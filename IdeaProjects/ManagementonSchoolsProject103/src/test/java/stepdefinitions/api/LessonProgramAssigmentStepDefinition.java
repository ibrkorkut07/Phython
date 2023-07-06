package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import pojos.LessonAssingmentPojo;
import pojos.LessonProgramPojo;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.BaseURL.response;
import static utilities.BaseURL.spec;

public class LessonProgramAssigmentStepDefinition {

    LessonProgramPojo expectedData;
    JsonPath actualData;
    LessonAssingmentPojo expectedData2;

    @Given("Ders programi olusturmak icin end point olusturulur. US_12")
    public void dersProgramiOlusturmakIcinEndPointOlusturulurUS_12() {
        spec.pathParams("first", "lessonPrograms", "second", "save");
    }

    @Then("Body olarak gonderilecek data hazirlanir. US_12")
    public void bodyOlarakGonderilecekDataHazirlanirUS_12() {
        expectedData = new LessonProgramPojo("MONDAY", "1", new ArrayList<>(Arrays.asList(1)), "12:00", "13:00");


    }

    @Then("Post request gonderilir US_12")
    public void postRequestGonderilirUS_12() {
        response = given().spec(spec).when().body(expectedData).post("/{first}/{second}");
        actualData = response.jsonPath();
        System.out.println("actualData = " + actualData.prettyPrint());
    }

    @And("Ders Programinin data'daki bilgilerle olusturuldugu dogrulanir.US_12_TC_01")
    public void dersProgramininDataDakiBilgilerleOlusturulduguDogrulanirUS_12TC_01() {
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



    @Then("Body olarak gonderilecek data ders secimi yapilmadan hazirlanir. US_12_TC_02")
    public void bodyOlarakGonderilecekDataDersSecimiYapilmadanHazirlanirUS_12TC_02() {
        expectedData = new LessonProgramPojo("MONDAY", "1", null, "12:00", "13:00");
    }

    @Then("Body olarak gonderilecek data egitim donemi secimi yapilmadan hazirlanir. US_12_TC_03")
    public void bodyOlarakGonderilecekDataEgitimDonemiSecimiYapilmadanHazirlanirUS_12TC_03() {
        expectedData = new LessonProgramPojo("MONDAY", null, new ArrayList<>(Arrays.asList(1)), "12:00", "13:00");
    }


    @Given("Olusturulan dersi gormek için end point oluşturulur.US_12")
    public void olusturulanDersiGormekIçinEndPointOluşturulurUS_12() {
        spec.pathParams("first", "lessons", "second", "getAll");

    }

    @Then("Data hazirlanir US_12_TC_04")
    public void dataHazirlanirUS_12_TC_04() {
        expectedData2 = new LessonAssingmentPojo(1060,"Kargo",5,true);
    }

    @Then("Get request gonderilir US_12_TC_04")
    public void getRequestGonderilirUS_12_TC_04() {
        response = given().spec(spec).when().get("/{first}/{second}");
        actualData = response.jsonPath();
        System.out.println("actualData = " + actualData.prettyPrint());
    }

    @And("Dersin olusturuldugunun dogrulanmasi yapilir")
    public void dersinOlusturuldugununDogrulanmasiYapilir() {
        assertTrue(actualData.getList("lessonId").contains(1060));
        assertTrue(actualData.getList("lessonName").contains("Kargo"));
        assertTrue(actualData.getList("creditScore").contains(5));
        assertTrue(actualData.getList("compulsory").contains(true));
    }
}