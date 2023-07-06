@US08api
Feature: Lesson olusturma

  Background:
    Given Lesson oluşturmak için endpoint hazırlanır

  @US08_TC01_API @api_smoke_test
  Scenario:Lesson Olusturma
    Then Vice Dean rolu ile token olusturulur
    Then Body olarak gonderilecek data hazirlanir US08_TC01
    Then Post request gonderilir US08_TC01
    Then Status Code'unun 200 oldugu dogrulanir
    And Lesson ın olusturuldugu dogrulanir US08_TC01

  @US08_TC02_API
  Scenario: Vice dean ders olusturmada Lesson Name kismini bos birakma.
    Then Vice Dean rolu ile token olusturulur
    And Body olarak gönderilecek data  Lesson Name bilgisine yer verilmeden hazırlanır US08_TC02
    And Post request gonderilir US08_TC01
    And  Status Code'unun 400 oldugu dogrulanir

  @US08_TC03_API
  Scenario: Vice dean ders olusturmada Compulsory checkbox alanini bos birakma
    Then Vice Dean rolu ile token olusturulur
    Then Data Compulsory checkbox bilgisine yer verilmeden hazirlanir US08_03
    And Post request gonderilir US08_TC01
    And Status Code'unun 200 oldugu dogrulanir

  @US08_TC04_API
  Scenario: Vice dean ders olusturmada Credit Score alanini bos birakma
    Then Vice Dean rolu ile token olusturulur
    Then  Body olarak gönderilecek data  Credit Score bilgisine yer verilmeden hazirlanir US
    And  Post request gonderilir US08_TC01
    And Status Code'unun 200 oldugu dogrulanir