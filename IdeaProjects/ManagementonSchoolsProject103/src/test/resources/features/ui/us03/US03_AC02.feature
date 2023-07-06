Feature: Kullanicilar sayfadan mesaj gonderebilmeli

  Background:
    Given Site adresine gidilir
    When kullanici Contact butonuna tiklar

  @us03_tc02
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Email alanina valid bir deger girer
    Then kullanici Your Email alanina bir deger girilebildigini dogrular
    Then Sayfa kapatilir

  @us03_tc03
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Email alanina valid bir deger girer
    Then kullanici girilen degerde "@" ve "." karakterlerinin oldugunu dogrular
    Then Sayfa kapatilir

  @us03_tc09
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanini bos birakir
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Required yazisini gorur
    Then Sayfa kapatilir

  @us03_tc10
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina . icermeyen bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir

  @us03_tc11
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina @ icermeyen bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir

  @us03_tc12
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina "." sonrasi bos deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir

  @us03_tc13
  Scenario: Kullanici mail gonderme bolumune Email girebilmeli
    And kullanici Your Name alanina valid bir deger girer
    And kullanici Your Email alanina space ile baslayan bir deger girer
    And kullanici Subject alanina valid bir deger girer
    And kullanici Message alanina valid bir deger girer
    And kullanici Send Message butonuna tiklar
    Then kullanici Mesajin gonderilemedigini dogrular
    Then Sayfa kapatilir