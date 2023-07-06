package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ContactMessagePage;
import pages.ContactPage;
import pages.HomePage;
import pages.MainMenuPanel;
import utilities.ReusableMethods;

public class ContactStepDefinition {

    HomePage homePage = new HomePage();
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    ContactMessagePage contactMessagePage = new ContactMessagePage();

    public String invalidEmail1 = "mary@clanen";
    public String invalidEmail2 = "mary.clane";
    public String invalidEmail3 = "mary@clane.";
    public String expectedName = "Name";
    public String expectedEmail = "Email";
    public String expectedDate = "Date";
    public String expectedSubject = "Subject";
    public String expectedMessage = "Message";
    public String expectedRequired = "Required";

    @When("kullanici Contact butonuna tiklar")
    public void kullaniciContactButonunaTiklar() {
        homePage.contactButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("kullanici Your Name alanina valid bir deger girer")
    public void kullaniciYourNameAlaninaValidBirDegerGirer() {
        contactPage.name.click();
        contactPage.name.sendKeys(ReusableMethods.createName());
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Your Name alanina bir deger girilebildigini dogrular")
    public void kullaniciYourNameAlaninaBirDegerGirilebildiginiDogrular() {
        Assert.assertFalse(ReusableMethods.getValueByJS("name").isEmpty());
    }

    @And("kullanici Your Email alanina valid bir deger girer")
    public void kullaniciYourEmailAlaninaValidBirDegerGirer() {
        contactPage.email.click();
        contactPage.email.sendKeys(ReusableMethods.createEmail());
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Your Email alanina bir deger girilebildigini dogrular")
    public void kullaniciYourEmailAlaninaBirDegerGirilebildiginiDogrular() {
        Assert.assertFalse(ReusableMethods.getValueByJS("email").isEmpty());
    }

    @Then("kullanici girilen degerde {string} ve {string} karakterlerinin oldugunu dogrular")
    public void kullaniciGirilenDegerdeKarakterininOldugunuDogrular(String karakter1, String karakter2) {
        ReusableMethods.waitFor(2);
        String value = ReusableMethods.getValueByJS("email");
        Assert.assertTrue(value.contains(karakter1) && value.contains(karakter2));
    }

    @And("kullanici Subject alanina valid bir deger girer")
    public void kullaniciSubjectAlaninaValidBirDegerGirer() {
        contactPage.subject.click();
        contactPage.subject.sendKeys(faker.shakespeare().romeoAndJulietQuote());
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Subject alanina bir deger girilebildigini dogrular")
    public void kullaniciSubjectAlaninaBirDegerGirilebildiginiDogrular() {
        Assert.assertFalse(ReusableMethods.getValueByJS("subject").isEmpty());
    }

    @And("kullanici Message alanina valid bir deger girer")
    public void kullaniciMessageAlaninaValidBirDegerGirer() {
        ReusableMethods.scrollIntoViewJS(contactPage.message);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(contactPage.message);
        ReusableMethods.waitFor(2);
        contactPage.message.sendKeys(faker.shakespeare().hamletQuote());
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Message alanina bir deger girilebildigini dogrular")
    public void kullaniciMessageAlaninaBirDegerGirilebildiginiDogrular() {
        Assert.assertFalse(ReusableMethods.getValueByJS("message").isEmpty());
    }

    @And("kullanici Send Message butonuna tiklar")
    public void kullaniciSendMessageButonunaTiklar() {
        ReusableMethods.clickByJS(contactPage.sendMessage);
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici Mesajin basarili bir sekilde gonderildigini dogrular")
    public void kullaniciMesajinBasariliBirSekildeGonderildiginiDogrular() {
        Assert.assertTrue(contactPage.successfully.isDisplayed());
    }

    @And("kullanici Your Name alanini bos birakir")
    public void kullaniciYourNameAlaniniBosBirakir() {
        contactPage.name.click();
        contactPage.name.sendKeys(Keys.TAB);
    }

    @Then("kullanici Mesajin gonderilemedigini dogrular")
    public void kullaniciMesajinGonderilemediginiDogrular() {
        Assert.assertTrue(contactPage.unsuccessfully.isDisplayed());
    }

    @And("kullanici Your Name alanina space karakteri girer")
    public void kullaniciYourNameAlaninaSpaceKarakteriGirer() {
        contactPage.name.click();
        contactPage.name.sendKeys(" ");
    }

    @And("kullanici Subject alanini bos birakir")
    public void kullaniciSubjectAlaniniBosBirakir() {
        contactPage.subject.click();
        contactPage.subject.sendKeys(Keys.TAB);
    }

    @And("kullanici Message alanini bos birakir")
    public void kullaniciMessageAlaniniBosBirakir() {
        contactPage.message.click();
        contactPage.message.sendKeys(Keys.TAB);
    }

    @And("kullanici Your Email alanini bos birakir")
    public void kullaniciYourEmailAlaniniBosBirakir() {
        contactPage.email.click();
        contactPage.email.sendKeys(Keys.TAB);
    }

    @And("kullanici Your Email alanina space ile baslayan bir deger girer")
    public void kullaniciYourEmailAlaninaSpaceIleBaslayanBirDegerGirer() {
        contactPage.email.click();
        contactPage.email.sendKeys(" " + ReusableMethods.createEmail());
    }

    @And("kullanici Your Email alanina . icermeyen bir deger girer")
    public void kullaniciYourEmailAlaninaNoktaIcermeyenBirDegerGirer() {
        contactPage.email.click();
        contactPage.email.sendKeys(invalidEmail1);
    }

    @And("kullanici Your Email alanina @ icermeyen bir deger girer")
    public void kullaniciYourEmailAlaninaIcermeyenBirDegerGirer() {
        contactPage.email.click();
        contactPage.email.sendKeys(invalidEmail2);
    }

    @And("kullanici Your Email alanina {string} sonrasi bos deger girer")
    public void kullaniciYourEmailAlaninaSonrasiBosDegerGirer(String arg0) {
        contactPage.email.click();
        contactPage.email.sendKeys(invalidEmail3);
    }

    @And("Dean Menu butonuna tiklar")
    public void deanMenuButonunaTiklar() {
        homePage.menuButton.click();
    }

    @And("Dean Contact Get All yazisina tiklar")
    public void deanContactGetAllYazisinaTiklar() {
        mainMenuPanel.contactGetAllButton.click();
    }

    @Then("Dean sayfada mesaj yazarlarinin goruntulendigini dogrular")
    public void deanSayfadaMesajYazarlarininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedName, contactMessagePage.name.getText());
    }

    @Then("Dean sayfada mesaj yazarlarina ait emaillerin goruntulendigini dogrular")
    public void deanSayfadaMesajYazarlarinaAitEmaillerinGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedEmail, contactMessagePage.email.getText());
    }

    @Then("Dean sayfada mesajlarin gonderilme tarihinin goruntulendigini dogrular")
    public void deanSayfadaMesajlarinGonderilmeTarihininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedDate, contactMessagePage.date.getText());
    }

