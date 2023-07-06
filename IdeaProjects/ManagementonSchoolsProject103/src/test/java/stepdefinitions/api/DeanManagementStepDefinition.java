package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import pojos.AddDeanPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class DeanManagementStepDefinition extends BaseURL {

    AddDeanPojo expectedData;
    JsonPath actualData;

    @Given("Dean kaydi icin end point hazirlanir")
    public void dean_kaydi_icin_end_point_hazirlanir() {
        spec.pathParams("pp1", "dean", "pp2", "save");

    }

    @And("Request datasi hazirlanir")
    public void requestDatasiHazirlanir() {
        expectedData = new AddDeanPojo(
                "1999-06-12",
                ReusableMethods.createBirthPlace(),
                "FEMALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Post request gonderilir")
    public void postRequestGonderilir() {
        response = given().spec(spec).
                when().body(expectedData).
                post("/{pp1}/{pp2}");
        actualData = response.jsonPath();
    }

    @Then("Request data ve response datalarin ayni oldugu dogrulanir")
    public void requestDataVeResponseDatalarinAyniOlduguDogrulanir() {
        assertEquals(expectedData.getBirthDay(), actualData.getString("object.birthDay"));
        assertEquals(expectedData.getGender(), actualData.getString("object.gender"));
        assertEquals(expectedData.getName(), actualData.getString("object.name"));
        assertEquals(expectedData.getPhoneNumber(), actualData.getString("object.phoneNumber"));
        assertEquals(expectedData.getSsn(), actualData.getString("object.ssn"));
        assertEquals(expectedData.getSurname(), actualData.getString("object.surname"));
        assertEquals(expectedData.getUsername(), actualData.getString("object.username"));
    }

    @And("Get request gonderilir us{int}")
    public void getRequestGonderilirUs(int arg0) {
        response = given().spec(spec).when().get("/{pp1}/{pp2}");
    }

    @And("Request datasi name bilgisi verilmeden hazirlanir")
    public void requestDatasiNameBilgisiVerilmedenHazirlanir() {
        expectedData = new AddDeanPojo(
                "1999-06-12",
                ReusableMethods.createBirthPlace(),
                "FEMALE",
                null,
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @Given("Dean icin end point hazirlanir")
    public void deanIcinEndPointHazirlanir() {
        spec.pathParams("pp1", "dean", "pp2", "getAll");
    }

    @Given("Dean icin end point hazirlanir-put")
    public void deanIcinEndPointHazirlanirPut() {
        spec.pathParams("pp1", "dean", "pp2", "update", "pp3", "402");
    }

    @When("Guncelleme icin request data hazirlanir")
    public void guncellemeIcinRequestDataHazirlanir() {
        expectedData = new AddDeanPojo(
                "1999-06-12",
                "london",
                "FEMALE",
                "emma",
                "12345678",
                "123-343-6549",
                "543-57-9753",
                "brown",
                "emmaB");
    }

    @And("Put request gonderilir")
    public void putRequestGonderilir() {
        response = given().spec(spec).
                when().body(expectedData).
                put("/{pp1}/{pp2}/{pp3}");
        response.prettyPrint();
    }

    @Given("Dean icin end point hazirlanir-del")
    public void deanIcinEndPointHazirlanirDel() {
        spec.pathParams("pp1", "dean", "pp2", "delete", "pp3", "407");
    }

    @When("Delete request gonderilir")
    public void deleteRequestGonderilir() {
        response = given().spec(spec).when().delete("/{pp1}/{pp2}/{pp3}");
    }

}
