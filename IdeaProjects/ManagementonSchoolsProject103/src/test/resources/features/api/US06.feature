@us06
Feature: Den Vicedean olusturma

  Background:
    Given Vice Dean oluşturmak için endpoint hazırlanır

  @US06_TC01_API @api_smoke_test
  Scenario: Vicedean olusturma
    Then Dean rolu ile token olusturulur
    Then Body olarak gönderilecek data hazırlanır US06_TC01
    And Post request gönderilir US06_TC01
    And Status Code'unun 200 oldugu dogrulanir
    And ViceDean ın data'daki bilgilerle oluşturulduğu doğrulanır US06_TC01

  @US06_TC02_API
  Scenario:Data'da "name" bilgisine yer verilmesinin zorunlu olmasi
    Then Dean rolu ile token olusturulur
    Then Body olarak gönderilecek data name bilgisine yer verilmeden hazırlanır US06_TC02
    And Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  @US06_TC03_API
  Scenario:Data'da "surname" bilgisine yer verilmesinin zorunlu olmasi
    Then Dean rolu ile token olusturulur
    Then Body olarak gönderilecek data surname bilgisine yer verilmeden hazırlanır US06_TC03
    And Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  @US06_TC04_API
  Scenario:Data'da "birth Place" bilgisine yer verilmesinin zorunlu olmasi
    Then Dean rolu ile token olusturulur
    Then Body olarak gönderilecek data birth Place bilgisine yer verilmeden hazırlanır US06_TC04
    And Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  @US06_TC05_API
  Scenario:Data'da Gender bilgisine yer verilmesinin zorunlu olmasi
    Then Dean rolu ile token olusturulur
    And Body olarak gönderilecek data Gender bilgisine yer verilmeden hazırlanır US06_TC04
    And Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  @US06_TC06_API
  Scenario:Data'da Telefon no bilgisine yer verilmesinin zorunlu olmasi
    Then Dean rolu ile token olusturulur
    And Body olarak gönderilecek data Telefon no bilgisine yer verilmeden hazırlanır
    And  Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir