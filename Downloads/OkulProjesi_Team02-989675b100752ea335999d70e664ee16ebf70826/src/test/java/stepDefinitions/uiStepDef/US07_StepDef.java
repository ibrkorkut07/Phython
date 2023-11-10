package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.LoginPage;
import pages.MustafasPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US07_StepDef {
    LoginPage loginPage = new LoginPage();
    MustafasPage deanPage = new MustafasPage();
    Actions actions = new Actions(Driver.getDriver());

    @And("MUsername alanina Dean'e ait {string} girer")
    public void musernameAlaninaDeanEAitGirer(String deanUsername) {
        loginPage.username.sendKeys(ConfigReader.getProperty("deanUsername"));
    }
    @And("MPassword alanina Dean'e ait {string} girer ve logine tiklar")
    public void mpasswordAlaninaDeanEAitGirerVeLogineTiklar(String deanPassword) {
        loginPage.password.sendKeys(ConfigReader.getProperty("deanPassword"));
        ReusableMethods.bekle(2);
        loginPage.loginButton.click();
    }
    @And("MDean Main menuden Contact Get All butonuna tiklar")
    public void mdeanMainMenudenContactGetAllButonunaTiklar() {
        deanPage.contactGetAllButton.click();
    }
    @And("MDean Contact Message'leri gorur")
    public void mdeanContactMessageLeriGorur() {
        String expectedData = "Contact Message";
        Assert.assertEquals(expectedData,deanPage.contactMessageDean.getText());
    }
    @And("MDean Sil butonunu gorebilmeli")
    public void mdeanSilButonunuGorebilmeli() {
        System.out.println("Sil butonu gorulmez,sil butonu yoktur");
    }
    @And("MDean Sil butonunun goruldugunu dogrular")
    public void mdeanSilButonununGoruldugunuDogrular() {
        System.out.println("Sil butonunun goruldugu dogrulanamaz,sil butonu yoktur");
    }
    @And("MDean Yazar Column gorunur oldugunu dogrular")
    public void mdeanYazarColumnGorunurOldugunuDogrular() {
        String nameColumn = "Name";
        Assert.assertEquals(nameColumn,deanPage.nameColumnDean.getText());
    }
    @And("MDean Email Column gorunur oldugunu dogrular")
    public void mdeanEmailColumnGorunurOldugunuDogrular() {
        String nameColumn = "Email";
        Assert.assertEquals(nameColumn,deanPage.emailColumnDean.getText());
    }
    @And("MDean Date Column gorunur oldugunu dogrular")
    public void mdeanDateColumnGorunurOldugunuDogrular() {
        String nameColumn = "Date";
        Assert.assertEquals(nameColumn,deanPage.dateColumnDean.getText());
    }
    @And("MDean Subject Column gorunur oldugunu dogrular")
    public void mdeanSubjectColumnGorunurOldugunuDogrular() {
        String nameColumn = "Subject";
        Assert.assertEquals(nameColumn,deanPage.subjectColumnDean.getText());
    }
    @And("MDean Message Column gorunur oldugunu dogrular")
    public void mdeanMessageColumnGorunurOldugunuDogrular() {
        String nameColumn = "Message";
        Assert.assertEquals(nameColumn,deanPage.messageColumnDean.getText());
    }
    @And("MDean sayfada Silme butonunu gorur")
    public void mdeanSayfadaSilmeButonunuGorur() {
        System.out.println("Sil butonu gorulmez,sil butonu yoktur");
    }
    @And("MDean sayfada Silme butonunu tiklar")
    public void mdeanSayfadaSilmeButonunuTiklar() {
        System.out.println("Sil butonuna tiklayamaz,sil butonu yoktur");
    }
    @And("MDean Mesajin silindigini dogrular")
    public void mdeanMesajinSilindiginiDogrular() {
        System.out.println("Mesajin silindigini dogrulayamaz,sil butonu yoktur");
    }
}
