@US01_AC09 @US_01
Feature: US01_Aday_ogrenciler_sisteme_kayit_olabilmelidir.

  @US01_TC35
  Scenario: US01_AC09_Password_girilmelidir_Password_en_az_8_karakterden_olusmalidir
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
    And Kullanici User name alanina valid bir deger girer
    And Kullanici Password alanini bos birakir
    And Sayfa kapatilir

  @US01_TC36
  Scenario: US01_AC09_Password_girilmelidir_Password_en_az_8_karakterden_olusmalidir
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
    And Kullanici User name alanina valid bir deger girer
    And Kullanici Password alanina bir karakterli bir deger girer
    And Sayfa kapatilir

  @US01_TC37
  Scenario: US01_AC09_Password_girilmelidir_Password_en_az_8_karakterden_olusmalidir
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
    And Kullanici User name alanina valid bir deger girer
    And Kullanici Password alanina sekiz space(bosluk) karakterli bir deger girer
    And Sayfa kapatilir

  @US01_TC38
  Scenario: US01_AC09_Password_girilmelidir_Password_en_az_8_karakterden_olusmalidir
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
    And Kullanici User name alanina valid bir deger girer
    And Kullanici Password alanina yedi karakterli bir deger girer
    And Sayfa kapatilir

  @US01_TC39
  Scenario: US01_AC09_Password_girilmelidir_Password_en_az_8_karakterden_olusmalidir
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
    And Kullanici User name alanina valid bir deger girer
    And Kullanici Password alanina sekiz karakterli bir deger girer
    And Sayfa kapatilir

  @US01_TC40
  Scenario: US01_AC09_Password_girilmelidir_Password_en_az_8_karakterden_olusmalidir
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
    And Kullanici User name alanina valid bir deger girer
    And Kullanici Password alanina dokuz karakterli bir deger girer
    And Sayfa kapatilir

  @US01_TC41 @smokeTest
  Scenario: US01_AC09_Password_girilmelidir_Password_en_az_8_karakterden_olusmalidir
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
    And Kullanici User name alanina valid bir deger girer
    And Kullanici Password alanina dokuz karakterli bir deger girer
    And Kullanici Register alanina tiklar
    And Sayfa kapatilir