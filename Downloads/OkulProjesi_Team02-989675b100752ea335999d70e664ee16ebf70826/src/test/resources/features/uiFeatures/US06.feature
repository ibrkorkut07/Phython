Feature: US06 Dean, Vice Dean hesabi olusturabilmeli

  Background: Kullanici web sitesine gider
    Given Kullanici web sitesine giderRB
    When Kullanici kayitli bir Dean hesabi ile giris yaparRB

    @US06-TC01
  Scenario: TC01 Dean Web Sitesinde Vice Dean olusturabilmeliRB
    Given Kullanici Vice Dean Management sayfasinda Name alanina bir isim girerRB
    When Surname alanina bir soyisim girerRB
    And Birth Place alanina dogum yeri girerRB
    And Gender alaninda 'Female' cinsiyet secerRB
    And Date Of Birth alanini doldururRB
    And Phone alanina telefon numarasi girerRB
    And Ssn alanina bir Sosyal Guvenlik Numarasi girerRB
    And Username alanina bir kullanici adi girerRB
    And Password alanina bir sifre girerRB
    And Submit butonuna tiklarRB
    And Vice dean saved mesajinin gorundugunu dogrularRB
    Then Sayfayi kapatirRB

  @US06-TC02
  Scenario: TC02 Zorunlu alanlar bos birakildiginda kayit islemi gerceklesmemeliRB
    Given Kullanici Vice Dean Management sayfasinda Name, Surname, Birth Place, Gender, Date Of Birth, Phone, Ssn, Username ve Password alanlarini bos birakirRB
    When Submit butonuna tiklarRB
    And Kaydin gerceklesmedigini dogrularRB
    And Sayfayi kapatirRB

  @US06-TC03
  Scenario: TC03 Phone formatina uygun bir sekilde yazilmadiginda gerceklesmemeliRB
    Given Kullanici Vice Dean Management sayfasinda Name, Surname, Birth Place, Gender 'Male' Date Of Birth, Ssn, Username ve Password alanlarini doldururRB
    When Phone alaninda tire isareti yerine baska bir isaret kullanirRB
    And Submit butonuna tiklarRB
    And Please enter valid phone number mesajinin gorundugunu dogrularRB
    And Phone alanini temizlerRB
    And Phone alaninda tire isareti kullanmadan on haneli bir numara girerRB
    And Minimum oniki character (XXX-XXX-XXXX) mesajinin gorundugunu dogrularRB
    And Phone alanini temizlerRB
    And Phone alaninda tire isareti kullanmadan oniki haneli bir numara girerRB
    And Submit butonuna tiklarRB
    And  Please enter valid phone number mesajinin gorundugunu dogrularRB
    And Sayfayi kapatirRB

  @US06-TC04
  Scenario: TC04 Ssn, formatina uygun bir sekilde yazilmadiginda kayit islemi gerceklesmemeliRB
    Given Kullanici Vice Dean Management sayfasinda Name, Surname, Birth Place, Gender 'Female' Date Of Birth, Phone, Username ve Password alanlarini doldururRB
    When Ssn alaninda ucuncu rakamdan sonra farkli bir isaret girerRB
    And Submit butonuna tiklarRB
    And Please enter valid SSN number mesajinin gorundugunu dogrularRB
    And Ssn alanini temizlerRB
    And Ssn alaninda besinci rakamdan sonra farkli bir isaret girerRB
    And Submit butonuna tiklarRB
    And Please enter valid SSN number mesajinin gorundugunu dogrularRB
    And Ssn alanini temizlerRB
    And Ssn alaninda ikinci ve altinci rakamlardan sonra tire isareti girerRB
    And Submit butonuna tiklarRB
    And Please enter valid SSN number mesajinin gorundugunu dogrularRB
    And Ssn alanini temizlerRB
    And Ssn alaninda tire isareti kullanmadan dokuz haneli bir Ssn girerRB
    And Minimum onbir charakter (XXX-XX-XXXX) mesajinin gorundugunu dogrularRB
    And Ssn alanini temizlerRB
    And Ssn alaninda tire isareti kullanmadan onbir haneli bir Ssn girerRB
    And Submit butonuna tiklarRB
    And Please enter valid SSN number mesajinin gorundugunu dogrularRB
    And Sayfayi kapatirRB

  @US06-TC05
  Scenario: TC05 Password, en az 8 karakterden olusmaliRB
    Given Kullanici Vice Dean Management sayfasinda Name, Surname, Birth Place, Gender 'Male' Date Of Birth, Phone, Ssn ve Username alanlarini doldururRB
    When Password alanina yedi haneli bir sifre girerRB
    And Submit butonuna tiklarRB
    And At least sekiz characters mesajinin gorundugunu dogrularRB
    And Password alanini temizlerRB
    And Password alanina dokuz haneli bir sifre girerRB
    And Submit butonuna tiklarRB
    And Vice dean saved mesajinin gorundugunu dogrularRB
    And Sayfayi kapatirRB

  @US06-TC06
  Scenario: TC06 Password, buyuk harf, kucuk harf ve rakam icermelidir.
    Given Kullanici Vice Dean Management sayfasinda Name, Surname, Birth Place, Gender 'Female' Date Of Birth, Phone, Ssn ve Username alanlarini doldururRB
    When Password alanina buyuk harf ve rakamlardan olusan bir sifre girer
    And One lowercse character mesajinin gorundugunu dogrular
    And Password alanini temizlerRB
    And Password alanina kucuk harf ve rakamlardan olusan bir sifre girer
    And One uppercase character mesajinin gorundugunu dogrular
    And Password alanini temizlerRB
    And Password alanina buyuk harf ve kucuk harflerden olusan bir sifre girer
    And One number mesajinin gorundugunu dogrular
    And Sayfayi kapatirRB




