package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AdminPage;
import pages.DeanPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US23_StepDefs {
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    DeanPage deanPage = new DeanPage();
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String surname = faker.name().lastName();
    String birthPlace = faker.address().city();
    Date dateOfBirth1 = faker.date().birthday(40, 70);
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    String dateOfBirth2 = format.format(dateOfBirth1);
    String phone1 = faker.number().numberBetween(100,999)+"-"+
            faker.number().numberBetween(100,999)+"-"+
            faker.number().numberBetween(1000,9999);

    String ssn1 = faker.number().numberBetween(100,999)+"-"+
            faker.number().numberBetween(10,99)+"-"+
            faker.number().numberBetween(1000, 9999);

    String username = faker.name().username();
    String password1 = faker.number().numberBetween(1000, 9999) + "RBrb";
    String password2 = faker.number().numberBetween(100, 999) + "RBrb";
    String password3 = faker.number().numberBetween(10000, 99999) + "RBrb";
    String password4 = faker.number().numberBetween(1000, 9999) +"RBRB";
    String password5 = faker.number().numberBetween(1000, 9999) +"rbrb";
    String password6 = faker.internet().password(4,8, true, false, false)+ "rbrb";

    @When("Kullanici kayitli bir Admin hesabi ile giris yaparRB")
    public void kullaniciKayitliBirAdminHesabiIleGirisYaparRB() {
        loginPage.login.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("adminUsername"), Keys.TAB,
                ConfigReader.getProperty("adminPassword"));
        ReusableMethods.bekle(1);
        loginPage.loginButton.click();
        ReusableMethods.bekle(2);
    }

    @And("Kullanici Menu butonuna tiklarRB")
    public void kullaniciMenuButonunaTiklarRB() {
        adminPage.menuButtonRB.click();
        ReusableMethods.bekle(2);
    }

    @And("Acilan sayfadan Vice Dean Management kismina tiklarRB")
    public void acilanSayfadanViceDeanManagementKisminaTiklarRB() {
        adminPage.viceDeanManagementPageRB.click();
        ReusableMethods.bekle(2);
    }

    @Given("Admin Vice Dean Management sayfasinda Name, Surname, Birth Place alanlarini doldururRB")
    public void adminViceDeanManagementSayfasindaNameSurnameBirthPlaceAlanlariniDoldururRB() {
        deanPage.viceDeanNameRB.sendKeys(name, Keys.TAB, surname, Keys.TAB, birthPlace);
        ReusableMethods.bekle(2);
    }

    @When("Admin Gender alaninda {string} cinsiyet secerRB")
    public void adminGenderAlanindaFemaleCinsiyetSecerRB(String expectedGenderRB) {
        deanPage.chooseGenderRB(expectedGenderRB);
        ReusableMethods.bekle(2);
    }

    @And("Date Of Birth, Phone, Ssn, User Name ve Password alanlarini doldururRB")
    public void dateOfBirthPhoneSsnUserNameVePasswordAlanlariniDoldururRB() {
        deanPage.viceDeanBirthDayRB.sendKeys(dateOfBirth2, Keys.TAB, phone1, Keys.TAB, ssn1, Keys.TAB, username,Keys.TAB, password1);
        ReusableMethods.bekle(2);
    }

    @And("Admin Vice dean saved mesajinin gorundugunu dogrularRB")
    public void adminViceDeanSavedMesajininGorundugunuDogrularRB() {
        Assert.assertTrue(adminPage.viceDeanSavedRB.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("Date Of Birth, Ssn, User Name ve Password alanlarini doldururRB")
    public void dateOfBirthSsnUserNameVePasswordAlanlariniDoldururRB() {
        deanPage.viceDeanBirthDayRB.sendKeys(dateOfBirth2, Keys.TAB, Keys.TAB, ssn1, Keys.TAB, username, Keys.TAB, password1);
        ReusableMethods.bekle(2);
    }
}
