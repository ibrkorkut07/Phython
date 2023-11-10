package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



//ortak locete alınacak


    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath="//*[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//h3")
    public WebElement adminManagementDogrulama;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement menuButton;














}
