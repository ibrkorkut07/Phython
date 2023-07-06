package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import pojos.RegisterObjectPojo;
import pojos.RegisterPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepdefinitions.ui.RegisterStepDefinition.ssnFormat;

public class RegisterStepDefinition extends BaseURL {

    RegisterPojo expectedData;
    RegisterObjectPojo objectData;
    JsonPath actualData;

    @Given("Register için endpoint hazırlanır")
    public void register_için_endpoint_hazırlanır() {
        spec.pathParams("first", "guestUser", "second", "register");
    }

    @When("Data hazırlanır US01")
    public void data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
        expectedData = new RegisterPojo(objectData, "Guest User registered.", "CREATED");
    }

    @When("Data hazırlanır US22")
    public void data_hazırlanır_us22() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
        expectedData = new RegisterPojo(objectData, "Admin Saved", "CREATED");
    }

    @Then("Request gonderilip response alinir US01")
    public void request_gonderilip_response_alinir_us01() {
        response = given().spec(spec).when().body(objectData).post("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("assertion_yapilir US01")
    public void assertion_yapilir_us01() {
        assertEquals(200, response.statusCode());
        assertEquals(actualData.getString("object.username"), expectedData.getObject().getUsername());
        assertEquals(actualData.getString("object.name"), expectedData.getObject().getName());
        assertEquals(actualData.getString("object.surname"), expectedData.getObject().getSurname());
        assertEquals(actualData.getString("object.ssn"), expectedData.getObject().getSsn());
        assertEquals(actualData.getString("object.phoneNumber"), expectedData.getObject().getPhoneNumber());
        assertEquals(actualData.getString("object.gender"), expectedData.getObject().getGender());
        assertEquals(actualData.getString("message"), expectedData.getMessage());
        assertEquals(actualData.getString("httpStatus"), expectedData.getHttpStatus());
    }

    @When("Yalnızca name alanı boş bırakılarak data hazırlanır US01")
    public void yalnızca_name_alanı_boş_bırakılarak_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                "",
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @Then("Hazırlanan data ile kayıt oluşturulamadığı doğrulanır US01")
    public void hazırlanan_data_ile_kayıt_oluşturulamadığı_doğrulanır_us01() {
        assertEquals(400, response.statusCode());
        assertTrue(actualData.getString("message").contains("Validation failed for object='guestUserRequest") ||
                actualData.getString("message").contains("JSON parse error"));
    }

    @When("Yalnızca surname alanı boş bırakılarak data hazırlanır US01")
    public void yalnızca_surname_alanı_boş_bırakılarak_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                "",
                ReusableMethods.createUserName());
    }

    @When("Yalnızca birthPlace alanı boş bırakılarak data hazırlanır US01")
    public void yalnızca_birth_place_alanı_boş_bırakılarak_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                "",
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Yalnızca phoneNumber alanı boş bırakılarak data hazırlanır US01")
    public void yalnızca_phone_number_alanı_boş_bırakılarak_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                "",
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Yalnızca phoneNumber alanına oniki karakterden az deger girerek data hazırlanır US01")
    public void yalnızca_phone_number_alanına_oniki_karakterden_az_deger_girerek_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                "1248567-24",
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Yalnızca gender alanı boş bırakılarak data hazırlanır US01")
    public void yalnızca_gender_alanı_boş_bırakılarak_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Yalnızca birthDay alanı boş bırakılarak data hazırlanır US01")
    public void yalnızca_birth_day_alanı_boş_bırakılarak_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Yalnızca birthDay alanına gecersiz formatta data hazırlanır US01")
    public void yalnızca_birth_day_alanına_gecersiz_formatta_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995/06/21",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Yalnızca ssn alanı SSN alanina gecersiz formatta deger girerek data hazırlanır US01")
    public void yalnızca_ssn_alanı_ssn_alanina_gecersiz_formatta_deger_girerek_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                "1548-2-145875",
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Yalnızca username alanı boş bırakılarak data hazırlanır US01")
    public void yalnızca_username_alanı_boş_bırakılarak_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                "");
    }

    @Given("Yalnızca password alanına yedi karakter girerek boş bırakılarak data hazırlanır US01")
    public void yalnızca_password_alanına_yedi_karakter_girerek_boş_bırakılarak_data_hazırlanır_us01() {
        objectData = new RegisterObjectPojo("1995-06-01",
                ReusableMethods.createBirthPlace(),
                "MALE",
                ReusableMethods.createName(),
                "1234567",
                ReusableMethods.createPhone(),
                ssnFormat,
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

}
