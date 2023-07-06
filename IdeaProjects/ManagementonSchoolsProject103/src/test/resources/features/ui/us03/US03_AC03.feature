Feature: Kullanicilar sayfadan mesaj gonderebilmeli

  Background:
    Given Site adresine gidilir
    When kullanici Contact butonuna tiklar

  @us03_tc04
  Scenario: Kullanici mail gonderme bolumune Subject girebilmeli
    And kullanici Subject alanina valid bir deger girer
    Then kullanici Subject alanina bir deger girilebildigini dogrular
    Then Sayfa kapatilir

  @us03_tc14
  Scenario: Kullanici mail gonderme bolumune Subject girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina valid bir deger girer
    And kullanici Subject alanini bos birakir
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Required yazisini gorur
    Then Sayfa kapatilir