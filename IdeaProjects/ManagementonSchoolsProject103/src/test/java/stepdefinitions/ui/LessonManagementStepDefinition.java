package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LessonManagementPage;
import pages.LessonProgramManagementPage;
import pages.MainMenuPanel;
import utilities.Driver;
import utilities.ReusableMethods;

public class LessonManagementStepDefinition {

    LessonManagementPage lessonManagementPage = new LessonManagementPage();
    MainMenuPanel menuPanel = new MainMenuPanel();
    Actions actions = new Actions(Driver.getDriver());
    Select select;
    HomePage homePage = new HomePage();
    LessonProgramManagementPage lessonProgramManagementPage = new LessonProgramManagementPage();

    @Then("Kullanici acilan menuden Lesson Management e tiklar.")
    public void kullanici_acilan_menuden_lesson_management_e_tiklar() {
        menuPanel.lessonManagementButton.click();
    }

    @Then("Acilan sayfada Lessons menüsünü secer.")
    public void acilan_sayfada_lessons_menüsünü_secer() {
        lessonManagementPage.lessonsButton.click();
    }

    @Then("Lesson Management sayfasini acildigini dogrular.")
    public void lesson_management_sayfasini_acildigini_dogrular() {
        Assert.assertTrue(lessonManagementPage.lessonManagementAssert.isDisplayed());
    }

    @Given("Lesson Name alanina {string}  girer.")
    public void lesson_name_alanina_girer(String string) {
        lessonManagementPage.lessonName.sendKeys(string);
    }

    @Then("Compulsory Checkbox ini isaretler.")
    public void compulsory_checkbox_ini_isaretler() {
        lessonManagementPage.lessonCheckbox.click();
    }

    @Then("Credit Score alanina {string} girer.")
    public void credit_score_alanina_girer(String string) {
        lessonManagementPage.creditScore.sendKeys(string);
    }

    @And("Submit butonuna tiklar.")
    public void submitButonunaTiklar() {
        lessonManagementPage.submitlessons.click();
    }

    @Then("Lesson List bolumunde {string} bilgisini gorur.")
    public void lesson_list_bolumunde_bilgisini_gorur(String string) {
    }

    @Then("Lesson List bolumunde Compulsory bilgisini gorur.")
    public void lessonListBolumundeCompulsoryBilgisiniGorur() {
    }

    @Then("Lesson List bolumunde Credit Score bilgisini gorur.")
    public void lessonListBolumundeCreditScoreBilgisiniGorur() {
    }

    @Then("Lesson Name alanina ders adi girer.")
    public void lessonNameAlaninaDersAdiGirer() {
        lessonManagementPage.lessonName.sendKeys("Java");
    }

    @And("create edilen lesson i silme butonuna tiklar")
    public void createEdilenLessonISilmeButonunaTiklar() {
    }

    @And("create edilen lesson i edit butonuna tiklar")
    public void createEdilenLessonIEditButonunaTiklar() {
    }

    @When("Kullanici Lesson Program tiklar.")
    public void kullanici_lesson_program_tiklar() {
        ReusableMethods.waitFor(2);
        lessonManagementPage.lessonProgramButton.click();
    }

    @When("Kullanici ders secimi yapar.")
    public void kullanici_ders_secimi_yapar() {
        lessonManagementPage.selectLesson.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
    }

    @When("Kullanici egitim donemi secimi yapar.")
    public void kullanici_egitim_donemi_secimi_yapar() {
        select = new Select(lessonManagementPage.selectEducationTerm);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @When("Kullanici ders gunu secer.")
    public void kullanici_ders_gunu_secer() {
        select = new Select(lessonManagementPage.selectDay);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @When("Kullanici dersin baslangic saatini girer.")
    public void kullanici_dersin_baslangic_saatini_girer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.startTime.sendKeys("10", "00");
    }

    @When("Kullanci dersin bitis saatini baslangic saatinden buyuk girer.")
    public void kullanci_dersin_bitis_saatini_baslangic_saatinden_buyuk_girer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.stopTime.sendKeys("11", "00");
    }

