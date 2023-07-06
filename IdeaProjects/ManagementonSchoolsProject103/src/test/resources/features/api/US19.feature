@US19
Feature: Teacher rolu ile toplanti duzenleme

  # Post Request Positive Scenario
  @US19_TC01 @api_smoke_test
  Scenario: Toplanti duzenleme
    Given Toplanti duzenlemek icin endpoint hazirlanir US19_TC01
    # Token CommonStepDefinition'dan aliniyor
    When Teacher rolu ile token olusturulur
    And Data hazirlanir US19_TC01
    When Post request gonderilir US19_TC01
    # Status Code CommonStepDefinition'dan aliniyor
    Then Status Code'unun 200 oldugu dogrulanir
    Then Hazirlanan data ile toplanti olusturuldugu dogrulanir US19_TC01

  #Post Request Negative Scenario
  @US19_TC02
  Scenario: "Date" verisinin bulunmasinin zorunlu olmasi
    # Given adimi TC01 ile ayni oldugundan ayrica step olusturulmuyor
    Given Toplanti duzenlemek icin endpoint hazirlanir US19_TC01
    # Token CommonStepDefinition'dan aliniyor
    When Teacher rolu ile token olusturulur
    And Data hazirlanir US19_TC02
    # When adimi TC01 ile ayni oldugundan ayrica step olusturulmuyor
    When Post request gonderilir US19_TC01
    # Status Code CommonStepDefinition'dan aliniyor
    Then Status Code'unun 400 oldugu dogrulanir