package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.MainMenuPanel;
import pages.StudentManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class StudentManagementStepDefinition {

    HomePage homePage = new HomePage();
    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    StudentManagementPage studentManagementPage = new StudentManagementPage();
    String expectedUsername;
    String actualUsername;
    public static Faker faker = new Faker();
    public static String numberUcHane = faker.phoneNumber().subscriberNumber(3);
    public static String numberDortHane = faker.phoneNumber().subscriberNumber(4);
    public static String numberBesHane = faker.phoneNumber().subscriberNumber(5);
    public static int number1 = faker.number().numberBetween(1, 31);
    public static int number2 = faker.number().numberBetween(1, 12);
    public static int number3 = faker.number().numberBetween(1980, 2016);
    public static String araFormat = "-";
    public static String hic = "";
    public static String nokta = ".";
    public static String space = " ";
    Select select;
    public static String str = faker.regexify("./");
    String phoneNumber = numberUcHane + araFormat + numberUcHane + araFormat + numberUcHane;
    public static String numberIkiHane = faker.phoneNumber().subscriberNumber(2);
    public static String yildiz = "*";

    @When("Baslikta bulunan Menu butonuna tiklanir")
    public void baslikta_bulunan_menu_butonuna_tiklanir() {
        homePage.menuButton.click();
    }

    @When("Panelde bulunan Student Management butonuna tiklanir")
    public void panelde_bulunan_student_management_butonuna_tiklanir() {
        mainMenuPanel.studentManagementButton.click();
    }

    @And("Choose Teacher listesinden gecerli bir secim yapilir")
    public void choose_teacher_listesinden_gecerli_bir_secim_yapilir() {
        ReusableMethods.waitFor(1);
        ReusableMethods.selectFromDropdownByVisibleText(studentManagementPage.chooseTeacherDropdown, "Senemm Ozcetin");
        ReusableMethods.waitFor(1);
    }

    @And("Name kutusuna gecerli bir deger girilir")
    public void name_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.nameBox.sendKeys(ReusableMethods.createName());
    }

    @And("Surname kutusuna gecerli bir deger girilir")
    public void surname_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.surnameBox.sendKeys(ReusableMethods.createSurname());
    }

    @And("Birth Place kutusuna gecerli bir deger girilir")
    public void birth_place_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.birthPlaceBox.sendKeys(ReusableMethods.createBirthPlace());
    }

    @And("Email kutusuna gecerli bir deger girilir")
    public void email_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.emailBox.sendKeys(ReusableMethods.createEmail());
    }

    @And("Phone kutusuna gecerli bir deger girilir")
    public void phone_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.phoneBox.sendKeys(ReusableMethods.createPhone());
    }

    @And("Gender bolumunde gecerli bir secim yapilir")
    public void gender_bolumunde_gecerli_bir_secim_yapilir() {
        studentManagementPage.maleButton.click();
    }

    @And("Date Of Birth kutusuna gecerli bir deger girilir")
    public void date_of_birth_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.dateOfBirthBox.sendKeys(ReusableMethods.createDateOfBirth());
    }

    @And("Ssn kutusuna gecerli bir deger girilir")
    public void ssn_kutusuna_gecerli_bir_deger_girilir() {
        ReusableMethods.waitFor(1);
        studentManagementPage.ssnBox.sendKeys(ReusableMethods.createSSN());
        ReusableMethods.waitFor(1);
    }

    @And("User Name kutusuna gecerli bir deger girilir")
    public void user_name_kutusuna_gecerli_bir_deger_girilir() {
        expectedUsername = ReusableMethods.createUserName();
        studentManagementPage.userNameBox.sendKeys(expectedUsername);
    }

    @And("Father Name kutusuna gecerli bir deger girilir")
    public void father_name_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.fatherNameBox.sendKeys(ReusableMethods.createFatherName());
    }

    @And("Mother Name kutusuna gecerli bir deger girilir")
    public void mother_name_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.motherNameBox.sendKeys(ReusableMethods.createMotherName());
    }

    @And("Password kutusuna gecerli bir deger girilir")
    public void password_kutusuna_gecerli_bir_deger_girilir() {
        studentManagementPage.passwordBox.sendKeys(ReusableMethods.createPassword());
    }

    @When("Submit butonuna tiklanir")
    public void submit_butonuna_tiklanir() {
        studentManagementPage.submitButton.click();
    }

    @When("Sayfanin alt kisminda yer alan Student List adli listenin son sayfasina gidilir")
    public void sayfanin_alt_kisminda_yer_alan_student_list_adli_listenin_son_sayfasina_gidilir() {
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollIntoViewJS(studentManagementPage.lastPageButton);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(studentManagementPage.lastPageButton);
        ReusableMethods.waitFor(1);
    }

    @When("Girilen User Name ile olusturulan ogrenci listede bulunur")
    public void girilen_user_name_ile_olusturulan_ogrenci_listede_bulunur() {
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollTopJS();
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollIntoViewJS(studentManagementPage.studentsUsernameLastCreated);
        ReusableMethods.waitFor(1);
        actualUsername = studentManagementPage.studentsUsernameLastCreated.getText();
    }

    @Then("Girilen degerlerle ogrencinin olusturuldugu dogrulanir")
    public void girilen_Degerlerle_Ogrencinin_Olusturuldugu_Dogrulanir() {
        Assert.assertEquals(expectedUsername, actualUsername);
    }

    @Then("Danisman ogretmen secilmesi gerektigine dair hata mesajinin alindigi dogrulanir")
    public void danisman_Ogretmen_Secilmesi_Gerektigine_Dair_Hata_Mesajinin_Alindigi_Dogrulanir() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentManagementPage.alert.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void name_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.nameRequiredWarning.isDisplayed());
    }

    @Then("Surname kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void surname_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.surnameRequiredWarning.isDisplayed());
    }

    @Then("Birth Place kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void birth_Place_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.birthPlaceRequiredWarning.isDisplayed());
    }

    @Then("E-mail kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void email_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.emailRequiredWarning.isDisplayed());
    }

    @Then("Phone kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void phone_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.phoneRequiredWarning.isDisplayed());
    }

    @Then("Cinsiyet secilmesi gerektigine dair hata mesajinin alindigi dogrulanir")
    public void gender_Secilmesi_Gerektigine_Dair_Hata_Mesajinin_Alindigi_Dogrulanir() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentManagementPage.alert.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("Date Of Birth kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void date_Of_Birth_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.dateOfBirthRequiredWarning.isDisplayed());
    }

    @Then("Ssn kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void ssn_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.ssnRequiredWarning.isDisplayed());
    }

    @Then("SSN'nin dogru formatta girilmesi gerektigine dair hata mesajinin alindigi dogrulanir")
    public void ssnNinDogruFormattaGirilmesiGerektigineDairHataMesajininAlindigiDogrulanir() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentManagementPage.alert.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("User Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void user_Name_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.usernameRequiredWarning.isDisplayed());
    }

    @Then("Father Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void father_Name_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.fatherNameRequiredWarning.isDisplayed());
    }

    @Then("Mother Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void mother_Name_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.motherNameRequiredWarning.isDisplayed());
    }

    @Then("Ogrenciye student number atandigi dogrulanir")
    public void ogrenciye_Student_Number_Atandigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.studentsNumberLastCreated.isDisplayed());
    }

    @Then("Password kutusunun altinda uyari mesajinin goruntulendigi dogrulanir")
    public void password_Kutusunun_Altinda_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.passwordRequiredWarning.isDisplayed());
    }

    @And("Password kutusuna yedi karakter girilir")
    public void password_Kutusuna_Yedi_Karakter_Girilir() {
        Faker faker = new Faker();
        String password = faker.internet().password(7, 8);
        studentManagementPage.passwordBox.sendKeys(password);
    }

    @Then("Password'un yedi karakterden az olamayacagina dair uyari mesajinin goruntulendigi dogrulanir")
    public void passwordun_Yedi_Karakterden_Az_Olamayacagina_Dair_Uyari_Mesajinin_Goruntulendigi_Dogrulanir() {
        Assert.assertTrue(studentManagementPage.passwordRequiredWarning.isDisplayed());
    }

    @Given("Admin ana sayfada login yapar")
    public void adminAnaSayfadaLoginYapar() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.login("adminUsername", "adminPassword");
    }

    @Given("Menu butonunu tiklar")
    public void menu_butonuna_tiklar() {
        studentManagementPage.menuu.click();
    }

    @Given("Acilan pencereden Student Management secer")
    public void acilan_pencereden_student_management_secer() {
        studentManagementPage.studentManagement.click();
    }

    @Given("Add Student basliginda Choose Advisor Teacher secer")
    public void add_student_basliginda_choose_advisor_teacher_secer() {
        select = new Select(studentManagementPage.chooseAdvisor);
        select.selectByVisibleText(ConfigReader.getProperty("advisor"));
    }

    @Given("Name alanina valid deger girer")
    public void name_alanina_valid_deger_girer() {
        ReusableMethods.waitFor(1);
        studentManagementPage.namee.sendKeys(faker.name().firstName());
    }

    @Given("Surname alanina valid deger girer")
    public void surname_alanina_valid_deger_girer() {
        ReusableMethods.waitFor(1);
        studentManagementPage.surName.sendKeys(faker.name().lastName());
    }

    @Given("Birth Place Alanina valid deger girer")
    public void birth_place_alanina_valid_deger_girer() {
        studentManagementPage.birthPlace.sendKeys(faker.country().capital());
    }

    @Given("Email alanina valid email girer")
    public void email_alanina_valid_email_girer() {
        studentManagementPage.eMail.sendKeys(faker.internet().emailAddress());
    }

    @Given("Phone Alanina valid phone number girer")
    public void phone_alanina_valid_phone_number_girer() {
        String str = space + numberUcHane + araFormat + numberUcHane + araFormat + numberDortHane;
        String phoneNumber = str.trim();
        studentManagementPage.phoneNumber.sendKeys(phoneNumber);
    }

    @Given("Gender Secer")
    public void gender_secer() {
        studentManagementPage.genderMale.click();
    }

    @Given("Date Of Birth Alanina dogum tarihini girer")
    public void date_of_birth_alanina_dogum_tarihini_girer() {
        String str = hic + number1 + nokta + number2 + nokta + number3;
        String dateOfBirth = str.trim();
        studentManagementPage.dateOfBirth.sendKeys(dateOfBirth);
    }

    @Given("Ssn alanina valid deger girer")
    public void ssn_alanina_valid_deger_girer() {
        studentManagementPage.snn.sendKeys(faker.idNumber().ssnValid());
    }

    @Given("User Name Alanina valid deger girer")
    public void user_name_alanina_valid_deger_girer() {
        studentManagementPage.userName.sendKeys(faker.name().username());
    }

    @Given("Father Name Alanina valid deger girer")
    public void father_name_alanina_valid_deger_girer() {
        studentManagementPage.fatherName.sendKeys(faker.name().firstName());
    }

    @Given("Mother Name Alanina valid deger girer")
    public void mother_name_alanina_valid_deger_girer() {
        studentManagementPage.motherName.sendKeys(faker.name().firstName());
    }

    @And("Password alanina en az sekiz karakterden olusan valid deger girer")
    public void passwordAlaninaEnAzSekizKarakterdenOlusanValidDegerGirer() {
        studentManagementPage.passwordArea.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @Given("Submit butonunu tiklar")
    public void submit_butonuna_tiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        studentManagementPage.submitButton.click();
    }

    @Then("Student Kaydinin yapildigini dogrular")
    public void student_kaydinin_yapildigini_dogrular() {
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(studentManagementPage.studentSave, 5);
        Assert.assertTrue(studentManagementPage.studentSave.isDisplayed());
    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Given("Add Student basliginda Choose Advisor Teacher bos birakir")
    public void add_student_basliginda_choose_advisor_teacher_bos_birakir() {
        studentManagementPage.chooseAdvisor.sendKeys(hic, Keys.TAB);
    }

    @Then("Student Kaydinin yapilmadigini dogrular")
    public void student_kaydinin_yapilmadigini_dogrular() {
        Assert.assertTrue(studentManagementPage.selectEdvisor.isDisplayed());
    }

    @Given("Name alanini bos birakir")
    public void name_alanini_bos_birakir() {
        studentManagementPage.namee.sendKeys(hic);
    }

    @Then("{string} yazisinin ciktigini dogrular")
    public void yazisinin_ciktigini_dogrular(String string) {
        studentManagementPage.requiredName.isDisplayed();
    }

    @Given("Name alanina sembol girer")
    public void name_alanina_sembol_girer() {
        studentManagementPage.namee.sendKeys(str);
    }

    @And("bir saniye bekler")
    public void birSaniyeBekler() {
        ReusableMethods.waitFor(1);
    }

    @Then("Hata mesajinin gorundugunu dogrular")
    public void hata_mesajinin_gorundugunu_dogrular() {
        String expectedValidName = "Please enter valid name";
        Assert.assertTrue(studentManagementPage.validName.getText().contains(expectedValidName));
    }

    @Given("Name alanina space girer")
    public void name_alanina_space_girer() {
        studentManagementPage.namee.sendKeys(space);
    }

    @Given("Name alanina numerik deger girer")
    public void name_alanina_numerik_deger_girer() {
        studentManagementPage.namee.sendKeys(faker.number().digit());
    }

    @When("Surname alani bos birakir")
    public void surname_alanini_bos_birakir() {
        studentManagementPage.surName.sendKeys(hic);
    }

    @Then("Surname altinda {string} yazisinin ciktigini dogrular")
    public void surnameAltindaYazisininCiktiginiDogrular(String str) {
        Assert.assertTrue(studentManagementPage.requiredSurName.getText().contains(str));
    }

    @Given("Surname alanina sembol girer")
    public void surname_alanina_sembol_girer() {
        studentManagementPage.surName.sendKeys(str);
    }

    @Then("{string} mesajinin gorundugunu dogrular")
    public void mesajinin_gorundugunu_dogrular(String str) {
        Assert.assertTrue(studentManagementPage.surNameSembol.getText().contains(str));

    }

    @Given("Surname alanina space girer")
    public void surname_alanina_space_girer() {
        studentManagementPage.surName.sendKeys(space);
    }

    @Then("Surname altinda{string} mesajinin gorundugunu dogrular")
    public void surnameAltindaMesajininGorundugunuDogrular(String str) {
        Assert.assertTrue(studentManagementPage.errorMessage.isDisplayed());
    }

    @When("Surname alanina numerik deger girer")
    public void surname_alanina_numerik_deger_girer() {
        studentManagementPage.surName.sendKeys(faker.number().digit());
    }

    @When("Birth Place alanini bos birakir")
    public void birth_place_alanini_bos_birakir() {
        studentManagementPage.birthPlace.sendKeys(hic);
    }

    @And("BirthPlace {string} yazisinin ciktigini dogrular")
    public void birthplaceYazisininCiktiginiDogrular(String arg0) {
        Assert.assertTrue(studentManagementPage.birthPlaceRequired.isDisplayed());
    }

    @When("Email alanini bos birakir")
    public void email_alanini_bos_birakir() {
        studentManagementPage.eMail.sendKeys(hic);
    }

    @Then("Email {string} yazisinin ciktigini dogrular")
    public void email_yazisinin_ciktigini_dogrular(String str) {
        Assert.assertTrue(studentManagementPage.eMailRequired.getText().contains(str));
    }

    @And("Email alanina {string} formatta email adresi girer")
    public void emailAlaninaFormattaEmailAdresiGirer(String arg0) {
        String email = "dede@hh";
        studentManagementPage.eMail.sendKeys(email);
    }

    @Then("girilen degerde {string} ve {string} karakterlerinin oldugunu dogrular")
    public void girilen_degerde_ve_karakterlerinin_oldugunu_dogrular(String str1, String str2) {
        Assert.assertTrue(studentManagementPage.eMail.getText().contains(str1) && studentManagementPage.eMail.getText().contains(str2));

    }

    @When("Phone alanini bos birakir")
    public void phone_alanini_bos_birakir() {
        studentManagementPage.phoneNumber.sendKeys(hic);
    }

    @Then("Phone {string} yazisinin ciktigini dogrular")
    public void phone_yazisinin_ciktigini_dogrular(String str) {
        Assert.assertTrue(studentManagementPage.phoneRequired.getText().contains(str));
    }

    @When("Phone alanina onbir karakter girer")
    public void phoneAlaninaOnbirKarakterGirer() {
        studentManagementPage.phoneNumber.sendKeys(phoneNumber);
    }

    @Then("Minimum oniki character \\(XXX-XXX-XXXX) yazisinin ciktigini dogrular")
    public void minimumOnikiCharacterXXXXXXXXXXYazisininCiktiginiDogrular() {
        Assert.assertTrue(studentManagementPage.phoneNumberMinKarakter.isDisplayed());
    }

    @And("Phone alanina invalid karakter girer")
    public void phoneAlaninaInvalidKarakterGirer() {
        String phoneNumber = numberUcHane + araFormat + numberDortHane + araFormat + numberDortHane;
        studentManagementPage.phoneNumber.sendKeys(phoneNumber);
    }

    @Then("Phone Number Hata mesajinin gorundugunu dogrular")
    public void phoneNumberHataMesajininGorundugunuDogrular() {
        Assert.assertTrue(studentManagementPage.errorMessage.isDisplayed());
    }

    @When("Gender bos birakir")
    public void gender_bos_birakir() {
        studentManagementPage.genderMale.sendKeys(hic);
    }

    @Then("student kaydinin yapilamadigini dogrular")
    public void student_kaydinin_yapilamadigini_dogrular() throws IOException {
        ReusableMethods.waitFor(1);
        studentManagementPage.genderEmpty.isDisplayed();
    }

    @Given("Snn alanina tiklar")
    public void snn_alanina_tiklar() {
        studentManagementPage.snn.click();
    }

    @Then("Snn {string} yazisinin ciktigini dogrular")
    public void snnYazisininCiktiginiDogrular(String str) {
        Assert.assertTrue(studentManagementPage.snnReqired.getText().contains(str));
    }

    @Given("Uc ve besinci karaktere invalid deger girer")
    public void ucVeBesinciKaraktereInvalidDegerGirer() {
        String snn = numberUcHane + yildiz + numberIkiHane + yildiz + numberDortHane;
        studentManagementPage.snn.sendKeys(snn);
    }

    @Then("Snn Hata mesajinin gorundugunu dogrular")
    public void snn_hata_mesajinin_gorundugunu_dogrular() {
        studentManagementPage.invalidsnn.isDisplayed();
    }

    @Given("SSN alanina \\(-) iceren oniki karakter girer")
    public void ssn_alanina_iceren_oniki_karakter_girer() {
        String snn = numberUcHane + yildiz + numberUcHane + yildiz + numberDortHane;
        studentManagementPage.snn.sendKeys(snn);
    }

    @Given("SSN alanina \\(-) iceren {int} karakter girer")
    public void ssnAlaninaIcerenKarakterGirer(int arg0) {
        String snn = numberUcHane + araFormat + numberIkiHane + araFormat + numberUcHane;
        studentManagementPage.snn.sendKeys(snn);
    }

    @Then("snn Hata mesajinin gorundugunu dogrular")
    public void snnHataMesajininGorundugunuDogrular() {
        studentManagementPage.ssnAlert.isDisplayed();
    }

    @When("User Name alanini bos birakir")
    public void user_name_alanini_bos_birakir() {
        studentManagementPage.userName.sendKeys(hic);
    }

    @Then("UserName {string} yazisinin ciktigini dogrular")
    public void user_name_yazisinin_ciktigini_dogrular(String string) {
        Assert.assertTrue(studentManagementPage.userNameReqired.isDisplayed());
    }

    @Given("Father Name alanini bos birakir")
    public void fatherNameAlaniniBosBirakir() {
        studentManagementPage.fatherName.sendKeys(space);
    }

    @Given("Father Name Alanina space girer")
    public void fatherNameAlaninaSpaceGirer() {
        studentManagementPage.fatherName.sendKeys(space);
    }

    @Then("Father name Hata mesajinin gorundugunu dogrular")
    public void fatherNameHataMesajininGorundugunuDogrular() {
        studentManagementPage.fatherNamePopUp.isDisplayed();
    }

    @Given("Mother Name alanini bos birakir")
    public void motherNameAlaniniBosBirakir() {
        studentManagementPage.motherName.sendKeys(hic);
    }

    @Given("Mother Name alanini space girer")
    public void motherNameAlaniniSpaceGirer() {
        studentManagementPage.motherName.sendKeys(space);
    }

    @Then("MotherName {string} yazisinin ciktigini dogrular")
    public void mothernameYazisininCiktiginiDogrular(String arg0) {
        studentManagementPage.motherNameRequired.isDisplayed();
    }

    @Given("Password alanina yedi Karakter girer")
    public void passwordAlaninaYediKarakterGirer() {
        String phoneNumber = faker.phoneNumber().subscriberNumber(7);
        studentManagementPage.passwordArea.sendKeys(phoneNumber);
    }

    @Then("Password Hata mesajinin gorundugunu dogrular")
    public void password_hata_mesajinin_gorundugunu_dogrular() {
        Assert.assertTrue(studentManagementPage.passwordMinKarakter.isDisplayed());
    }

    @Given("Password alanina space girer")
    public void password_alanina_space_girer() {
        String space = "        ";
        studentManagementPage.passwordArea.sendKeys(space);
    }

    @Then("Password {string} yazisinin ciktigini dogrular")
    public void passwordYazisininCiktiginiDogrular(String arg0) {
        Assert.assertTrue(studentManagementPage.errorMessage.isDisplayed());
    }

}
