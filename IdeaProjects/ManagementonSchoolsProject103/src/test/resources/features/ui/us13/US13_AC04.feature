@US13
Feature: US-13 Vice Dean ogretmen olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar

  @US13_TC19
  Scenario: TC19_Ogretmen_olusturulurken_Phone_Number_alaninin_bos_birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And Phone_Number bos olarak birakilir
    Then Phone_Number_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC20
  Scenario: TC20_Ogretmen_olusturulurken_Phone_Number_alaninin_bos_birakilmamasi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number alanina formata uygun "789-246-145" girer
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Phone number bolumunun_altinda_"Minimum 12 character"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC21
  Scenario: TC21_Ogretmen_olusturulurken_Phone_Number_alaninin_bos_birakilmamasi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number alanina formata uygun "789-246-14500" girer
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC22
  Scenario: TC22_Öğretmenin danışmanlığı varsa "Is Advisor Teacher" seçeneğini seçilebilme
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email "email" olarak girilir
    And Phone number "phone" olarak girilir
    And "is Advisor Teacher" secenegini isaretler
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Islemin gerceklestigine dair popUp mesajini goruntuler
    Then Sayfa kapatilir