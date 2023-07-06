package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class LessonManagementPage {

    public LessonManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Lesson Program']")
    public WebElement lessonProgramButton;

    @FindBy(xpath = "//div[.='Select lesson']")
    public WebElement selectLesson;

    @FindBy(xpath = "//*[@class='mb-3 form-select']")
    public WebElement selectDay;

    @FindBy(xpath = "//*[@class='mt-5 form-select']")
    public WebElement selectEducationTerm;

    @FindBy(id = "startTime")
    public WebElement startTime;

    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(xpath = "//div[contains(text(),'Created Lesson Program')]")
    public WebElement createdLessonProgram;

    @FindBy(xpath = "//*[.='Please select education term']")
    public WebElement peSeEduTerm;

    @FindBy(xpath = "//div[contains(text(),'Error: start time')]")
    public WebElement timeError;

    @FindBy(xpath = "//div[contains(text(),'JSON parse error:')]")
    public WebElement jSONError;

    @FindBy(xpath = "//div[@class='col-lg-6']//div[@class='mx-auto p-3 col']//div//button[@type='button'][normalize-space()='Submit']")
    public WebElement submitButtonForLesson;

    @FindBy(xpath = "//*[@id='lessonName']")
    public WebElement lessonName;

    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonsButton;

    @FindBy(xpath = "(//*[text()='Lesson Management'])[2]")
    public WebElement lessonManagementAssert;

    @FindBy(xpath = "//*[@id='compulsory']")
    public WebElement lessonCheckbox;

    @FindBy(id = "creditScore")
    public WebElement creditScore;

    @FindBy(xpath = "(//*[text()='Submit'])[2]")
    public WebElement submitlessons;

    public LessonProgramManagementPage clickLessonProgram() {
        ReusableMethods.waitForClickability(lessonProgramButton, 5);
        lessonProgramButton.click();
        return new LessonProgramManagementPage();
    }

}
