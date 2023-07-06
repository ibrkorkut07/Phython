@US03_API
Feature: Kullanici olarak mesaj gonderebilme

  # Pozitive scenario
  @US03_TC01 @api_smoke_test
  Scenario: Kullanici olarak mesaj gonderebilme_TC01
    Given Mesaj gonderebilmek icin endpoint hazirlanir US03
    When Data hazirlanir US03
    And Post request gonderilir US03
    And Status Code'unun 200 oldugu dogrulanir
    Then Hazirlanan data ile mesaj gonderildigi dogrulanir US03

  # Negative scenario
  @US03_TC02
  Scenario: Kullanici olarak mesaj gonderebilme_TC02
    Given Mesaj gonderebilmek icin endpoint hazirlanir US03
    When Name alani bos birakilarak data hazirlanir US03
    And Post request gonderilir US03
    And Status Code'unun 400 oldugu dogrulanir
    Then Hazirlanan data ile mesaj gonderilemedigi dogrulanir US03

  # Negative scenario
  @US03_TC03
  Scenario: Kullanici olarak mesaj gonderebilme_TC03
    Given Mesaj gonderebilmek icin endpoint hazirlanir US03
    When Email alani bos birakilarak data hazirlanir US03
    And Post request gonderilir US03
    And Status Code'unun 400 oldugu dogrulanir
    Then Hazirlanan data ile mesaj gonderilemedigi dogrulanir US03

  # Negative scenario
  @US03_TC04
  Scenario: Kullanici olarak mesaj gonderebilme_TC04
    Given Mesaj gonderebilmek icin endpoint hazirlanir US03
    When Email alanina invalid deger girilerek data hazirlanir US03
    And Post request gonderilir US03
    And Status Code'unun 400 oldugu dogrulanir
    Then Hazirlanan data ile mesaj gonderilemedigi dogrulanir US03