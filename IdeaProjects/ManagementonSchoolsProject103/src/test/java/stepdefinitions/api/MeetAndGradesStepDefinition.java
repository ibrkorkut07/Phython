package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import pojos.*;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepdefinitions.ui.RegisterStepDefinition.ssnFormat;
import static utilities.BaseURL.response;
import static utilities.BaseURL.spec;

public class MeetAndGradesStepDefinition {

    JsonPath actualData;
    LessonProgramIdPojo lessonProgramId;
    RegisterObjectPojo objectData;
    RegisterPojo expectedData;
    StudentDersNotlariPojo expectedData2;
    StudentMeetPojo expectedData3;

    ToplantiDuzenlemeGuncellemePojo expectedData4;

    @Given("chooseLesson için endpoint hazırlanır US21_TC01")
    public void choose_lesson_için_endpoint_hazırlanır_us21_tc01() {
        spec.pathParams("first", "lessonPrograms", "second", "getAllLessonProgramByStudent");
    }

    @Then("Request gonderilip response alinir US21_TC01")
    public void request_gonderilip_response_alinir_us21_tc01() {
        response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("Teacher,Day,Start Time ve Stop Time goruldugu dogrulanir US21_TC01")
    public void teacher_day_start_time_ve_stop_time_goruldugu_dogrulanir_us21_tc01() {
        assertTrue(actualData.getString("teachers.name").contains("John"));
        assertTrue(actualData.getString("startTime").contains("10:00:00"));
        assertTrue(actualData.getString("stopTime").contains("12:00:00"));
        assertTrue(actualData.getString("day").contains("MONDAY"));
    }

    @Given("chooseLesson secimi için endpoint hazırlanır US21_TC02")
    public void choose_lesson_secimi_için_endpoint_hazırlanır_us21_tc02() {
        spec.pathParams("first", "students", "second", "chooseLesson");
    }

    @Then("Data hazırlanır US01_TC02")
    public void data_hazırlanır_us01_tc02() {
        objectData = new RegisterObjectPojo("1995-06-01",
                "Amasya",
                "MALE",
                "fsdf",
                ReusableMethods.createPassword(),
                "547-851-8563",
                ssnFormat,
                "fsdfsdf",
                "elin.murazik");
        expectedData = new RegisterPojo(objectData, "Lesson added to Student", "CREATED");
    }

    @Then("Request gonderilip response alinir US21_TC02")
    public void request_gonderilip_response_alinir_us21_tc02() {
        ArrayList<Integer> id = new ArrayList<>();
        id.add(182);
        System.out.println("id = " + id);
        lessonProgramId = new LessonProgramIdPojo(id);
        response = given().spec(spec).when().body(lessonProgramId).post("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("Dersin secildigi dogrulanir US21_TC02")
    public void dersin_secildigi_dogrulanir_us21_tc02() {
        assertEquals(actualData.getString("object.username"), expectedData.getObject().getUsername());
        assertEquals(actualData.getString("object.name"), expectedData.getObject().getName());
        assertEquals(actualData.getString("object.surname"), expectedData.getObject().getSurname());
        assertEquals(actualData.getString("object.birthDay"), expectedData.getObject().getBirthDay());
        assertEquals(actualData.getString("object.birthPlace"), expectedData.getObject().getBirthPlace());
        assertEquals(actualData.getString("object.phoneNumber"), expectedData.getObject().getPhoneNumber());
        assertEquals(actualData.getString("object.gender"), expectedData.getObject().getGender());
        assertEquals(actualData.getString("message"), expectedData.getMessage());
        assertEquals(actualData.getString("httpStatus"), expectedData.getHttpStatus());
    }

    @Then("lessonProgramId alani bos birakilarak Data hazırlanır US01_TC03")
    public void lesson_program_id_alani_bos_birakilarak_data_hazırlanır_us01_tc03() {
        ArrayList<Integer> aa = new ArrayList<>();
        lessonProgramId = new LessonProgramIdPojo(aa);
        response = given().spec(spec).when().body(lessonProgramId).post("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("Dersin secilemedigi dogrulanir US21_TC03")
    public void dersin_secilemedigi_dogrulanir_us21_tc03() {
        assertEquals(actualData.getString("message"), "Error: Lesson Programs not found");
    }

    @Then("ayni ders secimi icin Data hazırlanır US01_TC05")
    public void ayni_ders_secimi_icin_data_hazırlanır_us01_tc05() {
        ArrayList<Integer> id = new ArrayList<>();
        id.add(1);
        lessonProgramId = new LessonProgramIdPojo(id);
        response = given().spec(spec).when().body(lessonProgramId).post("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("Ders secilemedigi dogrulanir US21_TC04")
    public void ders_secilemedigi_dogrulanir_us21_tc04() {
        assertEquals(actualData.getString("message"), "Error: Course schedule cannot be selected for the same hour and day");
    }

    @Given("ogrenci sinav notlari goruntuleme için endpoint hazırlanır US21_TC05")
    public void ogrenci_sinav_notlari_goruntuleme_için_endpoint_hazırlanır_us21_tc05() {
        spec.pathParams("first", "studentInfo", "second", "getByStudentId", "third", 127);
    }

    @Then("Data hazırlanır US01_TC05")
    public void data_hazırlanır_us01_tc05() {
        expectedData2 = new StudentDersNotlariPojo(319, 100.00, 75.00, 5, "hfghsfdddg", "CYPRESS", 4, "SPRING_SEMESTER",
                85.00, true, "AA");
    }

    @Then("Request gonderilip response alinir US21_TC05")
    public void request_gonderilip_response_alinir_us21_tc05() {
        response = given().spec(spec).when().get("/{first}/{second}/{third}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("sinav notlarin goruldugu dogrulanir US21_TC05")
    public void sinav_notlarin_goruldugu_dogrulanir_us21_tc05() {
        assertEquals(actualData.getInt("[0].id"), expectedData2.getId());
        assertEquals((actualData.getString("[0].midtermExam")), "100.0");
        assertEquals((actualData.getString("[0].finalExam")), "75.0");
        assertEquals(actualData.getInt("[0].absentee"), expectedData2.getAbsentee());
        assertEquals(actualData.getString("[0].infoNote"), expectedData2.getInfoNote());
        assertEquals(actualData.getString("[0].lessonName"), expectedData2.getLessonName());
        assertEquals(actualData.getInt("[0].creditScore"), expectedData2.getCreditScore());
        assertEquals(actualData.getString("[0].educationTerm"), expectedData2.getEducationTerm());
        assertEquals((actualData.getString("[0].average")), "85.0");
        assertEquals(actualData.getString("[0].note"), expectedData2.getNote());
    }

    @Given("ogrenci toplantilari goruntuleme için endpoint hazırlanır US21_TC06")
    public void ogrenci_toplantilari_goruntuleme_için_endpoint_hazırlanır_us21_tc06() {
        spec.pathParams("first", "meet", "second", "getAllMeetByStudent");
    }

    @Then("Data hazırlanır US01_TC06")
    public void data_hazırlanır_us01_tc06() {
        expectedData3 = new StudentMeetPojo(88, "habelehdjfhs", "2023-05-23", "13:00:00", "14:00:00", 7, "Hobert", "234-04-5679");
    }

    @Then("Request gonderilip response alinir US21_TC06")
    public void request_gonderilip_response_alinir_us21_tc06() {
        response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("toplantilarin goruldugu dogrulanir US21_TC03")
    public void toplantilarin_goruldugu_dogrulanir_us21_tc03() {
        assertEquals(actualData.getInt("[0].id"), expectedData3.getId());
        assertEquals(actualData.getString("[0].description"), expectedData3.getDescription());
        assertEquals(actualData.getString("[0].date"), expectedData3.getDate());
        assertEquals(actualData.getString("[0].startTime"), expectedData3.getStartTime());
        assertEquals(actualData.getString("[0].startTime"), expectedData3.getStartTime());
        assertEquals(actualData.getString("[0].stopTime"), expectedData3.getStopTime());
        assertEquals(actualData.getInt("[0].advisorTeacherId"), expectedData3.getAdvisorTeacherId());
        assertEquals(actualData.getString("[0].teacherName"), expectedData3.getTeacherName());
        assertEquals(actualData.getString("[0].teacherSsn"), expectedData3.getTeacherSsn());
    }

    @Then("Status Code'unun ikiyuz oldugu dogrulanir US21")
    public void status_code_unun_ikiyuz_oldugu_dogrulanir_us21() {
        assertEquals(200, response.statusCode());
    }

    @Then("Status Code'unun dortyuz oldugu dogrulanir US21")
    public void status_code_unun_dortyuz_oldugu_dogrulanir_us21() {
        assertEquals(400, response.statusCode());
    }

    @Then("Status Code'unun dortyuzdort oldugu dogrulanir US21")
    public void status_code_unun_dortyuzdort_oldugu_dogrulanir_us21() {
        assertEquals(404, response.statusCode());
    }

    @Given("Toplanti duzenlemek icin endpoint hazirlanir US19_TC01")
    public void toplanti_duzenlemek_icin_endpoint_hazirlanir_US19_TC01() {
        spec.pathParams("first", "meet", "second", "save");
    }

    @And("Data hazirlanir US19_TC01")
    public void data_hazirlanir_US19_TC01() {
        expectedData4 = new ToplantiDuzenlemeGuncellemePojo("2024-01-11", "Veli Toplantisi", "12:00", "13:00", new ArrayList<>(Arrays.asList(35)));
    }

    @When("Post request gonderilir US19_TC01")
    public void post_request_gonderilir_US19_TC01() {
        response = given().spec(spec).when().body(expectedData4).post("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("Hazirlanan data ile toplanti olusturuldugu dogrulanir US19_TC01")
    public void hazirlanan_data_ile_toplanti_olusturuldugu_dogrulanir_US19_TC01() {
        assertEquals(expectedData4.getDate(), actualData.getString("object.date"));
        assertEquals(expectedData4.getDescription(), actualData.getString("object.description"));
        assertEquals(expectedData4.getStartTime() + ":00", actualData.getString("object.startTime"));
        assertEquals(expectedData4.getStopTime() + ":00", actualData.getString("object.stopTime"));
        ArrayList<Integer> studentIds = new ArrayList<>();
        List<Map> studentList = response.jsonPath().getList("object.students", Map.class);
        for (Map w : studentList) {
            studentIds.add((Integer) (w.get("id")));
        }
        assertEquals(expectedData4.getStudentIds(), studentIds);
        Integer id = response.jsonPath().getInt("object.id");
        ReusableMethods.deleteRequest("meet", id);
    }

    @And("Data hazirlanir US19_TC02")
    public void data_hazirlanir_US19_TC02() {
        expectedData4 = new ToplantiDuzenlemeGuncellemePojo(null, "Veli Toplantisi", "12:00", "13:00", new ArrayList<>(Arrays.asList(5)));
    }

    @Given("Toplanti goruntulemek icin endpoint hazirlanir US20_TC01")
    public void toplanti_goruntulemek_icin_endpoint_hazirlanir_US20_TC01() {
        spec.pathParams("first", "meet", "second", "getMeetById", "third", 2);
        // spec.pathParams("first", "meet", "second", "getMeetById");
        // spec.queryParam("third", 0);
    }

    @And("Get request gonderilir US20_TC01")
    public void get_request_gonderilir_US20_TC01() {
        response = given().spec(spec).when().get("/{first}/{second}/{third}");
        actualData = response.jsonPath();
    }

    @Given("Toplanti guncellemek icin endpoint hazirlanir US20_TC02")
    public void toplanti_guncellemek_icin_endpoint_hazirlanir_US20_TC02() {
        spec.pathParams("first", "meet", "second", "update", "third", 2);
        // spec.pathParams("first", "meet", "second", "update");
        // spec.queryParam("third", 0);
    }

    @And("Data hazirlanir US20_TC02")
    public void data_hazirlanir_US20_TC02() {
        expectedData4 = new ToplantiDuzenlemeGuncellemePojo("2024-01-11", "Veli Toplantisi", "12:00", "13:00", new ArrayList<>(Arrays.asList(5)));
    }

    @When("Put request gonderilir US20_TC02")
    public void put_request_gonderilir_US20_TC02() {
        response = given().spec(spec).when().body(expectedData4).put("/{first}/{second}/{third}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("Hazirlanan data ile toplantinin guncellendigi dogrulanir US20_TC02")
    public void hazirlanan_data_ile_toplantinin_guncellendigi_dogrulanir_US20_TC02() {
        assertEquals(expectedData4.getDate(), actualData.getString("object.date"));
        assertEquals(expectedData4.getDescription(), actualData.getString("object.description"));
        assertEquals(expectedData4.getStartTime() + ":00", actualData.getString("object.startTime"));
        assertEquals(expectedData4.getStopTime() + ":00", actualData.getString("object.stopTime"));
        ArrayList<Integer> studentIds = new ArrayList<>();
        List<Map> studentList = response.jsonPath().getList("object.students", Map.class);
        for (Map w : studentList) {
            studentIds.add((Integer) (w.get("id")));
        }
        assertEquals(expectedData4.getStudentIds(), studentIds);
    }

    @Given("Toplanti silmek icin endpoint hazirlanir US20_TC03")
    public void toplanti_silmek_icin_endpoint_hazirlanir_US20_TC03() {
        spec.pathParams("first", "meet", "second", "delete", "third", 2);
        // spec.pathParams("first", "meet", "second", "delete");
        // spec.queryParam("third", 0);
    }

    @And("Delete request gonderilir US20_TC03")
    public void delete_request_gonderilir_US20_TC03() {
        response = given().spec(spec).when().delete("/{first}/{second}/{third}");
    }





}
