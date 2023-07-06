package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='mb-4 fw-semibold shadow-sm bg-body-tertiary card-title h5']")
    public WebElement registerBolumu;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameUyari;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement surnameUyari;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement birthPlaceUyari;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement phoneNumberUyari;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male;

    @FindBy(id = "birthDay")
    public WebElement birthDay;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement birthDayUyari;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement ssnUyari;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement usernameUyari;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement passwordUyari;

    @FindBy(xpath = "//button[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement guestUserRegisteredUyari;

}
