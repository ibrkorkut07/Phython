@US12_DB
Feature: Vice Dean rolu ile ders programının dogrulanmasi

  @US12_TC01_DB
  Scenario: Vice Dean rolu ile olusturulmus olan ders programı bilgilerinin dogrulanmasi
    Given Database baglantisi kurulur
    When Vice Dean rolu ile olusturulmus ders programı tablosunda id ile bulunur US12
    Then Ders program bilgileri dogrulanir US12
    Then Database baglantisi kesilir