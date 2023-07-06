package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ReusableMethods;

public class RegisterStepDefinition {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    public static Faker faker = new Faker();
    public static int dateGun = Faker.instance().number().numberBetween(1, 31);
    public static int dateAy = Faker.instance().number().numberBetween(1, 12);
    public static String hiclik = "";
    public static String bosluk = " ";
    public static String fakerCity = faker.address().city();
    public static String rakam = faker.phoneNumber().subscriberNumber(1);
    public static String numberIkiHane = faker.phoneNumber().subscriberNumber(2);
    public static String numberUcHane = faker.phoneNumber().subscriberNumber(3);
    public static String numberDortHane = faker.phoneNumber().subscriberNumber(4);
    public static String numberBesHane = faker.phoneNumber().subscriberNumber(5);
    public static String numberYediHane = faker.phoneNumber().subscriberNumber(7);
    public static String numberOnHane = faker.phoneNumber().subscriberNumber(10);
    public static String numberOnBirHane = faker.phoneNumber().subscriberNumber(11);
    public static String numberOnIkiHane = faker.phoneNumber().subscriberNumber(12);
    public static String phoneFormat = numberUcHane + "-" + numberUcHane + "-" + numberDortHane;
    public static String ssnFormat = numberUcHane + "-" + numberIkiHane + "-" + numberDortHane;

    @When("Kullanici register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
        homePage.registerButton.click();
    }

    @Then("Kullanici Register sayfasinda oldugunu gorur")
    public void kullanici_register_sayfasinda_oldugunu_gorur() {
        Assert.assertEquals(registerPage.registerBolumu.getText(), "Register");
    }

