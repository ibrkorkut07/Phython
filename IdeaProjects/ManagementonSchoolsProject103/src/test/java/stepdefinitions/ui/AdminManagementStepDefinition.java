package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminManagementPage;
import pages.MainMenuPanel;

public class AdminManagementStepDefinition {

    MainMenuPanel menuPanel = new MainMenuPanel();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    Faker faker = new Faker();

    @When("Kullanici Admin Management butonuna tiklar")
    public void kullanici_admin_management_butonuna_tiklar() {
        menuPanel.adminManagementButton.click();
    }

    @When("Kullanici Surname kutusuna gecerli bir deger girer")
    public void kullanici_surname_kutusuna_gecerli_bir_deger_girer() {
        adminManagementPage.surnameBox.sendKeys(faker.name().lastName());
    }

    @When("Kullanici Name kutucugunu bos birakir")
    public void kullanici_name_kutucugunu_bos_birakir() {
    }

    @Then("Kullanici hata mesajini dogrular")
    public void kullanici_hata_mesajini_dogrular() {
        adminManagementPage.requiredFeedback.isDisplayed();
    }

    @When("Kullanici name kutusuna bosluk tusu girer")
    public void kullanici_name_kutusuna_bosluk_tusu_girer() {
        adminManagementPage.nameBox.sendKeys(" ");
    }

    @When("Kullanici name kutusuna herhangi bir sayi girer")
    public void kullanici_name_kutusuna_herhangi_bir_sayi_girer() {
        adminManagementPage.nameBox.sendKeys("123");
    }

    @When("Kullanici name kutusuna gecerli bir deger girer")
    public void kullanici_name_kutusuna_gecerli_bir_deger_girer() {
        adminManagementPage.nameBox.sendKeys(faker.name().firstName());
    }

    @Then("Kullanici herhangi bir hata mesaji olmadigini dogrular")
    public void kullanici_herhangi_bir_hata_mesaji_olmadigini_dogrular() {
    }

    @When("Kullanici name kutusuna herhangi bir noktalama isareti girer")
    public void kullanici_name_kutusuna_herhangi_bir_noktalama_isareti_girer() {
        adminManagementPage.nameBox.sendKeys(";");
    }

    @When("Kullanici Surname kutucugunu bos birakir")
    public void kullanici_surname_kutucugunu_bos_birakir() {
    }

    @When("Kullanici Surname kutusuna bosluk tusu girer")
    public void kullanici_surname_kutusuna_bosluk_tusu_girer() {
        adminManagementPage.surnameBox.sendKeys(" ");
    }

    @When("Kullanici Surname kutusuna herhangi bir sayi girer")
    public void kullanici_surname_kutusuna_herhangi_bir_sayi_girer() {
        adminManagementPage.surnameBox.sendKeys("123");
    }

    @When("Kullanici Surname kutusuna herhangi bir noktalama isareti girer")
    public void kullanici_surname_kutusuna_herhangi_bir_noktalama_isareti_girer() {
        adminManagementPage.surnameBox.sendKeys(";");
    }

    @When("Kullanici Birth Place kutusuna gecerli bir deger girer")
    public void kullanici_birth_place_kutusuna_gecerli_bir_deger_girer() {
        adminManagementPage.birthPlaceBox.sendKeys("Istanbul");
    }

    @When("Kullanici Birth Place kutusunu bos birakir")
    public void kullanici_birth_place_kutusunu_bos_birakir() {
    }

    @When("Kullanici Birth Place kutusuna bosluk tusu girer")
    public void kullanici_birth_place_kutusuna_bosluk_tusu_girer() {
        adminManagementPage.birthPlaceBox.sendKeys(" ");
    }

    @When("Kullanici Birth Place kutusuna herhangi bir sayi girer")
    public void kullanici_birth_place_kutusuna_herhangi_bir_sayi_girer() {
        adminManagementPage.birthPlaceBox.sendKeys("123");
    }

    @When("Kullanici Birth Place kutusuna herhangi bir noktalama isareti girer")
    public void kullanici_birth_place_kutusuna_herhangi_bir_noktalama_isareti_girer() {
        adminManagementPage.birthPlaceBox.sendKeys(";");
    }

    @When("Kullanici Date Of Birth kutusuna gecerli bir deger girer")
    public void kullanici_date_of_birth_kutusuna_gecerli_bir_deger_girer() {
        adminManagementPage.dateOfBirthBox.sendKeys("11.12.1999");
    }

    @When("Kullanici Date Of Birth kutusunda yil kismina bes haneli bir tarih girer")
    public void kullanici_date_of_birth_kutusunda_yil_kismina_bes_haneli_bir_tarih_girer() {
        adminManagementPage.dateOfBirthBox.sendKeys("11.12.11111");
    }

