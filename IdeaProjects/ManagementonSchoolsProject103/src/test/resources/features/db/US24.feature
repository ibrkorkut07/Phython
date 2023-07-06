@US24_DB
Feature: Admin rolu ile ogretmen olusturulabildiginin dogrulanmasi

  @US24_TC01_DB
  Scenario: Admin rolu ile olusturulmus olan ogretmenin bilgilerinin dogrulanmasi
    Given Database baglantisi kurulur
    When Admin rolu ile olusturulmus ogretmen teacher tablosunda id ile bulunur US24
    Then Ogretmenin bilgileri dogrulanir US24
    Then Database baglantisi kesilir