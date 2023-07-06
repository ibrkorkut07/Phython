@US_21
Feature: Students_chooselesson_grades_and_announcement

  Background:
    Given Site adresine gidilir
    When Student rolu ile login islemi gerceklestirilir

  @US21_TC01
  Scenario: Ogrenci_Choose_Lesson_listesinde_Teacher_Day_StartTime_ve_Stop_Time_bilgilerini_gorebilmeli
    Then Kullanici Chose Lesson listesinde Teacher bilgilerini gorur
    Then Kullanici Chose Lesson listesinde Day bilgilerini gorur
    Then Kullanici Chose Lesson listesinde Start Time bilgilerini gorur
    Then Kullanici Chose Lesson listesinde Stop time bilgilerini gorur
    And Sayfa kapatilir

  @US21_TC02
  Scenario: Istedigi_ders_veya_dersleri_secebilmeli
    Then Kullanici secmek istedigi dersin Choose Lesson butonuna tiklar
    Then Kullanici Submit butonuna tiklar
    Then Kullanici Lesson added to Student uyarisini gorur
    Then Kullanici secmek istedigi dersin Choose Lesson butonuna tiklar
    And Kullanici Submit butonuna tiklar
    And Kullanici Lesson added to Student uyarisini gorur
    And Sayfa kapatilir

  @US21_TC03
  Scenario:Aynı_gun_ve_saate_denk_gelen_dersleri_secememeli
    Then Kullanici Pazartesi gunu saat oniki de olan dersi secer
    Then Kullanici Submit butonuna tiklar
    Then Kullanici Lesson added to Student uyarisini gorur
    #Then Kullanici Pazartesi gunu saat oniki de olan dersi secer
    And Kullanici Pazartesi gunu saat oniki de olan baska bir ders secer
    And Kullanici Submit butonuna tiklar
    And Kullanici Error: Course schedule cannot be selected for the same hour and day uyarisini gorur
    And Sayfa kapatilir

  @US21_TC04
  Scenario: Sectigi_dersleri_Lesson_Program_Listte_gorebilmeli
    Then Kullanici secmek istedigi dersin Choose Lesson butonuna tiklar
    Then Kullanici Submit butonuna tiklar
    Then Kullanici Lesson added to Student uyarisini gorur
    Then Kullanici sayfayi asagi kaydirir
    Then Kullanici Lesson Program List te ekledigi dersleri gorur
    And Sayfa kapatilir

  @US21_TC05 @smokeTest
  Scenario: Ogrenci_sinav_notlarini_gorebilmeli
    Then Kullanici menu butonuna tiklar
    Then Kullanici sayfada acilan main menu kisminda Grades ve Announcements alanina tiklar
    And Kullanici acilan sayfada Student Info List kisminda Note bolumunu gorur
    And Sayfa kapatilir

  @US21_TC06 @smokeTest
  Scenario:Ogrenci_danismanin_kendisi_icin_olusturdugu_toplantilari_gorebilmeli
    Then Kullanici menu butonuna tiklar
    Then Kullanici sayfada acilan main menu kisminda Grades ve Announcements alanina tiklar
    And Kullanici acilan sayfada Meet List alaninda toplantilari gorur
    And Sayfa kapatilir