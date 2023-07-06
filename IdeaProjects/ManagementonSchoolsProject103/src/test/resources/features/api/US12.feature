@US12
Feature:Vice Dean öğretmene ders atayabilmelidir.


  @US12_TC01  @api_smoke_test
  Scenario: Vice Dean ders programi olusturmasi
    Given Ders programi olusturmak icin end point olusturulur. US_12
    When Vice Dean rolu ile token olusturulur
    Then Body olarak gonderilecek data hazirlanir. US_12
    Then Post request gonderilir US_12
    And Status Code'unun 200 oldugu dogrulanir
    And Ders Programinin data'daki bilgilerle olusturuldugu dogrulanir.US_12_TC_01

  @US12_TC02
  Scenario: Vice Dean ders programi olusturmasi esnasinda ders secimini bos birakilmasi
    Given Ders programi olusturmak icin end point olusturulur. US_12
    When Vice Dean rolu ile token olusturulur
    Then Body olarak gonderilecek data ders secimi yapilmadan hazirlanir. US_12_TC_02
    Then Post request gonderilir US_12
    And Status Code'unun 400 oldugu dogrulanir

  @US12_TC03
  Scenario: Vice Dean ders programi olusturmasi esnasinda egitim donemini bos birakmasi
    Given Ders programi olusturmak icin end point olusturulur. US_12
    When Vice Dean rolu ile token olusturulur
    Then Body olarak gonderilecek data egitim donemi secimi yapilmadan hazirlanir. US_12_TC_03
    Then Post request gonderilir US_12
    And Status Code'unun 400 oldugu dogrulanir

  @US12_TC04
  Scenario: Vice Dean ders programi olusturmasi esnasinda egitim donemini bos birakmasi
    Given Olusturulan dersi gormek için end point oluşturulur.US_12
    When Vice Dean rolu ile token olusturulur
    Then Data hazirlanir US_12_TC_04
    Then Get request gonderilir US_12_TC_04
    And Status Code'unun 200 oldugu dogrulanir
    And Dersin olusturuldugunun dogrulanmasi yapilir