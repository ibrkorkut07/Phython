@us02
Feature: Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli

  Background:
    Given Kullanici managementonschools sayfasina gider
    When Kullanici login butonuna tiklar
    And Admin rolu ile login islemi gerceklestirilir
    And Kullanici menu butonuna tiklar
    And Kullanici Guest User butonuna tiklar

  @us02tc01
  Scenario: Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli
    Then Kullanici Name Surname sutunundaki verilerin gorunurlugunu dogrular
    And Sayfa kapatilir

  @us02tc02
  Scenario: Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli
    Then Kullanici Phone Number sutunundaki verilerin gorunurlugunu dogrular
    And Sayfa kapatilir

  @us02tc03
  Scenario: Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli
    Then Kullanici Ssn sutunundaki verilerin gorunurlugunu dogrular
    And Sayfa kapatilir

  @us02tc04
  Scenario: Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli
    Then Kullanici User Name sutunundaki verilerin gorunurlugunu dogrular
    And Sayfa kapatilir

  @us02tc05 @smokeTest
  Scenario: Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli
    When Kullanici Guest User List'indeki herhangi bir veri grubunun yanindaki cop kutusu simgesine tiklar
    Then Kullanici veri grubunun silindigini dogrular
    And Sayfa kapatilir