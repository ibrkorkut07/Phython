@US24
Feature: Admin ogretmen olusturabilmalidir

  @US24_TC01 @api_smoke_test
  Scenario: admin ogretmen olusturma
    Given admin ogretmen olusturmak icin end pointe olusturulur US24_TC01
    When Admin rolu ile token olusturulur
    And data hazırlanır US24_TC01
    And post request gönderilir US24_TC01
    And Status Code'unun 200 oldugu dogrulanir
    Then assertion islemi yapilir US24_TC01

  @US24_TC02
  Scenario: API ile ogretmen olusturulurken "Name" alaninin bos birakilmasi
    Given admin ogretmen olusturmak icin end pointe olusturulur US24_TC01
    When Admin rolu ile token olusturulur
    And name alani bos birakilarak data hazırlanır US24_TC02
    And post request gönderilir US24_TC01
    And Status Code'unun 400 oldugu dogrulanir