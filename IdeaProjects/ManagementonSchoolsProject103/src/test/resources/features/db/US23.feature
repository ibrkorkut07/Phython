@US23DB
Feature: Admin rolu ile olusturulmus ViceDean in olustugunun dogrulanmasi

  @US23_TC01_DB @db_smoke_test
  Scenario:Admin rolu ile olusturulmus ViceDean in olustugunun dogrulanmasi
    Given Database baglantisi kurulur
    Then Admin rolu ile belirlenmis Vicedean Vicedean tablosunda id ile bulunur
    And Vicedean bilgileri dogrulanir
    Then Database baglantisi kesilir