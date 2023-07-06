@US22_DB
Feature: Admin bilgileri dogrulama

  @US22_TC01_DB
  Scenario: Olusturulan adminin bilgilerinin dogrulanmasi
    Given Database baglantisi kurulur
    When Admin, id bilgisi ile cagrilir US22
    Then Adminin bilgileri dogrulanir US22
    Then Database baglantisi kesilir