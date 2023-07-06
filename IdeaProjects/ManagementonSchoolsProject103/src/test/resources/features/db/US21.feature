@US21_DB
Feature: Students, choose lesson, grades and announcement


  @US21_TC01_DB
  Scenario: Öğrencinin secmis oldugu derslerin dogrulanmasi
    Given Database baglantisi kurulur
    When dersler student_lesson tablosunda student_id ile bulunur US21
    Then lesson program id leri dogrulanir US21_TC01
    Then Database baglantisi kesilir


  @US21_TC02_DB
  Scenario: Öğrenci sınav notlarını görebilmeli
    Given Database baglantisi kurulur
    When ogrenci sinav notlari student_info tablosunda student_id ile bulunur US21
    Then ogrenci sinav notlari dogrulanir US21_TC02
    Then Database baglantisi kesilir

  @US21_TC03_DB
  Scenario: Öğrenci, danışmanın kendisi için oluşturduğu toplantıları görebilmeli
    Given Database baglantisi kurulur
    When toplanti meet student tablosunda id ile bulunur US21
    Then Toplanti id bilgileri dogrulanir US21_TC01
    Then Database baglantisi kesilir