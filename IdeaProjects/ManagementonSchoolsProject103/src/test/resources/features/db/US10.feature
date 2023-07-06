@US10_DB
Feature: Vice Dean rolu ile ders programının dogrulanmasi

  @US10_TC01_DB @db_smoke_test
  Scenario: Vice Dean rolu ile olusturulmus olan ders programı bilgilerinin dogrulanmasi
    Given Database baglantisi kurulur
    When Vice Dean rolu ile olusturulmus ders programı tablosunda id ile bulunur US10
    Then Ders program bilgileri dogrulanir US13
    Then Database baglantisi kesilir