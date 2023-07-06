@US13_DB
Feature: Vice Dean rolu ile ogretmen olusturulabildiginin dogrulanmasi

  @US13_TC01_DB
  Scenario: Vice Dean rolu ile olusturulmus olan ogretmenin bilgilerinin dogrulanmasi
    Given Database baglantisi kurulur
    When Vice Dean rolu ile olusturulmus ogretmen teacher tablosunda id ile bulunur US13
    Then Ogretmenin bilgileri dogrulanir US13
    Then Database baglantisi kesilir