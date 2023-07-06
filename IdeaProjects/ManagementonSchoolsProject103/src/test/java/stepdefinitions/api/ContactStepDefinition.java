package stepdefinitions.api;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import pojos.CreateMessagePojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ContactStepDefinition extends BaseURL {

    Faker faker = new Faker();
    CreateMessagePojo expectedData;
    JsonPath actualData;

    @Given("Mesaj gonderebilmek icin endpoint hazirlanir US03")
    public void mesajGonderebilmekIcinEndpointHazirlanirUS03() {
        spec.pathParams("first", "contactMessages", "second", "save");
    }

    @When("Data hazirlanir US03")
    public void dataHazirlanirUS03() {
        expectedData = new CreateMessagePojo(ReusableMethods.createName() + "@gmail.com",
                faker.shakespeare().hamletQuote(),
                ReusableMethods.createName(),
                faker.shakespeare().romeoAndJulietQuote());
        System.out.println("expectedData = " + expectedData);
    }

    @And("Post request gonderilir US03")
    public void postRequestGonderilirUS03() {
        response = given().spec(spec).when().
                body(expectedData).post("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("Hazirlanan data ile mesaj gonderildigi dogrulanir US03")
    public void hazirlananDataIleMesajGonderildigiDogrulanirUS03() {
        assertEquals(expectedData.getEmail(), actualData.getString("object.email"));
        assertEquals(expectedData.getMessage(), actualData.getString("object.message"));
        assertEquals(expectedData.getName(), actualData.getString("object.name"));
        assertEquals(expectedData.getSubject(), actualData.getString("object.subject"));
    }

    @When("Name alani bos birakilarak data hazirlanir US03")
    public void nameAlaniBosBirakilarakDataHazirlanirUS03() {
        expectedData = new CreateMessagePojo(ReusableMethods.createName() + "@gmail.com",
                faker.shakespeare().hamletQuote(),
                null,
                faker.shakespeare().romeoAndJulietQuote());
    }

    @Then("Hazirlanan data ile mesaj gonderilemedigi dogrulanir US03")
    public void hazirlananDataIleMesajGonderilemedigiDogrulanirUS03() {
        assertEquals(expectedData.getEmail(), actualData.getString("object.email"));
        assertEquals(expectedData.getMessage(), actualData.getString("object.message"));
        assertEquals(expectedData.getName(), actualData.getString("object.name"));
        assertEquals(expectedData.getSubject(), actualData.getString("object.subject"));
    }

    @When("Email alani bos birakilarak data hazirlanir US03")
    public void emailAlaniBosBirakilarakDataHazirlanirUS03() {
        expectedData = new CreateMessagePojo(null,
                faker.shakespeare().hamletQuote(),
                ReusableMethods.createName(),
                faker.shakespeare().romeoAndJulietQuote());
    }

    @When("Email alanina invalid deger girilerek data hazirlanir US03")
    public void emailAlaninaInvalidDegerGirilerekDataHazirlanirUS03() {
        expectedData = new CreateMessagePojo(ReusableMethods.createName() + "@gmail.",
                faker.shakespeare().hamletQuote(),
                ReusableMethods.createName(),
                faker.shakespeare().romeoAndJulietQuote());
    }

    @Given("Mesajlari gorebilmek icin endpoint hazirlanir")
    public void mesajlariGorebilmekIcinEndpointHazirlanir() {
        spec.pathParams("first", "contactMessages", "second", "getAll");
    }

    @And("Get request gonderilir")
    public void getRequestGonderilir() {
        response = given().spec(spec).when().get("/{first}/{second}");

    }

}
