package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentPage {
    public StudentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }










   //sumeyye 20-80

























































    //ramazan 80-140
    @FindBy (xpath = "(//*[@id='lessonProgramId'])[1]")
    public WebElement lessonProgramId1RA; //click yapmak icin tiklanacak kutucgun locate' i
    @FindBy (xpath = "(//*[@id='lessonProgramId'])[2]")
    public WebElement lessonProgramId2RA; //click yapmak icin tiklanacak kutucgun locate' i
    @FindBy (xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitStudentRA;
    @FindBy (xpath = "(//tbody)[1]//td[4]")
    public WebElement startTimeSutunuStudentRA;
    @FindBy (xpath = "(//tbody)[1]//td[5]")
    public WebElement daySutunuStudentRA;
    @FindBy (xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement alertSecilemezRA;

    @FindBy (xpath = "(//tbody)[1]//td[2]")
    public WebElement seciliIlkDersIsmi;
    @FindBy (xpath = "(//tbody)[1]//tr[2]//td[2]")
    public WebElement seciliIkinciDersIsmi;











































    //Ali 141-180






}
