@US01_AC03 @US_01
Feature: US01_Aday_ogrenciler_sisteme_kayit_olabilmelidir.

  @US01_TC07
  Scenario: US01_AC03_Herhangi_bir_karakter_iceren_ve_bos_birakilamayan_"Birth Place"_olmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    And Kullanici Surname alanina valid bir deger girer
    And Kullanici Birth Place alanini bos birakir
    And Sayfa kapatilir

  @US01_TC08
  Scenario: US01_AC03_Herhangi_bir_karakter_iceren_ve_bos_birakilamayan_"Birth Place"_olmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    And Kullanici Surname alanina valid bir deger girer
    And Kullanici Birth Place alanina space(bosluk) degeri girer
    And Sayfa kapatilir

  @US01_TC09
  Scenario: US01_AC03_Herhangi_bir_karakter_iceren_ve_bos_birakilamayan_"Birth Place"_olmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    And Kullanici Surname alanina valid bir deger girer
    And Kullanici Birth Place alanina valid bir deger girer
    And Sayfa kapatilir