@US01_DB
Feature: Aday öğrenciler sisteme kayıt olabilmelidir.

  @US01_TC01_DB
  Scenario: kayit olan aday ogrencinin bilgilerinin dogrulanmasi
    Given Database baglantisi kurulur
    When aday ogrenci student tablosunda username ile bulunur US21
    Then Ogrencinin bilgileri dogrulanir US01_TC01
    Then Database baglantisi kesilir

