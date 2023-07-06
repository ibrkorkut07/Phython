Feature: Kullanicilar sayfadan mesaj gonderebilmeli

  Background:
    Given Site adresine gidilir
    When kullanici Contact butonuna tiklar

  @us03_tc06 @smokeTest
  Scenario: Kullanici mesaj gonderebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina valid bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin basarili bir sekilde gonderildigini dogrular
    Then Sayfa kapatilir