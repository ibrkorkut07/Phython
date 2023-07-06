@us25
Feature: Admin_Student_kaydi_yapmabilmeli

  Background: TC001_login_Islemi
    Given Admin ana sayfada login yapar
    And Menu butonunu tiklar
    And Acilan pencereden Student Management secer

  @us25_tc01 @smokeTest
  Scenario: TC01_Admin_kullanici_girisi_ile_Student_kaydi_yapma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then Student Kaydinin yapildigini dogrular
    And Sayfayi kapatir

  @us25_tc02
  Scenario: TC02_danisman_ogretmen_secme
    Given Add Student basliginda Choose Advisor Teacher bos birakir
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then Student Kaydinin yapilmadigini dogrular
    And Sayfa kapatilir

  @us25_tc03
  Scenario: TC03_name_alanini_bos_biraakma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanini bos birakir
    Then "Required" yazisinin ciktigini dogrular

  @us25_tc04
  Scenario: TC04_name_alanina_sembol_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina sembol girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    And bir saniye bekler
    Then Hata mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc05
  Scenario: TC05__name_alanina_space_karakteri_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina space girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then Hata mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc06
  Scenario: TC06_name_alanina_numerik_deger_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina numerik deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then Hata mesajinin gorundugunu dogrular
    And Sayfa kapatilir

  @us25_tc07
  Scenario: TC06_surName_bos_alanini_bos_birakma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alani bos birakir
    Then Surname altinda "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc08
  Scenario: TC08_Surname_alanina_valid_deger_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina sembol girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then "Please enter valid surname" mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc09
  Scenario: TC09_surname_alanina_space_karakteri_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina space girer
    Then Surname altinda"Please enter valid surname" mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc10
  Scenario: TC10_Surname_alaninaa_numerik_deger_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina numerik deger girer
    Then Surname altinda"Please enter valid surname" mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc11
  Scenario: TC11_birthPlace_bos_birakma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place alanini bos birakir
    And BirthPlace "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc12
  Scenario: TC12_email_alanini_bos birakma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanini bos birakir
    Then Email "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc13
  Scenario: TC13_gecerli_email_formati_testi
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina "dede@g" formatta email adresi girer
    Then girilen degerde "@" ve "." karakterlerinin oldugunu dogrular
    And Sayfayi kapatir

  @us25_tc14
  Scenario: TC14_Telefon_alanini_bos_birakma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone alanini bos birakir
    Then Phone "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc15
  Scenario: TC15_phoneNumber_alanina_sinir_degerin_altinda_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone alanina onbir karakter girer
    Then Minimum oniki character (XXX-XXX-XXXX) yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc16
  Scenario: TC16_phoneNumber_invalid_deger_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone alanina invalid karakter girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then Phone Number Hata mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc17
  Scenario: Gender_bos_birakma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender bos birakir
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then student kaydinin yapilamadigini dogrular
    And Sayfayi kapatir

  @us25_tc18
  Scenario: Snn_alanini_bos_birakma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Snn alanina tiklar
    Then Snn "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc19
  Scenario: TC19_snn_verilen_formata_uygun_olmali
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Snn alanina tiklar
    And Uc ve besinci karaktere invalid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then Snn Hata mesajinin gorundugunu dogrular

  @us25_tc20
  Scenario: TC20_snn_gecerli_formatta_olmali
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And SSN alanina (-) iceren oniki karakter girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then Snn Hata mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc21
  Scenario: TC21_user_ssn_alanina_onbir_karakter_girer
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And SSN alanina (-) iceren 10 karakter girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then snn Hata mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc22
  Scenario: TC22_userName_bos_birakildi
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name alanini bos birakir
    Then UserName "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc23
  Scenario: TC23_father_name_alanini_bos_birakma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name alanini bos birakir
    Then "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc24
  Scenario: TC24_father_name_alanina_space_karakteri_girildi
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina space girer
    And Mother Name Alanina valid deger girer
    And Password alanina en az sekiz karakterden olusan valid deger girer
    And Submit butonunu tiklar
    Then Father name Hata mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc25
  Scenario: TC25_Mother_name_alanini_bos_birakma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name alanini bos birakir
    Then MotherName "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc26
  Scenario: TC26_Mother_name_alanina_space_yazma
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name alanini space girer
    Then MotherName "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir

  @us25_tc27
  Scenario: TC27_password_alanina_yedi_karakter_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina yedi Karakter girer
    And Submit butonunu tiklar
    Then Password Hata mesajinin gorundugunu dogrular
    And Sayfayi kapatir

  @us25_tc28
  Scenario: TC29_password_alanina_space_karakteri_girme
    Given Add Student basliginda Choose Advisor Teacher secer
    And Name alanina valid deger girer
    And Surname alanina valid deger girer
    And Birth Place Alanina valid deger girer
    And Email alanina valid email girer
    And Phone Alanina valid phone number girer
    And Gender Secer
    And Date Of Birth Alanina dogum tarihini girer
    And Ssn alanina valid deger girer
    And User Name Alanina valid deger girer
    And Father Name Alanina valid deger girer
    And Mother Name Alanina valid deger girer
    And Password alanina space girer
    And Submit butonunu tiklar
    Then Password "Required" yazisinin ciktigini dogrular
    And Sayfayi kapatir