package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.DeanManagementPage;
import pages.HomePage;
import pages.MainMenuPanel;
import pages.ViceDeanManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ViceDeanManagementStepDefinition {

    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    HomePage homePage = new HomePage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    Faker faker = new Faker();
    public static String bos = "";
    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
    public static Faker fakerStatic = new Faker();
    public static String rakam = fakerStatic.phoneNumber().subscriberNumber(1);
    public static String numberIkiHane = fakerStatic.phoneNumber().subscriberNumber(2);
    public static String numberUcHane = fakerStatic.phoneNumber().subscriberNumber(3);
    public static String numberDortHane = fakerStatic.phoneNumber().subscriberNumber(4);

    @Given("Name alani bos birakilir")
    public void nameAlaniBosBirakilir() {
        deanManagementPage.nameBox.sendKeys(bos, Keys.TAB);
        ReusableMethods.waitFor(1);
        assert deanManagementPage.nameRequired.getText().contains("Required");
    }

    @Given("Surname alanini bos birakir")
    public void surnameAlaniniBosBirakir() {
        deanManagementPage.surnameBox.sendKeys(bos, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.surnameRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Given("Birth_Place alani  bos birakilir")
    public void birth_placeAlaniBosBirakilir() {
        deanManagementPage.birthPlaceBox.sendKeys(bos, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.birthPlaceRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Given("Date Of Birth alani bos birakilir")
    public void dateOfBirthAlaniBosBirakilir() {
        deanManagementPage.birthdayBox.sendKeys(bos, Keys.TAB);
        ReusableMethods.waitFor(1);
        assert deanManagementPage.birthPlaceRequired.getText().contains("Required");
    }

    @Given("Phone_Number alani bos olarak birakilir")
    public void phone_numberAlaniBosOlarakBirakilir() {
        deanManagementPage.phoneNumberBox.sendKeys(bos, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.phoneRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Given("SSN alanini bos birakilir")
    public void ssnAlaniniBosBirakilir() {
        deanManagementPage.ssnBox.sendKeys(bos, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.ssnRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Dean Gender bolumunde gecerli bir secim yapilir")
    public void deanGenderBolumundeGecerliBirSecimYapilir() {
        deanManagementPage.genderMale.click();
    }

    @Then("Date Of Birth kutusuna bir deger girilir")
    public void dateOfBirthKutusunaBirDegerGirilir() {
        deanManagementPage.birthdayBox.sendKeys(ReusableMethods.createDateOfBirth());
    }

    @Given("Ssn alanina ucuncü rakamdan sonra - isareti koymadan Ssn numarasi girer.")
    public void ssn_alanina_ucuncü_rakamdan_sonra_isareti_koymadan_ssn_numarasi_girer() {
        deanManagementPage.phoneNumberBox.sendKeys(faker.number().digits(4));
        ReusableMethods.waitFor(1);
        Assert.assertTrue(deanManagementPage.ssnRequired.isDisplayed());
    }

    @Given("Ssn alanina besinci rakamdan sonra - isareti koymadan Ssn numarasi girer.")
    public void ssn_alanina_besinci_rakamdan_sonra_isareti_koymadan_ssn_numarasi_girer() {
        deanManagementPage.phoneNumberBox.sendKeys(faker.number().digits(6));
        ReusableMethods.waitFor(1);
        Assert.assertTrue(deanManagementPage.ssnRequired.isDisplayed());
    }

    @Given("User name alanini bos birakilir")
    public void userNameAlaniniBosBirakilir() {
        deanManagementPage.usernameBox.sendKeys(bos, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.userNameRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Given("Password alanini bos birakilir")
    public void passwordAlaniniBosBirakilir() {
        deanManagementPage.passwordBox.sendKeys(bos, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert deanManagementPage.passwordRequired.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Given("Password alanina yedi karakterden az bir deger girer")
    public void password_alanina_yedi_karakterden_az_bir_deger_girer() {
        deanManagementPage.passwordBox.sendKeys(faker.number().digits(6));
        ReusableMethods.waitFor(1);
        Assert.assertTrue(deanManagementPage.passwordAlert.isDisplayed());
    }

    @Given("Password alanina yedi karakterli bir deger girer")
    public void passwordAlaninaYediKarakterliBirDegerGirer() {
        deanManagementPage.passwordBox.sendKeys(faker.number().digits(7));
        ReusableMethods.waitFor(1);
        Assert.assertTrue(deanManagementPage.passwordAlert.isDisplayed());
    }

    @And("Logout islemi gerceklestirilir")
    public void logoutIslemiGerceklestirilir() {
        homePage.menuButton.click();
        mainMenuPanel.logoutButton.click();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Then("Kullanacı Menu butonuna tıklar.")
    public void kullanacı_menu_butonuna_tıklar() {
        ReusableMethods.waitFor(2);
        viceDeanManagementPage.menuButton.click();
    }

    @Then("Kullancı açılan menüden Vice Dean Management e tıklar.")
    public void kullancı_açılan_menüden_vice_dean_management_e_tıklar() {
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.viceDeanManagementButton.click();
    }

    @When("Kullancı Name alanına isim girer.")
    public void kullancı_name_alanına_isim_girer() {
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.nameBox.sendKeys(ReusableMethods.createName());
    }

    @When("Kullanıcı Surname alanına soyisim girer.")
    public void kullanıcı_surname_alanına_soyisim_girer() {
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.surnameBox.sendKeys(ReusableMethods.createSurname());
    }

    @When("Kullanıcı Birth Place alanına doğum yeri girer.")
    public void kullanıcı_birth_place_alanına_doğum_yeri_girer() {
        viceDeanManagementPage.birthPlaceBox.sendKeys(ReusableMethods.createBirthPlace());
    }

    @When("Kullanıcı Gender alanından cinsiyet seçer.")
    public void kullanıcı_gender_alanından_cinsiyet_seçer() {
        if (Integer.parseInt(rakam) % 2 == 0) {
            viceDeanManagementPage.genderFemale.click();
        } else {
            viceDeanManagementPage.genderMale.click();
        }
    }

    @When("Kulancı Date Of Birth alanına doğum tarihi girer.")
    public void kulancı_date_of_birth_alanına_doğum_tarihi_girer() {
        viceDeanManagementPage.birthdayBox.sendKeys(ReusableMethods.createDateOfBirth());
    }

    @When("Kullanıcı Phone alanına uygun formatta telefon numarası girer.")
    public void kullanıcı_phone_alanına_uygun_formatta_telefon_numarası_girer() {
        viceDeanManagementPage.phoneNumberBox.sendKeys(numberUcHane + "-" + numberUcHane + "-" + numberDortHane);
    }

    @When("Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.")
    public void kullanıcı_ssn_alanına_uygun_formatta_ssn_numarası_girer() {
        viceDeanManagementPage.ssnBox.sendKeys(ReusableMethods.createSSN());
    }

    @When("Kullancı User Name alanına user name girer.")
    public void kullancı_user_name_alanına_user_name_girer() {
        viceDeanManagementPage.usernameBox.sendKeys(ReusableMethods.createUserName());
    }

    @When("Kullancı Password alanına uygun formatta şifre girer.")
    public void kullancı_password_alanına_uygun_formatta_şifre_girer() {
        viceDeanManagementPage.passwordBox.sendKeys(ReusableMethods.createPassword());
    }

    @When("Kullanıcı Submit butonuna tıklar.")
    public void kullanıcı_submit_butonuna_tıklar() {
        ReusableMethods.waitFor(2);
        viceDeanManagementPage.submitButton.click();
    }

    @Then("Vice Dean saved mesajı çıkar ve vice dean oluşturulur.")
    public void vice_dean_saved_mesajı_çıkar_ve_vice_dean_oluşturulur() {
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(viceDeanManagementPage.viceDeanSaved, 5);
        Assert.assertTrue(viceDeanManagementPage.viceDeanSaved.isDisplayed());
    }

    @Then("Kullanıcı Name alanını boş bırakır.")
    public void kullanıcıNameAlanınıBoşBırakır() {
        viceDeanManagementPage.nameBox.sendKeys("", Keys.TAB);
    }

    @Then("Name kısmının altında Required yazısı çıkar.")
    public void nameKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Surname alanını boş bırakır.")
    public void kullanıcıSurnameAlanınıBoşBırakır() {
        viceDeanManagementPage.surnameBox.sendKeys("", Keys.TAB);
    }

    @Then("Surname kısmının altında Required yazısı çıkar.")
    public void surnameKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Birth Place alanını boş bırakır.")
    public void kullanıcıBirthPlaceAlanınıBoşBırakır() {
        viceDeanManagementPage.birthPlaceBox.sendKeys("", Keys.TAB);
    }

    @Then("Birth Place kısmının altında Required yazısı çıkar.")
    public void birthPlaceKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Birth of Date alanını boş bırakır.")
    public void kullanıcıBirthOfDateAlanınıBoşBırakır() {
        viceDeanManagementPage.birthdayBox.sendKeys("", Keys.TAB);
    }

    @Then("Birth of Date kısmının altında Required yazısı çıkar.")
    public void birthOfDateKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Phone alanını boş bırakır.")
    public void kullanıcıPhoneAlanınıBoşBırakır() {
        viceDeanManagementPage.phoneNumberBox.sendKeys("", Keys.TAB);
    }

    @Then("Phone kısmının altında Required yazısı çıkar.")
    public void phoneKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Ssn alanını boş bırakır.")
    public void kullanıcıSsnAlanınıBoşBırakır() {
        viceDeanManagementPage.ssnBox.sendKeys("", Keys.TAB);
    }

    @Then("Ssn kısmının altında Required yazısı çıkar.")
    public void ssnKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Ssn alanına üçüncü rakamdan sonra - işareti koymadan Ssn numarası girer.")
    public void kullanıcıSsnAlanınaÜçüncüRakamdanSonraIşaretiKoymadanSsnNumarasıGirer() {
        viceDeanManagementPage.ssnBox.sendKeys(numberUcHane + numberIkiHane + "-" + numberDortHane);
    }

    @Then("Ssn kısmının altında Minimum {int} character \\(XXX-XX-XXXX) yazısı çıkar.")
    public void ssnKısmınınAltındaMinimumCharacterXXXXXXXXXYazısıÇıkar(int arg0) {
        Assert.assertTrue(viceDeanManagementPage.textofMinChar.isDisplayed());
    }

    @And("Kullanıcı Ssn alanına beşinci rakamdan sonra - işareti koymadan Ssn numarası girer.")
    public void kullanıcıSsnAlanınaBeşinciRakamdanSonraIşaretiKoymadanSsnNumarasıGirer() {
        viceDeanManagementPage.ssnBox.sendKeys(numberUcHane + "-" + numberIkiHane + numberDortHane);
    }

    @And("Kullanıcı Ssn alanına üçüncü ve beşinci rakamdan sonra - işareti koymadan Ssn numarası girer.")
    public void kullanıcıSsnAlanınaÜçüncüVeBeşinciRakamdanSonraIşaretiKoymadanSsnNumarasıGirer() {
        viceDeanManagementPage.ssnBox.sendKeys(numberUcHane + numberIkiHane + numberDortHane);
    }

    @And("Kullanıcı User Name alanını boş bırakır.")
    public void kullanıcıUserNameAlanınıBoşBırakır() {
        viceDeanManagementPage.usernameBox.sendKeys("", Keys.TAB);
    }

    @Then("User Name kısmının altında Required yazısı çıkar.")
    public void userNameKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Password alanını boş bırakır.")
    public void kullanıcıPasswordAlanınıBoşBırakır() {
        viceDeanManagementPage.passwordBox.sendKeys("", Keys.TAB);
    }

    @Then("Password kısmının altında Required yazısı çıkar.")
    public void passwordKısmınınAltındaRequiredYazısıÇıkar() {
        Assert.assertTrue(viceDeanManagementPage.textofRequired.isDisplayed());
    }

    @And("Kullanıcı Password kısmına yedi karakterden az karakter girer.")
    public void kullanıcıPasswordKısmınaYediKarakterdenAzKarakterGirer() {
        viceDeanManagementPage.passwordBox.sendKeys(fakerStatic.internet().password(1, 7));
    }

    @Then("Password kısmının altında Minimum {int} character yazısı çıkar.")
    public void passwordKısmınınAltındaMinimumCharacterYazısıÇıkar(int arg0) {
        Assert.assertTrue(viceDeanManagementPage.textofMinpassword.isDisplayed());
    }

    @And("Kullanıcı Password kısmına yedi karakter girer.")
    public void kullanıcıPasswordKısmınaYediKarakterGirer() {
        viceDeanManagementPage.passwordBox.sendKeys(fakerStatic.internet().password(7, 8));
    }

    @And("Kullanıcı Gender alanından cinsiyeti boş bırakır.")
    public void kullanıcıGenderAlanındanCinsiyetiBoşBırakır() {
    }

    @Then("Vice Dean hesabı oluşturulmaz.")
    public void viceDeanHesabıOluşturulmaz() {
        Assert.assertEquals(0, Driver.getDriver().findElements(By.xpath("//div[text()='Vice dean Saved']")).size());
    }

}
