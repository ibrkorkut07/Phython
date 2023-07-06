package stepdefinitions.api;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import pojos.AddStudentPojo;
import utilities.BaseURL;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class AdStudentManagementStepDefinition extends BaseURL {

    public static Faker faker;
    AddStudentPojo expectedData;
    JsonPath actualData;

    @Given("Admin rolu ile student olusturmak icin endpoint hazirlanir US25")
    public void admin_rolu_ile_student_olusturmak_icin_endpoint_hazirlanir_US25() {
        spec.pathParams("first", "students", "second", "save");
    }

    @When("Data hazirlanir US25")
    public void data_hazirlanir() {
        expectedData = new AddStudentPojo(3,
                "2000-01-01",
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createName()+"@gmail.com",
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @When("Post request gonderilir US25")
    public void post_request_gonderilir_US25() {
        response = given().spec(spec).
                when().body(expectedData).post("/{first}/{second}");
        response.prettyPrint();
        actualData = response.jsonPath();
    }

    @Then("Request data’si ile response data’sinin ayni oldugu dogrulanir US25")
    public void request_data_si_ile_response_data_sinin_ayni_oldugu_dogrulanir_US25() {
        assertEquals(expectedData.getUsername(), actualData.getString("object.username"));
        assertEquals(expectedData.getEmail(), actualData.getString("object.email"));
        assertEquals(expectedData.getName(), actualData.getString("object.name"));
        assertEquals(expectedData.getSurname(), actualData.getString("object.surname"));
        assertEquals(expectedData.getBirthDay(), actualData.getString("object.birthDay"));
        assertEquals(expectedData.getBirthPlace(), actualData.getString("object.birthPlace"));
        assertEquals(expectedData.getPhoneNumber(), actualData.getString("object.phoneNumber"));
        assertEquals(expectedData.getGender(), actualData.getString("object.gender"));
        assertEquals(expectedData.getMotherName(), actualData.getString("object.motherName"));
        assertEquals(expectedData.getFatherName(), actualData.getString("object.fatherName"));
    }

    @When("Admin rolu ile token olusturulur US25")
    public void adminRoluIleTokenOlusturulurUS() {
        spec.pathParams("first", "students", "second", "save");
    }

    @And("Sadece name bilgisi girilmeden data hazirlanir US25")
    public void sadeceNameBilgisiGirilmedenDataHazirlanirUS() {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                "",
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Sadece surname bilgisi girilmeden data hazirlanir US25")
    public void sadeceSurnameBilgisiGirilmedenDataHazirlanirUS() {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                "",
                ReusableMethods.createUserName());

    }

    @And("Sadece birthplace bilgisi girilmeden data hazirlanir US25")
    public void sadeceBirthplaceBilgisiGirilmedenDataHazirlanirUS() {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                "",
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Sadece telefon numarasi bilgisi girilmeden data hazirlanir US25")
    public void sadeceTelefonNumarasiBilgisiGirilmedenDataHazirlanirUS() {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                "",
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Sadece email bilgisi girilmeden data hazirlanir US25")
    public void sadeceEmailBilgisiGirilmedenDataHazirlanirUS() {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                "",
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());

    }

    @And("Sadece snn bilgisi girilmeden data hazirlanir US25")
    public void sadeceSnnBilgisiGirilmedenDataHazirlanirUS() {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                "",
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());
    }

    @And("Sadece username bilgisi girilmeden data hazirlanir US25")
    public void sadeceUsernameBilgisiGirilmedenDataHazirlanirUS() {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                ReusableMethods.createPassword(),
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                "");
    }

    @And("Sadece password bilgisi girilmeden data hazirlanir US25")
    public void sadecePasswordBilgisiGirilmedenDataHazirlanirUS() {
        expectedData = new AddStudentPojo(3,
                ReusableMethods.createDateOfBirth(),
                ReusableMethods.createBirthPlace(),
                ReusableMethods.createEmail(),
                ReusableMethods.createFatherName(),
                "MALE",
                ReusableMethods.createMotherName(),
                ReusableMethods.createName(),
                "",
                ReusableMethods.createPhone(),
                ReusableMethods.createSSN(),
                ReusableMethods.createSurname(),
                ReusableMethods.createUserName());

    }

    @Then("Olusturulan oğrenciye otomatik olarak student number atandigi doğrulanır US25")
    public void olusturulanOğrenciyeOtomatikOlarakStudentNumberAtandigiDoğrulanırUS() {
        Assert.assertTrue(actualData.getString("object.studentNumber").length() > 0);
    }

}
