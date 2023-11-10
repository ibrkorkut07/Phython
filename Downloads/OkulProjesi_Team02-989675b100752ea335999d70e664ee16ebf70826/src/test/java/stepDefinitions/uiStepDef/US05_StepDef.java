package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.LoginPage;
import pages.MustafasPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05_StepDef {
    LoginPage loginPage = new LoginPage();

    MustafasPage adminPage = new MustafasPage();
      Actions actions = new Actions(Driver.getDriver());
    @Given("MKullanici {string} sayfasina gider.")
    public void mkullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @And("MKullanici {int} saniye bekler")
    public void mkullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }
    @Then("MKullanici logine tiklar")
    public void mkullaniciLogineTiklar() {
        loginPage.login.click();
    }
    @And("MUsername alanina Admin'e ait {string} girer")
    public void musernameAlaninaAdminEAitGirer(String adminUsername) {
        loginPage.username.sendKeys(ConfigReader.getProperty("adminUsername"));
    }
    @And("MPassword alanina Admin'e ait {string} girer ve logine tiklar")
    public void mpasswordAlaninaAdminEAitGirerVeLogineTiklar(String adminPassword) {
        loginPage.password.sendKeys(ConfigReader.getProperty("adminPassword"));
        ReusableMethods.bekle(2);
        loginPage.loginButton.click();
    }
    @And("MKullanici Sayfaya giris yaptigini dogrular")
    public void mkullaniciSayfayaGirisYaptiginiDogrular() {
        String expectedData = "Admin Management";
        Assert.assertEquals(expectedData,loginPage.adminManagementDogrulama.getText());
    }
    @And("MKullanici Menu butonuna tiklar")
    public void mkullaniciMenuButonunaTiklar() {
        loginPage.menuButton.click();
    }

    @And("MAdmin Main Menuden Dean Management'i secer")
    public void madminMainMenudenDeanManagementISecer() {
        adminPage.deanManagementMenu.click();
    }
    @And("MAdmin Dean Management sayfasina girdigini dogrular")
    public void madminDeanManagementSayfasinaGirdiginiDogrular() {
        String expectedData = "Dean Management";
        Assert.assertEquals(expectedData, adminPage.deanManagementBaslik);
    }
    @And("MAdmin Dean List'te Name bilgilerini gorur")
    public void madminDeanListTeNameBilgileriniGorur() {
        String expectedData = "Name";
        Assert.assertEquals(expectedData, adminPage.nameColumn);
    }
    @And("MAdmin Dean List'te Gender bilgilerini gorur")
    public void madminDeanListTeGenderBilgileriniGorur() {
        String expectedData = "Gender";
        Assert.assertEquals(expectedData, adminPage.genderColumn);
    }
    @And("MAdmin Dean List'te Phone Number bilgilerini gorur")
    public void madminDeanListTePhoneNumberBilgileriniGorur() {
        String expectedData = "Phone Number";
        Assert.assertEquals(expectedData, adminPage.phoneColumn);
    }
    @And("MAdmin Dean List'te Ssn bilgilerini gorur")
    public void madminDeanListTeSsnBilgileriniGorur() {
        String expectedData = "Ssn";
        Assert.assertEquals(expectedData, adminPage.ssnColumn);
    }
    @And("MAdmin Dean List'te User Name bilgilerini gorur")
    public void madminDeanListTeUserNameBilgileriniGorur() {
        String expectedData = "User Name";
        Assert.assertEquals(expectedData, adminPage.userNameColumn);
    }
    @And("MSayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("MAdmin liste yaninda Sil butonun tiklar")
    public void madminListeYanindaSilButonunTiklar() {
        System.out.println("Sil butonuna tiklayamaz,sil butonu yoktur");
    }
    @And("MAdmin Listede kayitli Dean'i silebilmeli")
    public void madminListedeKayitliDeanISilebilmeli() {
        System.out.println("Silemez,sil butonu yoktur");
    }
    @And("MAdmin liste yaninda Edit butonun tiklar")
    public void madminListeYanindaEditButonunTiklar() {
        adminPage.editDeanList.click();
    }
    @And("MAdmin Listede kayitli Dean'i bilgilerini gunceller")
    public void madminListedeKayitliDeanIBilgileriniGunceller() {
        adminPage.deanNameEdit.clear();
        adminPage.deanNameEdit.sendKeys("Ali", Keys.TAB,"Veli",Keys.TAB,"Ankara",Keys.TAB,Keys.ENTER);
        ReusableMethods.bekle(2);
        adminPage.deanBirthDateEdit.clear();
        adminPage.deanBirthDateEdit.sendKeys("01/01/2001",Keys.TAB,"532-333-4444",Keys.TAB,
                "222-33-1111",Keys.TAB,"DeanAli",Keys.TAB,"DeanAli123");
        ReusableMethods.bekle(2);
    }
    @And("MAdmin Sabmit butonuna tiklar")
    public void madminSabmitButonunaTiklar() {
        adminPage.deanSubmitEdit.click();
    }
    @And("MAdmin Dean'in bilgilerinin guncelledigini gorur")
    public void madminDeanInBilgilerininGuncellediginiGorur() {
        Assert.assertEquals("Ali", adminPage.deanNameEdit.getText());
        Assert.assertEquals("Veli", adminPage.deanSurnameEdit.getText());
        Assert.assertEquals("Ankara", adminPage.deanBirthPlaceEdit.getText());
        Assert.assertEquals("Female", adminPage.deanGenderFemaleEdit.getText());
        Assert.assertEquals("01/01/2001", adminPage.deanBirthDateEdit.getText());
        Assert.assertEquals("532-333-4444", adminPage.deanPhoneNumberEdit.getText());
        Assert.assertEquals("222-33-1111", adminPage.deanSsnEdit.getText());
        Assert.assertEquals("DeanAli", adminPage.deanUsernameEdit.getText());
        Assert.assertEquals("DeanAli123", adminPage.deanPasswordEdit.getText());
    }
}
