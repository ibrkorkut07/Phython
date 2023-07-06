@US19_DB
Feature: Teacher rolu ile meet olusturulabildiginin dogrulanmasi

  @US19_TC01_DB
  Scenario: Teacher rolu ile olusturulmus olan meet bilgilerinin dogrulanmasi
    Given Database baglantisi kurulurUS_19
    When Teacher rolu ile olusturulmus meet tablosunda Id ile bulunur US19
    Then Meet bilgileri dogrulanir US19
    Then Database baglantisi kesilir
