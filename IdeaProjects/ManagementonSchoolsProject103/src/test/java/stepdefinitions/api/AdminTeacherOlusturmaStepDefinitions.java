package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import pojos.AddandUpdateTeacherPojo;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.BaseURL.response;
import static utilities.BaseURL.spec;

public class AdminTeacherOlusturmaStepDefinitions {

    AddandUpdateTeacherPojo expectedData;
    JsonPath actualData;

    @Given("admin ogretmen olusturmak icin end pointe olusturulur US24_TC01")
    public void adminOgretmenOlusturmakIcinEndPointeOlusturulurUS24_TC01() {
        spec.pathParams("first", "teachers", "second", "save");
    }

    @And("data hazırlanır US24_TC01")
    public void dataHazırlanırUS24_TC01() {
        expectedData = new AddandUpdateTeacherPojo(
                "1989-01-13",
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createName()+"@gmail.com",
                "MALE",
                true,
                new ArrayList<>(Arrays.asList(2)),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName()
        );
    }

    @And("post request gönderilir US24_TC01")
    public void postRequestGönderilirUS24_TC01() {
        response = given().spec(spec).when().body(expectedData).post("/{first}/{second}");
        actualData = response.jsonPath();
    }

    @Then("assertion islemi yapilir US24_TC01")
    public void assertionIslemiYapilirUS_TC() {
        assertEquals(expectedData.getBirthDay(), actualData.getString("object.birthDay"));
        assertEquals(expectedData.getBirthPlace(), actualData.getString("object.birthPlace"));
        assertEquals(expectedData.getEmail(), actualData.getString("object.email"));
        assertEquals(expectedData.getGender(), actualData.getString("object.gender"));
        assertEquals(expectedData.getName(), actualData.getString("object.name"));
        assertEquals(expectedData.getSurname(), actualData.getString("object.surname"));
        assertEquals(expectedData.getUsername(), actualData.getString("object.username"));
        assertEquals(expectedData.getSsn(), actualData.getString("object.ssn"));
        assertEquals(expectedData.getPhoneNumber(), actualData.getString("object.phoneNumber"));
        assertEquals("Teacher saved successfully", actualData.getString("message"));
        assertEquals("CREATED", actualData.getString("httpStatus"));
    }

    @And("name alani bos birakilarak data hazırlanır US24_TC02")
    public void nameAlaniBosBirakilarakDataHazırlanırUS24_TC02() {
        expectedData = new AddandUpdateTeacherPojo(
                "1989-01-13",
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                "MALE",
                true,
                new ArrayList<>(Arrays.asList(1)),
                null,
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

}