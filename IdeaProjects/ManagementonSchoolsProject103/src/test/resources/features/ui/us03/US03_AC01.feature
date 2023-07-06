Feature: Kullanicilar sayfadan mesaj gonderebilmeli

  Background:
    Given Site adresine gidilir
    When kullanici Contact butonuna tiklar

  @us03_tc01
  Scenario: Kullanici mail gonderme bolumune Name girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    Then kullanici Your Name alanina bir deger girilebildigini dogrular
    Then Sayfa kapatilir

  @us03_tc07
  Scenario: Kullanici mail gonderme bolumune Name girebilmeli
    And kullanici Your Name alanini bos birakir
    And kullanici Your Email alanina valid bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Required yazisini gorur
    Then Sayfa kapatilir

  @us03_tc08
  Scenario: Kullanici mail gonderme bolumune Name girebilmeli
    And kullanici Your Name alanina space karakteri girer
    And kullanici Your Email alanina valid bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Required yazisini gorur
    Then Sayfa kapatilir