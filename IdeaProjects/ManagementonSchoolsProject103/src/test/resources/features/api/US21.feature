@US21_API
Feature: Students, choose lesson, grades and announcement

  @API_US21_TC01 @api_smoke_test
  Scenario: Öğrenci Choose Lesson listesinde; Teacher, Day, Start Time ve Stop Time bilgilerini görebilmeli
    Given chooseLesson için endpoint hazırlanır US21_TC01
    When Student rolu ile token olusturulur
    Then Request gonderilip response alinir US21_TC01
    And Status Code'unun ikiyuz oldugu dogrulanir US21
    And Teacher,Day,Start Time ve Stop Time goruldugu dogrulanir US21_TC01

  @API_US21_TC02
  Scenario: İstediği ders veya dersleri seçebilmeli
    Given chooseLesson secimi için endpoint hazırlanır US21_TC02
    When Student rolu ile token olusturulur
    Then Data hazırlanır US01_TC02
    Then Request gonderilip response alinir US21_TC02
    And Status Code'unun ikiyuz oldugu dogrulanir US21
    And Dersin secildigi dogrulanir US21_TC02

  @API_US21_TC03
  Scenario: İstediği ders veya dersleri seçebilmeli
    Given chooseLesson secimi için endpoint hazırlanır US21_TC02
    When Student rolu ile token olusturulur
    Then lessonProgramId alani bos birakilarak Data hazırlanır US01_TC03
    And Status Code'unun dortyuzdort oldugu dogrulanir US21
    And Dersin secilemedigi dogrulanir US21_TC03

  @API_US21_TC04
  Scenario: İstediği ders veya dersleri seçebilmeli
    Given chooseLesson secimi için endpoint hazırlanır US21_TC02
    When Student rolu ile token olusturulur
    Then ayni ders secimi icin Data hazırlanır US01_TC05
    Then Request gonderilip response alinir US21_TC02
    And Status Code'unun dortyuz oldugu dogrulanir US21
    And Ders secilemedigi dogrulanir US21_TC04

  @API_US21_TC05 @api_smoke_test
  Scenario: Öğrenci sınav notlarını görebilmeli
    Given ogrenci sinav notlari goruntuleme için endpoint hazırlanır US21_TC05
    When Teacher rolu ile token olusturulur
    Then Data hazırlanır US01_TC05
    Then Request gonderilip response alinir US21_TC05
    And Status Code'unun ikiyuz oldugu dogrulanir US21
    And sinav notlarin goruldugu dogrulanir US21_TC05

  @API_US21_TC06 @api_smoke_test
  Scenario: Öğrenci, danışmanın kendisi için oluşturduğu toplantıları görebilmeli
    Given ogrenci toplantilari goruntuleme için endpoint hazırlanır US21_TC06
    When Student rolu ile token olusturulur
    Then Data hazırlanır US01_TC06
    Then Request gonderilip response alinir US21_TC06
    And Status Code'unun ikiyuz oldugu dogrulanir US21
    And toplantilarin goruldugu dogrulanir US21_TC03