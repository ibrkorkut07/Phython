package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import pojos.LessonProgramPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class LessonProgramManagementStepDefinition extends BaseURL {

    LessonProgramPojo expectedData;
    JsonPath actualData;

    @Given("Ders programi olusturmak icin end point olusturulur. US10")
    public void ders_programi_olusturmak_icin_end_point_olusturulur_us10() {
        spec.pathParams("first", "lessonPrograms", "second", "save");
    }

    @Then("Body olarak gonderilecek data hazirlanir. US10_TC01")
    public void body_olarak_gonderilecek_data_hazirlanir_us10_tc01() {
        expectedData = new LessonProgramPojo("MONDAY", "1", new ArrayList<>(Arrays.asList(1)), "12:00", "13:00");
    }

    @Then("Post request gonderilir US10")
    public void post_request_gonderilir_us10() {
        response = given().spec(spec).when().body(expectedData).post("/{first}/{second}");
        actualData = response.jsonPath();
        System.out.println("actualData = " + actualData.prettyPrint());
    }

    @Then("Ders Programinin data'daki bilgilerle olusturuldugu dogrulanir")
    public void ders_programinin_data_daki_bilgilerle_olusturuldugu_dogrulanir() {
        assertEquals(expectedData.getDay(), actualData.getString("object.day"));
        assertEquals(expectedData.getStartTime() + ":00", actualData.getString("object.startTime"));
        assertEquals(expectedData.getStopTime() + ":00", actualData.getString("object.stopTime"));
        ArrayList<Integer> lessonIdList = new ArrayList<>();
        List<Map> lessonList = response.jsonPath().getList("object.lessonName", Map.class);
        for (Map w : lessonList) {
            lessonIdList.add((Integer) (w.get("lessonId")));
        }
        assertEquals(expectedData.getLessonIdList(), lessonIdList);
        Integer id = response.jsonPath().getInt("object.lessonProgramId");
        ReusableMethods.deleteRequest("lessonPrograms", id);
    }

    @Then("Body olarak gonderilecek data ders secimi yapilmadan hazirlanir. US10_TC02")
    public void body_olarak_gonderilecek_data_ders_secimi_yapilmadan_hazirlanir_us10_tc02() {
        expectedData = new LessonProgramPojo("MONDAY", "1", null, "12:00", "13:00");
    }

    @Then("Body olarak gonderilecek data egitim donemi secimi yapilmadan hazirlanir. US10_TC03")
    public void body_olarak_gonderilecek_data_egitim_donemi_secimi_yapilmadan_hazirlanir_us10_tc03() {
        expectedData = new LessonProgramPojo("MONDAY", null, new ArrayList<>(Arrays.asList(1)), "12:00", "13:00");
    }

    @Then("Body olarak gonderilecek data ders günü secimi yapilmadan hazirlanir. US10_TC04")
    public void body_olarak_gonderilecek_data_ders_günü_secimi_yapilmadan_hazirlanir_us10_tc04() {
        expectedData = new LessonProgramPojo("", "1", new ArrayList<>(Arrays.asList(1)), "12:00", "13:00");
    }

    @Then("Body olarak gonderilecek data ders bitis saati ders baslagic satinden kücük olarak hazirlanir. US10_TC04")
    public void body_olarak_gonderilecek_data_ders_bitis_saati_ders_baslagic_satinden_kücük_olarak_hazirlanir_us10_tc04() {
        expectedData = new LessonProgramPojo("MONDAY", "1", new ArrayList<>(Arrays.asList(1)), "12:00", "11:00");
    }

    @Given("Ders Programını gorebilmek icin endpoint hazirlanir. US11")
    public void ders_programını_gorebilmek_icin_endpoint_hazirlanir_us11() {
        spec.pathParams("first", "lessonPrograms", "second", "getAll");
    }

    @Then("Get request gonderilir. US11")
    public void get_request_gonderilir_us11() {
        response = given().spec(spec).when().get("/{first}/{second}");

    }

    private String delid() {
        spec.pathParams("first", "lessonPrograms", "second", "getAll");
        response = given().spec(spec).when().get("/{first}/{second}");
        List<Object> liste = response.jsonPath().getList("lessonProgramId");
        Integer id = (Integer) liste.get(liste.size() - 1);
        return id + "";
    }

    @Given("Ders Program Listten silme işlemi icin endpoint hazirlanir. US11")
    public void ders_program_listten_silme_işlemi_icin_endpoint_hazirlanir_us11() {
        String id = delid();
        spec.pathParams("first", "lessonPrograms", "second", "delete", "third", id);
    }

    @Then("Del request gönderilir. US11")
    public void del_request_gönderilir_us11() {
        response = given().spec(spec).when().delete("/{first}/{second}/{third}");
    }

}
