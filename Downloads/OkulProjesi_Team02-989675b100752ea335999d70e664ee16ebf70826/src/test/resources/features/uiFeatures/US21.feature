Feature: US21

  Background: Management School sayfasinda student olarak login olunur
    Given Kullanici Management sayfasina giderRA
    And Kullanici student olarak login olurRA
#PASSED
  Scenario: TC01 Oğrenci Choose Lesson listesinde; Teacher, Day, Start Time ve Stop Time bilgilerini görebilmeli
    Given Choose Lesson da Teacher bir name oldugunu dogrula
    Then Choose Lesson da bir  Day oldugunu dogrula
    And Choose Lesson da bir Start time oldugunu dogrula
    And Choose Lesson da bir Stop time oldugunu dogrula
    And Sayfayi kapatirRA

#FAILED
  Scenario: TC02 Istediğin ders veya dersleri seçebilmeli
    Given Choose Lesson daki ilk kutucuga click yap
    #Then Choose Lesson daki ikinci kutucuga click yap ve submit e tikla
    And Dersin secildigini dogrulaRA
    And Sayfayi kapatirRA

#PASSED
  Scenario: TC03 Aynı gün ve saate denk gelen dersleri seçememeli
    Given Day ve Start Timei ayni olan dersleri sec ve submit e tikla
    Then Course shedule can not be selected for the same hour and day yazisi goruldugunu dogrulaRA
    And Sayfayi kapatirRA

#PASSED
  Scenario: TC04 Seçtiği bir dersi silebilmelidir
    And Sayfayi kapatirRA

#FAILED
  Scenario: TC05 Seçtiği dersleri Lesson Program List’te görebilmeli
    Given Menuye tiklaRA
    Then Choose lesson a tiklaRA
    And Lesson Program List te secili derslerin goruldugunu dogrulaRA
    And Sayfayi kapatirRA

#FAILED
  Scenario: TC06 Öğrenci sınav notlarını görebilmeli
    Given Menuye tiklaRA
    Then Grades and Announcements e tiklaRA
    And Secilen derste notlar girildigini dogrula
    And Sayfayi kapatirRA

#FAILED
  Scenario: TC07 Öğrenci, danışmanın kendisi için oluşturduğu toplantıları görebilmeli
    Given Menuye tiklaRA
    Then Grades and Announcements e tiklaRA
    And Meet List Date' de Start Time, Stop Time ve Description oldugunu dogrulaRA
    And Sayfayi kapatirRA


























