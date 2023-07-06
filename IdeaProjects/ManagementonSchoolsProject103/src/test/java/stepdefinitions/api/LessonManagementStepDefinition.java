package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import pojos.LessonObjectPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LessonManagementStepDefinition extends BaseURL {

    LessonObjectPojo expectedData;
    JsonPath actualData;

    @Given("Lesson oluşturmak için endpoint hazırlanır")
    public void lesson_oluşturmak_için_endpoint_hazırlanır() {
        spec.pathParams("first", "lessons", "second", "save");
    }

    @Then("Body olarak gonderilecek data hazirlanir US08_TC01")
    public void body_olarak_gonderilecek_data_hazirlanir_us08_tc01() {
        expectedData = new LessonObjectPojo(true, 8, ReusableMethods.createName());
    }

    @Then("Post request gonderilir US08_TC01")
    public void post_request_gonderilir_us08_tc01() {
        response = given(spec).when().body(expectedData).post("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("Lesson ın olusturuldugu dogrulanir US08_TC01")
    public void lesson_ın_olusturuldugu_dogrulanir_us08_tc01() {
        assertEquals(200, response.statusCode());
        assertTrue(actualData.getString("message").contains("Lesson Created"));
        Integer id = actualData.getInt("object.lessonId");
        ReusableMethods.deleteRequest("lessons", id);
    }

    @Then("Body olarak gönderilecek data  Lesson Name bilgisine yer verilmeden hazırlanır US08_TC02")
    public void body_olarak_gönderilecek_data_lesson_name_bilgisine_yer_verilmeden_hazırlanır_us08_tc02() {
        expectedData = new LessonObjectPojo(true, 55, "");
    }

    @Then("Data Compulsory checkbox bilgisine yer verilmeden hazirlanir US08_{int}")
    public void data_compulsory_checkbox_bilgisine_yer_verilmeden_hazirlanir_us08(Integer int1) {
        expectedData = new LessonObjectPojo(false, 55, ReusableMethods.createName());
    }

    @Then("Body olarak gönderilecek data  Credit Score bilgisine yer verilmeden hazirlanir US")
    public void bodyOlarakGönderilecekDataCreditScoreBilgisineYerVerilmedenHazirlanirUS_TC() {
        expectedData = new LessonObjectPojo(false, 0, ReusableMethods.createName());
    }

    @Given("Lesson goruntuleyebilmek icin endpoint hazirlanir US09_TC01")
    public void lesson_goruntuleyebilmek_icin_endpoint_hazirlanir_us09_tc01() {
        spec.pathParams("first","lessons","second","getAll");
    }

    @Then("Get request gonderilir US09_TC01")
    public void get_request_gonderilir_us09_tc01() {
        response=given().spec(spec).when().get("/{first}/{second}");
    }

    @Given("Lesson List bilgilerini silebilmek icin endpoint hazirlanir US09_TC02")
    public void lesson_list_bilgilerini_silebilmek_icin_endpoint_hazirlanir_us09_tc02() {
        spec.pathParams("first","lessons","second","delete","third",788);
    }

    @Then("Endpoint'e delete request gonderilir US09_TC02")
    public void endpoint_e_delete_request_gonderilir_us09_tc02() {
        response=given().spec(spec).when().delete("/{first}/{second}/{third}");
    }

}
