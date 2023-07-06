package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.StudentInfoManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class StudentInfoManagementStepDefinition {

    StudentInfoManagementPage studentInfoManagementPage = new StudentInfoManagementPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;

    @And("teacher menu butonuna tiklar.")
    public void teacherMenuButonunaTiklar() {
        studentInfoManagementPage.menu.click();
    }

    @And("teacher Student Info Management butonuna tiklar.")
    public void teacherStudentInfoManagementButonunaTiklar() {
        studentInfoManagementPage.studentInfoManagement.click();
    }

    @And("teacher Add Student Info Bolumunu goruntuler.")
    public void teacherAddStudentInfoBolumunuGoruntuler() {
        studentInfoManagementPage.addInfoMangementyazisi.isDisplayed();
    }

    @And("teacher Choose Lesson sekmesinden ders secer.")
    public void teacherChooseLessonSekmesindenDersSecer() {
        studentInfoManagementPage.chooseLesson.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.chooseLesson);
        ReusableMethods.waitFor(1);
        select.selectByVisibleText("Cucumber");
    }

    @Then("teacher ders secebildigini dogrular.")
    public void teacherDersSecebildiginiDogrular() {
        studentInfoManagementPage.chooseLesson.click();
        WebElement chooseLesson = studentInfoManagementPage.chooseLesson;
        Select dersSecimi = new Select(chooseLesson);
        String varsayilanDErs = dersSecimi.getFirstSelectedOption().getText();
        String expectedDers = "Cucumber";
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expectedDers, varsayilanDErs);
    }

    @And("teacher Choose Student sekmesinden ogrenci secer.")
    public void teacherChooseStudentSekmesindenOgrenciSecer() {
        studentInfoManagementPage.chooseStudent.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.chooseStudent);
        select.selectByVisibleText("Sera Jones");
        ReusableMethods.waitFor(1);
    }

    @Then("teacher ogrenci secebildigini dogrular.")
    public void teacherOgrenciSecebildiginiDogrular() {
        studentInfoManagementPage.chooseStudent.click();
        ReusableMethods.waitFor(1);
        WebElement chooseStudent = studentInfoManagementPage.chooseStudent;
        Select ogrenciSecimi = new Select(chooseStudent);
        String varsayilanOgrenci = ogrenciSecimi.getFirstSelectedOption().getText();
        String expectedOgrenci = "Sera Jones";
        Assert.assertEquals(expectedOgrenci, varsayilanOgrenci);
    }

    @And("teacher Choose Education Term sekmesinden egitim donemi secer.")
    public void teacherChooseEducationTermSekmesindenEgitimDonemiSecer() {
        studentInfoManagementPage.chooseEducationTerm.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.chooseEducationTerm);
        select.selectByVisibleText("SPRING_SEMESTER");
        ReusableMethods.waitFor(1);
    }

    @Then("teacher donem secebildigini dogrular.")
    public void teacherDonemSecebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        WebElement chooseEducation = studentInfoManagementPage.chooseEducationTerm;
        Select donemSecimi = new Select(chooseEducation);
        String varsayilanDonem = donemSecimi.getFirstSelectedOption().getText();
        String expecteddonem = "SPRING_SEMESTER";
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expecteddonem, varsayilanDonem);
    }

    @And("teacher Devamsizlik  girer.")
    public void teacherDevamsizlikGirer() {
        studentInfoManagementPage.absentee.sendKeys("3");
    }

    @Then("teacher devamsizlik  girebildigini dogrular.")
    public void teacherDevamsizlikGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.absentee.isDisplayed());
    }

    @And("teacher Midterm notu girer.")
    public void teacherMidtermNotuGirer() {
        studentInfoManagementPage.midtermExam.sendKeys("55");
    }

    @Then("teacher Midterm notu girebildigini dogrular.")
    public void teacherMidtermNotuGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.midtermExam.isDisplayed());
    }

    @And("teacher Final notu girer.")
    public void teacherFinalNotuGirer() {
        studentInfoManagementPage.finalExam.sendKeys("80");
    }

    @Then("teacher Final notu girebildigini dogrular.")
    public void teacherFinalNotuGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.finalExam.isDisplayed());
    }

    @And("teacher info notuna metin girer.")
    public void teacherInfoNotunaMetinGirer() {
        studentInfoManagementPage.infoNote.sendKeys("Calismasi gerekiyor");
    }

    @Then("teacher info notu girebildigini dogrular.")
    public void teacherInfoNotuGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.infoNote.isDisplayed());
    }

    @And("kullanici info notuna space girer.")
    public void kullaniciInfoNotunaSpaceGirer() {
        studentInfoManagementPage.infoNote.sendKeys(" ");
    }

    @Then("kullanici info notu girebildigini dogrular.")
    public void kullaniciInfoNotuGirebildiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.infoNote.isDisplayed());
    }

    @And("teacher Choose Lesson sekmesinden ders secmez")
    public void teacherChooseLessonSekmesindenDersSecmez() {
    }

    @And("teacher Devamsizlik bilgilerini girer.")
    public void teacherDevamsizlikBilgileriniGirer() {
        studentInfoManagementPage.absentee.sendKeys("3");
    }

    @And("teacher Midterm notunu girer.")
    public void teacherMidtermNotunuGirer() {
        studentInfoManagementPage.midtermExam.sendKeys("55");
    }

    @And("teacher Final Exam notunu girer.")
    public void teacherFinalExamNotunuGirer() {
        studentInfoManagementPage.finalExam.sendKeys("80");
    }

    @And("teacher info note alanini bos birakir.")
    public void teacherInfoNoteAlaniniBosBirakir() {
        studentInfoManagementPage.infoNote.click();
    }

    @Then("teacher requared yazisinin ciktigini dogrular.")
    public void teacherRequaredYazisininCiktiginiDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.infoNoteRequaredYazisi.isDisplayed());
    }

    @And("teacher Student Info List Bolumunu gorur")
    public void teacherStudentInfoListBolumunuGorur() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.studentInfoList.isDisplayed());
    }

    @And("teacher Name Surname Bolumunu gorur")
    public void teacherNameSurnameBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.nameSurnameGorunur.isDisplayed());
    }

    @And("teacher Lesson Name Bolumunu gorur")
    public void teacherLessonNameBolumunuGorur() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.lessonNameGorunur.isDisplayed());
    }

    @And("teacher Anssente Bolumunu gorur")
    public void teacherAnssenteBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.absenteeGorunur.isDisplayed());
    }

    @And("teacher Midterm Bolumunu gorur")
    public void teacherMidtermBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.midtermExamGorunur.isDisplayed());
    }

    @And("teacher Final Exam Bolumunu gorur")
    public void teacherFinalExamBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.finalExamGorunur.isDisplayed());
    }

    @And("teacher Info Note Bolumunu gorur.")
    public void teacherInfoNoteBolumunuGorur() {
        Assert.assertTrue(studentInfoManagementPage.infonoteGorunur.isDisplayed());
    }

    @And("teacher Average bilgilerinin yer aldigi Bolumu gorur")
    public void teacherAverageBilgilerininYerAldigiBolumuGorur() {
        studentInfoManagementPage.averageGorunur.isDisplayed();
    }

    @And("teacher Add Student Info Bolumu goruntuler.")
    public void teacherAddStudentInfoBolumuGoruntuler() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.studentInfoList.isDisplayed());
    }

    @And("teacher Choose Lesson bolumunden ders  secer.")
    public void teacherChooseLessonBolumundenDersSecer() {
        studentInfoManagementPage.chooseLesson.click();
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.chooseLesson);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @And("teacher Choose Student bolumunden ogrenci secer.")
    public void teacherChooseStudentBolumundenOgrenciSecer() {
        studentInfoManagementPage.chooseStudent.click();
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.chooseStudent);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @And("teacher Choose Education Term bolumunden egitim donemi secer.")
    public void teacherChooseEducationTermBolumundenEgitimDonemiSecer() {
        studentInfoManagementPage.chooseEducationTerm.click();
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.chooseEducationTerm);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @And("teacher Devamsizlik bilgisi girer.")
    public void teacherDevamsizlikBilgisiGirer() {
        studentInfoManagementPage.absentee.sendKeys("3");
    }

    @And("teacher Midterm not girer.")
    public void teacherMidtermNotGirer() {
        studentInfoManagementPage.midtermExam.sendKeys("55");
    }

    @And("teacher Final notunu girer.")
    public void teacherFinalNotunuGirer() {
        studentInfoManagementPage.finalExam.sendKeys("80");
    }

    @And("teacher info notunu girer.")
    public void teacherInfoNotunuGirer() {
        studentInfoManagementPage.infoNote.sendKeys("Calismasi gerekiyor");
    }

    @And("teacher Submit butonuna tiklar.")
    public void teacherSubmitButonunaTiklar() {
        ReusableMethods.clickByJS(studentInfoManagementPage.submitButonu);
        ReusableMethods.waitFor(2);
    }

    @And("teacher Edit Butonuna tiklar.")
    public void teacherEditButonunaTiklar() {
        ReusableMethods.scrollIntoViewJS(studentInfoManagementPage.editButonu);
        ReusableMethods.waitForClickability(studentInfoManagementPage.editButonu, 5);
        ReusableMethods.clickByJS(studentInfoManagementPage.editButonu);
    }

    @And("teacher Choose Lesson secer.")
    public void teacherChooseLessonSecer() {
        ReusableMethods.waitForVisibility(studentInfoManagementPage.selectLesson, 2);
        studentInfoManagementPage.selectLesson.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.selectLesson);
        ReusableMethods.waitFor(1);
        ReusableMethods.selectFromDropdownByIndex(studentInfoManagementPage.selectLesson, 1);
    }

    @And("teacher Choose Education Term secer.")
    public void teacherChooseEducationTermSecer() {
        studentInfoManagementPage.egitimDonemi.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.egitimDonemi);
        ReusableMethods.selectFromDropdownByIndex(studentInfoManagementPage.egitimDonemi, 1);
    }

    @And("teacher ogrenci not bilgisine yeni bir deger girer.")
    public void teacherOgrenciNotBilgisineYeniBirDegerGirer() {
        studentInfoManagementPage.egitimDonemi.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "Gayret gostermeli", Keys.TAB, Keys.ENTER);
    }

    @Then("Teacher updated Successful\" popUp mesajini goruntuler.")
    public void teacherUpdatedSuccessfulPopUpMesajiniGoruntuler() {
        studentInfoManagementPage.successfullymessage.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @And("teacher Delete Butonuna tiklar.")
    public void teacherDeleteButonunaTiklar() {
        ReusableMethods.clickByJS(studentInfoManagementPage.deleteButonu);
        ReusableMethods.waitFor(2);
    }

    @Then("teacher ogrenci bilgilerinin silindigini dogrular.")
    public void teacherOgrenciBilgilerininSilindiginiDogrular() {
        ReusableMethods.waitForVisibility(studentInfoManagementPage.basariliDelete, 5);
        Assert.assertTrue(studentInfoManagementPage.basariliDelete.isDisplayed());
    }

}
