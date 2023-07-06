@us04
Feature: Admin Dean ekleyebilmeli

  Background:
    Given Site adresine gidilir
    When Admin rolu ile login islemi gerceklestirilir
    And Menu butonuna tiklar
    And Acilan bolumden Dean Management'a tiklar

  @us04_tc01
  Scenario: Name girilmelidir.Boş bırakılamaz.
    And Name alanina tiklar
    And Surname alanina tiklar
    Then Name altinda Required uyarisinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc02
  Scenario: Name alanina sadece space karakteri girildiginde Submit butonu aktif olmamali
    And Name alanina space karakteri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    And 1 sn bekler
    Then Hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc03
  Scenario: Surname girilmelidir.Boş bırakılamaz.
    And Surname alanina tiklar
    And Name alanina tiklar
    Then Surname altinda Required uyarisinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc04
  Scenario: Surname alanina sadece space karakteri girildiginde Submit butonu aktif olmamali
    And Name alanina veri girer
    And Surname alanina space karakteri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    When 1 sn bekler
    Then Hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc05
  Scenario: Birth Place girilmelidir.Boş bırakılamaz.
    And Birth Place alanina tiklar
    When Name alanina tiklar
    Then Birth Place altinda Required uyarisinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc06
  Scenario: Birth Place alanina sadece space karakteri girildiginde Submit butonu aktif olmamali
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina space karakteri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    Then Hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc07
  Scenario: Cinsiyet seçilmelidir.Boş bırakılamaz.
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    Then Hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc08
  Scenario: Doğum tarihi girilmelidir.Boş bırakılamaz.
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    Then Dogum tarihi icin hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc09
  Scenario: Telefon numarası girilmelidir.Boş bırakılamaz.
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    Then Telefon icin hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc10
  Scenario: SSN girilmelidir. Boş bırakılamaz.
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    Then Ssn altinda Required mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc11
  Scenario: SSN 3. rakamdan sonra - içermeli
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alaninda 4. karakteri hatali girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    Then Ssn icin Hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc12
  Scenario: SSN 5. rakamdan sonra - içermeli
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alaninda 6. karakteri hatali  girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    Then Ssn icin Hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc13
  Scenario: SSN 9 rakamdan az olamaz.
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alanina eksik veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    When 2 sn bekler
    Then Ssn altinda uyari mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc14
  Scenario: SSN 9 rakamdan oluşmalıdır
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    Then Onay mesajinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc15
  Scenario: User Name girilmelidir. Boş bırakılamaz.
    And User Name alanina tiklar
    When Name alanina tiklar
    Then User Name altinda Required uyarisinin goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc16
  Scenario: User Name alanina sadece space karakteri girildiginde Submit butonu aktif olmamali
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina space karakteri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    Then User Name icin Hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc17
  Scenario: Password girilmelidir.Password en az 8 karakterden oluşmalıdır.
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina 7 karakter girer
    And Submit butonuna tiklar
    When 2 sn bekler
    Then Password icin hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir

  @us04_tc18
  Scenario: Password girilmelidir.Password en az 8 karakterden oluşmalıdır.
    And Name alanina veri girer
    And Surname alanina veri girer
    And Birth Place alanina veri girer
    And Cinsiyet secer
    And Birthday alanina veri girer
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Submit butonuna tiklar
    When 2 sn bekler
    Then Password altinda hata mesaji goruntulendigini dogrular
    Then Sayfa kapatilir