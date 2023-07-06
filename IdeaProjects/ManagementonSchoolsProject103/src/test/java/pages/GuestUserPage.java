package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestUserPage {

    public GuestUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement nameSurnameColumn;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement phoneNumberColumn;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement ssnColumn;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement usernameColumn;

    @FindBy(xpath = "(//*[@class='btn btn-danger'])[1]")
    public WebElement trashBin;

    @FindBy(xpath = "//*[text()=' Guest User deleted Successful']")
    public WebElement successfullyDeleted;

}
