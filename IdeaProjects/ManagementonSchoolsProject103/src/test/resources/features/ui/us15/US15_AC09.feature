@us15_ac09
Feature: SSN girilmesinin zorunlu olmasi, formati ve karakter sayisi

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Baslikta bulunan Menu butonuna tiklanir
    When Panelde bulunan Student Management butonuna tiklanir

  @us15_ac09_tc_10
  Scenario: SSN girilmesinin zorunlu olmasi
    # And Ssn kutusu bos birakilir
    When Submit butonuna tiklanir
    Then Ssn kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac09_tc_11
  Scenario: SSN'in 3. rakamdan sonra "-" icermesi
    And Choose Teacher listesinden gecerli bir secim yapilir
    And Name kutusuna gecerli bir deger girilir
    And Surname kutusuna gecerli bir deger girilir
    And Birth Place kutusuna gecerli bir deger girilir
    And Email kutusuna gecerli bir deger girilir
    And Phone kutusuna gecerli bir deger girilir
    And Gender bolumunde gecerli bir secim yapilir
    And Date Of Birth kutusuna gecerli bir deger girilir
    # And "Ssn" kutusunda 7.basamakta "-", diğer basamaklarda rakam olmak üzere 11 değer girilir
    And User Name kutusuna gecerli bir deger girilir
    And Father Name kutusuna gecerli bir deger girilir
    And Mother Name kutusuna gecerli bir deger girilir
    And Password kutusuna gecerli bir deger girilir
    When Submit butonuna tiklanir
    Then SSN'nin dogru formatta girilmesi gerektigine dair hata mesajinin alindigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac09_tc_12
  Scenario: SSN'in 5. rakamdan sonra "-" icermesi
    And Choose Teacher listesinden gecerli bir secim yapilir
    And Name kutusuna gecerli bir deger girilir
    And Surname kutusuna gecerli bir deger girilir
    And Birth Place kutusuna gecerli bir deger girilir
    And Email kutusuna gecerli bir deger girilir
    And Phone kutusuna gecerli bir deger girilir
    And Gender bolumunde gecerli bir secim yapilir
    And Date Of Birth kutusuna gecerli bir deger girilir
    # And "Ssn" kutusunda 4.basamakta "-", diğer basamaklarda rakam olmak üzere 11 değer girilir
    And User Name kutusuna gecerli bir deger girilir
    And Father Name kutusuna gecerli bir deger girilir
    And Mother Name kutusuna gecerli bir deger girilir
    And Password kutusuna gecerli bir deger girilir
    When Submit butonuna tiklanir
    Then SSN'nin dogru formatta girilmesi gerektigine dair hata mesajinin alindigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac09_tc_13
  Scenario: SSN'nin 9 rakamdan olusmasi
    And Choose Teacher listesinden gecerli bir secim yapilir
    And Name kutusuna gecerli bir deger girilir
    And Surname kutusuna gecerli bir deger girilir
    And Birth Place kutusuna gecerli bir deger girilir
    And Email kutusuna gecerli bir deger girilir
    And Phone kutusuna gecerli bir deger girilir
    And Gender bolumunde gecerli bir secim yapilir
    And Date Of Birth kutusuna gecerli bir deger girilir
    # And "Ssn" kutusunda 4. ve 7. basamakta "-", diğer basamaklarda rakam olmak üzere 10 değer girilir
    And User Name kutusuna gecerli bir deger girilir
    And Father Name kutusuna gecerli bir deger girilir
    And Mother Name kutusuna gecerli bir deger girilir
    And Password kutusuna gecerli bir deger girilir
    When Submit butonuna tiklanir
    Then Ssn kutusunun altinda uyari mesajinin goruntulendigi dogrulanir
    Then Sayfa kapatilir

  @us15_ac09_tc_14
  Scenario: SSN'nin 9 rakamdan olusmasi
    And Choose Teacher listesinden gecerli bir secim yapilir
    And Name kutusuna gecerli bir deger girilir
    And Surname kutusuna gecerli bir deger girilir
    And Birth Place kutusuna gecerli bir deger girilir
    And Email kutusuna gecerli bir deger girilir
    And Phone kutusuna gecerli bir deger girilir
    And Gender bolumunde gecerli bir secim yapilir
    And Date Of Birth kutusuna gecerli bir deger girilir
    # And "Ssn" kutusunda 4. ve 7. basamakta "-", diğer basamaklarda rakam olmak üzere 12 değer girilir
    And User Name kutusuna gecerli bir deger girilir
    And Father Name kutusuna gecerli bir deger girilir
    And Mother Name kutusuna gecerli bir deger girilir
    And Password kutusuna gecerli bir deger girilir
    When Submit butonuna tiklanir
    Then SSN'nin dogru formatta girilmesi gerektigine dair hata mesajinin alindigi dogrulanir