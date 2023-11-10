package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.RegisterPage;
import utilities.Driver;

import java.util.Scanner;

public class US01_StepDef {
    Faker faker=new Faker();
    Scanner scanner = new Scanner(System.in);
    RegisterPage registerpage=new RegisterPage();

    Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici ana sayfaya gider")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get("https://managementonschools.com/");
    }

    @And("kullanici register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        RegisterPage.registerButton.click();
    }

    @And("kullanici  {string} {string} {string} {string} {string} {string} {string} {string} bilgilerini girer")
    public void kullaniciBilgileriniGirer(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
        
    }

    @And("kullanici register yazisina tiklar")
    public void kullaniciRegisterYazisinaTiklar() {
        RegisterPage.RegisterGetRegisterButton.click();
    }

    @And("kullanici bosluk iceren bir name girer")
    public void kullaniciBoslukIcerenBirNameGirer() {
        class Main {
            public void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Lütfen bir isim girin: ");
                String name = scanner.nextLine();
                String newName = name.replaceAll("\\s", "");
                System.out.println("Girilen isim: " + name);
                System.out.println("Boşlukları kaldırılmış isim: " + newName);
            }
        }
        
    }

    @And("kullanici GuestUser requested yazisini gorur")
    public void kullaniciGuestUserRequestedYazisiniGorur() {

        
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {Driver.getDriver().close();
        
    }

    @And("kullanici herhangi bir karakter iceren surname girer")
    public void kullaniciHerhangiBirKarakterIcerenSurnameGirer() {
        
    }

    @And("kullanici bosluk iceren surname girer")
    public void kullaniciBoslukIcerenSurnameGirer() {
        
        
    }

    @And("kullanici karakter birthplace girer")
    public void kullaniciKarakterBirthplaceGirer() {
        
    }

    @And("kullanici bosluk iceren birthplace girer")
    public void kullaniciBoslukIcerenBirthplaceGirer() {
        
    }

    @And("kullanici PhoneNumber girer")
    public void kullaniciPhoneNumberGirer() {
    }

    @And("kullanici gender  girer")
    public void kullaniciGenderGirer() {
    }

    @And("kullanici Date of birth  girer")
    public void kullaniciDateOfBirthGirer() {
        
    }

    @And("kullanici {int} rakamdan olusan , {int} ve {int}.rakamdan sonra {string} iceren ssn  girer")
    public void kullaniciRakamdanOlusanVeRakamdanSonraIcerenSsnGirer(int arg0, int arg1, int arg2, String arg3) {
        
    }

    @And("kullanici user name girer")
    public void kullaniciUserNameGirer() {
        
    }

    @And("kullanici {int} karakterden olusan password girer")
    public void kullaniciKarakterdenOlusanPasswordGirer(int arg0) {
        
    }

    @And("kullanici buyuk harf,kucuk harf ve rakam iceren  password girer")
    public void kullaniciBuyukHarfKucukHarfVeRakamIcerenPasswordGirer() {
        Scanner input = new Scanner(System.in);

        String password = input.nextLine();
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }
        if (hasUpperCase && hasLowerCase && hasSpecialChar) {
            System.out.println("Şifreniz başarıyla doğrulandı.");
        } else {
            System.out.println("Şifreniz doğrulanamadı. Lütfen şifrenizi büyük harf, küçük harf ve özel karakterler içerecek şekilde girin.");
        }
    }



    @And("kullanici herhangi bir karakter iceren name girer")
    public void kullaniciHerhangiBirKarakterIcerenNameGirer() { 
    }
}
