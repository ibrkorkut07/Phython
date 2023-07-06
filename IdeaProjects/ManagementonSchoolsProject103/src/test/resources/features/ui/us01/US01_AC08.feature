@US01_AC08 @US_01
Feature: US01_Aday_ogrenciler_sisteme_kayit_olabilmelidir.

  @US01_TC32
  Scenario: US01_AC08_Kullanıcı_User_Name_girmelidir.
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
    And Kullanici User name alanini bos birakir
    And Sayfa kapatilir

  @US01_TC33
  Scenario: US01_AC08_Kullanıcı_User_Name_girmelidir.
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
    And Kullanici User name alanina space(bosluk) degeri girer
    And Sayfa kapatilir

  @US01_TC34
  Scenario: US01_AC08_Kullanıcı_User_Name_girmelidir.
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
    And Sayfa kapatilir