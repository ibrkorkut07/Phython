package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MustafasPage {
    public MustafasPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US05 Locateler
    @FindBy(xpath = "(//*[@role='button'])[11]")
    public WebElement deanManagementMenu;
    @FindBy(xpath = "//h3")
    public WebElement deanManagementBaslik;
    @FindBy(xpath = "(//th)[1]")
    public WebElement nameColumn;
    @FindBy(xpath = "(//th)[2]")
    public WebElement genderColumn;
    @FindBy(xpath = "(//th)[3]")
    public WebElement phoneColumn;
    @FindBy(xpath = "(//th)[4]")
    public WebElement ssnColumn;
    @FindBy(xpath = "(//th)[5]")
    public WebElement userNameColumn;
    @FindBy(xpath = "(//*[@class='fa-solid fa-pencil'])[1]")
    public WebElement editDeanList;
    @FindBy(xpath = "(//*[@id='name'])[2]")
    public WebElement deanNameEdit;
    @FindBy(xpath = "(//*[@id='surname'])[2]")
    public WebElement deanSurnameEdit;
    @FindBy(xpath = "(//*[@id='birthPlace'])[2]")
    public WebElement deanBirthPlaceEdit;
    @FindBy(xpath = "(//*[@class='form-check-label'])[3]")
    public WebElement deanGenderFemaleEdit;
    @FindBy(xpath = "(//*[@class='form-check-label'])[4]")
    public WebElement deanGenderMaleEdit;
    @FindBy(xpath = "(//*[@id='birthDay'])[2]")
    public WebElement deanBirthDateEdit;
    @FindBy(xpath = "(//*[@id='phoneNumber'])[2]")
    public WebElement deanPhoneNumberEdit;
    @FindBy(xpath = "(//*[@id='ssn'])[2]")
    public WebElement deanSsnEdit;
    @FindBy(xpath = "(//*[@id='username'])[2]")
    public WebElement deanUsernameEdit;
    @FindBy(xpath = "(//*[@id='password'])[2]")
    public WebElement deanPasswordEdit;
    @FindBy(xpath = "(//*[text()='Submit'])[2]")
    public WebElement deanSubmitEdit;

    //US_07 Locatler
    @FindBy(xpath = "((//*[@class='nav-link'])[7]")
    public WebElement contactGetAllButton;
    @FindBy(xpath = "//h5")
    public WebElement contactMessageDean;

    @FindBy(xpath = "(//thead/tr/th)[1]")
    public WebElement nameColumnDean;
    @FindBy(xpath = "(//thead/tr/th)[2]")
    public WebElement emailColumnDean;
    @FindBy(xpath = "(//thead/tr/th)[3]")
    public WebElement dateColumnDean;
    @FindBy(xpath = "(//thead/tr/th)[4]")
    public WebElement subjectColumnDean;
    @FindBy(xpath = "(//thead/tr/th)[5]")
    public WebElement messageColumnDean;
    //US_08 Locatler

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonsButton;

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement lessonNameBox;

    @FindBy(xpath = "//input[@id='compulsory']")
    public WebElement compulsoryButton;

    @FindBy(xpath = "//input[@id='creditScore']")
    public WebElement creditScoreBox;

    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement lessonSubmitButton;

}

