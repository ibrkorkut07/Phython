Feature:US_05 Admin Dean'leri gorebilmeli ve silebilmelidir
  Background:
    Given MKullanici "url" sayfasina gider.
    And MKullanici 2 saniye bekler
    Then MKullanici logine tiklar
    And MUsername alanina Admin'e ait "username" girer
    And MPassword alanina Admin'e ait "password" girer ve logine tiklar
    And MKullanici 2 saniye bekler

    And MKullanici Sayfaya giris yaptigini dogrular
    And MKullanici 2 saniye bekler
    And MKullanici Menu butonuna tiklar
    And MKullanici 1 saniye bekler
    And MAdmin Main Menuden Dean Management'i secer


  Scenario: TC_01 Admin, Dean leri görebilmeli ve silebilmeli
    And MAdmin Dean Management sayfasina girdigini dogrular
    And MAdmin Dean List'te Name bilgilerini gorur
    And MAdmin Dean List'te Gender bilgilerini gorur
    And MAdmin Dean List'te Phone Number bilgilerini gorur
    And MAdmin Dean List'te Ssn bilgilerini gorur
    And MAdmin Dean List'te User Name bilgilerini gorur
    And MKullanici 2 saniye bekler
    And MSayfayi kapatir

  Scenario: TC_02 Admin, Dean leri silebilmeli
    And MAdmin liste yaninda Sil butonun tiklar
    And MAdmin Listede kayitli Dean'i silebilmeli
    And MKullanici 2 saniye bekler
    And MSayfayi kapatir

  Scenario: TC_03 Admin, Dean leri silebilmeli
    And MAdmin liste yaninda Edit butonun tiklar
    And MAdmin Listede kayitli Dean'i bilgilerini gunceller
    And MAdmin Sabmit butonuna tiklar
    And MAdmin Dean'in bilgilerinin guncelledigini gorur
    And MKullanici 2 saniye bekler
    And MSayfayi kapatir



