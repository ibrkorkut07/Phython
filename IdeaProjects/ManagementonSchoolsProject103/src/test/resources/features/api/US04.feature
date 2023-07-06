@US04
Feature: Admin Dean olusturabilmelidir

  @US04_TC01 @api_smoke_test
  Scenario: Admin rolu ile Dean olusturma
    Given Dean kaydi icin end point hazirlanir
    And Admin rolu ile token olusturulur
    And Request datasi hazirlanir
    And Post request gonderilir
    When Status Code'unun 200 oldugu dogrulanir
    Then Request data ve response datalarin ayni oldugu dogrulanir

  @US04_TC02
  Scenario: Data'da "name" alaninin zorunlu olması
    Given Dean kaydi icin end point hazirlanir
    When Admin rolu ile token olusturulur
    And Request datasi name bilgisi verilmeden hazirlanir
    And Post request gonderilir
    And Status Code'unun 400 oldugu dogrulanir