    @Then("Kullanici Submit butonuna tiklar.")
    public void kullanici_submit_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(lessonManagementPage.submitButtonForLesson);
    }

    @Then("{string} mesaji cikartigini dogrular.")
    public void mesaji_cikartigini_dogrular(String string) {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.createdLessonProgram.isDisplayed());
    }

    @When("Kullanici ders secimi bos birakir.")
    public void kullaniciDersSecimiBosBirakir() {
    }

    @And("Hata mesaji cikar.")
    public void hataMesajiCikar() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.jSONError.isDisplayed());
    }

    @And("Kullanici egitim donemi secimi yapmaz.")
    public void kullaniciEgitimDonemiSecimiYapmaz() {
    }

    @And("Please select education term mesaji cikartigini dogrular.")
    public void pleaseSelectEducationTermMesajiCikartiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.peSeEduTerm.isDisplayed());
    }

    @And("Kullanici ders gunu secimini yapmaz.")
    public void kullaniciDersGunuSeciminiYapmaz() {
    }

    @And("Kullanci dersin bitis saatini baslangic saatinden esit ve kucuk olacak sekilde girer.")
    public void kullanciDersinBitisSaatiniBaslangicSaatindenEsitVeKucukOlacakSekildeGirer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.stopTime.sendKeys("09", "00");
    }

    @And("Error: start time must not be greater than or equal to stop time mesaji cikartigini dogrular.")
    public void errorStartTimeMustNotBeGreaterThanOrEqualToStopTimeMesajiCikartiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.timeError.isDisplayed());
    }

    @Then("açılan sayfadan{string} tıklar")
    public void açılanSayfadanTıklar(String arg0) {
        lessonManagementPage.clickLessonProgram();
        ReusableMethods.waitFor(5);
    }

    @Then("kullanıcı choose lessons tıklar")
    public void kullanıcıChooseLessonsTıklar() {
    }

    @Then("kullanıcı ders seçmelidir")
    public void kullanıcıDersSeçmelidir() {
    }

    @And("dersin seçili olduğunu doğrular")
    public void dersinSeçiliOlduğunuDoğrular() {
        Assert.assertTrue("Selected lesson is not displayed.", lessonProgramManagementPage.selectedLesson.isDisplayed());
    }

    @Then("ana menüden Lesson Management ders seçimine tıklar")
    public void anaMenüdenLessonManagementDersSeçimineTıklar() {
        homePage.clickLessonManagement();
    }

    @Then("kullanıcı choose lessons tıklar ,ders seçimini yapar")
    public void kullanıcıChooseLessonsTıklarDersSeçiminiYapar() {
        lessonProgramManagementPage.selectLessonFromDropdown();
    }

    @Then("kullanıcı seçilen dersi silebilmelidir")
    public void kullanıcıSeçilenDersiSilebilmelidir() {
        lessonProgramManagementPage.removeSelectedLesson();
    }

    @And("dersin silindiğini doğrular")
    public void dersinSilindiğiniDoğrular() {
        Assert.assertFalse("Selected lesson is displayed incorrectly.", lessonProgramManagementPage.isLessonExist());
    }

    @Then("close browser")
    public void closeBrowser() {
        Driver.closeDriver();
    }

    @Then("kullanıcı homepagede menü ye tıklar")
    public void kullanıcıHomepagedeMenüYeTıklar() {
        homePage.clickMenu();
    }

    @Then("Error alert görünür.")
    public void errorAlertGörünür() {
        Assert.assertTrue("Error alert is not displayed.", lessonProgramManagementPage.submitButton.isDisplayed());
    }

    @Then("egitim donemi secimini dogrular.")
    public void egitimDonemiSeciminiDogrular() {
    }

}
