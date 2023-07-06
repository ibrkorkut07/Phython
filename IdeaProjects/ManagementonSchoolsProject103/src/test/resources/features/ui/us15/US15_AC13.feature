@us15_ac13
Feature: Student number'in otomatik olarak verilmesi

  @us15_ac13_tc18
  Scenario: Student number'in otomatik olarak verilmesi
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Baslikta bulunan Menu butonuna tiklanir
    When Panelde bulunan Student Management butonuna tiklanir
    And Choose Teacher listesinden gecerli bir secim yapilir
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
    When Sayfanin alt kisminda yer alan Student List adli listenin son sayfasina gidilir
    When Girilen User Name ile olusturulan ogrenci listede bulunur
    Then Ogrenciye student number atandigi dogrulanir
    Then Sayfa kapatilir