package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanPage {
    public ViceDeanPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }










    //sumeyye 20-90

    //İrem 91-140

    //Korkut 141-190 YAZIYOM ASAGi

    //Burak 191-240

















































































































  @FindBy(xpath = "//button[text()='Menu']")
  public WebElement menuButonuViceDean;
    @FindBy(xpath = "//*[text()='Contact Message']")
    public WebElement contactMessage;
}
