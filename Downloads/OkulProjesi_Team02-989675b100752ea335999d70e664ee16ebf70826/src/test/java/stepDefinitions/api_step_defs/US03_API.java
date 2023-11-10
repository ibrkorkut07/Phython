package stepDefinitions.api_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US03Pojo.US03ObjectPojo;
import pojos.US03Pojo.US03PostPojo;
import pojos.US03Pojo.US03ResponsePojo;
// import pojos.admin_management.AdminPostPojo;
import pojos.dean_management.ResponsePojo;
import utilities.ObjectMapperUtils;
import static baseUrl.ManagementSchoolUrl.*;
import static io.restassured.RestAssured.given;

public class US03_API {
    US03ObjectPojo us03ObjectPojo;
    US03PostPojo expectedData;
    US03ResponsePojo us03ResponsePojo;

    Response response;
    Faker faker;

    ResponsePojo actualData;

    @Given("User sends the post request")
    public void user_sends_the_post_request() {

        //https://managementonschools.com/app/contactMessages/save
        setup();
        spec.pathParams("first", "contactMessages", "second", "save");

        expectedData = new US03PostPojo("dave@gmail.com", "Hello Java$$$", "John", "Techpro");
        response = given(spec).when().body(expectedData).post("{first}/{second}");
        response.prettyPrint();
    }

    private void setup() {
    }

    @Then("User verify the response")
    public void user_verify_the_response() {
        // US03ResponsePojo actualData = response.as(US03ResponsePojo.class);
        US03ResponsePojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), US03ResponsePojo.class);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(expectedData.getName(), actualData.getObject().getName());
        Assert.assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
        Assert.assertEquals(expectedData.getMessage(), actualData.getObject().getMessage());
        Assert.assertEquals(expectedData.getSubject(), actualData.getObject().getSubject());
        Assert.assertEquals("Contact Message Created Successfully", actualData.getMessage());
        Assert.assertEquals("CREATED", actualData.getHttpStatus());
    }
    @Given("User sends the post request without name")
    public void user_sends_the_post_request_without_name() {
        spec.pathParams("first", "contactMessages", "second", "save");
        expectedData = new US03PostPojo("dave@gmail.com", "Hello Java$$$", "", "Techpro");
        response = given(spec).when().body(expectedData).post("/{first}/{second}");
    }
    @Then("User verify the status code should be {int}")
    public void userVerifyTheStatusCodeShouldBe(int statusCode) {
        //Assert.assertEquals(400,response.statusCode());
        Assert.assertEquals(statusCode,response.statusCode());
    }

    @Given("User sends the post request email without @ and .")
    public void userSendsThePostRequestEmailWithoutAnd() {
        spec.pathParams("first","contactMessages","second","save");
        expectedData = new US03PostPojo("davegmail.com","Hello Java$$$","John","Techpro");
        response= given(spec).when().body(expectedData).post("/{first}/{second}");
    }
    @Then("User verify the response without @ and .")
    public void userVerifyTheResponseWithoutAnd() {
        Assert.assertEquals(400,response.statusCode());
    }
    @Given("User sends the post request without subject")
    public void user_sends_the_post_request_without_subject() {
        spec.pathParams("first","contactMessages","second","save");
        expectedData = new US03PostPojo("dave@gmail.com","Hello Java$$$","John","");
        response= given(spec).when().body(expectedData).post("/{first}/{second}");
    }

    @Then("User verify the response without subject")
    public void user_verify_the_response_without_subject() {
        Assert.assertEquals(400,response.statusCode());
    }
    @Given("User sends the post request without message")
    public void user_sends_the_post_request_without_message() {
        spec.pathParams("first","contactMessages","second","save");
        expectedData = new US03PostPojo("davegmail.com","","John","Techpro");
        response= given(spec).when().body(expectedData).post("/{first}/{second}");
    }
    @Then("User verify the response without message")
    public void user_verify_the_response_without_message() {
        Assert.assertEquals(400,response.statusCode());
    }
}


