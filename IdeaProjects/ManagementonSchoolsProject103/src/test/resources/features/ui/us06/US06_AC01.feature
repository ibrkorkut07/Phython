Feature: Dean_Vice_Dean_hesabi_olusturabilmelidir

  Background:
    Given Site adresine gidilir

  @US06_TC01 @smokeTest
  Scenario: Dean_Olusturma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Then Name alanina veri girer
    Then Surname alanina veri girer
    Then Birth Place alanina veri girer
    Then Dean Gender bolumunde gecerli bir secim yapilir
    Then Birthday alanina veri girer
    Then Phone alanina veri girer
    Then Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    And Sayfa kapatilir

  @US_TC02
  Scenario: Dean_olusturmada_Name_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Then Name alani bos birakilir
    And Sayfa kapatilir

  @US_TC03
  Scenario: Dean_olusturmada_Surname_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Then  Surname alanini bos birakir
    And Sayfa kapatilir

  @US_TC04
  Scenario: Dean_olusturmada_Birth_place_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Then Birth_Place alani  bos birakilir
    And Sayfa kapatilir

  @US_TC05
  Scenario: Dean_olusturmada_Birth_of_Date_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Then  Date Of Birth alani bos birakilir
    And Sayfa kapatilir

  @US_TC06
  Scenario: Dean_olusturmada_Phone_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Then Phone_Number alani bos olarak birakilir
    And Sayfa kapatilir

  @US_TC07
  Scenario: Dean_olusturmada_Ssn_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Given SSN alanini bos birakilir
    And Sayfa kapatilir

  @US_TC08
  Scenario: Dean_olusturmada_Ssn_kisminda_ucuncu_rakamdan_sonra_-_koymama
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Given Ssn alanina ucuncü rakamdan sonra - isareti koymadan Ssn numarasi girer.
    And Sayfa kapatilir

  @US_TC09
  Scenario: Dean_olusturmada_Ssn_kisminda_besinci_rakamdan_sonra_-_koymama
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Given  Ssn alanina besinci rakamdan sonra - isareti koymadan Ssn numarasi girer.
    And Sayfa kapatilir

  @US_TC11
  Scenario: Dean_olusturmada_User_Name_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Given User name alanini bos birakilir
    And Sayfa kapatilir

  @US_TC12
  Scenario: Dean_olusturmada_Password_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Given Password alanini bos birakilir
    And Sayfa kapatilir

  @US_TC13
  Scenario: Dean_olusturmada_Password_kismini_yedi_karakterden_az_karakter_girme
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Given Password alanina yedi karakterden az bir deger girer
    And Sayfa kapatilir

  @US_TC14
  Scenario: Dean_olusturmada_Password_kismina_yedi_karakter_girme
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Given Password alanina yedi karakterli bir deger girer
    And Sayfa kapatilir

  @US_TC15
  Scenario: Dean_olusturmada_Gender_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Baslikta bulunan Menu butonuna tiklanir
    Then Acilan bolumden Dean Management'a tiklar
    Given Name alanina veri girer
    Then Surname alanina veri girer
    Then Birth Place alanina veri girer
    Then Date Of Birth kutusuna bir deger girilir
    And Phone alanina veri girer
    And Ssn alanina veri girer
    And User Name alanina veri girer
    And Password alanina veri girer
    And Submit butonuna tiklar
    And Logout islemi gerceklestirilir
    And Sayfa kapatilir