package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }










   //Emine

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div/div[2]/a[1] ")

    public static WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"name\"] ")

    public WebElement RegisterNameInput;


    @FindBy(xpath = "//*[@id=\"surname\"] ")

    public WebElement RegisterSurNameInput;


    @FindBy(xpath = " //*[@id=\"birthPlace\"]")

    public WebElement RegisterBirthplaceInput;


    @FindBy(xpath = " //*[@id=\"phoneNumber\"]")

    public WebElement RegisterPhoneNumberInput;



    @FindBy(xpath = " //*[@id=\"root\"]/div/main/div/div/div/form/div[6]/input")

    public WebElement FemaleRaddioButton;


    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/form/div[7]/input ")

    public WebElement MaleRadioButton;


    @FindBy(xpath = "//*[@id=\"birthDay\"] ")

    public WebElement  RegisterBirthday;



    @FindBy(xpath = "//*[@id=\"ssn\"] ")

    public WebElement RegisterSsnInput;



    @FindBy(xpath = "//*[@id=\"username\"] ")

    public WebElement RegisterUserNameInput;


    @FindBy(xpath = "//*[@id=\"password\"] ")

    public WebElement RegisterPasswordInput;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/form/div[12]/button ")

    public static WebElement RegisterGetRegisterButton;











}
