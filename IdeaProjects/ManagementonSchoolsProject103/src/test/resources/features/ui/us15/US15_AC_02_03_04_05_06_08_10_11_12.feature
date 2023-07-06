@us15_ac020304050608101112
Feature: Veri girilmesi zorunlu olan alanlarin doldurulmasi

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Baslikta bulunan Menu butonuna tiklanir
    When Panelde bulunan Student Management butonuna tiklanir

  @us15_ac02_tc3
  Scenario: Name girilmesinin zorunlu olmasi
    # And Name kutusu bos birakilir
    When Submit butonuna tiklanir
    Then Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac03_tc4
  Scenario: Surname girilmesinin zorunlu olmasi
    # And Surname kutusu bos birakilir
    When Submit butonuna tiklanir
    Then Surname kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac04_tc5
  Scenario: Birth Place girilmesinin zorunlu olmasi
    # And Birth Place kutusu bos birakilir
    When Submit butonuna tiklanir
    Then Birth Place kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac05_tc6
  Scenario: E-mail girilmesinin zorunlu olmasi
    # And E-mail kutusu bos birakilir
    When Submit butonuna tiklanir
    Then E-mail kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac06_tc7
  Scenario: Telefon numarasi girilmesinin zorunlu olmasi
    # And Phone kutusu bos birakilir
    When Submit butonuna tiklanir
    Then Phone kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac08_tc9
  Scenario: Dogum tarihi girilmesinin zorunlu olmasi
    # And Date Of Birth kutusu bos birakilir
    When Submit butonuna tiklanir
    Then Date Of Birth kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac10_tc15
  Scenario: User Name girilmesinin zorunlu olmasi
    # And User Name kutusu bos birakilir
    When Submit butonuna tiklanir
    Then User Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac11_tc16
  Scenario: Father Name girilmesinin zorunlu olmasi
    # And Father Name kutusu bos birakilir
    When Submit butonuna tiklanir
    Then Father Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac12_tc17
  Scenario: Mother Name girilmesinin zorunlu olmasi
    # And Mother Name kutusu bos birakilir
    When Submit butonuna tiklanir
    Then Mother Name kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir