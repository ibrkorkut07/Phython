@US14
Feature: US-13 Vice Dean ogretmen olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar

  @US13_TC05
  Scenario: TC05_Ogretmen_olusturulurken_Name_alaninin_bos_birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And Name bos olarak birakilir
    Then Name_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC06
  Scenario: TC05_Ogretmen_olusturulurken_Name_alaninin_bos_birakilmamasi
    And Ogretmenin girecegi ders secilir
    And Name alanina " " karakteri girilir.
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC07
  Scenario: TC07_Ogretmen_olusturulurken_Surname_alaninin_bos_birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And Surname bos olarak birakilir
    Then Surname_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC08
  Scenario: TC08_Ogretmen_olusturulurken_Surname_alaninin_bos_birakilmamasi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname alanina " " karakteri girilir.
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir


  @US13_TC09
  Scenario: TC09_Ogretmen_olusturulurken_Email_alaninin_bos_birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And Birth_Place bos olarak birakilir
    Then Birth_Place_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC10
  Scenario: TC10_Ogretmen_olusturulurken_Email_alaninin_bos_birakilmamasi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And BirthPlace alanina " " karakteri girilir
    And Email "email" olarak girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir