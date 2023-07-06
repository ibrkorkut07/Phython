@API_US02
Feature: Admin Guest User List

  @API_US02_TC01 @api_smoke_test
  Scenario: Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli
    Given Guest User List bilgilerini gorebilmek icin endpoint hazirlanir
    When Admin rolu ile token olusturulur
    And Endpoint'e get request gonderilir
    Then Status code'un iki yuz oldugu dogrulanir US22

  @API_US02_TC02
  Scenario: Admin Guest User List bilgilerini silebilir
    Given Guest User List bilgilerini silebilmek icin endpoint hazirlanir
    When Admin rolu ile token olusturulur
    And Endpoint'e delete request gonderilir
    Then Status code'un iki yuz oldugu dogrulanir US22