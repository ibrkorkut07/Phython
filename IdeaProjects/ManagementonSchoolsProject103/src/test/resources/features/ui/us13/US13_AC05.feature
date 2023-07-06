@US13
Feature: US-13 Vice Dean ogretmen olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar

  @US13_TC23
  Scenario: TC23_Ogretmen_olusturulurken_Gender_alaninin_bos_birakilmamasi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number "phone" olarak girilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC24
  Scenario: TC24_Ogretmen olusturulurken Date Of Birth alaninin bos birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    Then Date_of_Birth_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC25
  Scenario: TC25_Ogretmen olusturulurken Ssn alaninin bos birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    Then SSn_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC26
  Scenario: TC26_Ogretmen olusturulurken Ssn alanina gecersiz data girilmesi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn'e ucuncu ve besinci rakamdan sonra tire girmeden onbir rakam girer
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC27
  Scenario: TC27_Ogretmen olusturulurken Ssn alanina gecersiz data girilmesi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn'e formata uygun rakam disinda karakterler girer
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC28
  Scenario: TC28_Ogretmen olusturulurken User Name alaninin bos birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And User Name alanina " " karakteri girilir
    Then User_Name_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC29
  Scenario: TC29_Ogretmen olusturulurken User Name alaninin bos birakilmamasi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name space girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC30
  Scenario: TC30_Ogretmen olusturulurken Password alaninin bos birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And Password  bolumune tiklar ve bos birakir
    Then Password_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC31
  Scenario: TC31_Ogretmen olusturulurken Password alanina gecersiz data girilmesi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And Password alanina yedi karakter girer
    Then Kullanici Password bolumunun altinda Minimum sekiz character yazisinin gorundugunu test eder
    Then Sayfa kapatilir

  @US13_TC32
  Scenario: TC32_Ogretmen olusturulurken Password alaninin bos birakilmamasi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password alanina dokuz karakter girer
    And Submit tiklanir
    Then Islemin gerceklestigine dair popUp mesajini goruntuler
    Then Sayfa kapatilir