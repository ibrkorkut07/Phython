package stepdefinitions.api;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseURL;

import static org.junit.Assert.assertEquals;
import static utilities.Authentication.*;

public class CommonStepDefinition extends BaseURL {

    @When("Admin rolu ile token olusturulur")
    public void admin_rolu_ile_token_olusturulur() {
        spec.header("Authorization", generateAdminToken());
    }

    @When("Dean rolu ile token olusturulur")
    public void dean_rolu_ile_token_olusturulur() {
        spec.header("Authorization", generateDeanToken());
    }

    @When("Vice Dean rolu ile token olusturulur")
    public void vice_dean_rolu_ile_token_olusturulur() {
        spec.header("Authorization", generateViceDeanToken());
    }

    @When("Teacher rolu ile token olusturulur")
    public void teacher_rolu_ile_token_olusturulur() {
        spec.header("Authorization", generateTeacherToken());
    }

    @When("Student rolu ile token olusturulur")
    public void student_rolu_ile_token_olusturulur() {
        spec.header("Authorization", generateStudentToken());
    }

    @Then("Status Code'unun 200 oldugu dogrulanir")
    public void status_kodunun_ikiyuz_oldugu_dogrulanir() {
        assertEquals(200, response.statusCode());
    }

    @Then("Status Code'unun 201 oldugu dogrulanir")
    public void status_kodunun_ikiyuzbir_oldugu_dogrulanir() {
        assertEquals(201, response.statusCode());
    }

    @Then("Status Code'unun 204 oldugu dogrulanir")
    public void status_kodunun_ikiyuzdort_oldugu_dogrulanir() {
        assertEquals(204, response.statusCode());
    }

    @Then("Status Code'unun 400 oldugu dogrulanir")
    public void status_kodunun_dortyuz_oldugu_dogrulanir() {
        assertEquals(400, response.statusCode());
    }
    @Then("Status Code'unun 401 oldugu dogrulanir")
    public void status_kodunun_dortyuzbir_oldugu_dogrulanir() {
        assertEquals(401, response.statusCode());
    }

    @Then("Status Code'unun 403 oldugu dogrulanir")
    public void status_kodunun_dortyuzuc_oldugu_dogrulanir() {
        assertEquals(403, response.statusCode());
    }

    @Then("Status Code'unun 404 oldugu dogrulanir")
    public void status_kodunun_dortyuzdort_oldugu_dogrulanir() {
        assertEquals(404, response.statusCode());
    }

}
