package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.LessonPage;
import pages.LoginPage;
import pages.ViceDeanPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;


public class US10_StepDef {
    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();


    @When("Vice Dean selects the lesson {string} from the dropdown menu")
    public void viceDeanSelectsTheLessonFromTheDropdownMenu(String arg0) {
        lessonPage.chooseLessonDDMI.click();
        Select ddm = new Select(lessonPage.chooseLessonDDMI);
        ddm.selectByVisibleText("Literature102");
    }

    @And("Vice Dean selects the day {string} from the dropdown menu")
    public void viceDeanSelectsTheDayFromTheDropdownMenu(String arg0) {
        lessonPage.chooseDayDDMI.click();
        Select ddm = new Select(lessonPage.chooseDayDDMI);
        ddm.selectByVisibleText("Friday");
    }

    @And("Vice Dean selects the Education Term {string} from the dropdown menu")
    public void viceDeanSelectsTheEducationTermFromTheDropdownMenu(String arg0) {
        lessonPage.chooseSemesterDDMI.click();
        Select ddm = new Select(lessonPage.chooseSemesterDDMI);
        ddm.selectByVisibleText("SPRING_SEMESTER");
    }


    @And("Vice Dean scrolls down to reach the lesson program list's page numbers")
    public void viceDeanScrollsDownToReachTheLessonProgramListSPageNumbers() {
        actions.scrollToElement(lessonPage.lastPageButtonI).perform();
        lessonPage.lastPageButtonI.click();
    }

    @Then("the information of the created lesson program is displayed on the opened page")
    public void theInformationOfTheCreatedLessonProgramIsDisplayedOnTheOpenedPage() {
    }

    @And("Vice Dean verifies if the displayed information matches the created lesson program details")
    public void viceDeanVerifiesIfTheDisplayedInformationMatchesTheCreatedLessonProgramDetails() {
    }

    @Then("the Vice Dean waits for {int} seconds")
    public void theViceDeanWaitsForSeconds(int seconds) {
        ReusableMethods.bekle(seconds);
    }

    @Then("the Vice Dean verifies the visibility of the required fields.")
    public void theViceDeanVerifiesTheVisibilityOfTheRequiredFields() {
        softAssert.assertTrue(lessonPage.addLessonProgramRequiredFieldsAlertI.isDisplayed());

    }



    @Then("the Vice Dean verifies the accessibility of the Select Lesson menu in the Add Lesson Program area")
    public void theViceDeanVerifiesTheAccessibilityOfTheSelectLessonMenuInTheAddLessonProgramArea() {
    }

    @Then("the Vice Dean selects the top lesson from the Select Lesson menu in the Add Lesson Program area")
    public void theViceDeanSelectsTheTopLessonFromTheSelectLessonMenuInTheAddLessonProgramArea() {
    }



    @Then("the Vice Dean verifies the visibility of the message {string}")
    public void theViceDeanVerifiesTheVisibilityOfTheMessage(String alertMessage) {
        Alert alert = Driver.getDriver().switchTo().alert(); // Sayfadaki alerte geçiş yapma

        String alertText = alert.getText(); // Alertin metnini alır
        String expectedAlertText = "JSON parse error";
        softAssert.assertTrue(alertText.contains(expectedAlertText));
    }

    @Then("the Vice Dean captures a screenshot of the error message")
    public void theViceDeanCapturesAScreenshotOfTheErrorMessage() throws IOException {
        ReusableMethods.getScreenshotWebElement("Alert", lessonPage.alertMessageI);
    }

    @Then("the Vice Dean selects {string} from the Choose Day menu in the Add Lesson Program area")
    public void theViceDeanSelectsFromTheChooseDayMenuInTheAddLessonProgramArea(String day) {
        lessonPage.chooseDayDDMI.click();
        Select ddm = new Select(lessonPage.chooseDayDDMI);
        ddm.selectByVisibleText("Thursday");
        
    }

    @Then("the Vice Dean verifies the accessibility of the Choose Education Term menu in the Add Lesson Program area")
    public void theViceDeanVerifiesTheAccessibilityOfTheChooseEducationTermMenuInTheAddLessonProgramArea() {
    }

    @Then("the Vice Dean selects {string} from the Choose Education Term menu in the Add Lesson Program area")
    public void theViceDeanSelectsFromTheChooseEducationTermMenuInTheAddLessonProgramArea(String arg0) {
    }

    @Then("the Vice Dean verifies the accessibility of the Choose Day menu in the Add Lesson Program area")
    public void theViceDeanVerifiesTheAccessibilityOfTheChooseDayMenuInTheAddLessonProgramArea() {
    }


    @When("Vice Dean clicks the submit button")
    public void viceDeanClicksTheSubmitButton() {
        lessonPage.addLessonProgramSubmitButtonI.click();
    }

    @Then("the Vice Dean verifies the visibility of the message Please select education term")
    public void theViceDeanVerifiesTheVisibilityOfTheMessagePleaseSelectEducationTerm() {
        Alert alert = Driver.getDriver().switchTo().alert(); // Sayfadaki alerte geçiş yapma

        String alertText = alert.getText(); // Alertin metnini alır
        String expectedAlertText = "Please select education term";
        softAssert.assertTrue(alertText.contains(expectedAlertText));
    }

    @Then("the Vice Dean enters stop time and greater star time and clicks the submit button")
    public void theViceDeanEntersStopTimeAndGreaterStarTimeAndClicksTheSubmitButton() {
        lessonPage.startTimeI.sendKeys("1600", Keys.TAB,Keys.TAB,"1400",Keys.TAB,Keys.TAB,Keys.ENTER);

    }

    @Then("the Vice Dean verifies the visibility of the message Error: start time must not be greater than or equal to stop time")
    public void theViceDeanVerifiesTheVisibilityOfTheMessageErrorStartTimeMustNotBeGreaterThanOrEqualToStopTime() {
        Alert alert = Driver.getDriver().switchTo().alert(); // Sayfadaki alerte geçiş yapma

        String alertText = alert.getText(); // Alertin metnini alır
        String expectedAlertText = "Error: start time must not be greater than or equal to stop time";
        softAssert.assertTrue(alertText.contains(expectedAlertText));
    }
}
