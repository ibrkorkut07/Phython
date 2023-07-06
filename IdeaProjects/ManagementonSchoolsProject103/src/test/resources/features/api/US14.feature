@US14
Feature: Vice Dean öğretmenleri görebilmeli ve güncelleme yapabilmelidir

  @US14_TC01API @api_smoke_test
  Scenario: API ile mevcut ogretmeni gorebilmeli
    Given End point hazirlanir US14_TC01
    When Vice Dean rolu ile token olusturulur
    And Get request gönderilir US14_TC01
    Then Status Code'unun 200 oldugu dogrulanir

  @US14_TC02API
  Scenario: API ile mevcut ogretmeni guncelleyebilmeli
    Given End point hazirlanir US14_TC02
    When Vice Dean rolu ile token olusturulur
    And Request’te gönderilecek olan data hazırlanır US14_TC02
    And Hazırlanan endpoint’e put request gönderilir US14_TC02
    And Status Code'unun 200 oldugu dogrulanir
    Then Request data’sı ile response data’sının aynı olduğu doğrulanır