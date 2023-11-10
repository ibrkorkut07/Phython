package stepDefinitions.uiStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US19_StepDef {

    TeacherPage teacherPage = new TeacherPage();

    @Then(": Meet management a tiklar")
    public void meet_management_a_tiklar() {
        teacherPage.meetMan.click();

    }

    @Then(": Choose Students atiklar ve {string} i secer")
    public void choose_students_atiklar_ve_i_secer(String string) {
        teacherPage.chooseStd.click();
        Actions action = new Actions(Driver.getDriver());
        action.keyDown(Keys.ARROW_DOWN).sendKeys(string, Keys.ENTER).perform();

    }

    @Then(": Date of Meet bolumune tiklar ve {string} yazar")
    public void date_of_meet_bolumune_tiklar_ve_yazar(String string) {
        teacherPage.dateOfM.sendKeys(string,Keys.ENTER);


    }

    @Then(": Start Time a tiklar {string} yazar")
    public void start_time_a_tiklar_yazar(String string) {
        teacherPage.startTim.sendKeys(string,Keys.ENTER);

    }

    @Then(": Stop Time a tiklar {string} yazar")
    public void stop_time_a_tiklar_yazar(String string) {
        teacherPage.stopTim.sendKeys(string,Keys.ENTER);

    }

    @Then(": Description a tiklar ve {string} yazar")
    public void description_a_tiklar_ve_yazar(String string) {
        teacherPage.descriptionSelect.sendKeys(string,Keys.ENTER);

    }

    @Then(": Submit e tiklar")
    public void submit_e_tiklar() {
        teacherPage.submitMeet.click();

    }
}