    @When("Kullanici Date Of Birth kutusunda yil kismina alti haneli bir tarih girer")
    public void kullanici_date_of_birth_kutusunda_yil_kismina_alti_haneli_bir_tarih_girer() {
        adminManagementPage.dateOfBirthBox.sendKeys("11.12.111111");
    }

    @When("Kullanici Date of Birth kutucugunu bos birakir")
    public void kullanici_date_of_birth_kutucugunu_bos_birakir() {
    }

    @When("Kullanici Phone kutucuguna gecerli bir deger girer")
    public void kullanici_phone_kutucuguna_gecerli_bir_deger_girer() {
        adminManagementPage.phoneNumber.sendKeys("339-834-9232");
    }

    @When("Kullanici Phone kutucuguna gecersiz formatta on iki haneli bir deger girer")
    public void kullanici_phone_kutucuguna_gecersiz_formatta_on_iki_haneli_bir_deger_girer() {
        adminManagementPage.phoneNumber.sendKeys("339435923232");
    }

    @When("Kullanici Phone kutucuguna on bir haneli deger girer")
    public void kullanici_phone_kutucuguna_on_bir_haneli_deger_girer() {
        adminManagementPage.phoneNumber.sendKeys("392-832-932");
    }

    @When("Kullanici Phone kutucuguna on uc haneli deger girer")
    public void kullanici_phone_kutucuguna_on_uc_haneli_deger_girer() {
        adminManagementPage.phoneNumber.sendKeys("392-832-93277");
    }

    @When("Kullanici Phone kutucugunu bos birakir")
    public void kullanici_phone_kutucugunu_bos_birakir() {
    }

    @When("Kullanici SSN'i bos birakir")
    public void kullanici_ssn_i_bos_birakir() {
    }

    @When("Kullanici SSN kutucuguna gecerli bir deger girer")
    public void kullanici_ssn_kutucuguna_gecerli_bir_deger_girer() {
        adminManagementPage.ssnBox.sendKeys("837-38-2834");
    }

    @When("Kullanici Ssn kutucuguna gecersiz formatta on bir haneli bir deger girer")
    public void kullanici_ssn_kutucuguna_gecersiz_formatta_on_bir_haneli_bir_deger_girer() {
        adminManagementPage.ssnBox.sendKeys("12345678901");
    }

    @When("Kullanici Ssn kutucuguna gecerli formatta on haneli bir deger girer")
    public void kullanici_ssn_kutucuguna_gecerli_formatta_on_haneli_bir_deger_girer() {
        adminManagementPage.ssnBox.sendKeys("932-83-235");
    }

    @When("Kullanici User Name'i bos birakir")
    public void kullanici_user_name_i_bos_birakir() {
    }

    @When("Kullanici User Name kutucuguna gecerli bir deger girer")
    public void kullanici_user_name_kutucuguna_gecerli_bir_deger_girer() {
        adminManagementPage.usernameBox.sendKeys(faker.name().username());
    }

    @Then("Kullanici Password'u bos birakir")
    public void kullanici_password_u_bos_birakir() {
    }

    @Then("Kullanici gender kisminda Male butonunun tiklanabilir oldugunu dogrular")
    public void kullanici_gender_kisminda_male_butonunun_tiklanabilir_oldugunu_dogrular() {
        adminManagementPage.genderMale.isSelected();
    }

    @Then("Kullanici gender kisminda Female butonunun tiklanabilir oldugunu dogrular")
    public void kullanici_gender_kisminda_female_butonunun_tiklanabilir_oldugunu_dogrular() {
        adminManagementPage.genderFemale.isSelected();
    }

    @When("Kullanici Password kutucuguna dokuz haneli gecerli bir deger girer")
    public void kullanici_password_kutucuguna_dokuz_haneli_gecerli_bir_deger_girer() {
        adminManagementPage.passwordBox.sendKeys("123456789");
    }

    @When("Kullanici Password kutucuguna gecersiz bir deger girer")
    public void kullanici_password_kutucuguna_gecersiz_bir_deger_girer() {
        adminManagementPage.passwordBox.sendKeys("1234567");
    }

    @When("Kullanici Password kutucuguna sekiz haneli gecerli bir deger girer")
    public void kullanici_password_kutucuguna_sekiz_haneli_gecerli_bir_deger_girer() {
        adminManagementPage.passwordBox.sendKeys("12345678");
    }

    @When("Kullanici Female butonuna tiklar")
    public void kullanici_female_butonuna_tiklar() {
        adminManagementPage.genderFemale.click();
    }

    @When("Kullanici Male butonuna tiklar")
    public void kullanici_male_butonuna_tiklar() {
        adminManagementPage.genderMale.click();
    }

}
