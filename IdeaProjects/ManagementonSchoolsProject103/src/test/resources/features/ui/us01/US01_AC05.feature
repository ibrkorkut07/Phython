@US01_AC05 @US_01
Feature: US01_Aday_ogrenciler_sisteme_kayit_olabilmelidir.

  @US01_TC16
  Scenario: US01_AC05_Kullanici_cinsiyetini_secebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve female buttonuna tiklar
    And Sayfa kapatilir

  @US01_TC17
  Scenario: US01_AC05_Kullanici_cinsiyetini_secebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Sayfa kapatilir