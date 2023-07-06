Feature: Kullanicilar sayfadan mesaj gonderebilmeli

  Background:
    Given Site adresine gidilir
    When kullanici Contact butonuna tiklar

  @us03_tc05
  Scenario: Kullanici mail gonderme bolumune Mesaj girebilmeli
    And kullanici Message alanina valid bir deger girer
    Then kullanici Message alanina bir deger girilebildigini dogrular
    Then Sayfa kapatilir

  @us03_tc15
  Scenario: Kullanici mail gonderme bolumune Mesaj girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina valid bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanini bos birakir
    And kullanici Send Message butonuna tiklar
    Then kullanici Required yazisini gorur
    Then Sayfa kapatilir