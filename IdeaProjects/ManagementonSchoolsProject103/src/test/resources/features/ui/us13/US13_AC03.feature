@US13
Feature: US-13 Vice Dean ogretmen olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar

  @US13_TC11
  Scenario: TC11_Ogretmen_olusturulurken_Birth_Place_alaninin_bos_birakilmamasi
    And Sayfayi Submit butonu gorulecek sekilde asagi kaydirir.
    And Submit tiklanir
    And Email bos olarak birakilir
    Then Email_bolumunun_altinda_"Required"_yazisinin_oldugunu_dogrular
    Then Sayfa kapatilir

  @US13_TC12
  Scenario: TC12_Ogretmen_olusturulurken_Email_alanina_gecersiz_email_girilmesi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email alanina _abc_ formatinda email karakteri girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC13
  Scenario: TC13_Ogretmen_olusturulurken_Email_alanina_gecersiz_email_girilmesi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email alanina _abc@_ formatinda email karakteri girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC14
  Scenario: TC14_Ogretmen_olusturulurken_Email_alanina_gecersiz_email_girilmesi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email alanina _abc@gmail_ formatinda email karakteri girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC15
  Scenario: TC15_Ogretmen_olusturulurken_Email_alanina_gecersiz_email_girilmesi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email alanina _abc.com_ formatinda email karakteri girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC16
  Scenario: TC16_Ogretmen_olusturulurken_Email_alanina_gecersiz_email_girilmesi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email alanina _abc@abc_ formatinda email karakteri girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC17
  Scenario: TC17_Ogretmen_olusturulurken_Email_alanina_gecersiz_email_girilmesi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email alanina _abc@com_ formatinda email karakteri girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir

  @US13_TC18
  Scenario: TC18_Ogretmen_olusturulurken_Email_alanina_gecersiz_email_girilmesi
    And Ogretmenin girecegi ders secilir
    And Name "name" olarak girilir
    And Surname "surname" olarak girilir
    And birt place "birthplace" olarak girilir
    And Email alanina _sembollervesayilar_ formatinda email karakteri girilir
    And Phone number "phone" olarak girilir
    And Gender female secilir
    And Date of Birth "dateofbirth" olarak girilir
    And Ssn "ssn" olarak girilir
    And User Name "username" olarak  girer
    And Password "password" olarak girer
    And Submit tiklanir
    Then Hata mesajini goruntuler.
    Then Sayfa kapatilir