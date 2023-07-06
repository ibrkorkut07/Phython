package utilities;

import com.github.javafaker.Faker;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateAdminToken;

public class ReusableMethods {

    public static void clickByJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public static String getValueByJS(String idOfElement) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String text = js.executeScript("return document.getElementById('" + idOfElement + "').value").toString();
        return text;
    }

    public static void scrollEndJS() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void scrollIntoViewJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollTopJS() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }

    public static void typeWithJS(WebElement element, String metin) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','" + metin + "')", element);
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement waitForClickability(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void login(String username, String password) {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.loginButton.click();
        loginPage.username.sendKeys(ConfigReader.getProperty(username));
        loginPage.password.sendKeys(ConfigReader.getProperty(password));
        loginPage.loginButton.click();
    }

    public static void selectFromDropdownByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void selectFromDropdownByVisibleText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static String createName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String createSurname() {
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    public static String createBirthPlace() {
        Faker faker = new Faker();
        return faker.address().cityName();
    }

    public static String createEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String createPhone() {
        Faker faker = new Faker();
        int firstNumberOfThePhone = faker.number().randomDigit();
        int secondNumberOfThePhone = faker.number().randomDigit();
        int thirdNumberOfThePhone = faker.number().randomDigit();
        int fourthNumberOfThePhone = faker.number().randomDigit();
        int fifthNumberOfThePhone = faker.number().randomDigit();
        int sixthNumberOfThePhone = faker.number().randomDigit();
        int seventhNumberOfThePhone = faker.number().randomDigit();
        int eighthNumberOfThePhone = faker.number().randomDigit();
        int ninthNumberOfThePhone = faker.number().randomDigit();
        int tenthNumberOfThePhone = faker.number().randomDigit();
        String phone = "" +
                firstNumberOfThePhone +
                secondNumberOfThePhone +
                thirdNumberOfThePhone +
                "-" +
                fourthNumberOfThePhone +
                fifthNumberOfThePhone +
                sixthNumberOfThePhone +
                "-" +
                seventhNumberOfThePhone +
                eighthNumberOfThePhone +
                ninthNumberOfThePhone +
                tenthNumberOfThePhone;
        return phone;
    }

    public static String createDateOfBirth() {
        Faker faker = new Faker();
        int year = faker.number().numberBetween(1958, 2023);
        int month = faker.number().numberBetween(1, 12);
        int day = faker.number().numberBetween(1, 28);
        String dateOfBirth = day + "." + month + "." + year;
        return dateOfBirth;
    }

    public static String createSSN() {
        Faker faker = new Faker();
        int firstNumberOfTheSSN = faker.number().randomDigit();
        int secondNumberOfTheSSN = faker.number().randomDigit();
        int thirdNumberOfTheSSN = faker.number().randomDigit();
        int fourthNumberOfTheSSN = faker.number().randomDigit();
        int fifthNumberOfTheSSN = faker.number().randomDigit();
        int sixthNumberOfTheSSN = faker.number().randomDigit();
        int seventhNumberOfTheSSN = faker.number().randomDigit();
        int eighthNumberOfTheSSN = faker.number().randomDigit();
        int ninthNumberOfTheSSN = faker.number().randomDigit();
        String ssn = "" +
                firstNumberOfTheSSN +
                secondNumberOfTheSSN +
                thirdNumberOfTheSSN +
                "-" +
                fourthNumberOfTheSSN +
                fifthNumberOfTheSSN +
                "-" +
                sixthNumberOfTheSSN +
                seventhNumberOfTheSSN +
                eighthNumberOfTheSSN +
                ninthNumberOfTheSSN;
        return ssn;
    }

    public static String createUserName() {
        Faker faker = new Faker();
        return faker.name().username();
    }

    public static String createFatherName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String createMotherName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String createPassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }

    public static void deleteRequest(String firstPathParam, Integer id) {
        RequestSpecification specification = new RequestSpecBuilder().
                addHeader("Authorization", generateAdminToken()).
                setContentType(ContentType.JSON).
                setBaseUri(ConfigReader.getProperty("uri")).
                build();
        specification.pathParams("first", firstPathParam, "second", "delete", "third", id);
        given().spec(specification).when().delete("/{first}/{second}/{third}");
    }

    public static void deleteRequestWithoutDeleteParam(String firstPathParam, Integer id) {
        RequestSpecification specification = new RequestSpecBuilder().
                addHeader("Authorization", generateAdminToken()).
                setContentType(ContentType.JSON).
                setBaseUri(ConfigReader.getProperty("uri")).
                build();
        specification.pathParams("first", firstPathParam, "second", id);
        given().spec(specification).when().delete("/{first}/{second}");
    }

}
