@US01_AC02 @US_01
Feature: US01_Aday_ogrenciler_sisteme_kayit_olabilmelidir.

  @US01_TC04
  Scenario: US01_AC02_Herhangi_bir_karakter_iceren_ve_bos_birakilamayan_"Surname"_olmalidir.
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    And Kullanici Surname alanini bos birakir
    And Sayfa kapatilir

  @US01_TC05
  Scenario: US01_AC02_Herhangi_bir_karakter_iceren_ve_bos_birakilamayan_"Surname"_olmalidir.
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    And Kullanici Surname alanina space(bosluk) degeri girer
    And Sayfa kapatilir

  @US01_TC06
  Scenario: US01_AC02_Herhangi_bir_karakter_iceren_ve_bos_birakilamayan_"Surname"_olmalidir.
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    And Kullanici Surname alanina valid bir deger girer
    And Sayfa kapatilir