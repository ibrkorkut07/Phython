package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GradesAndAnnouncementsPage {

    public GradesAndAnnouncementsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//table//thead)[1]")
    public WebElement studentInfoListTablo;

}
