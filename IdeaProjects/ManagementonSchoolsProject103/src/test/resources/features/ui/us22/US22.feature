@us22
Feature: Admin ekleme

  Background:
    Given Kullanici managementonschools sayfasina gider
    When Kullanici login butonuna tiklar
    And Admin rolu ile login islemi gerceklestirilir
    And Kullanici menu butonuna tiklar
    And Kullanici Admin Management butonuna tiklar

  @us22tc01
  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    And Kullanici Surname kutusuna gecerli bir deger girer
    And Kullanici Name kutucugunu bos birakir
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc02
  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    And Kullanici name kutusuna bosluk tusu girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc03
  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    And Kullanici name kutusuna herhangi bir sayi girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc04
  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    And Kullanici name kutusuna gecerli bir deger girer
    Then Kullanici herhangi bir hata mesaji olmadigini dogrular
    And Sayfa kapatilir

  @us22tc05
  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    And Kullanici name kutusuna herhangi bir noktalama isareti girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc06
  Scenario: "Surname" girilmelidir. Boş bırakılamaz.
    And Kullanici name kutusuna gecerli bir deger girer
    And Kullanici Surname kutucugunu bos birakir
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc07
  Scenario: "Surname" girilmelidir. Boş bırakılamaz.
    And Kullanici Surname kutusuna bosluk tusu girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc08
  Scenario: "Surname" girilmelidir. Boş bırakılamaz.
    And Kullanici Surname kutusuna herhangi bir sayi girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc09
  Scenario: "Surname" girilmelidir. Boş bırakılamaz.
    And Kullanici Surname kutusuna gecerli bir deger girer
    Then Kullanici herhangi bir hata mesaji olmadigini dogrular
    And Sayfa kapatilir

  @us22tc10
  Scenario: "Surname" girilmelidir. Boş bırakılamaz.
    And Kullanici Surname kutusuna herhangi bir noktalama isareti girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc11
  Scenario: "Birth Place" girilmelidir. Boş bırakılamaz.
    And Kullanici Birth Place kutusuna gecerli bir deger girer
    Then Kullanici herhangi bir hata mesaji olmadigini dogrular
    And Sayfa kapatilir

  @us22tc12
  Scenario: "Birth Place" girilmelidir. Boş bırakılamaz.
    And Kullanici name kutusuna gecerli bir deger girer
    And Kullanici Birth Place kutusunu bos birakir
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc13
  Scenario: "Birth Place" girilmelidir. Boş bırakılamaz.
    And Kullanici Birth Place kutusuna bosluk tusu girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc14
  Scenario: "Birth Place" girilmelidir. Boş bırakılamaz.
    And Kullanici Birth Place kutusuna herhangi bir sayi girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc15
  Scenario: "Birth Place" girilmelidir. Boş bırakılamaz.
    And Kullanici Birth Place kutusuna herhangi bir noktalama isareti girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc16
  Scenario: Doğum tarihi girilmelidir. Boş bırakılamaz.
    And Kullanici Date Of Birth kutusuna gecerli bir deger girer
    Then Kullanici herhangi bir hata mesaji olmadigini dogrular
    And Sayfa kapatilir

  @us22tc17
  Scenario: Doğum tarihi girilmelidir. Boş bırakılamaz.
    And Kullanici Date Of Birth kutusunda yil kismina bes haneli bir tarih girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc18
  Scenario: Doğum tarihi girilmelidir. Boş bırakılamaz.
    And Kullanici Date Of Birth kutusunda yil kismina alti haneli bir tarih girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc19
  Scenario: Doğum tarihi girilmelidir. Boş bırakılamaz.
    And Kullanici name kutusuna gecerli bir deger girer
    And Kullanici Date of Birth kutucugunu bos birakir
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc20
  Scenario: Telefon numarası girilmelidir. Boş bırakılamaz.
    And Kullanici Phone kutucuguna gecerli bir deger girer
    Then Kullanici herhangi bir hata mesaji olmadigini dogrular
    And Sayfa kapatilir

  @us22tc21
  Scenario: Telefon numarası girilmelidir. Boş bırakılamaz.
    And Kullanici Phone kutucuguna gecersiz formatta on iki haneli bir deger girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc22
  Scenario: Telefon numarası girilmelidir. Boş bırakılamaz.
    And Kullanici Phone kutucuguna on bir haneli deger girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc23
  Scenario: Telefon numarası girilmelidir. Boş bırakılamaz.
    And Kullanici Phone kutucuguna on uc haneli deger girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc24
  Scenario: Telefon numarası girilmelidir. Boş bırakılamaz.
    And Kullanici name kutusuna gecerli bir deger girer
    And Kullanici Phone kutucugunu bos birakir
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc25
  Scenario: SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.
    And Kullanici name kutusuna gecerli bir deger girer
    And Kullanici SSN'i bos birakir
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc26
  Scenario: SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.
    And Kullanici SSN kutucuguna gecerli bir deger girer
    Then Kullanici herhangi bir hata mesaji olmadigini dogrular
    And Sayfa kapatilir

  @us22tc27
  Scenario: SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.
    And Kullanici Ssn kutucuguna gecersiz formatta on bir haneli bir deger girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc28
  Scenario: SSN girilmelidir. SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.
    And Kullanici Ssn kutucuguna gecerli formatta on haneli bir deger girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc29
  Scenario: User Name girilmelidir. Boş bırakılamaz.
    And Kullanici name kutusuna gecerli bir deger girer
    And Kullanici User Name'i bos birakir
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc30
  Scenario: User Name girilmelidir. Boş bırakılamaz.
    And Kullanici User Name kutucuguna gecerli bir deger girer
    Then Kullanici herhangi bir hata mesaji olmadigini dogrular
    And Sayfa kapatilir

  @us22tc31
  Scenario: Password girilmelidir. Password en az 8 karakterden oluşmalıdır.
    And Kullanici name kutusuna gecerli bir deger girer
    Then Kullanici Password'u bos birakir
    And Sayfa kapatilir

  @us22tc32
  Scenario: Password girilmelidir. Password en az 8 karakterden oluşmalıdır.
    And Kullanici Password kutucuguna sekiz haneli gecerli bir deger girer
    Then Kullanici herhangi bir hata mesaji olmadigini dogrular
    And Sayfa kapatilir

  @us22tc33
  Scenario: Password girilmelidir. Password en az 8 karakterden oluşmalıdır.
    And Kullanici Password kutucuguna gecersiz bir deger girer
    Then Kullanici hata mesajini dogrular
    And Sayfa kapatilir

  @us22tc34
  Scenario: Password girilmelidir. Password en az 8 karakterden oluşmalıdır.
    And Kullanici Password kutucuguna dokuz haneli gecerli bir deger girer
    Then Kullanici herhangi bir hata mesaji olmadigini dogrular
    And Sayfa kapatilir

  @us22tc35
  Scenario: Cinsiyet secilmelidir. Bos birakilamaz.
    And Kullanici Female butonuna tiklar
    Then Kullanici gender kisminda Female butonunun tiklanabilir oldugunu dogrular
    And Sayfa kapatilir

  @us22tc36
  Scenario: Cinsiyet secilmelidir. Bos birakilamaz.
    And Kullanici Male butonuna tiklar
    Then Kullanici gender kisminda Male butonunun tiklanabilir oldugunu dogrular
    And Sayfa kapatilir