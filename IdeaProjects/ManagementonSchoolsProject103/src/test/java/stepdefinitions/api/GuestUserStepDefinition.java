package stepdefinitions.api;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.BaseURL;

import static io.restassured.RestAssured.given;

public class GuestUserStepDefinition extends BaseURL {

    @Given("Guest User List bilgilerini gorebilmek icin endpoint hazirlanir")
    public void guest_user_list_bilgilerini_gorebilmek_icin_endpoint_hazirlanir() {
        spec.pathParams("first", "guestUser", "second", "getAll");
    }

    @Given("Guest User List bilgilerini silebilmek icin endpoint hazirlanir")
    public void guest_user_list_bilgilerini_silebilmek_icin_endpoint_hazirlanir() {
        spec.pathParams("first", "guestUser", "second", "delete", "third", Faker.instance().number().numberBetween(1, 200));
    }

    @When("Endpoint'e get request gonderilir")
    public void endpoint_e_get_request_gonderilir() {
        response = given().spec(spec).when().get("/{first}/{second}");
    }

    @When("Endpoint'e delete request gonderilir")
    public void endpoint_e_delete_request_gonderilir() {
        response = given().spec(spec).when().delete("/{first}/{second}/{third}");
    }

}
