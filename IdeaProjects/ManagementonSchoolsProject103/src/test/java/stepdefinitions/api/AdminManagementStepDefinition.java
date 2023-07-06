package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.RegisterObjectPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.ui.RegisterStepDefinition.ssnFormat;

public class AdminManagementStepDefinition extends BaseURL {

    RegisterObjectPojo objectData;

    @Given("Admin eklemek icin endpoint hazirlanir")
    public void admin_eklemek_icin_endpoint_hazirlanir() {
        spec.pathParams("first", "admin", "second", "save");
    }

    @When("Tum bilgilerin dolduruldugu data hazirlanir US22")
    public void tum_bilgilerin_dolduruldugu_data_hazirlanir_us22() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Post request gonderilir US22")
    public void post_request_gonderilir_us22() {
        response = given().spec(spec).when().body(objectData).post("/{first}/{second}");
    }

    @Then("Status code'un iki yuz oldugu dogrulanir US22")
    public void status_code_un_iki_yuz_oldugu_dogrulanir_us22() {
        assertEquals(200, response.statusCode());
    }

    @When("Sadece SSN'in bos birakildigi data hazirlanir")
    public void sadece_ssn_in_bos_birakildigi_data_hazirlanir() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                "",
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @Then("Status code'un dort yuz oldugu dogrulanir")
    public void status_code_un_dort_yuz_oldugu_dogrulanir() {
        assertEquals(400, response.statusCode());
    }

    @When("Sadece Password'un bos birakildigi data hazirlanir")
    public void sadece_password_un_bos_birakildigi_data_hazirlanir() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                "",
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

}
