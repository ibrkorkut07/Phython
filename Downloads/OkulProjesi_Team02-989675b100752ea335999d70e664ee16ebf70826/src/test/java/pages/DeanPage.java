package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class DeanPage {
    public DeanPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }





    //Recep 20-80
@FindBy(xpath = "//input[@id='name']") public WebElement viceDeanNameRB;
@FindBy(xpath = "//input[@id='surname']") public WebElement viceDeanSurnameRB;
@FindBy(xpath = "//input[@id='birthPlace']") public WebElement viceDeanBirthPlaceRB;
@FindBy(xpath = "//input[@value='FEMALE']") public WebElement viceDeanFemaleRB;
@FindBy(xpath = "//input[@value='MALE']") public WebElement viceDeanMaleRB;
@FindBy(xpath = "//input[@id='birthDay']") public WebElement viceDeanBirthDayRB;
@FindBy(xpath = "//input[@id='phoneNumber']") public WebElement viceDeanPhoneRB;
@FindBy(xpath = "//input[@id='ssn']") public WebElement viceDeanSsnRB;
@FindBy(xpath = "//input[@id='username']") public WebElement viceDeanUsernameRB;
@FindBy(xpath = "//input[@id='password']") public WebElement viceDeanPasswordRB;
@FindBy(xpath = "//button[text()='Submit']") public WebElement viceDeanSubmitButtonRB;
@FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Vice dean Saved']//parent::div[@role='alert']") public WebElement viceDeanSavedMessageRB;
@FindBy(xpath = "//*[@id='name']//following-sibling::div[text()='Required']") public WebElement nameRequiredRB;
@FindBy(xpath = "//*[@id='surname']//following-sibling::div[text()='Required']") public WebElement surnameRequiredRB;
@FindBy(xpath = "//*[@id='birthPlace']//following-sibling::div[text()='Required']") public WebElement birthPlaceRequiredRB;
@FindBy(xpath = "//*[@id='birthDay']//following-sibling::div[text()='Required']") public WebElement dateOfBirthRequiredRB;
@FindBy(xpath = "//*[@id='phoneNumber']//following-sibling::div[text()='Required']") public WebElement phoneRequiredRB;
@FindBy(xpath = "//*[@id='ssn']//following-sibling::div[text()='Required']") public WebElement ssnRequiredRB;
@FindBy(xpath = "//*[@id='username']//following-sibling::div[text()='Required']") public WebElement usernameRequiredRB;
@FindBy(xpath = "//*[@id='password']//following-sibling::div[text()='Enter your password']") public WebElement enterYourPasswordRB;
@FindBy(xpath = "(//div[text()='Please enter valid phone number'])[1]") public WebElement enterValidPhoneNumberRB;
@FindBy(xpath = "//*[text()='Minimum 12 character (XXX-XXX-XXXX)']") public WebElement minimum12characterRB;
@FindBy(xpath = "(//div[text()='Please enter valid SSN number'])[1]") public WebElement enterValidSsnNumberRB;
@FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']") public WebElement minimum11characterRB;
@FindBy(xpath = "//*[text()='At least 8 characters']") public WebElement atLeast8characterRB;
@FindBy(xpath = "//*[text()='One lowercase character']") public WebElement oneLowercaseCharacterRB;
@FindBy(xpath = "//*[text()='One uppercase character']") public WebElement oneUppercaseCharacterRB;
@FindBy(xpath = "//*[text()='One number']") public WebElement oneNumberRB;
public void chooseGenderRB(String expectedGenderRB){
    Assert.assertTrue(viceDeanMaleRB.isDisplayed());
    Assert.assertFalse(viceDeanMaleRB.isSelected());
    Assert.assertTrue(viceDeanFemaleRB.isDisplayed());
    Assert.assertFalse(viceDeanFemaleRB.isSelected());
    if(viceDeanMaleRB.getAttribute("value").equals(expectedGenderRB.toUpperCase())){
        viceDeanMaleRB.click();
        Assert.assertTrue(viceDeanMaleRB.isSelected());
    }else{   viceDeanFemaleRB.click();
        Assert.assertTrue(viceDeanFemaleRB.isSelected());}
}


























































//Mustafa 81-120







































    //Ercan 121-160






































}  //finish

