package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }








    //Recep 20-50
    @FindBy(xpath = "//button[text()='Menu']") public WebElement menuButtonRB;
    @FindBy(xpath = "//a[text()='Vice Dean Management']") public WebElement viceDeanManagementPageRB;
    @FindBy(xpath = "(//div[@class='Toastify__toast-body']/div[.='Vice dean Saved']//parent::div[@role='alert'])[1]") public WebElement viceDeanSavedRB;


























  //Ramazan 51-100
    @FindBy (xpath = "(//*[text()='Admin Management'])[2]")
    public WebElement adminManagement;
    @FindBy (xpath = "//*[@placeholder='Name']")
    public WebElement nameAdminRA;
    @FindBy (xpath = "//*[@placeholder='Surname']")
    public WebElement surnamenameAdminRA;
    @FindBy (xpath = "//*[@placeholder='Birth Place']")
    public WebElement birthPlaceAdminRA;
    @FindBy (xpath = "//*[@value='MALE']")
    public WebElement genderAdminRA;
    @FindBy (xpath = "//*[@id='birthDay']")
    public WebElement dateOFBirthAdminRA;
    @FindBy (xpath = "//*[@placeholder='Phone Number']")
    public WebElement phoneAdminRA;
    @FindBy (xpath = "//*[@placeholder='ssn']")
    public WebElement ssnAdminRA;
    @FindBy (xpath = "//*[@placeholder='username']")
    public WebElement userNameAdminRA;
    @FindBy (xpath = "//*[@placeholder='Password']")
    public WebElement passwordAdminRA;
    @FindBy (xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submintAdminRA;
    @FindBy (xpath = "//*[text()='Admin Saved']")
    public WebElement savedAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement invalidNameAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement invalidSurNameAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement invalidBirthPlaceAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement invalidDateOfBirthAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement invaliddPhoneAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement invalidSSNAdminRA;
     @FindBy (xpath = "(//*[text()='Please enter valid SSN number'])")
    public WebElement invalidTiresiz11liSSNAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement invalidUsernameAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement invalidPasswordAdminRA;
     @FindBy(xpath = "(//tbody[@class='table-group-divider']//tr[last()]//td[1])[1]")
     public WebElement tableSonUsernameRA;
     @FindBy(xpath = "(//*[@class='page-link'])[5]")
     public WebElement sonSayfaRA;
     @FindBy(xpath = "//*[@class='d-flex justify-content-start ps-5 col']")
     public WebElement sonSayfaRA2;
     @FindBy(xpath = "(//*[@class='fw-bold p-3 card-header'])[3]")
     public WebElement sonSayfaAdminListRA2;











    //sumeyye 101-131


















    //Ercan 132-162

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement menuEr;
    @FindBy(xpath = "//a[text()='Dean Management']")
    public WebElement deanManagementButton;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement deanName;
    @FindBy(xpath = "//input[@id='surname']")
    public WebElement deanSurname;
    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement deanBirthPlace;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleGender;
    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement deanDob;
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement deanPhoneNumber;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement deanSsn;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement deanUsername;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement deanPassword;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//div[contains(text(),'Dean Saved')]")
    public WebElement deanSavedMessage;
    @FindBy(xpath = "//div[normalize-space()='At least 8 characters']")
    public WebElement minimumEight;
    @FindBy(xpath = "//div[9]//div[1]//div[1]")
    public WebElement deanRequiredText;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement invalidNameDean;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement invalidSurNameDean;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement invalidBirthPlaceDean;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement invalidDateOfBirthDean;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement invalidPhoneDean;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement invalidSSNDean;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement invalidUsernameDean;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement invalidPasswordDean;


//Mustafa 163-190



























//Korkut 191-240

















































//Ali 241-280







































 //Emine 281-320






































}  //finish 320


