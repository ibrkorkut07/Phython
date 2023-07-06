package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/register']")
    public WebElement registerButton;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Lesson Management']")
    public WebElement lessonManagementLink;

    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement contactButton;

    public LessonManagementPage clickLessonManagement() {
        ReusableMethods.waitForClickability(lessonManagementLink, 5);
        lessonManagementLink.click();
        return new LessonManagementPage();
    }

    public HomePage clickMenu() {
        ReusableMethods.waitForClickability(menuButton, 5);
        menuButton.click();
        return this;
    }

}
