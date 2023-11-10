package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;

import pages.StudentInfoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US17_StepDef {

    StudentInfoPage studentInfoManagement = new StudentInfoPage();
    LoginPage loginPage = new LoginPage();
    StudentInfoPage managementonSchoolsHomePage = new StudentInfoPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

/*
    @Given("teacher url gider")
    public void teacher_url_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("managementonschools_url"));
    }

    @Then("teacher anasayfaya geldigini dogrular")
    public void teacher_anasayfaya_geldigini_dogrular() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Managementon Schools"));
    }

    @When("teacher login yazisina tiklar")
    public void teacher_login_yazisina_tiklar() {


    }



    @And("teacher  username textboxuna {string} ini girer")
    public void teacherUsernameTextboxunaIniGirer(String teacher_usernamemedine) {

        StudentInfoPage.username.sendKeys(ConfigReader.getProperty(teacher_usernamemedine), Keys.TAB);

    }

    @And("teacher password textboxa {string} girer")
    public void teacherPasswordTextboxaGirer(String teacher_passwordmedine) {
        StudentInfoPage.password.sendKeys(ConfigReader.getProperty(teacher_passwordmedine), Keys.TAB);

    }
    @When("teacher login butonuna tiklar")
    public void teacher_login_butonuna_tiklar() {
        StudentInfoPage.girisButton.click();

    }
*/
    @Then("teacher giris yaptigini dogrular")
    public void teacher_giris_yaptigini_dogrular() {
        Assert.assertTrue(studentInfoManagement.medineTeacherYazisi.isDisplayed());
        ReusableMethods.waitFor(2);
    }
    @Then("teacher studentInfoManagement  sayfasinda oldugunu dogrular")
    public void teacher_student_info_management_sayfasinda_oldugunu_dogrular() {
        Assert.assertTrue(studentInfoManagement.studentInfoManagementYazisi.isDisplayed());
        ReusableMethods.waitFor(2);
    }
    @Then("teacher derslerin buludugu Choose Lesson dropdowndan bir ders secer.")
    public void teacher_derslerin_buludugu_choose_lesson_dropdowndan_bir_ders_secer() {
        //Driver.waitAndClick(studentInfoManagement.chooseLessonSelect);
        Select select = new Select(studentInfoManagement.chooseLessonSelect);
        select.selectByVisibleText("JAVA");
        ReusableMethods.waitFor(2);

    }
    @Then("teacher isimlerin buludugu Choose Student dropdowndan bir ogrenci secer.")
    public void teacher_isimlerin_buludugu_choose_student_dropdowndan_bir_ogrenci_secer() {
        Select select = new Select(studentInfoManagement.chooseStudentSelect);
        // Driver.waitAndClick(studentInfoManagement.chooseStudentSelect);
        select.selectByVisibleText("Nurgul Kayra"); //ConfigReader.getProperty(studentInfoOgrenci)
        ReusableMethods.waitFor(2);
    }
    @Then("teacher donemlerin buludugu Choose Education Term dropdowndan bir donem secer.")
    public void teacher_donemlerin_buludugu_choose_education_term_dropdowndan_bir_donem_secer() {

        Select select = new Select(studentInfoManagement.chooseEducationTermSelect);
        select.selectByVisibleText("FALL_SEMESTER"); //ConfigReader.getProperty(studentInfoOgrenci)
        ReusableMethods.waitFor(2);
    }
    @And("teacher Absentee alanina {string} bir deger girer.")
    public void teacherAbsenteeAlaninaBirDegerGirer(String valid_absentee) {
        studentInfoManagement.absenteeBox.sendKeys(ConfigReader.getProperty(valid_absentee), Keys.TAB);
        
    }
    @And("teacher Midterm Exam alanina {string} bir deger girer.")
    public void teacherMidtermExamAlaninaBirDegerGirer(String valid_midterm_exam) {
        studentInfoManagement.midTermExamBox.sendKeys(ConfigReader.getProperty(valid_midterm_exam), Keys.TAB);
    }
    @And("teacher Final Exam alanina {string} bir deger girer.")
    public void teacherFinalExamAlaninaBirDegerGirer(String valid_final) {
        studentInfoManagement.finalExamBox.sendKeys(ConfigReader.getProperty(valid_final), Keys.TAB);
        
    }

    @And("teacher Info Note alanina {string} bir deger girer.")
    public void teacherInfoNoteAlaninaBirDegerGirer(String valid_info_note) {
        studentInfoManagement.infoNoteBox.sendKeys(ConfigReader.getProperty(valid_info_note), Keys.TAB);
        
    }
    @Then("teacher Submit butonuna tiklar.")
    public void teacher_submit_butonuna_tiklar() {
       // studentInfoManagement.submitButtonStudentInfo.click();
       // ReusableMethods.waitFor(2);
        Driver.waitAndClick(studentInfoManagement.submitButtonStudentInfo,2);

    }
    @Then("teacher Ogrenci_basariyla_kaydedildi_mesajinin gorundugunu dogrular.")
    public void teacherOgrenci_basariyla_kaydedildi_mesajininGorundugunuDogrular() {
        Assert.assertTrue(studentInfoManagement.studentInfoSavedUyarisi.isDisplayed());
        ReusableMethods.waitFor(2);
    }

   // Scenario: Teacher Ogrenciye ayni donemde bir dersten iki kere not veremez.                           # src/test/resources/features/UIFeatures/US17.feature:26

    @Then("teacher Error_Bu OgrenciBuDersIcinOncedenKaydedildi! mesajinin gorundugunu dogrular.")
    public void teacherError_BuOgrenciBuDersIcinOncedenKaydedildiMesajininGorundugunuDogrular() {
        Assert.assertTrue(studentInfoManagement.studentInfoWithLessonAlreadyExistUyariYazisi.isDisplayed());
        ReusableMethods.waitFor(3);
    }

   // Scenario: Ders alanindan bir ders secilmelidir. Bos birakilamaz.                     # src/test/resources/features/UIFeatures/US17.feature:37

    @Then("teacher derslerin buludugu Choose Lesson alani bos birakir.")
    public void teacher_derslerin_buludugu_choose_lesson_alani_bos_birakir() {
        Driver.waitAndClick(studentInfoManagement.chooseLessonSelect);
        actions.sendKeys(Keys.TAB).perform();

    }

   // Scenario: Ogrenci Ismi alanindan bir isim secilmelidir. Bos birakilamaz.             # src/test/resources/features/UIFeatures/US17.feature:47

    @Then("teacher isimlerin buludugu Choose Student alani bos birakilir.")
    public void teacher_isimlerin_buludugu_choose_student_alani_bos_birakilir() {
        Driver.waitAndClick(studentInfoManagement.chooseStudentSelect);
        actions.sendKeys(Keys.TAB).perform();

    }

   // Scenario: Egitim donemi alanindan bir donem secilmelidir. Bos birakilamaz.     # src/test/resources/features/UIFeatures/US17.feature:57

    @Then("teacher donemlerin buludugu Choose Education Term alani bos birakilir.")
    public void teacher_donemlerin_buludugu_choose_education_term_alani_bos_birakilir() {
        Driver.waitAndClick(studentInfoManagement.chooseEducationTermSelect);
        actions.sendKeys(Keys.TAB).perform();

    }

  //  Scenario: Absentee girebilmelidir. Bos birakilamaz.                                  # src/test/resources/features/UIFeatures/US17.feature:67

    @Then("teacher Absentee alanina herhangi bir deger girmez.")
    public void teacher_absentee_alanina_herhangi_bir_deger_girmez() {
        studentInfoManagement.absenteeBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(studentInfoManagement.absenteeRequiredUyarisi.isDisplayed());

    }


    @And("teacher Absentee alanina negatif {string} bir deger girer.")
    public void teacherAbsenteeAlaninaNegatifBirDegerGirer(String invalidAbsentee111) {
        studentInfoManagement.absenteeBox.click();
        studentInfoManagement.absenteeBox.sendKeys(ConfigReader.getProperty(invalidAbsentee111) , Keys.TAB);
    }

    // Scenario: Absentee alanina invalid222 bir deger girilemez.                           # src/test/resources/features/UIFeatures/US17.feature:87

    @And("teacher Absentee alanina pozitif buyuk {string} bir deger girer.")
    public void teacherAbsenteeAlaninaPozitifBuyukBirDegerGirer(String invalidAbsentee222) {
        studentInfoManagement.absenteeBox.click();
        studentInfoManagement.absenteeBox.sendKeys(ConfigReader.getProperty(invalidAbsentee222), Keys.TAB);

    }

   // Scenario: Midterm Exam notu girebilmelidir. Bos birakilamaz.                         # src/test/resources/features/UIFeatures/US17.feature:97

    @Then("teacher Midterm Exam alanina herhangi bir deger girmez.")
    public void teacher_midterm_exam_alanina_herhangi_bir_deger_girmez() {

        Driver.waitAndClick(studentInfoManagement.midTermExamBox);
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(studentInfoManagement.midTermExamRequiredUyarisi.isDisplayed());
    }

  //  Scenario: Midterm notu alanina invalid1111 bir deger girilemez.                      # src/test/resources/features/UIFeatures/US17.feature:107

    @And("teacher Midterm alanina negatif {string} bir deger girer.")
  public void teacherMidtermAlaninaNegatifBirDegerGirer(String invalidMidterm1111) {
        studentInfoManagement.midTermExamBox.click();
        studentInfoManagement.midTermExamBox.sendKeys(ConfigReader.getProperty(invalidMidterm1111), Keys.TAB);

  }

    //  Scenario: Midterm notu alanina invalid2222 bir deger girilemez.                      # src/test/resources/features/UIFeatures/US17.feature:117

    @And("teacher Midterm alanina pozitif buyuk {string} bir deger girer.")
    public void teacherMidtermAlaninaPozitifBuyukBirDegerGirer(String invalidMidterm2222) {
        studentInfoManagement.midTermExamBox.click();
        studentInfoManagement.midTermExamBox.sendKeys(ConfigReader.getProperty(invalidMidterm2222), Keys.TAB);

    }

    // Scenario: Final Exam notu girebilmelidir. Bos birakilamaz.                           # src/test/resources/features/UIFeatures/US17.feature:127

    @Then("teacher Final Exam alanina herhangi bir deger girmez.")
    public void teacher_final_exam_alanina_herhangi_bir_deger_girmez() {
        Driver.waitAndClick(studentInfoManagement.finalExamBox);
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(studentInfoManagement.finalExamRequiredUyarisi.isDisplayed());

    }

    //  Scenario: Final notu alanina invalid11 bir deger girilemez.                          # src/test/resources/features/UIFeatures/US17.feature:137

    @And("teacher Final Exam alanina negatif {string} bir deger girer.")
    public void teacherFinalExamAlaninaNegatifBirDegerGirer(String invalidFinal11) {
       /* StudentInfoPage.finalExamBox.click();
        StudentInfoPage.finalExamBox.sendKeys(ConfigReader.getProperty(invalidFinal11), Keys.TAB);
*/
    }

    //   Scenario: Final notu alanina invalid22 bir deger girilemez.                          # src/test/resources/features/UIFeatures/US17.feature:147

    @And("teacher Final Exam alanina pozitif buyuk {string} bir deger girer.")
    public void teacherFinalExamAlaninaPozitifBuyukBirDegerGirer(String invalidFinal22) {
        studentInfoManagement.finalExamBox.click();
        studentInfoManagement.finalExamBox.sendKeys(ConfigReader.getProperty(invalidFinal22), Keys.TAB);

    }

    //  Scenario: Ogrenci hakkinda Info notu girebilmelidir. Bos birakilamaz.                # src/test/resources/features/UIFeatures/US17.feature:157

    @And("teacher Info Note alanina herhangi bir deger girmez.")
    public void teacherInfoNoteAlaninaHerhangiBirDegerGirmez() {
        Driver.waitAndClick(studentInfoManagement.infoNoteBox);
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(studentInfoManagement.infoNoteRequiredUyarisi.isDisplayed());
    }

    //  Scenario: Ogrenci hakkinda Max200Karakter1 Info notu girebilmelidir.                 # src/test/resources/features/UIFeatures/US17.feature:167

    @And("teacher  Info Note alanina ikiyuz {string} karakterli deger girebilmeli.")
    public void teacherInfoNoteAlaninaIkiyuzKarakterliDegerGirebilmeli(String InfoMax200Karakter1) {
        studentInfoManagement.infoNoteBox.click();
        studentInfoManagement.infoNoteBox.sendKeys(ConfigReader.getProperty(InfoMax200Karakter1), Keys.TAB);

    }





    @Then("teacher Submit butonuna tiklayamaz.")
    public void teacher_submit_butonuna_tiklayamaz() {

            studentInfoManagement.submitButtonStudentInfo.click();
            ReusableMethods.waitFor(2);
            studentInfoManagement.menuButtonuStudentInfo.click();
            ReusableMethods.waitFor(2);
           /* ReusableMethods.clickByJS(studentInfoManagement.logoutButtonuStudentInfo);
            ReusableMethods.waitFor(2);
            ReusableMethods.clickByJS(studentInfoManagement.yesStudentInfo);
            Driver.closeDriver();*/

        }

    }