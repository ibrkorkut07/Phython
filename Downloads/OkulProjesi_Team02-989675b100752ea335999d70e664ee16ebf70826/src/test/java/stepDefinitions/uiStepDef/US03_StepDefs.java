package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ContactGetAllPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US03_StepDefs {

    ContactGetAllPage contactGetAllPage = new ContactGetAllPage();

    Faker faker = new Faker();

    @Given("User goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(string);
    }

    @When("User enters Contact button")
    public void user_enters_contact_button() {
        contactGetAllPage.contactButton.click();

        ReusableMethods.waitFor(1);
    }
    @When("User enters a valid value of {string} in the Your Name text box.")
    public void user_enters_a_valid_value_of_in_the_your_name_text_box(String string) {
        contactGetAllPage.contactYourName.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @When("User enters a valid value of {string} in the Your Mail text box.")
    public void user_enters_a_valid_value_of_in_the_your_mail_text_box(String string) {
        contactGetAllPage.contactYourMail.sendKeys(string);
//        String yourEmail = faker.internet().emailAddress();
//        contactGetAllPage.contactYourMail.sendKeys(yourEmail);
        ReusableMethods.waitFor(2);
    }
    @When("User enters a valid value of {string} in the Subject text box.")
    public void user_enters_a_valid_value_of_in_the_subject_text_box(String string) {
        contactGetAllPage.contactSubject.sendKeys(string);
    }
    @When("User enters a valid Message {string} in the Message text box.")
    public void user_enters_a_valid_message_in_the_message_text_box(String string) {
        contactGetAllPage.contactMessage.sendKeys(string);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
    }
    @When("User clicks the Send Message button")
    public void user_clicks_the_send_message_button() {
        ReusableMethods.clickWithJS(contactGetAllPage.sendMessageButton);
    }
    @Then("User confirms that Contact Message Created Successfully")
    public void user_confirms_that_contact_message_created_successfully() {
        System.out.println("Message= " + contactGetAllPage.createdMessage.getText());
        ReusableMethods.waitFor(2);
        Assert.assertTrue(contactGetAllPage.createdMessage.isDisplayed());
    }
    @And("User leaves the Your Name box blank")
    public void userLeavesTheYourNameBoxBlank() {
        contactGetAllPage.contactYourName.sendKeys(Keys.TAB);
    }
    @Then("User confirms that the required message has been received")
    public void userConfirmsThatTheRequiredMessageHasBeenReceived() throws IOException {
        ReusableMethods.getScreenshot("Required text is displayed!");
    }
    @Then("User confirms that the error message has been received")
    public void userConfirmsThatTheErrorMessageHasBeenReceived() {
        System.out.println("ErrorMessage= " + contactGetAllPage.contactErrorMessage.getText());
        ReusableMethods.waitFor(2);
        Assert.assertTrue(contactGetAllPage.contactErrorMessage.isDisplayed());
    }
    @And("User leaves the Message box blank")
    public void userLeavesTheMessageBoxBlank() {
        contactGetAllPage.contactMessage.sendKeys(Keys.TAB);
    }

    @And("User leaves the Subject box blank")
    public void userLeavesTheSubjectBoxBlank() {
        contactGetAllPage.contactSubject.sendKeys(Keys.TAB);
    }
    @Then("User close the page")
    public void userCloseThePage() {
        Driver.closeDriver();
    }
}