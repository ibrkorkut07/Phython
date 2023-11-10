Feature: US_07 Dean kullanicilarin gonderdigi mesajlari gorebilmeli
  Background:
    Given MKullanici "url" sayfasina gider.
    And MKullanici 2 saniye bekler
    Then MKullanici logine tiklar
    And MUsername alanina Dean'e ait "username" girer
    And MPassword alanina Dean'e ait "password" girer ve logine tiklar
    And MKullanici 2 saniye bekler
    And MKullanici Menu butonuna tiklar
    And MKullanici 1 saniye bekler
    And MDean Main menuden Contact Get All butonuna tiklar


  Scenario: TC_01 Dean silme butonunu gorebilmeli
    And MDean Contact Message'leri gorur
    And MDean Sil butonunu gorebilmeli
    And MDean Sil butonunun goruldugunu dogrular
    And MKullanici 2 saniye bekler
    And MSayfayi kapatir

  Scenario: TC_02 Dean mesajların yazar, e-mail, tarih ve  subject bilgilerini gorebilmeli
    And MDean Yazar Column gorunur oldugunu dogrular
    And MDean Email Column gorunur oldugunu dogrular
    And MDean Date Column gorunur oldugunu dogrular
    And MDean Subject Column gorunur oldugunu dogrular
    And MDean Message Column gorunur oldugunu dogrular
    And MKullanici 2 saniye bekler
    And MSayfayi kapatir

  Scenario: TC_03 Dean mesajları silebilmeli
    And MDean sayfada Silme butonunu gorur
    And MDean sayfada Silme butonunu tiklar
    And MDean Mesajin silindigini dogrular
    And MKullanici 2 saniye bekler
    And MSayfayi kapatir



