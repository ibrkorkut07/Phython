@us15_ac01
Feature: Ogrencinin danisman ogretmeninin secilmesi

  @us15_ac01_tc2
  Scenario: Ogrencinin danisman ogretmeninin secilmesi
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Baslikta bulunan Menu butonuna tiklanir
    When Panelde bulunan Student Management butonuna tiklanir
    # And Choose Teacher listesinden herhangi bir secim yapilmaz
    And Name kutusuna gecerli bir deger girilir
    And Surname kutusuna gecerli bir deger girilir
    And Birth Place kutusuna gecerli bir deger girilir
    And Email kutusuna gecerli bir deger girilir
    And Phone kutusuna gecerli bir deger girilir
    And Gender bolumunde gecerli bir secim yapilir
    And Date Of Birth kutusuna gecerli bir deger girilir
    And Ssn kutusuna gecerli bir deger girilir
    And User Name kutusuna gecerli bir deger girilir
    And Father Name kutusuna gecerli bir deger girilir
    And Mother Name kutusuna gecerli bir deger girilir
    And Password kutusuna gecerli bir deger girilir
    When Submit butonuna tiklanir
    Then Danisman ogretmen secilmesi gerektigine dair hata mesajinin alindigi dogrulanir
    Then Sayfa kapatilir