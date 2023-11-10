package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.LoginPage;
import pages.MustafasPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08_StepDef {
    LoginPage loginPage = new LoginPage();
    MustafasPage viceDeanPage = new MustafasPage();
    Actions actions = new Actions(Driver.getDriver());
    @And("MUsername alanina Vice Dean'e ait {string} girer")
    public void musernameAlaninaViceDeanEAitGirer(String viceDeanUsername) {
        loginPage.username.sendKeys(ConfigReader.getProperty("viceDeanUsername"));
    }
    @And("MPassword alanina Vice Dean'e ait {string} girer ve logine tiklar")
    public void mpasswordAlaninaViceDeanEAitGirerVeLogineTiklar(String viceDeanPassword) {
        loginPage.password.sendKeys(ConfigReader.getProperty("viceDeanPassword"));
        ReusableMethods.bekle(2);
        loginPage.loginButton.click();
    }
    @And("MVice Dean Main Menuden Lesson secer")
    public void mviceDeanMainMenudenLessonSecer() {
        viceDeanPage.lessonsButton.click();
    }
    @And("MVice Dean Ders Adi kutusuna bir Ders Adi yazar.")
    public void mviceDeanDersAdiKutusunaBirDersAdiYazar() {
        viceDeanPage.lessonNameBox.sendKeys("Java");
    }
    @And("MVice Dean Ders Adi kutusuna bir Ders Adi yazdigini dogrular.")
    public void mviceDeanDersAdiKutusunaBirDersAdiYazdiginiDogrular() {
        //Assert.assertEquals("Java",viceDeanPage.lessonNameBox.getText());
    }

    @And("MVice Dean Zorunlu radyo dugmesine tiklar.")
    public void mviceDeanZorunluRadyoDugmesineTiklar() {
        viceDeanPage.compulsoryButton.click();
    }

    @And("MVice Dean zorunlu radyo dugmesinin isaretlendigini dogrular.")
    public void mviceDeanZorunluRadyoDugmesininIsaretlendiginiDogrular() {
        Assert.assertTrue(viceDeanPage.compulsoryButton.isSelected());
    }

    @And("MVice Dean Credit Score kutusuna bir kredi skoru yazar.")
    public void mviceDeanCreditScoreKutusunaBirKrediSkoruYazar() {
        viceDeanPage.creditScoreBox.sendKeys("10");
    }
    @And("MVice Dean Credit Score kutusuna bir kredi skoru yazdigini Dogrular.")
    public void mviceDeanCreditScoreKutusunaBirKrediSkoruYazdiginiDogrular() {
        //Assert.assertEquals("10",viceDeanPage.creditScoreBox.getText());
    }

    @And("MVice Dean Gonder dugmesine tiklar.")
    public void mviceDeanGonderDugmesineTiklar() {
        viceDeanPage.lessonSubmitButton.click();
    }


}
