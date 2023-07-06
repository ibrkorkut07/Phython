@US15_DB
Feature: Vice Dean rolu ile ogrenci olusturulabildiginin dogrulanmasi

  @US15_TC01_DB
  Scenario: Vice Dean rolu ile olusturulmus olan ogrencinin bilgilerinin dogrulanmasi
    Given Database baglantisi kurulur
    When Vice Dean rolu ile olusturulmus ogrenci student tablosunda username ile bulunur US15
    Then Ogrencinin bilgileri dogrulanir US15
    Then Database baglantisi kesilir