package stepDefinitions.uiStepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.LessonPage;
import pages.LoginPage;
import pages.StudentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
public class US21_StepDef {
    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    StudentPage studentPage = new StudentPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanici Management sayfasina giderRA")
    public void kullaniciManagementSayfasinaGiderRA() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Driver.getDriver().get("https://managementonschools.com/");
    }
    @And("Kullanici student olarak login olurRA")
    public void kullaniciStudentOlarakLoginOlurRA() {
        loginPage.login.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("studentUsername"), Keys.TAB,
                ConfigReader.getProperty("studentPassword"));
        ReusableMethods.bekle(2);
        loginPage.loginButton.click();
        ReusableMethods.bekle(3);
    }

    @Given("Choose Lesson da Teacher bir name oldugunu dogrula")
    public void chooseLessonDaTeacherBirNameOldugunuDogrula() {
        List<WebElement> teacherList = Driver.getDriver().findElements(By.xpath("//tbody//td[3]"));
        Assert.assertTrue(teacherList.size() > 0);

    }

    @Then("Choose Lesson da bir  Day oldugunu dogrula")
    public void chooseLessonDaBirDayOldugunuDogrula() {
        List<WebElement> dayList = Driver.getDriver().findElements(By.xpath("//tbody//td[4]"));
        Assert.assertTrue(dayList.size() > 0);

    }

    @And("Choose Lesson da bir Start time oldugunu dogrula")
    public void chooseLessonDaBirStartTimeOldugunuDogrula() {
        List<WebElement> startList = Driver.getDriver().findElements(By.xpath("//tbody//td[5]"));
        Assert.assertTrue(startList.size() > 0);
    }

    @And("Choose Lesson da bir Stop time oldugunu dogrula")
    public void chooseLessonDaBirStopTimeOldugunuDogrula() {
        List<WebElement> stopList = Driver.getDriver().findElements(By.xpath("//tbody//td[6]"));
        Assert.assertTrue(stopList.size() > 0);
    }

    @And("Sayfayi kapatirRA")
    public void sayfayiKapatirRA() {
        ReusableMethods.bekle(1);
        Driver.closeDriver();
        ReusableMethods.bekle(1);

    }

    @Given("Choose Lesson daki ilk kutucuga click yap")
    public void chooseLessonDakiIlkKutucugaClickYap() {
        studentPage.lessonProgramId1RA.click();
    }
   /* @Then("Choose Lesson daki ikinci kutucuga click yap ve submit e tikla")
    public void chooseLessonDakiIkinciKutucugaClickYapVeSubmitETikla() {
        studentPage.lessonProgramId2RA.click();
        ReusableMethods.jsScroll(studentPage.submitStudentRA);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.bekle(3);
        studentPage.submitStudentRA.click();
        ReusableMethods.bekle(3);
    }*/

    @And("Dersin secildigini dogrulaRA")
    public void dersinSecildiginiDogrulaRA() {
        List < WebElement > seciliDerslerList = Driver.getDriver().findElements(By.xpath("(//tbody)[2]//td[1]"));
        List < String > seciliDerslerString = new ArrayList<>();
        for (WebElement w:seciliDerslerList) {
            seciliDerslerString.add(w.getText());
        }
        System.out.println(seciliDerslerString);
        System.out.println(studentPage.lessonProgramId2RA.getText());
        Assert.assertTrue(seciliDerslerString.contains(lessonPage.birinciDersRA.getText().contains(studentPage.seciliIlkDersIsmi.getText())));
       // Assert.assertTrue(seciliDerslerString.contains(lessonPage.ikinciDersRA.getText().contains(studentPage.seciliIkinciDersIsmi.getText())));
    }
    @Given("Day ve Start Timei ayni olan dersleri sec ve submit e tikla")
    public void dayVeStartTimeiAyniOlanDersleriSecVeSubmitETikla() {
        List < WebElement > startTimeSutunuList = Driver.getDriver().findElements(By.xpath("(//tbody)[1]//td[5]"));
        List < String > startTimeSutunuString = new ArrayList<>();
        for (WebElement w:startTimeSutunuList) {
            startTimeSutunuString.add(w.getText());
        }

        List < WebElement >daySutunuList = Driver.getDriver().findElements(By.xpath("(//tbody)[1]//td[4]"));
        List < String > daySutunuString = new ArrayList<>();
        for (WebElement w:daySutunuList) {
            daySutunuString.add(w.getText());
        }
        List < String > dayVeStartTimeString = new ArrayList<>();
        for (int i = 0; i < daySutunuString.size(); i++) {
            dayVeStartTimeString.add(daySutunuString.get(i)+" "+startTimeSutunuString.get(i));
        }
        System.out.println("dayVeStartTimeString = " + dayVeStartTimeString);

    }

    @Then("Course shedule can not be selected for the same hour and day yazisi goruldugunu dogrulaRA")
    public void courseSheduleCanNotBeSelectedForTheSameHourAndDayYazisiGoruldugunuDogrulaRA() {
        //Error: Course schedule cannot be selected for the same hour and day
        ReusableMethods.bekle(3);
        ReusableMethods.jsScroll(lessonPage.birinciDersRA);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.bekle(3);
        studentPage.lessonProgramId1RA.click();
        ReusableMethods.bekle(3);
        studentPage.lessonProgramId2RA.click();
        ReusableMethods.jsScroll(studentPage.submitStudentRA);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.bekle(3);
        studentPage.submitStudentRA.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(studentPage.alertSecilemezRA.getText().
                contains("Error: Course schedule cannot be selected for the same hour and day"));

    }

    @Given("Menuye tiklaRA")
    public void menuyeTiklaRA() {

        lessonPage.menuRa.click();
    }
    @Then("Choose lesson a tiklaRA")
    public void chooseLessonATiklaRA() {
        lessonPage.chooseLessonRA.click();
    }

    @And("Lesson Program List te secili derslerin goruldugunu dogrulaRA")
    public void lessonProgramListTeSeciliDerslerinGoruldugunuDogrulaRA() {
        List < WebElement > seciliDerslerList = Driver.getDriver().findElements(By.xpath("(//tbody)[2]//td[1]"));
        List < String > seciliDerslerString = new ArrayList<>();
        for (WebElement w:seciliDerslerList) {
            seciliDerslerString.add(w.getText());
        }
        System.out.println(seciliDerslerString);
        System.out.println(studentPage.lessonProgramId2RA.getText());
        Assert.assertTrue(seciliDerslerString.contains(lessonPage.birinciDersRA.getText()));
        Assert.assertTrue(seciliDerslerString.contains(lessonPage.ikinciDersRA.getText()));
    }
    @Then("Grades and Announcements e tiklaRA")
    public void gradesAndAnnouncementsETiklaRA() {
        lessonPage.menuRa.click(); //gradesAndAnnouncements tiklanmiyor
        ReusableMethods.bekle(3);
        lessonPage.gradesandAnnouncementsRA.click();
    }
    @And("Secilen derste notlar girildigini dogrula")
    public void secilenDersteNotlarGirildiginiDogrula() {
        ReusableMethods.clickWithJS(lessonPage.notluDersRA);
        ReusableMethods.jsScroll(studentPage.submitStudentRA);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.bekle(3);
        studentPage.submitStudentRA.click();
        ReusableMethods.bekle(3);
        List < WebElement > seciliDerslerList = Driver.getDriver().findElements(By.xpath("(//tbody)[2]//td[1]"));
        List < String > seciliDerslerString = new ArrayList<>();
        for (WebElement w:seciliDerslerList) {
            seciliDerslerString.add(w.getText());
        }
        Assert.assertTrue(seciliDerslerString.contains(lessonPage.notluDersRA.getText()));
    }

    @And("Meet List Date' de Start Time, Stop Time ve Description oldugunu dogrulaRA")
    public void meetListDateDeStartTimeStopTimeVeDescriptionOldugunuDogrulaRA() {
        //meet olusturalamadigi icin test de edilemiyor.
    }
}

//teacher: Charlesss1 Edwardsss12
//student: John Doe