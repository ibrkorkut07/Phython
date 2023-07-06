@US05
Feature: Admin, Dean leri görebilmeli ve silebilmeli

  @US05_TC01 @api_smoke_test
  Scenario: Admin Dean bilgilerini gorebilmeli
    Given Dean icin end point hazirlanir
    And Admin rolu ile token olusturulur
    And Get request gonderilir us05
    Then Status Code'unun 200 oldugu dogrulanir

  @US05_TC02
  Scenario: Admin Dean'i guncelleyebilmeli
    Given Dean icin end point hazirlanir-put
    When Admin rolu ile token olusturulur
    When Guncelleme icin request data hazirlanir
    And Put request gonderilir
    Then Status Code'unun 200 oldugu dogrulanir

  @US05_TC03
  Scenario: Admin Dean'i silebilmeli
    Given Dean icin end point hazirlanir-del
    Then Admin rolu ile token olusturulur
    When Delete request gonderilir
    Then Status Code'unun 200 oldugu dogrulanir