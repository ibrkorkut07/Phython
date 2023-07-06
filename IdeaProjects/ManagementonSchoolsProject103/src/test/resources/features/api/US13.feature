@US13
Feature: Vice Dean ogretmen olusturabilmalidir

  @US13_TC01 @api_smoke_test
  Scenario: API ile ogretmen olusturma
    Given Vice Dean ogretmen olusturmak icin end pointe gider US13_TC01
    When Vice Dean rolu ile token olusturulur
    And  Request’te gönderilecek olan data hazırlanır US13_TC01
    And Endpoint’e post request gönderilir US13_TC01
    And Status Code'unun 200 oldugu dogrulanir
    Then Request data’sı ile response data’sının aynı olduğu doğrulanır US13_TC01

  Scenario: API ile ogretmen olusturulurken "Name" alaninin bos birakilmasi
    Given Vice Dean ogretmen olusturmak icin end pointe gider US13_TC01
    When Vice Dean rolu ile token olusturulur
    And  Request’te gönderilecek olan data hazırlanır US13_TC02
    And Endpoint’e post request gönderilir US13_TC01
    And Status Code'unun 400 oldugu dogrulanir