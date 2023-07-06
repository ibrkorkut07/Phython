package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanManagementPage {

    public DeanManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(id = "surname")
    public WebElement surnameBox;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceBox;

    @FindBy(xpath = "(//*[@name='gender'])[1]")
    public WebElement genderFemale;

    @FindBy(id = "birthDay")
    public WebElement birthdayBox;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberBox;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement nameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement surnameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement birthDateRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement phoneRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement ssnRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement userNameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement passwordRequired;

    @FindBy(xpath = "//div[text()='Dean Saved']")
    public WebElement popUpMessage;

    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
    public WebElement errorMessage;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement ssnAlert;

    @FindBy(xpath = "//*[text()='Minimum 8 character']")
    public WebElement passwordAlert;

    @FindBy(xpath = "//*[@value='MALE']")
    public WebElement genderMale;

    @FindBy(xpath = "//table//tr[1]//td[1]")
    public WebElement firstName;

    @FindBy(xpath = "//table//tr[1]//td[2]")
    public WebElement firstGender;

    @FindBy(xpath = "//table//tr[1]//td[3]")
    public WebElement firstPhone;

    @FindBy(xpath = "//table//tr[1]//td[4]")
    public WebElement firstSsn;

    @FindBy(xpath = "//table//tr[1]//td[5]")
    public WebElement firstUserName;

    @FindBy(xpath = "(//deletebutton")
    public WebElement deleteButton;

    @FindBy(xpath = "(//*[@class='fa-solid fa-pencil'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//div[@role='dialog']//div[1]//div[1]//input[1]")
    public WebElement editNameBox;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement editSubmitButton;

    @FindBy(xpath = "(//*[@class='btn-close'])[3]")
    public WebElement closeButton;

}
