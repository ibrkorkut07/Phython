package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.LessonPage;
import pages.LoginPage;
import pages.ViceDeanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class US09_StepDef {
    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();

    @Given("Vice Dean is on {string}")
    public void viceDeanIsOn(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @And("Vice Dean clicks on the login")
    public void viceDeanClicksOnTheLogin() {
        loginPage.login.click();
    }

    @And("Vice Dean enters a valid username {string}")
    public void viceDeanEntersAValidUsername(String arg0) {
        loginPage.username.sendKeys(ConfigReader.getProperty("viceDeanUsername"));
    }

    @And("Vice Dean enters a valid password {string}")
    public void viceDeanEntersAValidPassword(String arg0) {
        loginPage.password.sendKeys(ConfigReader.getProperty("viceDeanPassword"));
    }
    @And("Vice Dean clicks on the login button")
    public void viceDeanClicksOnTheLoginButton() {
        loginPage.loginButton.click();

    }

    @And("Vice Dean clicks on the Lessons section on the opened page")
    public void viceDeanClicksOnTheSectionOnTheOpenedPage() {
        lessonPage.lessonsI.click();

    }

    @And("Vice Dean adds a lesson named {string}")
    public void viceDeanAddsALessonNamed(String lesson) {
        lessonPage.lessonNameI.sendKeys("Economics201");
    }

    @And("Vice Dean specifies if the lesson is compulsory: {string}")
    public void viceDeanSpecifiesIfTheLessonIsCompulsory(String arg0) {
    lessonPage.isCompulsoryI.click();
    }

    @And("Vice Dean enters the credit score as {string}")
    public void viceDeanEntersTheCreditScoreAs(String creditscore) {
        lessonPage.creditScoreI.sendKeys("8");
    }

    @And("Vice Dean submits the lesson")
    public void viceDeanSubmitsTheLesson() {
        ReusableMethods.bekle(2);
        lessonPage.submitButtonI.click();
        ReusableMethods.bekle(2);
    }

    @And("Vice Dean navigates to the last page")
    public void viceDeanNavigatesToTheLastPage() {
        ReusableMethods.bekle(3);
        //actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.jsScroll(lessonPage.lastPageButtonI);
        ReusableMethods.bekle(2);
       // ReusableMethods.jsExecutorClick(lessonPage.lastPageButtonI);
      ReusableMethods.clickWithJS(lessonPage.lastPageButtonI);
        ReusableMethods.bekle(3);
        ReusableMethods.jsScroll(lessonPage.lastPageButtonI);

    }

    @Then("The information of the created lesson {string} is displayed")
    public void theInformationOfTheCreatedLessonIsDisplayed(String lesson) throws IOException {
        //ReusableMethods.waitForVisibility(lessonPage.lessonCreatedAlertI,5);
        List<WebElement> lessonList = Driver.getDriver().findElements(By.xpath("//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]/div[2]/div[2]/div/table/tbody"));
        List < String > lessonListString = new ArrayList<>();
        for (WebElement w:lessonList) {
            lessonListString.add(w.getText());
        }
        softAssert.assertTrue(lessonListString.contains(lesson));
        ReusableMethods.getScreenshot("Lesson created");

    }

    @And("Verify if the displayed information matches the {string} created lesson details")
    public void verifyIfTheDisplayedInformationMatchesTheCreatedLessonDetails(String lesson) {
        for (int i = 0; i < lessonPage.lessonlistI.size(); i++) {
            softAssert.assertTrue(lessonPage.lessonlistI.get(i).isDisplayed());

        }
        /*
        for (int i = 0; i < lesson.allLessonNames.size(); i++) {
            Assert.assertTrue(lesson.allLessonNames.get(i).isDisplayed());
            Assert.assertTrue(lesson.allCompulsories.get(i).isDisplayed());
            Assert.assertTrue(lesson.allCreditScoreNames.get(i).isDisplayed());
        }
         */
    }

    @When("Vice Dean scrolls down to reach the page numbers")
    public void viceDeanScrollsDownToReachThePageNumbers() {
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
    }

    @And("Vice Dean clicks the last page button")
    public void viceDeanClicksTheLastPageButton() {
        lessonPage.lastPageButtonI.click();
    }

    @And("Vice Dean selects the lesson named {string} to be deleted")
    public void viceDeanSelectsTheLessonNamedToBeDeleted(String lesson) {
    }

    @And("Vice Dean clicks the trash bin icon for the lesson to be deleted")
    public void viceDeanClicksTheTrashBinIconForTheLessonToBeDeleted() throws IOException {

        List<WebElement> deleteButtonList = Driver.getDriver().findElements(By.xpath("//*[@class='btn btn-danger']"));
        int size = deleteButtonList.size();
        WebElement deleteButton = deleteButtonList.get(size-1);
       deleteButton.click();

    }

    @Then("Vice Dean verifies that the lesson {string} has been deleted successfully")
    public void viceDeanVerifiesThatTheLessonHasBeenDeletedSuccessfully(String lesson) {
        for (int i = 0; i < lessonPage.lessonlistI.size(); i++) {
            softAssert.assertFalse(lessonPage.lessonlistI.get(i).isDisplayed());

        }

    }


    @And("Vice Dean verifies that the lesson has been created")
    public void viceDeanVerifiesThatTheLessonHasBeenCreated() {
       // softAssert.assertTrue(lessonPage.lessonCreatedAlertI.isDisplayed());
    }
}
