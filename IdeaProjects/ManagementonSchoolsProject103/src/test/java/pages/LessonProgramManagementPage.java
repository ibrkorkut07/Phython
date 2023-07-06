package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class LessonProgramManagementPage {

    public LessonProgramManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[text()='Choose Lessons']/../div")
    public WebElement selectLessonDropdownElement;

    @FindBy(xpath = "//div[contains(@class,'multiValue')]/div[contains(@aria-label,'Remove')]")
    public WebElement selectedLesson;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    public LessonProgramManagementPage selectLessonFromDropdown() {
        selectLessonDropdownElement.click();
        ReusableMethods.waitFor(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        return this;
    }

    public LessonProgramManagementPage removeSelectedLesson() {
        selectedLesson.click();
        return this;
    }

    public boolean isLessonExist() {
        boolean isDisplayed;
        try {
            isDisplayed = selectedLesson.isDisplayed();
        } catch (Exception e) {
            return false;
        }
        return isDisplayed;
    }

}
