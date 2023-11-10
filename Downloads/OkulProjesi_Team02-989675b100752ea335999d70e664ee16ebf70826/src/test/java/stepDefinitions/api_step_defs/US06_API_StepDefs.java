package stepDefinitions.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.US06Pojo.US06ObjectPojo;
import pojos.US06Pojo.US06PostPojo;
import pojos.US06Pojo.US06ResponsePojo;
import pojos.dean_management.ObjectPojo;
import pojos.dean_management.ResponsePojo;
import utilities.ConfigReader;

import java.util.List;

import static baseUrl.BaseUrl.setup;
import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US06_API_StepDefs {

    US06PostPojo payload;
    Response response;
    US06ResponsePojo actualData;
    static int userId;
    public static US06ObjectPojo object;
    public static US06ResponsePojo expectedData;

    @Given("{string} olarak giris yapilir")
    public void olarakGirisYapilir(String user) {
        switch (user){
            case "Admin":
                setup(ConfigReader.getProperty("adminUsername"), ConfigReader.getProperty("adminPassword"));
                System.out.println("Admin yetkisi ile giriş yapıldı.");
                break;
            case "Dean":
                setup(ConfigReader.getProperty("deanUsername"), ConfigReader.getProperty("deanPassword"));
                System.out.println("Dean yetkisi ile giriş yapıldı.");
                break;
            case "Vice Dean":
                setup(ConfigReader.getProperty("viceDeanUsername"), ConfigReader.getProperty("viceDeanPassword"));
                System.out.println("Vice Dean yetkisi ile giriş yapıldı.");
                break;
            default:
                System.out.println("Geçersiz bir yetki ile giriş yapmaya çalıştınız.");
                break;
        }
    }

    @And("Vice Dean kayit islemi icin URL duzenlenir")
    public void viceDeanKayitIslemiIcinURLDuzenlenir() {
        //https://managementonschools.com/app/vicedean/save
        spec.pathParams("first", "vicedean", "second", "save");
    }


    @And("Vice Dean kayit islemi icin payload duzenlenir")
    public void viceDeanKayitIslemiIcinPayloadDuzenlenir() {
        payload = new US06PostPojo("1973-03-05", "Mardin", "MALE", "Ibrahim", "Ibrahim123", "312-562-9856", "312-52-3652", "Mardinli", "Ibrahim47");

    }

    @When("Vice Dean kayit islemi icin POST Request gonderilir ve Response alinir")
    public void viceDeanKayitIslemiIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(US06ResponsePojo.class);
    }

    @Then("Status kodun {int} oldugu dogrulanir")
    public void statusKodunOlduguDogrulanir(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }


    @And("Vice Dean kayit islemi icin gelen Response body dogrulanir")
    public void viceDeanKayitIslemiIcinGelenResponseBodyDogrulanir() {
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }

    @And("Kayitli Vice Dean hesab bilgisinin ID nosu alinir")
    public void kayitliViceDeanHesabBilgisininIDNosuAlinir() {
        spec.pathParams("first", "vicedean", "second", "getAll");
        response = given(spec).when().get("{first}/{second}");

        JsonPath json = response.jsonPath();
        List<Integer> userIdList = json.getList("findAll{it.username=='Ibrahim47'}.userId");
        userId = userIdList.get(0);
    }


    @And("Vice Dean GetViceDeanById icin URL duzenlenir")
    public void viceDeanGetViceDeanByIdIcinURLDuzenlenir() {
        spec.pathParams("first", "vicedean", "second", "getViceDeanById", "third", userId);
    }

    @And("Vice Dean GetViceDeanById icin beklenen veriler duzenlenir")
    public void viceDeanGetViceDeanByIdIcinBeklenenVerilerDuzenlenir() {
        object = new US06ObjectPojo(userId, "Ibrahim47", "Ibrahim", "Mardinli", "1973-03-05", "312-52-3652", "Mardin", "312-562-9856", "MALE");
        expectedData = new US06ResponsePojo(object, "Vice dean successfully found", "OK");
    }

    @When("Vice Dean GetViceDeanById icin GET Request gonderilir ve Response alinir")
    public void viceDeanGetViceDeanByIdIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(US06ResponsePojo.class);
    }

    @And("Vice Dean GetViceDeanById icin gelen Response body dogrulanir")
    public void viceDeanGetViceDeanByIdIcinGelenResponseBodyDogrulanir() {
        assertEquals(object.getUserId(), actualData.getObject().getUserId());
        assertEquals(object.getUsername(), actualData.getObject().getUsername());
        assertEquals(object.getName(), actualData.getObject().getName());
        assertEquals(object.getSurname(), actualData.getObject().getSurname());
        assertEquals(object.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(object.getSsn(), actualData.getObject().getSsn());
        assertEquals(object.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(object.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(object.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());
    }

}