    @Then("Dean sayfada mesajlarin subject bilgisinin goruntulendigini dogrular")
    public void deanSayfadaMesajlarinSubjectBilgisininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedSubject, contactMessagePage.subject.getText());
    }

    @Then("Dean sayfada mesajlarin goruntulendigini dogrular")
    public void deanSayfadaMesajlarinGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedMessage, contactMessagePage.message.getText());
    }

    @And("Dean Delete butonuna tiklar")
    public void deanDeleteButonunaTiklar() {
        contactMessagePage.deleteButton.click();
    }

    @Then("Dean sayfada istedigi mesajin silindigini dogrular")
    public void deanSayfadaIstedigiMesajinSilindiginiDogrular() {
        String nameFirst = contactMessagePage.nameFirstCreated.getText();
        Assert.assertEquals(nameFirst, contactMessagePage.nameFirstCreated.getText());
    }

    @And("Vice Dean Menu butonuna tiklar")
    public void viceDeanMenuButonunaTiklar() {
        homePage.menuButton.click();
    }

    @And("Vice Dean Contact Get All yazisina tiklar")
    public void viceDeanContactGetAllYazisinaTiklar() {
        mainMenuPanel.contactGetAllButton.click();
    }

    @Then("Vice Dean sayfada mesaj yazarlarinin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajYazarlarininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedName, contactMessagePage.name.getText());
    }

    @Then("Vice Dean sayfada mesaj yazarlarina ait emaillerin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajYazarlarinaAitEmaillerinGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedEmail, contactMessagePage.email.getText());
    }

    @Then("Vice Dean sayfada mesajlarin gonderilme tarihinin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajlarinGonderilmeTarihininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedDate, contactMessagePage.date.getText());
    }

    @Then("Vice Dean sayfada mesajlarin subject bilgisinin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajlarinSubjectBilgisininGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedSubject, contactMessagePage.subject.getText());
    }

    @Then("Vice Dean sayfada mesajlarin goruntulendigini dogrular")
    public void viceDeanSayfadaMesajlarinGoruntulendiginiDogrular() {
        Assert.assertEquals(expectedMessage, contactMessagePage.message.getText());
    }

    @And("Vice Dean Delete butonuna tiklar")
    public void viceDeanDeleteButonunaTiklar() {
        contactMessagePage.deleteButton.click();
    }

    @Then("Vice Dean sayfada istedigi mesajin silindigini dogrular")
    public void viceDeanSayfadaIstedigiMesajinSilindiginiDogrular() {
        String nameFirst = contactMessagePage.nameFirstCreated.getText();
        Assert.assertEquals(nameFirst, contactMessagePage.nameFirstCreated.getText());
    }

    @Then("kullanici Required yazisini gorur")
    public void kullaniciRequiredYazisiniGorur() {
        Assert.assertEquals(expectedRequired, contactPage.required.getText());
    }

}
