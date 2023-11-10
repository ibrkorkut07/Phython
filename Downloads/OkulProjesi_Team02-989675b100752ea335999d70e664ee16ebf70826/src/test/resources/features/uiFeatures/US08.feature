Feature: US_08 Vice Dean ders olusturabilmelidir
  Background:
    Given MKullanici "url" sayfasina gider.
    And MKullanici 2 saniye bekler
    Then MKullanici logine tiklar
    And MUsername alanina Vice Dean'e ait "username" girer
    And MPassword alanina Vice Dean'e ait "password" girer ve logine tiklar
    And MKullanici 2 saniye bekler

  Scenario: TC_01 Vice Dean olarak ders olusturur
    And MVice Dean Main Menuden Lesson secer
    And MVice Dean Ders Adi kutusuna bir Ders Adi yazar.
    And MVice Dean Ders Adi kutusuna bir Ders Adi yazdigini dogrular.

    And MVice Dean Zorunlu radyo dugmesine tiklar.
    And MVice Dean zorunlu radyo dugmesinin isaretlendigini dogrular.

    And MVice Dean Credit Score kutusuna bir kredi skoru yazar.
    And MVice Dean Credit Score kutusuna bir kredi skoru yazdigini Dogrular.
    And MVice Dean Gonder dugmesine tiklar.
    And MKullanici 2 saniye bekler
    And MSayfayi kapatir
