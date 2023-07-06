@US16_API
Feature: Vice Dean rolu ile mesajlari gorebilme

  @api_smoke_test
  Scenario: Vice Dean rolu ile mesajlari gorebilme
    Given Mesajlari gorebilmek icin endpoint hazirlanir
    When Vice Dean rolu ile token olusturulur
    And Get request gonderilir
    And Status Code'unun 200 oldugu dogrulanir