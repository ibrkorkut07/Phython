package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagementPage {

    public ViceDeanManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagement;

    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement chooseLessons;

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(id = "surname")
    public WebElement surnameBox;

    @FindBy(id = "birthPlace")
    public WebElement birthPlaceBox;

    @FindBy(id = "email")
    public WebElement emailbox;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderFemale;

    @FindBy(id = "birthDay")
    public WebElement birthdayBox;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertChooseLesson;

    @FindBy(xpath = "//div[text()='Teacher saved successfully']")
    public WebElement SuccessfullSaving;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement RequiredTextforName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement RequiredTextforSurname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement RequiredTextforBirthPlace;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement RequiredTextforEmail;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement RequiredTextforPhoneNumber;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement MinimumCharacterTextforPhoneNumber;

    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacherCheckBox;

    @FindBy(xpath = "//a[text()='Vice Dean Management']")
    public WebElement viceDeanManagementButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy(xpath = "//div[text()='Vice dean Saved']")
    public WebElement viceDeanSaved;

    @FindBy(xpath = "//div[text()='Required']")
    public WebElement textofRequired;

    @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement textofMinChar;

    @FindBy(xpath = "//div[text()='Minimum 8 character']")
    public WebElement textofMinpassword;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement RequiredTextforDateofBirth;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement RequiredTextforSsn;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement RequiredTextforUsername;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[9]")
    public WebElement RequiredTextforPassword;

    @FindBy(xpath = "//*[text()='Minimum 8 character']")
    public WebElement PasswordAlert;

    @FindBy(xpath = "//table/tbody/tr[13]/td[1]")
    public WebElement TeacherlistName;

    @FindBy(xpath = "//table/tbody/tr[13]/td[2]")
    public WebElement TeacherlistPhone;

    @FindBy(xpath = "//table/tbody/tr[13]/td[3]")
    public WebElement TeacherlistSsn;

    @FindBy(xpath = "//table/tbody/tr[13]/td[4]")
    public WebElement TeacherlistUsername;

    @FindBy(xpath = "(//i[@class='fa-solid fa-pencil'])[13]")
    public WebElement editButton;

    @FindBy(id = "react-select-4-placeholder")
    public WebElement selectLesson;

    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement editNameBox;

    @FindBy(xpath = "(//div[text()='Select lesson'])[2]")
    public WebElement editChooseLesson;

}
