package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentInfoPage {
    public StudentInfoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }






    //Ali 20-80

    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header']") //  //h3[@bg='primary']
    public WebElement studentInfoManagementYazisi; //h3[@class='fw-bold p-3 card-header']

    @FindBy(xpath = "//span[@class='text-white']") // //span[@class='text-white']  //
    public WebElement medineTeacherYazisi;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButtonuStudentInfo;

    @FindBy(xpath = "(//a[@class='nav-link'])[8]")
    public WebElement logoutButtonuStudentInfo;

    @FindBy(xpath = "//select[@id='lessonId']") // //select[@id='lessonId']
    public WebElement chooseLessonSelect;

    @FindBy(xpath = "//select[@id='studentId']")
    public WebElement chooseStudentSelect;

    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement chooseEducationTermSelect;

    @FindBy(xpath = "//input[@id='absentee']")
    public WebElement absenteeBox;

    @FindBy(xpath = "//input[@id='midtermExam']")
    public WebElement midTermExamBox;

    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement finalExamBox;

    @FindBy(xpath = "//input[@id='infoNote']")
    public WebElement infoNoteBox;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButtonStudentInfo;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']")
    public WebElement studentInfoListTable;  //table[@class='table table-striped table-bordered table-hover']

    @FindBy(xpath = "(//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click'])[1]")
    public WebElement pleaseSelectLessonUyarisi;  // (//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click'])[1]

    @FindBy(xpath = "(//div[@id='17'])[1]")
    public WebElement selectStudentUyarisi;

    @FindBy(xpath = "(//div[@id='19'])[1]")
    public WebElement selectEducationTermUyarisi;  // (//div[@id='19'])[1]

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement absenteeRequiredUyarisi;  // (//div[@class='invalid-feedback'])[4]
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement midTermExamRequiredUyarisi;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement finalExamRequiredUyarisi;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement infoNoteRequiredUyarisi;

    @FindBy(xpath = "(//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click'])[2]") //(//div[@id='2'])[1]
    public WebElement studentInfoSavedUyarisi;  //(//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click'])[2]



    @FindBy(xpath = "//div[@role='alert']//div[contains(text(),'Info should be at least 10 characters')]") // (//div[@class='Toastify__toast-body'])[1]
    public WebElement shouldBeAtLeast10CharacterUyariYazisi;  // //div[@role='alert']//div[contains(text(),'Info should be at least 10 characters')]

    @FindBy(xpath = "//body/div[@id='root']/div[@class='app']/main[@class='content']/div/div[@class='Toastify']/div[@class='Toastify__toast-container Toastify__toast-container--top-center']/div[@id='3']/div[@role='alert']/div[2]")
    public WebElement studentInfoWithLessonAlreadyExistUyariYazisi; //body/div[@id='root']/div[@class='app']/main[@class='content']/div/div[@class='Toastify']/div[@class='Toastify__toast-container Toastify__toast-container--top-center']/div[@id='3']/div[@role='alert']/div[2]

    @FindBy(xpath = "//button[@class='btn btn-warning']")
    public WebElement yesStudentInfo; // //button[@class='btn btn-warning']

    @FindBy(xpath = "(//button[@class='btn btn-danger'])[1]")
    public WebElement deleteButonuBirinciStudentInfo; // (//button[@class='btn btn-danger'])[1]

}














