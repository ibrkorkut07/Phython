@US02_DB
Feature: Admin Guest User List
  Scenario: Admin, olusturulan Guest User bilgilerini gorebilmeli ve dogrulamali
    Given Database baglantisi kurulur
    When Guest User id bilgisi ile cagrilir
    Then Guest User'in bilgileri dogrulanir

