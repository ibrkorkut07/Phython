@US01_AC01 @US_01
Feature: US01_Aday_ogrenciler_sisteme_kayit_olabilmelidir.

  @US01_TC01
  Scenario: US01_AC01_Herhangi_bir_karakter_iceren_ve_bos_birakilamayan_"Name"_olmalidir.
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    And Kullanici name alanini bos birakir
    And Sayfa kapatilir

  @US01_TC02
  Scenario: US01_AC01_Herhangi_bir_karakter_iceren_ve_bos_birakilamayan_"Name"_olmalidir.
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    And Kullanici name alanina space(bosluk) degeri girer
    And Sayfa kapatilir

  @US01_TC03
  Scenario: US01_AC01_Herhangi_bir_karakter_iceren_ve_bos_birakilamayan_"Name"_olmalidir.
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    And Kullanici name alanina valid bir deger girer
    And Sayfa kapatilir