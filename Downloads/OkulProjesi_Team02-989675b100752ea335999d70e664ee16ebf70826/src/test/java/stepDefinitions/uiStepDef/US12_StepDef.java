package stepDefinitions.uiStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US12_StepDef {
    LoginPage loginPage = new LoginPage();

    @Given("Vice Dean Siteye giderBS")
    public void vice_dean_siteye_gider_bs() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @Given("Login linkine tıklarBS")
    public void login_linkine_tıklar_bs() {
        loginPage.login.click();
    }

    @Given("User name kutusuna kayitli kayitli ismini girerBS")
    public void user_name_kutusuna_kayitli_kayitli_ismini_girer_bs() {
        loginPage.username.sendKeys(ConfigReader.getProperty("viceDeanUsername"));

    }

    @Given("Passwordu girerBS")
    public void passwordu_girer_bs() {

        loginPage.password.sendKeys(ConfigReader.getProperty("viceDeanPassword"));
    }

    @Given("Giris butonuna tiklarBS")
    public void giris_butonuna_tiklar_bs() {

        loginPage.loginButton.click();
    }

    @Given("Dersler butonuna tiklarBS")
    public void dersler_butonuna_tiklar_bs() {


    }

    @Then("Dersin olusturuldugunu dogrularBS")
    public void dersin_olusturuldugunu_dogrular_bs() {

    }



    @Given("Ders programina tiklarBS")
    public void ders_programina_tiklar_bs() {

    }

    @Given("Dersi secerBS")
    public void dersi_secer_bs() {

    }

    @Given("Ogretmen sec butonuna tiklarBS")
    public void ogretmen_sec_butonuna_tiklar_bs() {

    }

    @Given("Ogretmeni secerBS")
    public void ogretmeni_secer_bs() {

    }

    @Given("Ogretmen secebildigini dogrularBS")
    public void ogretmen_secebildigini_dogrular_bs() {

    }

    @Given("Gonder butonuna tiklarBS")
    public void gonder_butonuna_tiklar_bs() {


    }
}