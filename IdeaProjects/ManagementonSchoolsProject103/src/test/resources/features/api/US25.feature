@US25_student_save
Feature: Student_save

  @US25_TC01 @api_smoke_test
  Scenario: TC01_Admin_student_olusturabilmeli
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 200 oldugu dogrulanir
    Then Request data’si ile response data’sinin ayni oldugu dogrulanir US25

  @US25_TC02
  Scenario: TC02_API-Ogrenci olusturken "name" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece name bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @US25_TC03
  Scenario: TC03_API-Ogrenci olusturken "surname" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece surname bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @US25_TC04
  Scenario: TC04_API-Ogrenci olusturken "birthplace" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece birthplace bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @US25_TC05
  Scenario: TC05_Ogrenci olusturken "telefon numarasi" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece telefon numarasi bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @US25_TC06
  Scenario: TC06_Ogrenci olusturken "email" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece email bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @US25_TC07
  Scenario: TC07_Ogrenci olusturken "snn" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece snn bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @US25_TC08
  Scenario: TC08_Ogrenci olusturken "username" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece username bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @US25_TC09
  Scenario: TC09_Ogrenci olusturken "password" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece password bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @US25_TC10
  Scenario: TC10_Ogrenci olusturken "password" bilgisi girilmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Sadece password bilgisi girilmeden data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 400 oldugu dogrulanir

  @US25_TC11
  Scenario: TC11_Ogrenci olusturken "student number" bilgisi otomatik olarak gelmelidir
    Given Admin rolu ile student olusturmak icin endpoint hazirlanir US25
    And  Admin rolu ile token olusturulur
    And Data hazirlanir US25
    And Post request gonderilir US25
    Then Status Code'unun 200 oldugu dogrulanir
    Then Olusturulan oğrenciye otomatik olarak student number atandigi doğrulanır US25