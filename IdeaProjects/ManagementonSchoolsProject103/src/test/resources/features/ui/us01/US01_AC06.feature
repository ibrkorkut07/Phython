@US01_AC06 @US_01
Feature: US01_Aday_ogrenciler_sisteme_kayit_olabilmelidir.

  @US01_TC18
  Scenario: US01_AC06_Kullanici_dogum_tarihini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanini bos birakir
    And Sayfa kapatilir

  @US01_TC19
  Scenario: US01_AC06_Kullanici_dogum_tarihini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatina sifir girer
    And Sayfa kapatilir

  @US01_TC20
  Scenario: US01_AC06_Kullanici_dogum_tarihini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina yil bolumune bes haneli deger girer
    And Sayfa kapatilir

  @US01_TC21
  Scenario: US01_AC06_Kullanici_dogum_tarihini_girebilmelidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Sayfa kapatilir