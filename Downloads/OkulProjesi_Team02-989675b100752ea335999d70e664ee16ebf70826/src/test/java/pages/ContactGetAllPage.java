package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactGetAllPage {
    public ContactGetAllPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Contact Get All']")
    public WebElement contactGetAll;


    //Ercan

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement contactButton;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement contactYourName;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement contactYourMail;
    @FindBy(xpath = "//*[@id='subject']")
    public WebElement contactSubject;
    @FindBy(xpath = "//*[@id='message']")
    public WebElement contactMessage;
    @FindBy(xpath = "//*[text()='Send Message']")
    public WebElement sendMessageButton;
    @FindBy(xpath = "//div[contains(text(),'Contact Message Created Successfully')]")
    public WebElement createdMessage;

    @FindBy(xpath = "//div[text()='Please enter valid email']")
    public WebElement contactErrorMessage;






















































}
