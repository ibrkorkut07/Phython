@US01_AC07 @US_01
Feature: US01_Aday_ogrenciler_sisteme_kayit_olabilmelidir.

  @US01_TC22
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanini bos birakir
    And Sayfa kapatilir

  @US01_TC23
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanina bir haneli sayi girer
    And Sayfa kapatilir

  @US01_TC24
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanina on haneli sayi girer
    And Sayfa kapatilir

  @US01_TC25
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanina oniki haneli sayi girer
    And Sayfa kapatilir

  @US01_TC26
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanina - icermeyen onbir haneli sayi girer
    And Sayfa kapatilir

  @US01_TC27
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanina - icermeyen onbir karakterli harf yada ozel karakter girer
    And Sayfa kapatilir

  @US01_TC28
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanina ikinci ve dorduncu rakamdan sonra - karakteri ile dokuz rakamli deger girer
    And Sayfa kapatilir

  @US01_TC29
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanina ucuncu ve dorduncu rakamdan sonra - karakteri ile dokuz rakamli deger girer
    And Sayfa kapatilir

  @US01_TC30
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanina ucuncu ve besinci rakamdan sonra - karakteri ile on rakamli deger girer
    And Sayfa kapatilir

  @US01_TC31
  Scenario: US01_AC07_SSN_girilmelidir_SSN;_3._ve_5._rakamdan_sonra_"-"_icermeli_ve_9_rakamdan_olusmalidir
    Given Site adresine gidilir
    When Kullanici register butonuna tiklar
    Then Kullanici Register sayfasinda oldugunu gorur
    Then Kullanici name alanina valid bir deger girer
    Then Kullanici Surname alanina valid bir deger girer
    Then Kullanici Birth Place alanina valid bir deger girer
    And Kullanici Phone alanina onbir karakter gecerli formatta deger girer
    And Kullanici Gender alanini gorur ve male buttonuna tiklar
    And Kullanici Date Of Birth alanina gun-ay-yil formatinda gecerli deger girer
    And Kullanici SSN alanina ucuncu ve besinci rakamdan sonra - karakteri ile dokuz rakamli deger girer
    And Sayfa kapatilir