package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ViceDeanManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TeacherManagementStepDefinition {

    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
    Faker faker;

    @When("Menu butonuna tiklar")
    public void menu_butonuna_tiklar() {
        viceDeanManagementPage.menuButton.click();
        ReusableMethods.waitFor(1);
    }

    @When("Teacher Management'a tiklar")
    public void teacher_management_a_tiklar() {
        viceDeanManagementPage.teacherManagement.click();
        ReusableMethods.waitFor(1);
    }

    @When("Ogretmenin girecegi ders secilir")
    public void ogretmenin_girecegi_secilir() {
        Driver.waitForPageToLoad(5);
        ReusableMethods.waitFor(5);
        viceDeanManagementPage.chooseLessons.click();
        ReusableMethods.waitFor(10);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(1);
    }

    @When("Name {string} olarak girilir")
    public void name_olarak_girilir(String name) {
        faker = new Faker();
        String firstName = faker.name().firstName();
        viceDeanManagementPage.nameBox.sendKeys(firstName + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @When("Surname {string} olarak girilir")
    public void surname_olarak_girilir(String arg0) {
        faker = new Faker();
        String surname = faker.name().lastName();
        viceDeanManagementPage.surnameBox.sendKeys(surname + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @When("birt place {string} olarak girilir")
    public void birt_place_olarak_girilir(String arg0) {
        faker = new Faker();
        String birthPlace = faker.address().city();
        viceDeanManagementPage.birthPlaceBox.sendKeys(birthPlace + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @When("Email {string} olarak girilir")
    public void email_olarak_girilir(String arg0) {
        faker = new Faker();
        String email = faker.internet().emailAddress();
        viceDeanManagementPage.emailbox.sendKeys(email);
        ReusableMethods.waitFor(1);
    }

    @When("Phone number {string} olarak girilir")
    public void phone_number_olarak_girilir(String arg0) {
        faker = new Faker();
        String number = faker.number().digits(10);
        String number01 = number.substring(0, 3);
        String number02 = number.substring(3, 6);
        String number03 = number.substring(6);
        String phoneNumber = number01 + "-" + number02 + "-" + number03;
        viceDeanManagementPage.phoneNumberBox.sendKeys(phoneNumber);
        ReusableMethods.waitFor(1);
    }

    @When("Gender female secilir")
    public void gender_female_secilir() {
        viceDeanManagementPage.genderFemale.click();
        ReusableMethods.waitFor(1);
    }

    @When("Date of Birth {string} olarak girilir")
    public void date_of_birth_olarak_girilir(String arg0) {
        faker = new Faker();
        int number = faker.number().numberBetween(1, 31);
        int number02 = faker.number().numberBetween(1, 12);
        int number03 = faker.number().numberBetween(1950, 2010);
        String str = " " + number + "." + number02 + "." + number03;
        String dateofbirth = str.trim();
        viceDeanManagementPage.birthdayBox.sendKeys(dateofbirth + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @When("Ssn {string} olarak girilir")
    public void ssn_olarak_girilir(String arg0) {
        faker = new Faker();
        String ssn = faker.number().digits(9);
        String ssn01 = ssn.substring(0, 3);
        String ssn02 = ssn.substring(3, 5);
        String ssn03 = ssn.substring(5);
        String ssnA = ssn01 + "-" + ssn02 + "-" + ssn03;
        viceDeanManagementPage.ssnBox.sendKeys(ssnA);
        ReusableMethods.waitFor(1);
    }

    @When("User Name {string} olarak  girer")
    public void user_name_olarak_girer(String arg0) {
        faker = new Faker();
        String username = faker.name().username();
        viceDeanManagementPage.usernameBox.sendKeys(username + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @When("Password {string} olarak girer")
    public void password_olarak_girer(String arg0) {
        faker = new Faker();
        String password = faker.internet().password();
        viceDeanManagementPage.passwordBox.sendKeys(password);
        ReusableMethods.waitFor(1);
    }

    @When("Submit tiklanir")
    public void submit_tiklanir() {
        ReusableMethods.waitForClickability(viceDeanManagementPage.submitButton, 5);
        viceDeanManagementPage.submitButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Islemin gerceklestigine dair popUp mesajini goruntuler")
    public void ıslemin_gerceklestigine_dair_pop_up_mesajini_goruntuler() {
        ReusableMethods.waitForVisibility(viceDeanManagementPage.SuccessfullSaving, 15);
        Assert.assertTrue(viceDeanManagementPage.SuccessfullSaving.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("Ders secim alani bos birakildigi icin hata mesaji alir")
    public void dersSecimAlaniBosBirakildigiIcinHataMesajiAlir() {
        ReusableMethods.waitForVisibility(viceDeanManagementPage.alertChooseLesson, 15);
        Assert.assertTrue(viceDeanManagementPage.alertChooseLesson.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("Choose Lessons kismindan secili dersi siler.")
    public void chooseLessonsKismindanSeciliDersiSiler() {
        viceDeanManagementPage.chooseLessons.click();
        ReusableMethods.waitFor(1);
        Actions action = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(2);
        action.sendKeys(Keys.DELETE).build().perform();
        ReusableMethods.waitFor(1);
    }

    @And("Ogretmenin girecegi ders  tekrar {string} olarak secilir")
    public void ogretmeninGirecegiDersTekrarOlarakSecilir(String ders) {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(ders).build().perform();
        ReusableMethods.waitFor(2);
        action.sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(1);
    }

    @And("Name bos olarak birakilir")
    public void nameBosOlarakBirakilir() {
        viceDeanManagementPage.nameBox.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Name_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void _bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforName.getText();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expecteddata, actualdata);
        ReusableMethods.waitFor(1);
    }

    @And("Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.")
    public void sayfayiAsagiKaydirir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        ReusableMethods.waitFor(1);
    }

    @Then("Hata mesajini goruntuler.")
    public void hataMesajiniGoruntuler() {
        ReusableMethods.waitForVisibility(viceDeanManagementPage.alertChooseLesson, 15);
        Assert.assertTrue(viceDeanManagementPage.alertChooseLesson.isDisplayed());
    }

    @And("Name alanina {string} karakteri girilir.")
    public void nameAlaninaKarakteriGirilir(String arg0) {
        viceDeanManagementPage.nameBox.click();
        viceDeanManagementPage.nameBox.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @And("Surname bos olarak birakilir")
    public void surnameBosOlarakBirakilir() {
        viceDeanManagementPage.surnameBox.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Surname_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void surname_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforSurname.getText();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expecteddata, actualdata);
        ReusableMethods.waitFor(1);
    }

    @And("Surname alanina {string} karakteri girilir.")
    public void surnameAlaninaKarakteriGirilir(String arg0) {
        viceDeanManagementPage.surnameBox.click();
        viceDeanManagementPage.surnameBox.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @And("Birth_Place bos olarak birakilir")
    public void birth_placeBosOlarakBirakilir() {
        viceDeanManagementPage.birthPlaceBox.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Birth_Place_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void birth_place_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforBirthPlace.getText();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expecteddata, actualdata);
    }

    @And("BirthPlace alanina {string} karakteri girilir")
    public void birthPlaceAlaninaKarakteriGirilir(String arg0) {
        viceDeanManagementPage.birthPlaceBox.click();
        viceDeanManagementPage.birthPlaceBox.sendKeys(arg0 + Keys.ENTER);
    }

    @And("Email bos olarak birakilir")
    public void emailBosOlarakBirakilir() {
        viceDeanManagementPage.emailbox.click();
    }

    @Then("Email_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void email_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforEmail.getText();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expecteddata, actualdata);
    }

    @And("Email alanina _abc_ formatinda email karakteri girilir")
    public void emailAlanina_Abc_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String name = faker.name().firstName();
        viceDeanManagementPage.emailbox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc@_ formatinda email karakteri girilir")
    public void emailAlanina_abc_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String name = str + "@";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc@gmail_ formatinda email karakteri girilir")
    public void emailAlanina_abcGmail_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String name = str + "@" + "gmail";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc.com_ formatinda email karakteri girilir")
    public void emailAlanina_abcCom_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String name = str + "." + "com";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc@abc_ formatinda email karakteri girilir")
    public void emailAlanina_abcAbc_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String str02 = faker.name().lastName();
        String name = str + "@" + str02;
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _abc@com_ formatinda email karakteri girilir")
    public void EmailAlanina_abcCom_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String str = faker.name().firstName();
        String str02 = faker.name().lastName();
        String name = str + "@" + "com";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.emailbox.sendKeys(name);
    }

    @And("Email alanina _sembollervesayilar_ formatinda email karakteri girilir")
    public void emailAlanina_sembollervesayilar_FormatindaEmailKarakteriGirilir() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).build().perform();
        String str = "7-=*+785///}{458/*";
        ReusableMethods.waitForClickability(viceDeanManagementPage.emailbox, 5);
        viceDeanManagementPage.emailbox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.emailbox.sendKeys(str);
        ReusableMethods.waitFor(1);
    }

    @And("Phone_Number bos olarak birakilir")
    public void phone_numberBosOlarakBirakilir() {
        viceDeanManagementPage.phoneNumberBox.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Phone_Number_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void phone_number_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expecteddata = arg0;
        String actualdata = viceDeanManagementPage.RequiredTextforPhoneNumber.getText();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expecteddata, actualdata);

    }

    @And("Phone number alanina formata uygun {string} girer")
    public void phoneNumberAlaninaFormataUygunGirer(String arg0) {
        viceDeanManagementPage.phoneNumberBox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.phoneNumberBox.sendKeys(arg0);
    }

    @Then("Phone number bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void phoneNumberBolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expectedData = arg0;
        String actualData = viceDeanManagementPage.MinimumCharacterTextforPhoneNumber.getText();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(actualData.contains(expectedData));
    }

    @And("{string} secenegini isaretler")
    public void isAdvisorTeacherSeceneginiIsaretler(String arg0) {
        viceDeanManagementPage.isAdvisorTeacherCheckBox.click();
        ReusableMethods.waitFor(1);
    }


    @Then("Date_of_Birth_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void date_of_birth_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expectedData = arg0;
        String actualData = viceDeanManagementPage.RequiredTextforDateofBirth.getText();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(actualData.contains(expectedData));
    }

    @Then("SSn_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void ssn_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expectedData = arg0;
        String actualData = viceDeanManagementPage.RequiredTextforSsn.getText();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(actualData.contains(expectedData));
    }


    @And("Ssn'e ucuncu ve besinci rakamdan sonra tire girmeden onbir rakam girer")
    public void ssnEUcuncuVeBesinciRakamdanSonraTireGirmedenOnbirRakamGirer() {
        faker = new Faker();
        String Phonenumber11hane = faker.number().digits(11);
        viceDeanManagementPage.ssnBox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.ssnBox.sendKeys(Phonenumber11hane + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @And("Ssn'e formata uygun rakam disinda karakterler girer")
    public void ssnEFormataUygunRakamDisindaKarakterlerGirer() {
        ReusableMethods.clickByJS(viceDeanManagementPage.ssnBox);
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.ssnBox.sendKeys("abc-ab-abcd" + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @And("User Name alanina {string} karakteri girilir")
    public void userNameAlaninaKarakteriGirilir(String arg0) {
        viceDeanManagementPage.usernameBox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.usernameBox.sendKeys(arg0 + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("User_Name_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void user_name_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expectedData = arg0;
        String actualData = viceDeanManagementPage.RequiredTextforUsername.getText();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(actualData.contains(expectedData));
    }

    @And("User Name space girer")
    public void userNameSpaceGirer() {
        viceDeanManagementPage.usernameBox.click();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.usernameBox.sendKeys("  " + Keys.ENTER);
        ReusableMethods.waitFor(1);
    }


    @And("Password  bolumune tiklar ve bos birakir")
    public void passwordBolumuneTiklarVeBosBirakir() {
        ReusableMethods.clickByJS(viceDeanManagementPage.passwordBox);
        ReusableMethods.waitFor(1);
    }

    @Then("Password_bolumunun_altinda_{string}_yazisinin_oldugunu_dogrular")
    public void password_bolumunun_altinda__yazisinin_oldugunu_dogrular(String arg0) {
        String expectedData = arg0;
        String actualData = viceDeanManagementPage.RequiredTextforPassword.getText();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(actualData.contains(expectedData));
    }

    @And("Password alanina yedi karakter girer")
    public void passwordAlaninaYediKarakterGirer() {
        faker = new Faker();
        String yedikarakterlipassword = faker.number().digits(7);
        ReusableMethods.clickByJS(viceDeanManagementPage.passwordBox);
        viceDeanManagementPage.passwordBox.sendKeys(yedikarakterlipassword);
    }

    @Then("Kullanici Password bolumunun altinda Minimum sekiz character yazisinin gorundugunu test eder")
    public void kullaniciPasswordBolumununAltindaMinimumSekizCharacterYazisininGorundugunuTestEder() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(viceDeanManagementPage.PasswordAlert.isDisplayed());
    }

    @And("Password alanina dokuz karakter girer")
    public void passwordAlaninaDokuzKarakterGirer() {
        faker = new Faker();
        String dokuzkarakterlipassword = faker.number().digits(9);
        ReusableMethods.clickByJS(viceDeanManagementPage.passwordBox);
        viceDeanManagementPage.passwordBox.sendKeys(dokuzkarakterlipassword);
    }

    @Then("Teacher List sayfasinda olusturulan ogretmene ait Name Surname bilgisinin gorundugunu dogrular")
    public void teacherListSayfasindaOlusturulanOgretmeneAitNameSurnameBilgisininGorundugunuDogrular() {
        Assert.assertTrue(viceDeanManagementPage.TeacherlistName.isDisplayed());
    }

    @Then("Teacher List sayfasinda olusturulan ogretmene ait Phone Number bilgisinin gorundugunu dogrular")
    public void teacherListSayfasindaOlusturulanOgretmeneAitPhoneNumberBilgisininGorundugunuDogrular() {
        Assert.assertTrue(viceDeanManagementPage.TeacherlistPhone.isDisplayed());
    }

    @Then("Teacher List sayfasinda olusturulan ogretmene ait Ssn bilgisinin gorundugunu dogrular")
    public void teacherListSayfasindaOlusturulanOgretmeneAitSsnBilgisininGorundugunuDogrular() {
        Assert.assertTrue(viceDeanManagementPage.TeacherlistSsn.isDisplayed());
    }

    @Then("Teacher List sayfasinda olusturulan ogretmene ait User Name bilgisinin gorundugunu dogrular")
    public void teacherListSayfasindaOlusturulanOgretmeneAitUserNameBilgisininGorundugunuDogrular() {
        Assert.assertTrue(viceDeanManagementPage.TeacherlistUsername.isDisplayed());
    }

    @When("Guncellemek istedigi ogretmenin bulundugu satirdaki Edit butonuna tiklar")
    public void guncellemekIstedigiOgretmeninBulunduguSatirdakiEditButonunaTiklar() {
        ReusableMethods.clickByJS(viceDeanManagementPage.editButton);
    }

    @And("Ogretmene ait secili ders bilgisini gorur")
    public void ogretmeneAitSeciliDersBilgisiniGorur() {
        String seciliDers = viceDeanManagementPage.selectLesson.getText();
        Assert.assertTrue(seciliDers.contains("Java"));
    }

    @And("Secili ders bilgisini baska bir data ile degistirir")
    public void seciliDersBilgisiniBaskaBirDataIleDegistirir() {
        viceDeanManagementPage.editChooseLesson.click();
        ReusableMethods.waitFor(10);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys("Java" + Keys.ENTER).build().perform();
        ReusableMethods.waitFor(1);
    }

    @Then("Teacher updated Successful popUp mesajini goruntuler")
    public void teacherUpdatedSuccessfulPopUpMesajiniGoruntuler() {
        Assert.assertTrue(false);
    }

    @And("Ogretmene ait secili Name bilgisini gorur")
    public void ogretmeneAitSeciliNameBilgisiniGorur() {
        String nameText = ReusableMethods.getValueByJS("name");
        Assert.assertEquals("Senemm", nameText);
    }

    @And("Secili Name bilgisini baska bir data ile degistirir")
    public void seciliNameBilgisiniBaskaBirDataIleDegistirir() {
        ReusableMethods.clickByJS(viceDeanManagementPage.editNameBox);
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.editNameBox.clear();
        ReusableMethods.waitFor(1);
        viceDeanManagementPage.editNameBox.sendKeys("Ali");
    }

    @And("Ogretmenin girecegi ders edit sayfasinda secilir")
    public void ogretmeninGirecegiDersEditSayfasindaSecilir() {
        Actions action = new Actions(Driver.getDriver());
        action.click(viceDeanManagementPage.editChooseLesson);
        ReusableMethods.waitFor(10);
        action.sendKeys(Keys.ENTER).build().perform();
        ReusableMethods.waitFor(1);
    }

}
