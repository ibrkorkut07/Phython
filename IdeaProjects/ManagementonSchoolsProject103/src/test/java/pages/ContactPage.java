package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "subject")
    public WebElement subject;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(xpath = "//button[text()='Send Message']")
    public WebElement sendMessage;

    @FindBy(xpath = "//div[text()='Contact Message Created Successfully']")
    public WebElement successfully;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement unsuccessfully;

    @FindBy(xpath = "//div[text()='Required']")
    public WebElement required;

}
