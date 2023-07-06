@US17
Feature: Teacher rolu ile ogrencilere not verebilme

  # Post Request Positive Scenario
  @US17_TC01 @api_smoke_test
  Scenario: Ogrencilere Not Verme
    Given Teacher ogrenciye not verebilmek icin endpoint hazirlar US17_TC01
    When Teacher rolu ile token olusturulur
    And Data hazirlar US17_TC01
    When Post request gonderilir US17_TC01
    Then Status Code'unun 200 oldugu dogrulanir
    Then Hazirlanan data ile ogrenciye not verildigi dogrulanir US17_TC01

  #Post Request Negative Scenario
  @US17_TC02
  Scenario: "Info Note" verisinin bulunmasinin zorunlu olmasi
    Given Teacher ogrenciye not verebilmek icin endpoint hazirlar US17_TC01
    When Teacher rolu ile token olusturulur
    And Data hazirlanir US17_TC02
    When Post request gonderilir US17_TC01
    Then Status Code'unun 400 oldugu dogrulanir