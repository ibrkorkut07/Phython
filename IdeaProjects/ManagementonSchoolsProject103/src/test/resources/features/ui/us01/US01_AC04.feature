@US01_AC04 @US_01
Feature: US01_Aday_ogrenciler_sisteme_kayit_olabilmelidir.

  @US01_TC10
  Scenario: US01_AC04_Kullanici_telefon_numarasini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanini bos birakir
    And Sayfa kapatilir

  @US01_TC11
  Scenario: US01_AC04_Kullanici_telefon_numarasini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina bir karakter deger girer
    And Sayfa kapatilir

  @US01_TC12
  Scenario: US01_AC04_Kullanici_telefon_numarasini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter deger girer
    And Sayfa kapatilir

  @US01_TC13
  Scenario: US01_AC04_Kullanici_telefon_numarasini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina oniki karakter gecersiz formatta deger girer
    And Sayfa kapatilir

  @US01_TC14
  Scenario: US01_AC04_Kullanici_telefon_numarasini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onuc karakter gecerli formatta deger girer
    And Sayfa kapatilir

  @US01_TC15
  Scenario: US01_AC04_Kullanici_telefon_numarasini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Sayfa kapatilir