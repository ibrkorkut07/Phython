package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MeetManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class MeetManagementStepDefinition {

    MeetManagementPage meetManagementPage = new MeetManagementPage();
    Actions actions = new Actions(Driver.getDriver());

    @And("teacher menu butonuna tiklar")
    public void teacherMenuButonunaTiklar() {
        meetManagementPage.menu.click();
    }

    @And("teacher Meet Management butonuna tiklar")
    public void teacherMeetManagementButonunaTiklar() {
        meetManagementPage.meetManagement.click();
    }

    @And("teacher Meet List bolumunu gorur.")
    public void teacherMeetListBolumunuGorur() {
        Assert.assertTrue(meetManagementPage.addMeet.isDisplayed());
    }

    @And("teacher choose student alanindan ogrenci secer")
    public void teacherChooseStudentAlanindanOgrenciSecer() {
        ReusableMethods.clickByJS(meetManagementPage.chooseStudent);
        ReusableMethods.waitFor(2);
        new Actions(Driver.getDriver()).moveByOffset(300, 500).click().build().perform();
    }

    @Then("teacher choose student alanindan ogrenci secilebildigini dogrular")
    public void teacherChooseStudentAlanindanOgrenciSecilebildiginiDogrular() {
        meetManagementPage.chooseStudent.isDisplayed();
    }

    @And("teacher Date Of Meet alanina gelecek bir tarih girer")
    public void teacherDateOfMeetAlaninaGelecekBirTarihGirer() {
        meetManagementPage.dateOfMeet.sendKeys("30.04.2023");
        ReusableMethods.waitFor(2);
    }

    @Then("teacher Date Of Meet alanina gelecek bir tarih girildigini dogrular.")
    public void teacherDateOfMeetAlaninaGelecekBirTarihGirildiginiDogrular() {
        Assert.assertTrue(meetManagementPage.dateOfMeet.isDisplayed());
    }

    @And("teacher Date Of Meet alanina gecmis bir tarih girer")
    public void teacherDateOfMeetAlaninaGecmisBirTarihGirer() {
        meetManagementPage.dateOfMeet.sendKeys("15.04.2023");
    }

    @Then("teacher Date Of Meet alanina gecmis bir tarih girildigini dogrular.")
    public void teacherDateOfMeetAlaninaGecmisBirTarihGirildiginiDogrular() {
        Assert.assertTrue(meetManagementPage.dateOfMeet.isDisplayed());
    }

    @And("teacher Start Time alanina valid bir deger girer")
    public void teacherStartTimeAlaninaValidBirDegerGirer() {
        meetManagementPage.startTime.sendKeys("11", "00");
    }

    @Then("teacher Start Time alanina valid bir deger girildigini dogrular.")
    public void teacherStartTimeAlaninaValidBirDegerGirildiginiDogrular() {
        meetManagementPage.startTime.isDisplayed();
    }

    @And("teacher Stop Time alanina valid bir deger girer")
    public void teacherStopTimeAlaninaValidBirDegerGirer() {
        meetManagementPage.stopTime.sendKeys("12", "00");
    }

    @Then("teacher Stop Time alanina valid bir deger girildigini dogrular.")
    public void teacherStopTimeAlaninaValidBirDegerGirildiginiDogrular() {
        meetManagementPage.stopTime.isDisplayed();
    }

    @And("teacher choose student bolumunden ogrenci secer")
    public void teacherChooseStudentBolumundenOgrenciSecer() {
        ReusableMethods.clickByJS(meetManagementPage.chooseStudent);
        ReusableMethods.waitFor(2);
        new Actions(Driver.getDriver()).moveByOffset(300, 500).click().build().perform();
    }

    @And("teacher Date Of Meet alanina gecmis tarih girer")
    public void teacherDateOfMeetAlaninaGecmisTarihGirer() {
        meetManagementPage.dateOfMeet.sendKeys("15.04.2023");
    }

    @And("teacher Start Time alanina gecerli deger girer")
    public void teacherStartTimeAlaniniBosBirakir() {
        meetManagementPage.startTime.sendKeys("11", "00");
    }

    @And("teacher Stop Time alanina gecerli deger girer")
    public void teacherStopTimeAlaniniBosBirakir() {
        meetManagementPage.stopTime.sendKeys("12", "00");
    }

    @And("teacher Description alanina valid bir deger girer")
    public void teacherDescriptionAlaninaValidBirDegerGirer() {
        meetManagementPage.description.sendKeys("veli gorusmesi");
    }

    @And("teacher submit butonuna tiklar")
    public void teacherSubmitButonunaTiklar() {
        meetManagementPage.submitButonu.click();
    }

    @Then("teacher hata mesaji gorur ve toplanti olusturamaz")
    public void teacherHataMesajiGorurVeToplantiOlusturamaz() {
        meetManagementPage.hataMesaji.isDisplayed();
    }

    @And("teacher description alanina gecer bir deger girer")
    public void teacherDescriptionAlaninaGecerBirDegerGirer() {
        meetManagementPage.description.sendKeys("Kayit haftasi gorusmesi");
    }

    @Then("teacher description alanina gecer deger girilebildigini dogrular")
    public void teacherDescriptionAlaninaGecerDegerGirilebildiginiDogrular() {
        meetManagementPage.description.isDisplayed();
    }

    @And("teacher description alanina space karakteri girer")
    public void teacherDescriptionAlaninaSpaceKarakteriGirer() {
        meetManagementPage.description.sendKeys(" ");
    }

    @Then("teacher description alanina deger girilebildigini dogrular")
    public void teacherDescriptionAlaninaDegerGirilebildiginiDogrular() {
        meetManagementPage.description.isDisplayed();
    }

    @And("teacher Meet List alanini gorur.")
    public void teacherMeetListAlaniniGorur() {
        Assert.assertTrue(meetManagementPage.meetList.isDisplayed());
    }

    @And("teacher Date bolumunu gorur.")
    public void teacherDateBolumunuGorur() {
        meetManagementPage.date.isDisplayed();
    }

    @And("teacher Start Time bolumunu gorur")
    public void teacherStartTimeBolumunuGorur() {
        meetManagementPage.startTime.isDisplayed();
    }

    @And("teacher Stop Time bolumunu gorur.")
    public void teacherStopTimeBolumunuGorur() {
        meetManagementPage.stopTime.isDisplayed();
    }

    @And("teacher Description bolumunu gorur.")
    public void teacherDescriptionBolumunuGorur() {
        meetManagementPage.description.isDisplayed();
    }

    @When("teacher choose studentdan  ogrenci secer")
    public void teacher_choose_studentdan_ogrenci_secer() {
        ReusableMethods.waitFor(5);
        meetManagementPage.chooseStudent.click();
        ReusableMethods.waitFor(10);
        ReusableMethods.clickByJS(meetManagementPage.chooseStudent);
        ReusableMethods.waitFor(2);
        new Actions(Driver.getDriver()).moveByOffset(300, 500).click().build().perform();
    }

    @When("teacher Date Of Meet bolumune gelecek bir tarih girer")
    public void teacher_date_of_meet_bolumune_gelecek_bir_tarih_girer() {
        meetManagementPage.dateOfMeet.sendKeys("28.04.2023");
    }

    @When("teacher Start Time alanina gecerli bir deger girer")
    public void teacher_start_time_alanina_gecerli_bir_deger_girer() {
        meetManagementPage.startTime.sendKeys("13", "30");
    }

    @When("teacher Stop Time alaninagecerli bir deger girer")
    public void teacher_stop_time_alaninagecerli_bir_deger_girer() {
        meetManagementPage.stopTime.sendKeys("15", "00");
    }

    @When("teacher description alanina gecerli  bir metin girer")
    public void teacher_description_alanina_gecerli_bir_metin_girer() {
        meetManagementPage.description.sendKeys("Veli toplantisi");
    }

    @When("teacher Submite tiklar.")
    public void teacher_submite_tiklar() {
        meetManagementPage.submitButonu.click();
    }

    @When("teacher toplanti olusturdugunu dogrular.")
    public void teacher_toplanti_olusturdugunu_dogrular() {
        meetManagementPage.toplantiOlusturulduMesaji.isDisplayed();
    }

    @When("teacher Meet List alani gorur.")
    public void teacher_meet_list_alani_gorur() {
        meetManagementPage.meetList.isDisplayed();
    }

    @When("teacher Edit alanina tiklar.")
    public void teacher_edit_alanina_tiklar() {
        ReusableMethods.scrollIntoViewJS(meetManagementPage.editButonu);
        ReusableMethods.waitForClickability(meetManagementPage.editButonu, 5);
        ReusableMethods.clickByJS(meetManagementPage.editButonu);
    }

    @When("teacher Date Of Meet bolumde degisiklik yapar.")
    public void teacher_start_time_bolumde_degisiklik_yapar() {
        ReusableMethods.waitFor(5);
        meetManagementPage.dateOfMeetEditBolumu.sendKeys("30.04.2023");
        ReusableMethods.waitFor(5);
    }

    @And("teacher  Start Time bolumde degisiklik yapar.")
    public void teacherStartTimeBolumdeDegisiklikYapar() {
        ReusableMethods.waitFor(5);
        meetManagementPage.startTimeEditBolumu.click();
        meetManagementPage.startTime.sendKeys("15", "30");
    }

    @And("teacher Submit butonu tiklar.")
    public void teacherSubmitButonuTiklar() {

        meetManagementPage.submitEditBolumu.click();
        ReusableMethods.waitFor(5);
    }

    @Then("teacher {string} popUp mesaji goruntuler.")
    public void teacher_pop_up_mesaji_goruntuler(String string) {
        ReusableMethods.waitFor(3);
        ReusableMethods.waitForVisibility(meetManagementPage.basariliEditYazisi, 5);
        Assert.assertTrue(meetManagementPage.basariliEditYazisi.isDisplayed());
    }

    @When("teacher Edit Butonuna  tiklar.")
    public void teacher_edit_butonuna_tiklar() {
        ReusableMethods.scrollIntoViewJS(meetManagementPage.editButonu);
        ReusableMethods.waitForClickability(meetManagementPage.editButonu, 5);
        ReusableMethods.clickByJS(meetManagementPage.editButonu);
        ReusableMethods.waitFor(5);
    }

    @And("teacher Start_Time_bolumde degisiklik yapar.")
    public void teacherStart_Time_bolumdeDegisiklikYapar() {
        meetManagementPage.startTimeEditBolumu.sendKeys("10", "30", Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
        ReusableMethods.waitFor(5);
    }

    @When("teacher  Description alanini bos birakir.")
    public void teacher_description_alanini_bos_birakir() {
        meetManagementPage.editDescription.click();
        ReusableMethods.waitFor(5);
        actions.
                keyDown(Keys.COMMAND).
                sendKeys("A").keyUp(Keys.COMMAND).
                sendKeys(Keys.DELETE).
                build().
                perform();
        ReusableMethods.waitFor(15);
    }

    @Then("teacher requared yazisinin  gorundugunu dogrular.")
    public void teacher_requared_yazisinin_gorundugunu_dogrular() {
        meetManagementPage.requaredDescriptionEditBolumu.isDisplayed();
    }

    @And("teacher Edit  Butonuna tiklar.")
    public void teacherEditButonunaTiklar() {
        ReusableMethods.scrollIntoViewJS(meetManagementPage.editButonu);
        ReusableMethods.waitForClickability(meetManagementPage.editButonu, 5);
        ReusableMethods.clickByJS(meetManagementPage.editButonu);
        ReusableMethods.waitFor(5);
    }

    @When("teacher Start Time bolumunde degisiklik yapar.")
    public void teacher_start_time_bolumunde_degisiklik_yapar() {
        meetManagementPage.startTimeEditBolumu.sendKeys("10", "40", Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
        ReusableMethods.waitFor(5);
    }

    @When("teacher  Description alanina space girer.")
    public void teacher_description_alanina_space_girer() {
        ReusableMethods.waitFor(3);
        meetManagementPage.editDescription.sendKeys(Keys.CLEAR);
        ReusableMethods.waitFor(15);
        meetManagementPage.editDescription.sendKeys(" ");
    }

    @Then("teacher requared yazisinin gorundugunu dogrular.")
    public void teacherRequaredYazisininGorundugunuDogrular() {
        meetManagementPage.requaredDescriptionEditBolumu.isDisplayed();
    }

    @When("teacher Delete  butonuna tiklar.")
    public void teacher_delete_butonuna_tiklar() {
        ReusableMethods.clickByJS(meetManagementPage.deleteButonu);
        ReusableMethods.waitFor(2);
    }

    @Then("teacher toplanti bilgisinin basariyla silindi mesajinin gorundugunu dogrular")
    public void teacher_toplanti_bilgisinin_basariyla_silindi_mesajinin_gorundugunu_dogrular() {
        ReusableMethods.waitForVisibility(meetManagementPage.basariliDeleteYazisi, 5);
        Assert.assertTrue(meetManagementPage.basariliDeleteYazisi.isDisplayed());
    }

}
