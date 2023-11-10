package stepDefinitions.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.US22_ResponsePojo;
import pojos.US22_admin_management.US22_AdminPostPojo;
// import pojos.US22_admin_management.US22_ResponsePojo;

import static baseUrl.ManagementSchoolUrl.adminSetup;
import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;

public class US22_API {

    /*
     public static void adminSetup() {

        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",
                        generateToken(ConfigReader.getProperty("adminPassword"),
                                ConfigReader.getProperty("adminUsername"))).
                setBaseUri("https://managementonschools.com/app").build();
    } //setContentType() kismi post isleminin duzgun calismasi icin

        features = "src/test/resources/features/api_features",

     */
    Response response;
    US22_ResponsePojo actualData;
    US22_AdminPostPojo payload;


    @Given("Admin Save icin URL duzenlenirRA")
    public void adminSaveIcinURLDuzenlenirRA() {
        adminSetup();
        spec.pathParams("first", "admin", "second", "save");
    }

    @And("Admin Save icin payload duzenlenirRA")
    public void adminSaveIcinPayloadDuzenlenirRA() {
        payload = new US22_AdminPostPojo("1907-11-11", "Ankara", "MALE", "Ramazan", "Ramazan1.", "922-182-3322", "156-73-0949", "Batch172", "RamazanB2");
    }

    @When("Admin Save icn POST Request gonderilir ve Response alinirRA")
    public void adminSaveIcnPOSTRequestGonderilirVeResponseAlinirRA() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(US22_ResponsePojo.class);
    }

    @Then("Status kodun {int} oldugu dogrulanirRA")
    public void statusKodunOlduguDogrulanirRA(int statuscode) {
        Assert.assertEquals(statuscode, response.statusCode());
    }

    @And("Admin Save icin gelen Response body dogrulanirRA")
    public void adminSaveIcinGelenResponseBodyDogrulanirRA() {
//        Assert.assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
//        Assert.assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
//        Assert.assertEquals(payload.getGender(), actualData.getObject().getGender());
//        Assert.assertEquals(payload.getName(), actualData.getObject().getName());
//        Assert.assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
//        Assert.assertEquals(payload.getSsn(), actualData.getObject().getSsn());
//        Assert.assertEquals(payload.getSurname(), actualData.getObject().getSurname());
//        Assert.assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }

    @Given("Kayitli Admin hesap bilgisinin ID nosu alinirRA")
    public void kayitliAdminHesapBilgisininIDNosuAlinirRA() {
        adminSetup();
        spec.pathParams("first", "admin", "second", "getAll");
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }

    @Given("Admin Delete icin URL duzenlenirRA")
   /* public void adminDeleteIcinURLDuzenlenirRA() {
        spec.pathParams("first", "admin", "second", "delete", "third", userId);
    }
    */


    @When("Admin Delete icin Delete Request gonderilir ve Response alinirRA")
    public void adminDeleteIcinDeleteRequestGonderilirVeResponseAlinirRA() {
        response = given(spec).when().delete("{first}/{second}{third}}");
    }
}
