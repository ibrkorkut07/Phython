@us07
Feature: Dean, kullanıcıların gönderdiği mesajları görebilmeli

  Background:
    Given Site adresine gidilir
    When Dean rolu ile login islemi gerceklestirilir

  @us07_tc01
  Scenario: Dean'in kullanicilarin gonderdigi mesaj yazarlarini gorebilmeli
    And Dean Menu butonuna tiklar
    And Dean Contact Get All yazisina tiklar
    Then Dean sayfada mesaj yazarlarinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us07_tc02
  Scenario: Dean'in kullanicilarin gonderdigi mesaj yazarlarina ait emailleri gorebilmeli
    And Dean Menu butonuna tiklar
    And Dean Contact Get All yazisina tiklar
    Then Dean sayfada mesaj yazarlarina ait emaillerin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us07_tc03
  Scenario: Dean'in kullanicilarin gonderdigi mesajlarin gonderilme tarihini gorebilmeli
    And Dean Menu butonuna tiklar
    And Dean Contact Get All yazisina tiklar
    Then Dean sayfada mesajlarin gonderilme tarihinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us07_tc04
  Scenario: Dean'in kullanicilarin gonderdigi mesajlarin subject bilgisini gorebilmeli
    And Dean Menu butonuna tiklar
    And Dean Contact Get All yazisina tiklar
    Then Dean sayfada mesajlarin subject bilgisinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us07_tc05 @smokeTest
  Scenario: Dean'in kullanicilarin gonderdigi mesajlari gorebilmeli
    And Dean Menu butonuna tiklar
    And Dean Contact Get All yazisina tiklar
    Then Dean sayfada mesajlarin goruntulendigini dogrular
    Then Sayfa kapatilir