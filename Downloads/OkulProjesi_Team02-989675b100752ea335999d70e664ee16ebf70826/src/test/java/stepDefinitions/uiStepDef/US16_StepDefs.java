package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.ContactGetAllPage;
import pages.LoginPage;
import pages.TeacherPage;
import pages.ViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.sql.*;

public class US16_StepDefs {
    LoginPage loginPage = new LoginPage();
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    ContactGetAllPage contactGetAllPage = new ContactGetAllPage();

    @Given("kullanici okul web sayfasina gider")
    public void kullanici_okul_web_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("kullanici ana sayfadaki logine tiklar")
    public void kullanici_ana_sayfadaki_logine_tiklar() {
        loginPage.login.click();
    }
    @Given("Vice Dean username girer")
    public void vice_dean_username_girer() {
loginPage.username.sendKeys(ConfigReader.getProperty("viceDeanUsername"));
    }
    @Given("Vice Dean Password girer")
    public void vice_dean_password_girer() {
loginPage.password.sendKeys(ConfigReader.getProperty("viceDeanPassword"));
    }
    @Given("kullanici login buttona tiklar")
    public void kullanici_login_buttona_tiklar() {
loginPage.loginButton.click();
    }
    @Given("Vice Dean Menu buttona tiklar")
    public void vice_dean_menu_buttona_tiklar() {
viceDeanPage.menuButonuViceDean.click();
    }
    @Given("kullanici Contact Get All secer")
    public void kullanici_contact_get_all_secer() {
        contactGetAllPage.contactGetAll.click();
    }
    @Given("Vice Dean mesajlari goruntuler")
    public void vice_dean_mesajlari_goruntuler() {
        Assert.assertTrue(viceDeanPage.contactMessage.isDisplayed());
    }
    @Given("Vice Dean yazarlari goruntuler")
    public void vice_dean_yazarlari_goruntuler() {

    }
    @Given("Vice Dean email hesaplari goruntuler")
    public void vice_dean_email_hesaplari_goruntuler() {

    }
    @Given("Vice Dean gonderilme tarihini goruntuler")
    public void vice_dean_gonderilme_tarihini_goruntuler() {

    }
    @Given("Vice Dean subject bilgilerini goruntuler")
    public void vice_dean_subject_bilgilerini_goruntuler() {

    }




}
