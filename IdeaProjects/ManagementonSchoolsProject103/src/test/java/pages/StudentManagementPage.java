package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagementPage {

    public StudentManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "advisorTeacherId")
    public WebElement chooseTeacherDropdown;

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameRequiredWarning;

    @FindBy(id = "surname")
    public WebElement surnameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement surnameRequiredWarning;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequiredWarning;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement emailRequiredWarning;

    @FindBy(id = "phoneNumber")
    public WebElement phoneBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement phoneRequiredWarning;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleButton;

    @FindBy(id = "birthDay")
    public WebElement dateOfBirthBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement dateOfBirthRequiredWarning;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement ssnRequiredWarning;

    @FindBy(id = "username")
    public WebElement userNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement usernameRequiredWarning;

    @FindBy(id = "fatherName")
    public WebElement fatherNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[9]")
    public WebElement fatherNameRequiredWarning;

    @FindBy(id = "motherName")
    public WebElement motherNameBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[10]")
    public WebElement motherNameRequiredWarning;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[11]")
    public WebElement passwordRequiredWarning;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//a[@class='page-link'])[4]")
    public WebElement lastPageButton;

    @FindBy(xpath = "(//table[1]/tbody/tr)[last()]//td[5]//span")
    public WebElement studentsUsernameLastCreated;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;

    @FindBy(xpath = "(//table[1]/tbody/tr)[last()]//td[1]//span")
    public WebElement studentsNumberLastCreated;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuu;

    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentManagement;

    @FindBy(xpath = "//select[@id='advisorTeacherId']")
    public WebElement chooseAdvisor;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement namee;

    @FindBy(xpath = "//input[@class='Please enter valid name.']")
    public WebElement validName;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement requiredName;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surName;

    @FindBy(xpath = "//input[@id='Please enter valid surname']")
    public WebElement surNameSembol;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement requiredSurName;

    @FindBy(xpath = "//*[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlace;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceRequired;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMail;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement eMailRequired;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[text()='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement phoneNumberMinKarakter;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement phoneRequired;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy(xpath = "//div[contains(text(),'JSON parse error: Cannot coerce empty String (\"\") ')]")
    public WebElement genderEmpty;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement snn;

    @FindBy(xpath = "//div[(text()='Please enter valid SSN number')]")
    public WebElement invalidsnn;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement ssnAlert;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "(//div[text()='Required'])[1]")
    public WebElement snnReqired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement userNameReqired;

    @FindBy(xpath = "//input[@id='fatherName']")
    public WebElement fatherName;

    @FindBy(xpath = "//div[text()='Please enter valid father name']")
    public WebElement fatherNamePopUp;

    @FindBy(xpath = "//input[@id='motherName']")
    public WebElement motherName;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[10]")
    public WebElement motherNameRequired;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordArea;

    @FindBy(xpath = "//div[text()='Minimum 8 character']")
    public WebElement passwordMinKarakter;

    @FindBy(xpath = "//div[.='Please select advisor teacher']")
    public WebElement selectEdvisor;

    @FindBy(xpath = "//div[.='Student saved Successfully']")
    public WebElement studentSave;

}
