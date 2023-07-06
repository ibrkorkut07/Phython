@US25_DB
Feature: Admin rolu ile ogrenci olusturulabildiginin dogrulanmasi

  @US25_TC01_DB
  Scenario: Admin rolu ile olusturulan ogrencinin bilgilerinin dogrulanmasi
    Given Database baglantisi kurulur US25
    When Admin rolu ile olusturulmus ogrenci student tablosunda username ile bulunur US25
    Then Ogrencinin bilgileri dogrulanir US25
    Then Database baglantisi kesilir
