package stepdefinitions.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class CommonStepDefinition {

    @Given("Site adresine gidilir")
    public void     siteAdresineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Admin rolu ile login islemi gerceklestirilir")
    public void adminRoluIleLoginIslemiGerceklestirilir() {
        ReusableMethods.login("adminUsername", "adminPassword");
    }

    @When("Dean rolu ile login islemi gerceklestirilir")
    public void deanRoluIleLoginIslemiGerceklestirilir() {
        ReusableMethods.login("deanUsername", "deanPassword");
    }

    @When("Vice Dean rolu ile login islemi gerceklestirilir")
    public void viceDeanRoluIleLoginIslemiGerceklestirilir() {
        ReusableMethods.login("viceDeanUsername", "viceDeanPassword");
    }

    @When("Teacher rolu ile login islemi gerceklestirilir")
    public void teacherRoluIleLoginIslemiGerceklestirilir() {
        ReusableMethods.login("teacherUsername", "teacherPassword");
    }

    @When("Student rolu ile login islemi gerceklestirilir")
    public void studentRoluIleLoginIslemiGerceklestirilir() {
        ReusableMethods.login("studentUsername", "studentPassword");
    }

    @Then("Sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }

}