    @Then("Kullanici name alanini bos birakir")
    public void kullanici_name_alanini_bos_birakir() {
        registerPage.name.sendKeys(hiclik, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert registerPage.nameUyari.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici name alanina space\\(bosluk) degeri girer")
    public void kullanici_name_alanina_space_bosluk_degeri_girer() {
        registerPage.name.sendKeys(bosluk, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert registerPage.nameUyari.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici name alanina valid bir deger girer")
    public void kullanici_name_alanina_valid_bir_deger_girer() {
        registerPage.name.sendKeys(ReusableMethods.createName(), Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertFalse(registerPage.nameUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Surname alanini bos birakir")
    public void kullanici_surname_alanini_bos_birakir() {
        registerPage.surname.sendKeys(hiclik, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert registerPage.surnameUyari.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Surname alanina space\\(bosluk) degeri girer")
    public void kullanici_surname_alanina_space_bosluk_degeri_girer() {
        registerPage.surname.sendKeys(bosluk, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert registerPage.surnameUyari.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Surname alanina valid bir deger girer")
    public void kullanici_surname_alanina_valid_bir_deger_girer() {
        registerPage.surname.sendKeys(ReusableMethods.createSurname(), Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertFalse(registerPage.surnameUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Birth Place alanini bos birakir")
    public void kullanici_birth_place_alanini_bos_birakir() {
        registerPage.birthPlace.sendKeys(hiclik, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert registerPage.birthPlaceUyari.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Birth Place alanina space\\(bosluk) degeri girer")
    public void kullanici_birth_place_alanina_space_bosluk_degeri_girer() {
        registerPage.birthPlace.sendKeys(bosluk, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert registerPage.birthPlaceUyari.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Birth Place alanina valid bir deger girer")
    public void kullanici_birth_place_alanina_valid_bir_deger_girer() {
        registerPage.birthPlace.sendKeys(fakerCity, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertFalse(registerPage.birthPlaceUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Phone alanini bos birakir")
    public void kullanici_phone_alanini_bos_birakir() {
        registerPage.phoneNumber.sendKeys(hiclik, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert registerPage.phoneNumberUyari.getText().contains("Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Phone alanina bir karakter deger girer")
    public void kullanici_phone_alanina_bir_karakter_deger_girer() {
        registerPage.phoneNumber.sendKeys(rakam, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertEquals(registerPage.phoneNumberUyari.getText(), "Minimum 12 character (XXX-XXX-XXXX)");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Phone alanina onbir karakter deger girer")
    public void kullanici_phone_alanina_onbir_karakter_deger_girer() {
        registerPage.phoneNumber.sendKeys(numberOnHane, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertEquals(registerPage.phoneNumberUyari.getText(), "Minimum 12 character (XXX-XXX-XXXX)");
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici Phone alanina oniki karakter gecersiz formatta deger girer")
    public void kullanici_phone_alanina_oniki_karakter_gecersiz_formatta_deger_girer() {
        registerPage.phoneNumber.sendKeys(numberOnIkiHane, Keys.TAB);
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollIntoViewJS(registerPage.phoneNumberUyari);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.phoneNumberUyari.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici Phone alanina onuc karakter gecerli formatta deger girer")
    public void kullanici_phone_alanina_onuc_karakter_gecerli_formatta_deger_girer() {
        phoneFormat = numberUcHane + "-" + numberUcHane + "-" + numberBesHane;
        registerPage.phoneNumber.sendKeys(phoneFormat, Keys.TAB);
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollIntoViewJS(registerPage.phoneNumberUyari);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.phoneNumberUyari.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici Phone alanina onbir karakter gecerli formatta deger girer")
    public void kullanici_phone_alanina_onbir_karakter_gecerli_formatta_deger_girer() {
        registerPage.phoneNumber.sendKeys(phoneFormat, Keys.TAB);
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollIntoViewJS(registerPage.phoneNumberUyari);
        ReusableMethods.waitFor(2);
        Assert.assertFalse(registerPage.phoneNumberUyari.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici Gender alanini gorur ve female buttonuna tiklar")
    public void kullanici_gender_alanini_gorur_ve_female_buttonuna_tiklar() {
        registerPage.female.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.female.isSelected());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Gender alanini gorur ve male buttonuna tiklar")
    public void kullanici_gender_alanini_gorur_ve_male_buttonuna_tiklar() {
        registerPage.male.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.male.isSelected());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Date Of Birth alanini bos birakir")
    public void kullanici_date_of_birth_alanini_bos_birakir() {
        registerPage.birthDay.sendKeys(hiclik, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertEquals(registerPage.birthDayUyari.getText(), "Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Date Of Birth alanina gun-ay-yil formatina sifir girer")
    public void kullanici_date_of_birth_alanina_gun_ay_yil_formatina_sifir_girer() {
        registerPage.birthDay.sendKeys("00000000");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.birthDayUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Date Of Birth alanina yil bolumune bes haneli deger girer")
    public void kullanici_date_of_birth_alanina_yil_bolumune_bes_haneli_deger_girer() {
        registerPage.birthDay.sendKeys(dateGun + "." + dateAy + "." + numberBesHane);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.birthDayUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer")
    public void kullanici_date_of_birth_alanina_gun_ay_yil_formatinda_gecerli_deger_girer() {
        registerPage.birthDay.sendKeys(ReusableMethods.createDateOfBirth(), Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertFalse(registerPage.birthDayUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanini bos birakir")
    public void kullanici_ssn_alanini_bos_birakir() {
        registerPage.ssn.sendKeys(hiclik, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertEquals(registerPage.ssnUyari.getText(), "Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanina bir haneli sayi girer")
    public void kullanici_ssn_alanina_bir_haneli_sayi_girer() {
        registerPage.ssn.sendKeys(rakam, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertEquals(registerPage.ssnUyari.getText(), "Minimum 11 character (XXX-XX-XXXX)");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanina on haneli sayi girer")
    public void kullanici_ssn_alanina_on_haneli_sayi_girer() {
        registerPage.ssn.sendKeys(numberOnHane, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertEquals(registerPage.ssnUyari.getText(), "Minimum 11 character (XXX-XX-XXXX)");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanina oniki haneli sayi girer")
    public void kullanici_ssn_alanina_oniki_haneli_sayi_girer() {
        registerPage.ssn.sendKeys(numberOnIkiHane, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.ssnUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanina - icermeyen onbir haneli sayi girer")
    public void kullanici_ssn_alanina_icermeyen_onbir_haneli_sayi_girer() {
        registerPage.ssn.sendKeys(numberOnBirHane, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.ssnUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanina - icermeyen onbir karakterli harf yada ozel karakter girer")
    public void kullanici_ssn_alanina_icermeyen_onbir_karakterli_harf_yada_ozel_karakter_girer() {
        registerPage.ssn.sendKeys("yanlisBilgi", Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.ssnUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanina ikinci ve dorduncu rakamdan sonra - karakteri ile dokuz rakamli deger girer")
    public void kullanici_ssn_alanina_ikinci_ve_dorduncu_rakamdan_sonra_karakteri_ile_dokuz_rakamli_deger_girer() {
        ssnFormat = numberIkiHane + "-" + numberIkiHane + "-" + numberBesHane;
        registerPage.ssn.sendKeys(ssnFormat, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.ssnUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanina ucuncu ve dorduncu rakamdan sonra - karakteri ile dokuz rakamli deger girer")
    public void kullanici_ssn_alanina_ucuncu_ve_dorduncu_rakamdan_sonra_karakteri_ile_dokuz_rakamli_deger_girer() {
        ssnFormat = numberUcHane + "-" + rakam + "-" + numberBesHane;
        registerPage.ssn.sendKeys(ssnFormat, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.ssnUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanina ucuncu ve besinci rakamdan sonra - karakteri ile on rakamli deger girer")
    public void kullanici_ssn_alanina_ucuncu_ve_besinci_rakamdan_sonra_karakteri_ile_on_rakamli_deger_girer() {
        ssnFormat = numberUcHane + "-" + numberIkiHane + "-" + numberBesHane;
        registerPage.ssn.sendKeys(ssnFormat, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.ssnUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici SSN alanina ucuncu ve besinci rakamdan sonra - karakteri ile dokuz rakamli deger girer")
    public void kullanici_ssn_alanina_ucuncu_ve_besinci_rakamdan_sonra_karakteri_ile_dokuz_rakamli_deger_girer() {
        registerPage.ssn.sendKeys(ssnFormat, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertFalse(registerPage.ssnUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici User name alanini bos birakir")
    public void kullanici_user_name_alanini_bos_birakir() {
        registerPage.username.sendKeys(hiclik, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertEquals(registerPage.usernameUyari.getText(), "Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici User name alanina space\\(bosluk) degeri girer")
    public void kullanici_user_name_alanina_space_bosluk_degeri_girer() {
        registerPage.username.sendKeys(bosluk, Keys.TAB);
        ReusableMethods.waitFor(2);
        assert registerPage.usernameUyari.isDisplayed();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici User name alanina valid bir deger girer")
    public void kullanici_user_name_alanina_valid_bir_deger_girer() {
        registerPage.username.sendKeys(ReusableMethods.createUserName(), Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertFalse(registerPage.usernameUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Password alanini bos birakir")
    public void kullanici_password_alanini_bos_birakir() {
        registerPage.password.sendKeys(hiclik, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertEquals(registerPage.passwordUyari.getText(), "Required");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Password alanina bir karakterli bir deger girer")
    public void kullanici_password_alanina_bir_karakterli_bir_deger_girer() {
        registerPage.password.sendKeys(rakam, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.passwordUyari.getText().contains("Minimum 8 character"));
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Password alanina sekiz space\\(bosluk) karakterli bir deger girer")
    public void kullanici_password_alanina_sekiz_space_bosluk_karakterli_bir_deger_girer() {
        bosluk = "        ";
        registerPage.password.sendKeys(bosluk, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.passwordUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Password alanina yedi karakterli bir deger girer")
    public void kullanici_password_alanina_yedi_karakterli_bir_deger_girer() {
        registerPage.password.sendKeys(numberYediHane, Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.passwordUyari.getText().contains("Minimum 8 character"));
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Password alanina sekiz karakterli bir deger girer")
    public void kullanici_password_alanina_sekiz_karakterli_bir_deger_girer() {
        registerPage.password.sendKeys(ReusableMethods.createPassword(), Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertFalse(registerPage.passwordUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Password alanina dokuz karakterli bir deger girer")
    public void kullanici_password_alanina_dokuz_karakterli_bir_deger_girer() {
        registerPage.password.sendKeys(ReusableMethods.createPassword() + "1", Keys.TAB);
        ReusableMethods.waitFor(2);
        Assert.assertFalse(registerPage.passwordUyari.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Register alanina tiklar")
    public void kullanici_register_alanina_tiklar() {
        ReusableMethods.clickByJS(registerPage.registerButton);
        ReusableMethods.waitFor(2);
    }

}
