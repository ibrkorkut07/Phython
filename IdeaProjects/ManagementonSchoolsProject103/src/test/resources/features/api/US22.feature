@API_US22
Feature: Admin ekleme

  Background:
    Given Admin eklemek icin endpoint hazirlanir
    When Admin rolu ile token olusturulur

  @API_US22_TC01 @api_smoke_test
  Scenario: Admin ekleme
    And Data hazırlanır US22
    And Request gonderilip response alinir US01
    Then Status code'un iki yuz oldugu dogrulanir US22
    And assertion_yapilir US01

  @API_US22_TC02
  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    And Yalnızca name alanı boş bırakılarak data hazırlanır US01
    Then Request gonderilip response alinir US01
    Then Status code'un dort yuz oldugu dogrulanir

  @API_US22_TC03
  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    And Yalnızca surname alanı boş bırakılarak data hazırlanır US01
    Then Request gonderilip response alinir US01
    Then Status code'un dort yuz oldugu dogrulanir

  @API_US22_TC04
  Scenario: "Birth Place" girilmelidir. Boş bırakılamaz.
    And Yalnızca birthPlace alanı boş bırakılarak data hazırlanır US01
    Then Request gonderilip response alinir US01
    Then Status code'un dort yuz oldugu dogrulanir

  @API_US22_TC05
  Scenario: Cinsiyet seçilmelidir. Boş bırakılamaz.
    And Yalnızca gender alanı boş bırakılarak data hazırlanır US01
    Then Request gonderilip response alinir US01
    Then Status code'un dort yuz oldugu dogrulanir

  @API_US22_TC06
  Scenario: Doğum tarihi girilmelidir. Boş bırakılamaz.
    And Yalnızca birthDay alanı boş bırakılarak data hazırlanır US01
    Then Request gonderilip response alinir US01
    Then Status code'un dort yuz oldugu dogrulanir

  @API_US22_TC07
  Scenario: Telefon numarası girilmelidir. Boş bırakılamaz.
    And Yalnızca phoneNumber alanı boş bırakılarak data hazırlanır US01
    Then Request gonderilip response alinir US01
    Then Status code'un dort yuz oldugu dogrulanir

  @API_US22_TC08
  Scenario: SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.
    And Sadece SSN'in bos birakildigi data hazirlanir
    Then Status code'un dort yuz oldugu dogrulanir

  @API_US22_TC09
  Scenario: User Name girilmelidir. Boş bırakılamaz.
    And Yalnızca username alanı boş bırakılarak data hazırlanır US01
    Then Request gonderilip response alinir US01
    Then Status code'un dort yuz oldugu dogrulanir

  @API_US22_TC10
  Scenario: Password girilmelidir. Password en az 8 karakterden oluşmalıdır.
    And Sadece Password'un bos birakildigi data hazirlanir
    Then Status code'un dort yuz oldugu dogrulanir