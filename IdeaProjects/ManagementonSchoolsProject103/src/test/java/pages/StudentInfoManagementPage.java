package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentInfoManagementPage {

    public StudentInfoManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//a[text()='Student Info Management']")
    public WebElement studentInfoManagement;

    @FindBy(xpath = "//*[@class='fw-bold p-3 card-header']")
    public WebElement addInfoMangementyazisi;

    @FindBy(xpath = "(//*[@class='form-select'])[1]")
    public WebElement chooseLesson;

    @FindBy(id = "studentId")
    public WebElement chooseStudent;

    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTerm;

    @FindBy(id = "absentee")
    public WebElement absentee;

    @FindBy(id = "midtermExam")
    public WebElement midtermExam;

    @FindBy(id = "finalExam")
    public WebElement finalExam;

    @FindBy(id = "infoNote")
    public WebElement infoNote;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButonu;

    @FindBy(xpath = "(//*[@class='form-select'])[4]")
    public WebElement selectLesson;

    @FindBy(xpath = "(//*[@class='form-select'])[5]")
    public WebElement egitimDonemi;

    @FindBy(xpath = "(//*[@class='fw-bold p-3 card-header'])[3]")
    public WebElement studentInfoList;

    @FindBy(xpath = "//*[text()='Name Surname']")
    public WebElement nameSurnameGorunur;

    @FindBy(xpath = "//*[text()='Lesson Name']")
    public WebElement lessonNameGorunur;

    @FindBy(xpath = "//*[text()='Absentee']")
    public WebElement absenteeGorunur;

    @FindBy(xpath = "//*[text()='Midterm Exam']")
    public WebElement midtermExamGorunur;

    @FindBy(xpath = "//*[text()='Final Exam']")
    public WebElement finalExamGorunur;

    @FindBy(xpath = "//*[text()='Info Note']")
    public WebElement infonoteGorunur;

    @FindBy(xpath = "//*[text()='Average']")
    public WebElement averageGorunur;

    @FindBy(xpath = "//*[@class='fa-solid fa-pencil']")
    public WebElement editButonu;

    @FindBy(xpath = "//*[@class='fa-solid fa-trash'][1]")
    public WebElement deleteButonu;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement infoNoteRequaredYazisi;

    @FindBy(xpath = "//*[text()='Student Info updated Successfully']")
    public WebElement successfullymessage;

    @FindBy(xpath = "//*[text()='Student Info deleted Successfully']")
    public WebElement basariliDelete;

}
