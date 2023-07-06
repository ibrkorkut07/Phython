@US06DB
Feature: Dean rolu ile olusturulmus ViceDean in olustugunun dogrulanmasi

  Scenario:Dean rolu ile olusturulmus ViceDean in olustugunun dogrulanmasi
    Given Database baglantisi kurulur
    Then Dean rolu ile belirlenmis Vicedean Vicedean tablosunda id ile bulunur
    And Vicedean bilgileri dogrulanir
    Then Database baglantisi kesilir

