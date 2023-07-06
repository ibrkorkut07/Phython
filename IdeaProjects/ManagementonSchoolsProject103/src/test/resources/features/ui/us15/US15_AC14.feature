@us15_ac14
Feature: Password girilmesinin zorunlu olmasi ve girilebilecek min karakter sayisi

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Baslikta bulunan Menu butonuna tiklanir
    When Panelde bulunan Student Management butonuna tiklanir

  @us15_ac_14_tc19
  Scenario: Password girilmesinin zorunlu olmasi
    # And Password kutusu bos birakilir
    When Submit butonuna tiklanir
    Then Password kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac14_tc20
  Scenario: Password için girilebilecek minimum karakter sayısı
    And Password kutusuna yedi karakter girilir
    When Submit butonuna tiklanir
    Then Password'un yedi karakterden az olamayacagina dair uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir