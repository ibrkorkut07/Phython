@US09API
Feature: (Lessons - Lesson List)

  @US_09_TC01_API @api_smoke_test
  Scenario:Olusturulan; Lesson Name, Compulsory ve Credit Score gorebilmelidir
    Given Lesson goruntuleyebilmek icin endpoint hazirlanir US09_TC01
    Then Vice Dean rolu ile token olusturulur
    Then Get request gonderilir US09_TC01
    And Status Code'unun 200 oldugu dogrulanir

  @US_09_TC02_API
  Scenario: Ders silebilmelidir
    Given Lesson List bilgilerini silebilmek icin endpoint hazirlanir US09_TC02
    Then  Vice Dean rolu ile token olusturulur
    Then  Endpoint'e delete request gonderilir US09_TC02
    And Status Code'unun 200 oldugu dogrulanir