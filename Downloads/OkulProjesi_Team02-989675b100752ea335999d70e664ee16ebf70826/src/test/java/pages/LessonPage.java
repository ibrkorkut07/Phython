package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LessonPage {
    public LessonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }










    //irem 20-100
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tab-lessonsList\"] ")
    public WebElement lessonsI;
    @FindBy(xpath = "//*[@id=\"lessonName\"]")
    public WebElement lessonNameI;
    @FindBy(xpath = "//*[@id=\"compulsory\"]")
    public WebElement isCompulsoryI;
    @FindBy(xpath="//*[@id=\"creditScore\"]")
    public WebElement creditScoreI;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]/div[2]/div[1]/div/div/form/div/div[4]/div/button")
    public WebElement submitButtonI;
    @FindBy(xpath = "(//*[@class='page-link'])[10]")
    public WebElement lastPageButtonI;
    @FindBy(xpath = "//*[@id=\"2\"]/div[1]/div[2]")
    public WebElement lessonCreatedAlertI;
    @FindBy(xpath= "//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]/div[2]/div[2]/div/table/tbody/tr[6]")
    public WebElement lastLessonCreatedI;
    @FindBy(xpath="//*[@class='btn btn-danger']")
    public List<WebElement> lastCreatedLessonDeleteButtonsI;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tab-lessonProgram\"]")
    public WebElement lessonProgramI;
    @FindBy(xpath = "//*[text()='Select lesson']")
    public WebElement chooseLessonDDMI;
    @FindBy(xpath = "//*[@id=\"day\"]")
    public WebElement chooseDayDDMI;
    @FindBy(xpath = "//*[@id=\"educationTermId\"]")
    public WebElement chooseSemesterDDMI;
    @FindBy(xpath = "//*[@id=\"startTime\"]")
    public WebElement startTimeI;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[1]/div/form/div/div[2]/div[3]/div/button")
    public WebElement addLessonProgramSubmitButtonI;
    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonProgram\"]/div[2]/div[1]/div/form/div/div[2]/div[1]/div/div")
    public WebElement addLessonProgramRequiredFieldsAlertI;

    @FindBy(xpath = " //*[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']")
    public WebElement lessonYokkenCikanAlertI;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement createdLessonProgramI;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement alertMessageI;

    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]/div[2]/div[2]/div/table")
    public List<WebElement> lessonlistI;
















































































    //mustafa 101-180
















































































    //burak 182-240
























































//ramazan 241-270
     @FindBy(xpath = "(//span[text()='Teacher'])[1]")
    public WebElement teacherCheckRA;
     @FindBy(xpath = "(//span[text()='MONDAY'])[1]")
    public WebElement dayCheckRA;
     @FindBy(xpath = "(//span[text()='10:00:00'])[1]")
    public WebElement startTimeCheckRA;
     @FindBy(xpath = "(//span[text()='12:00:00'])[1]")
    public WebElement stopTimeCheckRA;
     @FindBy(xpath = "(//tbody)[1]//tr[1]//td[2]")
    public WebElement birinciDersRA; //dersin isminin locate' i
     @FindBy(xpath = "(//tbody)[1]//tr[2]//td[2]")
    public WebElement ikinciDersRA; //dersin isminin locate' i
    @FindBy (xpath = "(//*[@type='button'])[1]")
    public WebElement menuRa;
    @FindBy (xpath = "(//*[@role='button'])[6]")
    public WebElement chooseLessonRA;
    @FindBy (xpath = "//*[text()='Grades and Announcements']")
    public WebElement gradesandAnnouncementsRA;
     @FindBy (xpath = "(//*[@type='checkbox'])[15]")
    public WebElement notluDersRA;

            ;







}   //finish 271


