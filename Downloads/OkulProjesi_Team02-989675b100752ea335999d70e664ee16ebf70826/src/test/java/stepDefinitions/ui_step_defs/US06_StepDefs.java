package stepDefinitions.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DeanPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US06_StepDefs {

    LoginPage loginPage = new LoginPage();
    DeanPage deanPage = new DeanPage();
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String surname = faker.name().lastName();
    String birthPlace = faker.address().city();
    Date dateOfBirth1 = faker.date().birthday(40, 70);
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    String dateOfBirth2 = format.format(dateOfBirth1);
    String phone1 = faker.number().numberBetween(100,999)+"-"+
                    faker.number().numberBetween(100,999)+"-"+
                    faker.number().numberBetween(1000,9999);
    String phone2 = faker.number().numberBetween(100,999)+"/"+
            faker.number().numberBetween(100,999)+"/"+
            faker.number().numberBetween(1000,9999);
    String phone3 = faker.number().numberBetween(11111, 99999)+""+
                    faker.number().numberBetween(11111,99999);
    String phone4 = faker.number().numberBetween(111111, 999999)+""+
                    faker.number().numberBetween(111111, 999999);

    String ssn1 = faker.number().numberBetween(100,999)+"-"+
                 faker.number().numberBetween(10,99)+"-"+
                 faker.number().numberBetween(1000, 9999);
    String ssn2 = faker.number().numberBetween(100,999)+"+"+
            faker.number().numberBetween(10,99)+"-"+
            faker.number().numberBetween(1000, 9999);
    String ssn3 = faker.number().numberBetween(100,999)+"-"+
            faker.number().numberBetween(10,99)+"!"+
            faker.number().numberBetween(1000, 9999);
    String ssn4 = faker.number().numberBetween(10, 99)+"-"+
            faker.number().numberBetween(1000, 9999)+"-"+
            faker.number().numberBetween(100, 999);
    String ssn5 = faker.number().numberBetween(10000,99999)+""+
            faker.number().numberBetween(1000,9999);
    String ssn6 = faker.number().numberBetween(100000,999999)+""+
            faker.number().numberBetween(10000,99999);
    String username = faker.name().username();
    String password1 = faker.number().numberBetween(1000, 9999) + "RBrb";
    String password2 = faker.number().numberBetween(100, 999) + "RBrb";
    String password3 = faker.number().numberBetween(10000, 99999) + "RBrb";
    String password4 = faker.number().numberBetween(1000, 9999) +"RBRB";
    String password5 = faker.number().numberBetween(1000, 9999) +"rbrb";
    String password6 = faker.internet().password(4,8, true, false, false)+ "rbrb";

    @Given("Kullanici web sitesine giderRB")
    public void kullaniciWebSitesineGiderRB() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Kullanici kayitli bir Dean hesabi ile giris yaparRB")
    public void kullaniciKayitliBirDeanHesabiIleGirisYaparRB() {
        loginPage.login.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("deanUsername"), Keys.TAB,
                ConfigReader.getProperty("deanPassword"));
        ReusableMethods.bekle(1);
        loginPage.loginButton.click();
        ReusableMethods.bekle(2);
    }

    @Given("Kullanici Vice Dean Management sayfasinda Name alanina bir isim girerRB")
    public void kullaniciViceDeanManagementSayfasindaNameAlaninaBirIsimGirerRB() {
        deanPage.viceDeanNameRB.sendKeys(name);
    }

    @When("Surname alanina bir soyisim girerRB")
    public void surnameAlaninaBirSoyisimGirerRB() {
        deanPage.viceDeanSurnameRB.sendKeys(surname);
    }

    @And("Birth Place alanina dogum yeri girerRB")
    public void birthPlaceAlaninaDogumYeriGirerRB() {
        deanPage.viceDeanBirthPlaceRB.sendKeys(birthPlace);
    }

    @And("Gender alaninda {string} cinsiyet secerRB")
    public void genderAlanindaFemaleCinsiyetSecerRB(String expectedGenderRB) {
        deanPage.chooseGenderRB(expectedGenderRB);
    }

    @And("Date Of Birth alanini doldururRB")
    public void dateOfBirthAlaniniDoldururRB() {
        deanPage.viceDeanBirthDayRB.sendKeys(dateOfBirth2);
    }

    @And("Phone alanina telefon numarasi girerRB")
    public void phoneAlaninaTelefonNumarasiGirerRB() {
        deanPage.viceDeanPhoneRB.sendKeys(phone1);
    }

    @And("Ssn alanina bir Sosyal Guvenlik Numarasi girerRB")
    public void ssnAlaninaBirSosyalGuvenlikNumarasiGirerRB() {
        deanPage.viceDeanSsnRB.sendKeys(ssn1);
    }

    @And("Username alanina bir kullanici adi girerRB")
    public void usernameAlaninaBirKullaniciAdiGirerRB() {
        deanPage.viceDeanUsernameRB.sendKeys(username);
    }

    @And("Password alanina bir sifre girerRB")
    public void passwordAlaninaBirSifreGirerRB() {
        deanPage.viceDeanPasswordRB.sendKeys(password1);
    }

    @And("Submit butonuna tiklarRB")
    public void submitButonunaTiklarRB() {
        deanPage.viceDeanSubmitButtonRB.click();
        ReusableMethods.bekle(1);
    }

    @And("Vice dean saved mesajinin gorundugunu dogrularRB")
    public void viceDeanSavedMesajininGorundugunuDogrularRB() {
        Assert.assertTrue(deanPage.viceDeanSavedMessageRB.isDisplayed());
    }

    @Then("Sayfayi kapatirRB")
    public void sayfayiKapatirRB() {
        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }


    @Given("Kullanici Vice Dean Management sayfasinda Name, Surname, Birth Place, Gender, Date Of Birth, Phone, Ssn, Username ve Password alanlarini bos birakirRB")
    public void kullaniciViceDeanManagementSayfasindaNameSurnameBirthPlaceGenderDateOfBirthPhoneSsnUsernameVePasswordAlanlariniBosBirakirRB() {
        deanPage.viceDeanNameRB.sendKeys("", Keys.TAB, Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB);
        ReusableMethods.bekle(6);

    }


    @And("Kaydin gerceklesmedigini dogrularRB")
    public void kaydinGerceklesmediginiDogrularRB() {
        Assert.assertTrue(deanPage.nameRequiredRB.isDisplayed());
        Assert.assertTrue(deanPage.surnameRequiredRB.isDisplayed());
        Assert.assertTrue(deanPage.birthPlaceRequiredRB.isDisplayed());
        Assert.assertTrue(deanPage.dateOfBirthRequiredRB.isDisplayed());
        Assert.assertTrue(deanPage.phoneRequiredRB.isDisplayed());
        Assert.assertTrue(deanPage.ssnRequiredRB.isDisplayed());
        Assert.assertTrue(deanPage.usernameRequiredRB.isDisplayed());
        Assert.assertTrue(deanPage.enterYourPasswordRB.isDisplayed());
        ReusableMethods.bekle(3);
    }

    @Given("Kullanici Vice Dean Management sayfasinda Name, Surname, Birth Place, Gender {string} Date Of Birth, Ssn, Username ve Password alanlarini doldururRB")
    public void kullaniciViceDeanManagementSayfasindaNameSurnameBirthPlaceGenderFemaleDateOfBirthSsnUsernameVePasswordAlanlariniDoldururRB(String expectedGenderRB) {
        deanPage.viceDeanNameRB.sendKeys(name, Keys.TAB, surname, Keys.TAB, birthPlace);
        deanPage.chooseGenderRB(expectedGenderRB);
        deanPage.viceDeanBirthDayRB.sendKeys(dateOfBirth2, Keys.TAB, Keys.TAB, ssn1, Keys.TAB, username, Keys.TAB, password1);
    }

    @When("Phone alaninda tire isareti yerine baska bir isaret kullanirRB")
    public void phoneAlanindaTireIsaretiYerineBaskaBirIsaretKullanirRB() {
        deanPage.viceDeanPhoneRB.sendKeys(phone2);
    }

    @And("Please enter valid phone number mesajinin gorundugunu dogrularRB")
    public void pleaseEnterValidPhoneNumberMesajininGorundugunuDogrularRB() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(deanPage.enterValidPhoneNumberRB.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @And("Phone alanini temizlerRB")
    public void phoneAlaniniTemizlerRB() {
        ReusableMethods.clear("arguments[0].value = '';", deanPage.viceDeanPhoneRB);
        ReusableMethods.bekle(3);
    }

    @And("Phone alaninda tire isareti kullanmadan on haneli bir numara girerRB")
    public void phoneAlanindaTireIsaretiKullanmadanOnHaneliBirNumaraGirerRB() {
        deanPage.viceDeanPhoneRB.sendKeys(phone3);
    }

    @And("Minimum oniki character \\(XXX-XXX-XXXX) mesajinin gorundugunu dogrularRB")
    public void minimumOnikiCharacterXXXXXXXXXXMesajininGorundugunuDogrularRB() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(deanPage.minimum12characterRB.isDisplayed());
    }

    @And("Phone alaninda tire isareti kullanmadan oniki haneli bir numara girerRB")
    public void phoneAlanindaTireIsaretiKullanmadanOnikiHaneliBirNumaraGirerRB() {
        deanPage.viceDeanPhoneRB.sendKeys(phone4);
    }

    @Given("Kullanici Vice Dean Management sayfasinda Name, Surname, Birth Place, Gender {string} Date Of Birth, Phone, Username ve Password alanlarini doldururRB")
    public void kullaniciViceDeanManagementSayfasindaNameSurnameBirthPlaceGenderFemaleDateOfBirthPhoneUsernameVePasswordAlanlariniDoldururRB(String expectedGenderRB) {
        deanPage.viceDeanNameRB.sendKeys(name, Keys.TAB, surname, Keys.TAB, birthPlace);
        deanPage.chooseGenderRB(expectedGenderRB);
        deanPage.viceDeanBirthDayRB.sendKeys(dateOfBirth2, Keys.TAB, phone1, Keys.TAB, Keys.TAB, username, Keys.TAB, password1);
    }

    @When("Ssn alaninda ucuncu rakamdan sonra farkli bir isaret girerRB")
    public void ssnAlanindaUcuncuRakamdanSonraFarkliBirIsaretGirerRB() {
        deanPage.viceDeanSsnRB.sendKeys(ssn2);
    }

    @And("Please enter valid SSN number mesajinin gorundugunu dogrularRB")
    public void pleaseEnterValidSSNNumberMesajininGorundugunuDogrularRB() {
        Assert.assertTrue(deanPage.enterValidSsnNumberRB.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("Ssn alanini temizlerRB")
    public void ssnAlaniniTemizlerRB() {
        ReusableMethods.clear("arguments[0].value = '';", deanPage.viceDeanSsnRB);
        ReusableMethods.bekle(2);
    }

    @And("Ssn alaninda besinci rakamdan sonra farkli bir isaret girerRB")
    public void ssnAlanindaBesinciRakamdanSonraFarkliBirIsaretGirerRB() {
        deanPage.viceDeanSsnRB.sendKeys(ssn3);
    }

    @And("Ssn alaninda ikinci ve altinci rakamlardan sonra tire isareti girerRB")
    public void ssnAlanindaIkinciVeAltinciRakamlardanSonraTireIsaretiGirerRB() {
        deanPage.viceDeanSsnRB.sendKeys(ssn4);
    }

    @And("Ssn alaninda tire isareti kullanmadan dokuz haneli bir Ssn girerRB")
    public void ssnAlanindaTireIsaretiKullanmadanDokuzHaneliBirSsnGirerRB() {
        deanPage.viceDeanSsnRB.sendKeys(ssn5);
    }

    @And("Minimum onbir charakter \\(XXX-XX-XXXX) mesajinin gorundugunu dogrularRB")
    public void minimumOnbirCharakterXXXXXXXXXMesajininGorundugunuDogrularRB() {
        Assert.assertTrue(deanPage.minimum11characterRB.isDisplayed());
    }

    @And("Ssn alaninda tire isareti kullanmadan onbir haneli bir Ssn girerRB")
    public void ssnAlanindaTireIsaretiKullanmadanOnbirHaneliBirSsnGirerRB() {
        deanPage.viceDeanSsnRB.sendKeys(ssn6);
    }

   @Given("Kullanici Vice Dean Management sayfasinda Name, Surname, Birth Place, Gender {string} Date Of Birth, Phone, Ssn ve Username alanlarini doldururRB")
   public void kullaniciViceDeanManagementSayfasindaNameSurnameBirthPlaceGenderMaleDateOfBirthPhoneSsnVeUsernameAlanlariniDoldururRB(String expectedGenderRB) {
       deanPage.viceDeanNameRB.sendKeys(name, Keys.TAB, surname, Keys.TAB, birthPlace);
       deanPage.chooseGenderRB(expectedGenderRB);
       deanPage.viceDeanBirthDayRB.sendKeys(dateOfBirth2, Keys.TAB, phone1, Keys.TAB, ssn1, Keys.TAB, username);
   }

    @When("Password alanina yedi haneli bir sifre girerRB")
    public void passwordAlaninaYediHaneliBirSifreGirerRB() {
        deanPage.viceDeanPasswordRB.sendKeys(password2);
    }

    @And("At least sekiz characters mesajinin gorundugunu dogrularRB")
    public void atLeastSekizCharactersMesajininGorundugunuDogrularRB() {
        Assert.assertTrue(deanPage.atLeast8characterRB.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("Password alanini temizlerRB")
    public void passwordAlaniniTemizlerRB() {
        ReusableMethods.clear("arguments[0].value = '';", deanPage.viceDeanPasswordRB);
        ReusableMethods.bekle(2);
    }

    @And("Password alanina dokuz haneli bir sifre girerRB")
    public void passwordAlaninaDokuzHaneliBirSifreGirerRB() {
        deanPage.viceDeanPasswordRB.sendKeys(password3);
    }

    @When("Password alanina buyuk harf ve rakamlardan olusan bir sifre girer")
    public void passwordAlaninaBuyukHarfVeRakamlardanOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        deanPage.viceDeanPasswordRB.sendKeys(password4);
    }

    @And("One lowercse character mesajinin gorundugunu dogrular")
    public void oneLowercseCharacterMesajininGorundugunuDogrular() {
        Assert.assertTrue(deanPage.oneLowercaseCharacterRB.isDisplayed());
    }

    @And("Password alanina kucuk harf ve rakamlardan olusan bir sifre girer")
    public void passwordAlaninaKucukHarfVeRakamlardanOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        deanPage.viceDeanPasswordRB.sendKeys(password5);
    }

    @And("One uppercase character mesajinin gorundugunu dogrular")
    public void oneUppercaseCharacterMesajininGorundugunuDogrular() {
        Assert.assertTrue(deanPage.oneUppercaseCharacterRB.isDisplayed());
    }

    @And("Password alanina buyuk harf ve kucuk harflerden olusan bir sifre girer")
    public void passwordAlaninaBuyukHarfVeKucukHarflerdenOlusanBirSifreGirer() {
        ReusableMethods.bekle(2);
        deanPage.viceDeanPasswordRB.sendKeys(password6);
    }

    @And("One number mesajinin gorundugunu dogrular")
    public void oneNumberMesajininGorundugunuDogrular() {
        Assert.assertTrue(deanPage.oneNumberRB.isDisplayed());
    }


}
