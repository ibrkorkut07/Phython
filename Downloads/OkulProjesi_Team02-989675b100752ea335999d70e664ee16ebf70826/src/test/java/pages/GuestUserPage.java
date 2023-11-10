package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestUserPage {
    public GuestUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Emine
    @FindBy(xpath = " //*[@id=\"root\"]/div/main/div/div[1]/div/div/h5")

    public WebElement GuestUserListLocate;



    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/div/div/div[1]/table/thead/tr/th[1]")

    public WebElement GuestUserName;



    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/div/div/div[1]/table/thead/tr/th[2] ")

    public WebElement GuestUserPhoneNumber;



    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/div/div/div[1]/table/thead/tr/th[3] ")

    public WebElement GuestUserSsnNumber;


    @FindBy(xpath = " //*[@id=\"root\"]/div/main/div/div[1]/div/div/div/div[1]/table/thead/tr/th[4]")

    public WebElement GuestUserUserName;


    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/div/div/div[1]/table/tbody/tr[1]/td[5]/span/button/i ")

    public WebElement GuestUserCopKutusu;











}
