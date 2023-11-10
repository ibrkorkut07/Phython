package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage {
    public TeacherPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }










 //Ali 20-90
    @FindBy(xpath = "//a[normalize-space()='Teacher Management']")
    public WebElement teacherManButton;
    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header']")
    public WebElement teacherManPage;
    @FindBy(xpath="  //div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement chooseLessons;
    @FindBy(xpath = "(//*[text()='Required'])[1]")
    public WebElement requiredText;
    @FindBy(xpath = "//div[normalize-space()='Minimum 8 character']")
    public WebElement minimumsekiz;
    @FindBy(xpath = "//*[text()='Teacher saved successfully']")
    public WebElement teacherSaved;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement teacherName;
    @FindBy(xpath = "//input[@id='surname']")
    public WebElement TeacherUsername;
    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement teacherBirthPlace;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement teacherEmail;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement teacherPhone;

    @FindBy(xpath = "//input[@id='isAdvisorTeacher']")
    public WebElement teacherAdvisor;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement teacherGender;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement teacherBirth;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement teacherSsn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement teacherUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement teacherPassword;

    @FindBy(xpath ="//button[normalize-space()='Submit']" )
    public WebElement teacherSubmit;

    @FindBy(xpath="//a[normalize-space()='Meet Management']")
    public WebElement meetMan;

    @FindBy(xpath = "//div[contains(@class,'css-qbdosj-Input')]")
    public WebElement chooseStd;

    @FindBy(xpath = "//input[@id='date']")
    public WebElement dateOfM;

    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTim;

    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTim;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement descriptionSelect;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement submitMeet;


}



//Ercan 91-140

 //Burak 141-190

 //Korkut 191-240


