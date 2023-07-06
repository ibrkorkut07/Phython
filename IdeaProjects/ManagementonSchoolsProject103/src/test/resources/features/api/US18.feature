@US18
Feature: Teacher rolu ile Student Info Note 'un  goruntulenmesi, guncellenmesi ve silinmesi

  # Get Request
  @US18_TC01 @api_smoke_test
  Scenario: Student Info List goruntuleme
    Given Student Info List goruntulemek icin endpoint hazirlanir US18_TC01
    When Teacher rolu ile token olusturulur
    And Get request gonderilir US18_TC01
    Then Status Code'unun 200 oldugu dogrulanir

  # Put Request
  @US18_TC02
  Scenario: Student Info List  guncelleme
    Given Student Info List guncellemek icin endpoint hazirlanir US18_TC02
    When Teacher rolu ile token olusturulur
    And Data hazirlanir US18_TC02
    When Put request gonderilir US18_TC02
    Then Status Code'unun 200 oldugu dogrulanir
    Then Hazirlanan data ile Student Info Listin guncellendigi dogrulanir US18_TC02

  # Delete Request
  @US18_TC03
  Scenario: Student Info List  silme
    Given Student Info List  silmek icin endpoint hazirlanir US18_TC03
    When Teacher rolu ile token olusturulur
    And Delete request gonderilir US20_TC03
    Then Status Code'unun 200 oldugu dogrulanir