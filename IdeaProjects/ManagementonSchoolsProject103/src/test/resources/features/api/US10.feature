@US10_API
Feature: Vice Dean ders programi olusturabilmelidir.

  @US10_TC01  @api_smoke_test
  Scenario: Vice Dean ders programi olusturmasi
    Given Ders programi olusturmak icin end point olusturulur. US10
    When Vice Dean rolu ile token olusturulur
    Then Body olarak gonderilecek data hazirlanir. US10_TC01
    Then Post request gonderilir US10
    And Status Code'unun 200 oldugu dogrulanir
    And Ders Programinin data'daki bilgilerle olusturuldugu dogrulanir

  @US10_TC02
  Scenario: Vice Dean ders programi olusturmasi esnasinda ders secimini bos birakilmasi
    Given Ders programi olusturmak icin end point olusturulur. US10
    When Vice Dean rolu ile token olusturulur
    Then Body olarak gonderilecek data ders secimi yapilmadan hazirlanir. US10_TC02
    Then Post request gonderilir US10
    And Status Code'unun 400 oldugu dogrulanir

  @US10_TC03
  Scenario: Vice Dean ders programi olusturmasi esnasinda egitim donemini bos birakmasi
    Given Ders programi olusturmak icin end point olusturulur. US10
    When Vice Dean rolu ile token olusturulur
    Then Body olarak gonderilecek data egitim donemi secimi yapilmadan hazirlanir. US10_TC03
    Then Post request gonderilir US10
    And Status Code'unun 400 oldugu dogrulanir

  @US10_TC04
  Scenario: Vice Dean ders programi olusturmasi esnasinda ders günü secilmemesi
    Given Ders programi olusturmak icin end point olusturulur. US10
    When Vice Dean rolu ile token olusturulur
    Then Body olarak gonderilecek data ders günü secimi yapilmadan hazirlanir. US10_TC04
    Then Post request gonderilir US10
    And Status Code'unun 400 oldugu dogrulanir

  @US10_TC05
  Scenario: Vice Dean ders programi olusturmasi esnasinda ders bitis saatinin baslangic saatinden kücük olmasi
    Given Ders programi olusturmak icin end point olusturulur. US10
    When Vice Dean rolu ile token olusturulur
    Then Body olarak gonderilecek data ders bitis saati ders baslagic satinden kücük olarak hazirlanir. US10_TC04
    Then Post request gonderilir US10
    And Status Code'unun 400 oldugu dogrulanir