package stepdefinitions.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GuestUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenuPanel;
import utilities.Driver;
import utilities.ReusableMethods;

public class GuestUserStepDefinition {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MainMenuPanel menuPanel = new MainMenuPanel();
    GuestUserPage guestUserPage = new GuestUserPage();

    @Given("Kullanici managementonschools sayfasina gider")
    public void kullanici_managementonschools_sayfasina_gider() {
        Driver.getDriver().get("https://www.managementonschools.com/guest-user");
    }

    @When("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        homePage.loginButton.click();
    }

    @When("Kullanici username ve password'e gecerli degerleri girerek sisteme giris yapar")
    public void kullanici_username_passworde_gecerli_degerleri_girerek_sisteme_giris_yapar() {
        loginPage.username.sendKeys("AdminB103");
        loginPage.password.sendKeys("12345678");
        loginPage.loginButton.click();
    }

    @When("Kullanici menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {
        homePage.menuButton.click();
    }

    @When("Kullanici Guest User butonuna tiklar")
    public void kullanici_guest_user_butonuna_tiklar() {
        menuPanel.guestUserButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici Name Surname sutunundaki verilerin gorunurlugunu dogrular")
    public void kullanici_name_surname_sutunundaki_verilerin_gorunurlugunu_dogrular() {
        guestUserPage.nameSurnameColumn.isDisplayed();
    }

    @Then("Kullanici Phone Number sutunundaki verilerin gorunurlugunu dogrular")
    public void kullanici_phone_number_sutunundaki_verilerin_gorunurlugunu_dogrular() {
        guestUserPage.phoneNumberColumn.isDisplayed();
    }

    @When("Kullanici Guest User List'indeki herhangi bir veri grubunun yanindaki cop kutusu simgesine tiklar")
    public void kullanici_guest_user_list_indeki_herhangi_bir_veri_grubunun_yanindaki_cop_kutusu_simgesine_tiklar() {
        guestUserPage.trashBin.click();
    }

    @Then("Kullanici veri grubunun silindigini dogrular")
    public void kullanici_veri_grubunun_silindigini_dogrular() {
        guestUserPage.successfullyDeleted.isDisplayed();
    }

    @Then("Kullanici User Name sutunundaki verilerin gorunurlugunu dogrular")
    public void kullanici_user_name_sutunundaki_verilerin_gorunurlugunu_dogrular() {
        guestUserPage.usernameColumn.isDisplayed();
    }

    @Then("Kullanici Ssn sutunundaki verilerin gorunurlugunu dogrular")
    public void kullanici_ssn_sutunundaki_verilerin_gorunurlugunu_dogrular() {
        guestUserPage.ssnColumn.isDisplayed();
    }

}
