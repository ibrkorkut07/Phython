package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.LessonPage;
import pages.LoginPage;
import pages.ViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class US11_StepDef {
    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();
    Select select;
    @And("Vice Dean logs in with a valid username and a valid password")
    public void viceDeanLogsInWithAValidUsernameAndAValidPassword() {
        loginPage.login.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("viceDeanUsername"), Keys.TAB,ConfigReader.getProperty("viceDeanPassword"));
        loginPage.loginButton.click();
    }
    @When("Vice Dean clicks on the Lesson Program section on the opened page")
    public void viceDeanClicksOnTheLessonProgramSectionOnTheOpenedPage() {
        lessonPage.lessonProgramI.click();
    }

    @And("Vice Dean selects a lesson from the dropdown menu")
    public void viceDeanSelectsALessonFromTheDropdownMenu() {

        Select ddm = new Select(lessonPage.chooseLessonDDMI);
        ddm.selectByVisibleText("Literature103");
    }

    @And("Vice Dean selects a day from the dropdown menu")
    public void viceDeanSelectsADayFromTheDropdownMenu() {
        Select ddm = new Select(lessonPage.chooseDayDDMI);
        ddm.selectByVisibleText("Friday");
    }

    @And("Vice Dean selects the Education Term from the dropdown menu")
    public void viceDeanSelectsTheEducationTermFromTheDropdownMenu() {
        Select ddm = new Select(lessonPage.chooseSemesterDDMI);
        ddm.selectByVisibleText("SPRING_SEMESTER");
    }

    @And("Vice Dean enters the start and stop time of the lesson and clicks the submit button")
    public void viceDeanEntersTheStartAndStopTimeOfTheLessonAndClicksTheSumbitButton() {
        lessonPage.startTimeI.sendKeys("1400",Keys.TAB,Keys.TAB,"1600",Keys.TAB,Keys.TAB,Keys.ENTER);

    }


    @And("Verify if the displayed information matches the created lesson program")
    public void verifyIfTheDisplayedInformationMatchesTheCreatedLessonProgram() {

    }

    @Then("Vice Dean can not {string}")
    public void viceDeanCanNot(String arg0) throws IOException {
        ReusableMethods.jsScroll(lessonPage.lastPageButtonI);
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("ViceDean");
    }



}
