package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.AdminPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US04_StepDefs {

    AdminPage adminPage =new AdminPage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();


    @And("Admin accesses the {string} page.")
    public void adminAccessesThePage(String string) {
        Driver.getDriver().get(string);
    }
    @And("Admin clicks on the Login")
    public void adminClicksOnTheLogin() {
        loginPage.login.click();
    }
    @And("Admin enters Username {string}")
    public void adminEntersUsername(String string) {
        loginPage.username.sendKeys((string));
        ReusableMethods.waitFor(2);
    }
    @And("Admin enters password {string}")
    public void adminEntersPassword(String string) {
        loginPage.password.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @And("Admin clicks on the Login to Enter.")
    public void adminClicksOnTheLoginToEnter() {
        loginPage.loginButton.click();
        ReusableMethods.waitFor(2);
    }
    @And("Admin clicks on the Menu button.")
    public void adminClicksOnTheMenuButton() {
        adminPage.menuEr.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(2);
    }
    @And("Admin selects Dean Management.")
    public void adminSelectsDeanManagement() {
        ReusableMethods.clickWithJS(adminPage.deanManagementButton);
        // adminPage.deanManagementButton.click();
        ReusableMethods.waitFor(2);
    }
    @And("Admin enters the dean's Name in the box")
    public void adminEntersTheDeanSNameInTheBox() {
        String name=faker.name().firstName();
        adminPage.deanName.sendKeys(name);
        ReusableMethods.waitFor(2);
    }
    @And("Admin enters the dean's Surname in the box")
    public void adminEntersTheDeanSSurnameInTheBox() {
        String surname=faker.name().lastName();
        adminPage.deanSurname.sendKeys(surname);
        ReusableMethods.waitFor(2);
    }
    @And("Admin enters the dean's Birth Place in the box")
    public void adminEntersTheDeanSBirthPlaceInTheBox() {
        String birthPlace=faker.address().city();
        adminPage.deanBirthPlace.sendKeys(birthPlace);
        ReusableMethods.waitFor(2);
    }

    @And("In the Gender section, Admin selects Male.")
    public void inTheGenderSectionAdminSelectsMale() {
        adminPage.maleGender.click();
        ReusableMethods.waitFor(2);
    }
    @And("Admin enters the dean's date of birth in the Date Of Birth box in the valid format .")
    public void adminEntersTheDeanSDateOfBirthInTheDateOfBirthBoxInTheValidFormat() {
        Date date=faker.date().birthday();
        SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy");
        String formatDate=dateFormat.format(date);
        adminPage.deanDob.sendKeys(formatDate, Keys.TAB);
        ReusableMethods.waitFor(2);
    }
    @And("Admin enters the dean's Phone number in the box")
    public void adminEntersTheDeanSPhoneNumberInTheBox() {
        String phoneNumber = faker.phoneNumber().phoneNumber();
        phoneNumber = phoneNumber.replaceAll("\\D", "");
        adminPage.deanPhoneNumber.sendKeys(phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10));
        ReusableMethods.waitFor(2);
    }
    @And("Admin enters the dean's Ssn in the required format.")
    public void adminEntersTheDeanSSsnInTheRequiredFormat() {
//        Faker faker = new Faker();
//        String phoneNumber = faker.phoneNumber().phoneNumber();
//        phoneNumber = phoneNumber.replaceAll("\\D", "");
//
//        adminPage.deanSsn.sendKeys(phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 5) + "-" + phoneNumber.substring(5, 9));
        String ssn=faker.number().numberBetween(100,999)+"-"+
                faker.number().numberBetween(10,99)+"-"+
                faker.number().numberBetween(1000,9999);
        adminPage.deanSsn.sendKeys(ssn);
        ReusableMethods.waitFor(2);
    }
    @And("Admin enters the dean's User Name in the box")
    public void adminEntersTheDeanSUserNameInTheBox() {
        String username = faker.name().username();
        adminPage.deanUsername.sendKeys(username);
        ReusableMethods.waitFor(2);
    }
    @And("Admin enters a password with a minimum of Eight characters in the Password box")
    public void adminEntersAPasswordWithAMinimumOfEightCharactersInThePasswordBox() {
        Faker faker = new Faker();
        String password = faker.internet().password(8,10,true,false,true);
        adminPage.deanPassword.sendKeys(password);
        ReusableMethods.waitFor(1);
    }
    @And("Admin clicks on the Submit button.")
    public void adminClicksOnTheSubmitButton() {
        adminPage.submitButton.click();
        ReusableMethods.waitFor(2);
    }
    @And("Admin verifies the Dean Saved message.")
    public void adminVerifiesTheDeanSavedMessage() {
        Assert.assertTrue(adminPage.deanSavedMessage.isDisplayed());
    }
    @And("Admin leaves the dean's Name box blank")
    public void adminLeavesTheDeanSNameBoxBlank() throws IOException {
        adminPage.deanName.sendKeys(Keys.TAB);
        Assert.assertTrue(adminPage.deanRequiredText.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Required text is displayed!");
    }
    @And("Admin verifies the invalid name text")
    public void adminVerifiesTheInvalidNameText() {
        Assert.assertTrue(adminPage.invalidNameDean.isDisplayed());

    }
    @And("Admin leaves the dean's Surname box blank")
    public void adminLeavesTheDeanSSurnameBoxBlank() throws IOException {
        adminPage.deanSurname.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Required text is displayed!");

    }
    @And("Admin verifies the invalid surname text")
    public void adminVerifiesTheInvalidSurnameText() {
        Assert.assertTrue(adminPage.invalidSurNameDean.isDisplayed());

    }
    @And("Admin Leaves the dean's Birth Place in the box blank")
    public void adminLeavesTheDeanSBirthPlaceInTheBoxBlank() throws IOException {
        adminPage.deanBirthPlace.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Required text is displayed!");
    }
    @And("Admin verifies the invalid birthPlace text")
    public void adminVerifiesTheInvalidBirthPlaceText() {
        Assert.assertTrue(adminPage.invalidBirthPlaceDean.isDisplayed());
    }

    @And("Admin Leaves the dean's date of birth in the Date Of Birth box blank.")
    public void adminLeavesTheDeanSDateOfBirthInTheDateOfBirthBoxBlank() throws IOException {
        adminPage.deanBirthPlace.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Required text is displayed!");
    }
    @And("Admin verifies the invalid dob text")
    public void adminVerifiesTheInvalidDobText() {
        Assert.assertTrue(adminPage.invalidDateOfBirthDean.isDisplayed());
    }
    @And("Admin Leaves the dean's Phone number  box blank")
    public void adminLeavesTheDeanSPhoneNumberBoxBlank() throws IOException {
        adminPage.deanPhoneNumber.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Required text is displayed!");
    }
    @And("Admin verifies the invalid phone number text")
    public void adminVerifiesTheInvalidPhoneNumberText() {
        Assert.assertTrue(adminPage.invalidPhoneDean.isDisplayed());
    }

    @And("Admin leaves the dean's Ssn number box blank..")
    public void adminLeavesTheDeanSSsnNumberBoxBlank() throws IOException {
        adminPage.deanSsn.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Required text is displayed!");
    }

    @And("Admin does not put the - sign in the Ssn box after the third and fifth digits of Ssn.")
    public void adminDoesNotPutTheSignInTheSsnBoxAfterTheThirdAndFifthDigitsOfSsn() throws IOException {
        adminPage.deanSsn.sendKeys("123256398", Keys.TAB);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Minimum 11 character text is displayed!");
    }

    @And("Admin enters an SSN number of more than nine digits into the SSN box..")
    public void adminEntersAnSSNNumberOfMoreThanNineDigitsIntoTheSSNBox() throws IOException {
        adminPage.deanSsn.sendKeys("1234567890", Keys.TAB);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Minimum 11 character text is displayed!");
    }
    @And("Admin verifies the Valid SSN message.")
    public void adminVerifiesTheValidSSNMessage() {
        Assert.assertTrue(adminPage.invalidSSNDean.isDisplayed());

    }
    @And("Admin verifies SSN Minimum eleven character \\(XXX-XX-XXXX)")
    public void adminVerifiesSSNMinimumElevenCharacterXXXXXXXXX() {
        Assert.assertTrue(adminPage.invalidSSNDean.isDisplayed());
    }

    @And("Admin leaves the dean's User Name box blank")
    public void adminLeavesTheDeanSUserNameBoxBlank() throws IOException {
        adminPage.deanUsername.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Required text is displayed!");
    }
    @And("Admin verifies the invalid username text")
    public void adminVerifiesTheInvalidUsernameText() {
        Assert.assertTrue(adminPage.invalidUsernameDean.getText().contains("Required"));
    }
    @And("Admin leaves a password  in the Password box blank")
    public void adminLeavesAPasswordInThePasswordBoxBlank() throws IOException {
        adminPage.deanPassword.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Required text is displayed!");
    }
    @And("Admin verifies the invalid password text")
    public void adminVerifiesTheInvalidPasswordText() {
        Assert.assertTrue(adminPage.invalidPasswordDean.getText().contains("Enter your password"));
    }
    @And("Admin enters less then Eight characters for password")
    public void adminEntersLessThenEightCharactersForPassword() {
        adminPage.deanPassword.sendKeys("1234567");
    }
    @And("Admin confirmed that the At least Eight characters warning message was displayed")
    public void adminConfirmedThatTheAtLeastEightCharactersWarningMessageWasDisplayed() {
        Assert.assertTrue(adminPage.minimumEight.getText().contains("At least 8 characters"));
    }
    @Then("close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }



}