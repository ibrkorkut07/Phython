package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DeanManagementPage;
import pages.MainMenuPanel;
import utilities.Driver;
import utilities.ReusableMethods;

public class DeanManagementStepDefinition {

    MainMenuPanel mainMenuPanel = new MainMenuPanel();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Acilan bolumden Dean Management'a tiklar")
    public void acilan_bolumden_dean_management_a_tiklar() {
        mainMenuPanel.deanManagementButton.click();
    }

    @Then("Name alanina tiklar")
    public void name_alanina_tiklar() {
        deanManagementPage.nameBox.click();
    }

    @Then("Name altinda Required uyarisinin goruntulendigini dogrular")
    public void nameAltindaRequiredUyarisininGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.nameRequired.isDisplayed());
    }

    @And("{int} sn bekler")
    public void snBekler(int sn) {
        ReusableMethods.waitFor(sn);
    }

    @And("Surname alanina tiklar")
    public void surnameAlaninaTiklar() {
        deanManagementPage.surnameBox.click();
    }

    @When("Name alanina space karakteri girer")
    public void name_alanina_space_karakteri_girer() {
        deanManagementPage.nameBox.click();
        deanManagementPage.nameBox.sendKeys(" ");
    }

    @When("Surname alanina veri girer")
    public void surname_alanina_veri_girer() {
        deanManagementPage.surnameBox.click();
        deanManagementPage.surnameBox.sendKeys(faker.name().firstName());
    }

    @When("Birth Place alanina veri girer")
    public void birth_place_alanina_veri_girer() {
        deanManagementPage.birthPlaceBox.click();
        deanManagementPage.birthPlaceBox.sendKeys(faker.address().city());
    }

    @When("Cinsiyet secer")
    public void cinsiyet_secer() {
        deanManagementPage.genderFemale.click();
    }

    @When("Birthday alanina veri girer")
    public void birthday_alanina_veri_girer() {
        int day = faker.number().numberBetween(1, 31);
        int month = faker.number().numberBetween(1, 12);
        int year = faker.number().numberBetween(1950, 2005);
        String birthDate = day + "." + month + "." + year;
        deanManagementPage.birthdayBox.sendKeys(birthDate);
    }

    @When("Phone alanina veri girer")
    public void phone_alanina_veri_girer() {
        deanManagementPage.phoneNumberBox.sendKeys(faker.number().digits(3) + "-" +
                faker.number().digits(3) + "-" +
                faker.number().digits(4));
    }

    @When("Ssn alanina veri girer")
    public void ssn_alanina_veri_girer() {
        deanManagementPage.ssnBox.sendKeys(faker.number().digits(3) + "-" +
                faker.number().digits(2) + "-" +
                faker.number().digits(4));
    }

    @When("User Name alanina veri girer")
    public void user_name_alanina_veri_girer() {
        deanManagementPage.usernameBox.sendKeys(faker.name().username());
    }

    @When("Password alanina veri girer")
    public void password_alanina_veri_girer() {
        deanManagementPage.passwordBox.sendKeys(faker.number().digits(8));
    }

    @When("Submit butonuna tiklar")
    public void submit_butonuna_tiklar() {
        deanManagementPage.submitButton.click();
    }

    @Then("Hata mesaji goruntulendigini dogrular")
    public void hata_mesaji_goruntulendigini_dogrular() {
        ReusableMethods.waitForVisibility(deanManagementPage.errorMessage, 5);
        ReusableMethods.waitForVisibility(deanManagementPage.errorMessage, 5);
        ReusableMethods.waitForVisibility(deanManagementPage.errorMessage, 5);
        Assert.assertTrue(deanManagementPage.errorMessage.isDisplayed());
    }

    @Then("Surname altinda Required uyarisinin goruntulendigini dogrular")
    public void surnameAltindaRequiredUyarisininGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.surnameRequired.isDisplayed());
    }

    @And("Name alanina veri girer")
    public void nameAlaninaVeriGirer() {
        deanManagementPage.nameBox.click();
        deanManagementPage.nameBox.sendKeys(faker.name().firstName());
    }

    @And("Surname alanina space karakteri girer")
    public void surnameAlaninaSpaceKarakteriGirer() {
        deanManagementPage.surnameBox.click();
        deanManagementPage.surnameBox.sendKeys(" ");
    }

    @And("Birth Place alanina tiklar")
    public void birthPlaceAlaninaTiklar() {
        deanManagementPage.birthPlaceBox.click();
    }

    @Then("Birth Place altinda Required uyarisinin goruntulendigini dogrular")
    public void birthPlaceAltindaRequiredUyarisininGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.birthPlaceRequired.isDisplayed());
    }

    @And("Birth Place alanina space karakteri girer")
    public void birthPlaceAlaninaSpaceKarakteriGirer() {
        deanManagementPage.birthPlaceBox.click();
        deanManagementPage.birthPlaceBox.sendKeys("  ");
        ReusableMethods.waitFor(2);
    }

    @Then("Dogum tarihi icin hata mesaji goruntulendigini dogrular")
    public void dogumTarihiIcinHataMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.birthDateRequired.isDisplayed());
    }

    @Then("Telefon icin hata mesaji goruntulendigini dogrular")
    public void telefonIcinHataMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.phoneRequired.isDisplayed());
    }

    @Then("Ssn altinda Required mesaji goruntulendigini dogrular")
    public void ssnAltindaRequiredMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.ssnRequired.isDisplayed());
    }

    @And("Ssn alaninda {int}. karakteri hatali girer")
    public void ssnAlanindaKarakteriHataliGirer1(int num) {
        deanManagementPage.ssnBox.click();
        deanManagementPage.ssnBox.sendKeys(faker.number().digits(num) +
                faker.number().digits(3) + "-" +
                faker.number().digits(4));
    }

    @Then("Ssn icin Hata mesaji goruntulendigini dogrular")
    public void ssnIcinHataMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.errorMessage.isDisplayed());
    }

    @And("Ssn alaninda {int}. karakteri hatali  girer")
    public void ssnAlanindaKarakteriHataliGirer2(int num) {
        deanManagementPage.ssnBox.click();
        deanManagementPage.ssnBox.sendKeys(faker.number().digits(3) + "-" +
                faker.number().digits(num + 1));
    }

    @And("Ssn alanina eksik veri girer")
    public void ssnAlaninaEksikVeriGirer() {
        deanManagementPage.ssnBox.sendKeys(faker.number().digits(3) + "-" +
                faker.number().digits(2) + "-" +
                faker.number().digits(3));
    }

    @Then("Ssn altinda uyari mesaji goruntulendigini dogrular")
    public void ssnAltindaUyariMesajiGoruntulendiginiDogrular() {
        String expected = "Minimum 11 character (XXX-XX-XXXX)";
        Assert.assertEquals(expected, deanManagementPage.ssnAlert.getText());
    }

    @Then("Onay mesajinin goruntulendigini dogrular")
    public void onayMesajininGoruntulendiginiDogrular() {
        ReusableMethods.waitForVisibility(deanManagementPage.popUpMessage, 5);
        Assert.assertEquals("Dean Saved", deanManagementPage.popUpMessage.getText());
        ReusableMethods.waitForVisibility(deanManagementPage.popUpMessage, 5);
        Assert.assertEquals("Dean Saved", deanManagementPage.popUpMessage.getText());
    }

    @And("User Name alanina tiklar")
    public void userNameAlaninaTiklar() {
        deanManagementPage.usernameBox.click();
    }

    @Then("User Name altinda Required uyarisinin goruntulendigini dogrular")
    public void userNameAltindaRequiredUyarisininGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.userNameRequired.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @And("User Name alanina space karakteri girer")
    public void userNameAlaninaSpaceKarakteriGirer() {
        deanManagementPage.usernameBox.click();
        deanManagementPage.usernameBox.sendKeys(" ");
        ReusableMethods.waitFor(3);
    }

    @Then("User Name icin Hata mesaji goruntulendigini dogrular")
    public void userNameIcinHataMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.popUpMessage.isDisplayed());
    }

    @And("Password alanina {int} karakter girer")
    public void passwordAlaninaKarakterGirer(int num) {
        deanManagementPage.passwordBox.click();
        deanManagementPage.passwordBox.sendKeys(faker.number().digits(num));
    }

    @Then("Password icin hata mesaji goruntulendigini dogrular")
    public void passwordIcinHataMesajiGoruntulendiginiDogrular() {
        String expected = "Minimum 8 character";
        Assert.assertEquals(expected, deanManagementPage.passwordAlert.getText());
        ReusableMethods.waitFor(2);
    }

    @Then("Password altinda hata mesaji goruntulendigini dogrular")
    public void passwordAltindaHataMesajiGoruntulendiginiDogrular() {
        Assert.assertTrue(deanManagementPage.passwordRequired.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Dean'lerin Name bilgilerinin gorunur oldugunu dogrular")
    public void dean_lerin_name_bilgilerinin_gorunur_oldugunu_dogrular() {
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstName.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Dean'lerin Gender bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinGenderBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickability(deanManagementPage.firstName, 5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstGender.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Dean'lerin Phone Number bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinPhoneNumberBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickability(deanManagementPage.firstName, 5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstPhone.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Dean'lerin SSN bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinSSNBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickability(deanManagementPage.firstName, 5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstSsn.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Dean'lerin User Name bilgilerinin gorunur oldugunu dogrular")
    public void deanLerinUserNameBilgilerininGorunurOldugunuDogrular() {
        ReusableMethods.waitForClickability(deanManagementPage.firstName, 5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.firstUserName.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @And("Silme butonuna tiklar")
    public void silmeButonunaTiklar() {
        ReusableMethods.waitForClickability(deanManagementPage.firstName, 5);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        Assert.assertTrue(deanManagementPage.deleteButton.isDisplayed());
        deanManagementPage.deleteButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Dean'in silindigini dogrular")
    public void deanInSilindiginiDogrular() {
    }

    @And("Guncellemek istenen Dean'nin Edit butonuna tiklar")
    public void guncellemekIstenenDeanNinEditButonunaTiklar() {
        ReusableMethods.waitForClickability(deanManagementPage.firstName, 5);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.editButton);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        ReusableMethods.waitForClickability(deanManagementPage.editButton, 10);
        deanManagementPage.editButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("Edit penceresindeki Name alanina veri girer")
    public void editPenceresindekiNameAlaninaVeriGirer() {
        ReusableMethods.waitForClickability(deanManagementPage.editNameBox, 5);
        deanManagementPage.editNameBox.click();
        deanManagementPage.editNameBox.sendKeys(faker.name().firstName());
    }

    @And("Edit penceresindeki Submit butonuna tiklar")
    public void editPenceresindekiSubmitButonunaTiklar() {
        ReusableMethods.waitForClickability(deanManagementPage.editSubmitButton, 10);
        deanManagementPage.editSubmitButton.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(deanManagementPage.popUpMessage.isDisplayed());
    }

    @And("Edit penceresini kapatir")
    public void editPenceresiniKapatir() {
        deanManagementPage.closeButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Dean'in Name bilgisinin guncellendigini dogrular")
    public void deanInNameBilgisininGuncellendiginiDogrular() {
    }

}
