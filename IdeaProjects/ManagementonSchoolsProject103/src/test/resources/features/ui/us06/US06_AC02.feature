Feature: Dean_Vice_Dean_hesabi_olusturabilmelidir

  Background:
    Given Site adresine gidilir
    When Dean rolu ile login islemi gerceklestirilir

  @US06_TC01 @smokeTest
  Scenario: Vice_Dean_Olusturma
    Then Kullancı Name alanına isim girer.
    Then Kullanıcı Surname alanına soyisim girer.
    Then Kullanıcı Birth Place alanına doğum yeri girer.
    Then Kullanıcı Gender alanından cinsiyet seçer.
    Then Kulancı Date Of Birth alanına doğum tarihi girer.
    Then Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    Then Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And Kullancı User Name alanına user name girer.
    And Kullancı Password alanına uygun formatta şifre girer.
    And Kullanıcı Submit butonuna tıklar.
    Then  Vice Dean saved mesajı çıkar ve vice dean oluşturulur.
    And  Sayfa kapatilir

  @US_TC02
  Scenario: Vice_Dean_olusturmada_Name_kismini_bos_birakma
    Then   Kullanıcı Name alanını boş bırakır.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Submit butonuna tıklar.
    Then Name kısmının altında Required yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC03
  Scenario: Vice_Dean_olusturmada_Surname_kismini_bos_birakma
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Surname alanını boş bırakır.
    And   Kullanıcı Submit butonuna tıklar.
    Then Surname kısmının altında Required yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC04
  Scenario: Vice_Dean_olusturmada_Birth_place_kismini_bos_birakma
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Birth Place alanını boş bırakır.
    And   Kullanıcı Submit butonuna tıklar.
    Then Birth Place kısmının altında Required yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC05
  Scenario: Vice_Dean_olusturmada_Birth_of_Date_kismini_bos_birakma
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Birth of Date alanını boş bırakır.
    And   Kullanıcı Submit butonuna tıklar.
    Then Birth of Date kısmının altında Required yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC06
  Scenario: Vice_Dean_olusturmada_Phone_kismini_bos_birakma
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Phone alanını boş bırakır.
    And   Kullanıcı Submit butonuna tıklar.
    Then Phone kısmının altında Required yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC07
  Scenario: Vice_Dean_olusturmada_Ssn_kismini_bos_birakma
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Ssn alanını boş bırakır.
    And   Kullanıcı Submit butonuna tıklar.
    Then Ssn kısmının altında Required yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC08
  Scenario: Vice_Dean_olusturmada_Ssn_kisminda_ucuncu_rakamdan_sonra_-_koymama
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Ssn alanına üçüncü rakamdan sonra - işareti koymadan Ssn numarası girer.
    Then Ssn kısmının altında Minimum 11 character (XXX-XX-XXXX) yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC09
  Scenario: Vice_Dean_olusturmada_Ssn_kisminda_besinci_rakamdan_sonra_-_koymama
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Ssn alanına beşinci rakamdan sonra - işareti koymadan Ssn numarası girer.
    Then Ssn kısmının altında Minimum 11 character (XXX-XX-XXXX) yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC10
  Scenario: Vice_Dean_olusturmada_Ssn_kisminda_ucuncu_ve_besinci_rakamdan_sonra_-_koymama
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Ssn alanına üçüncü ve beşinci rakamdan sonra - işareti koymadan Ssn numarası girer.
    Then Ssn kısmının altında Minimum 11 character (XXX-XX-XXXX) yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC11
  Scenario: Vice_Dean_olusturmada_User_Name_kismini_bos_birakma
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı User Name alanını boş bırakır.
    And   Kullanıcı Submit butonuna tıklar.
    Then User Name kısmının altında Required yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC12
  Scenario: Vice_Dean_olusturmada_Password_kismini_bos_birakma
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullanıcı Password alanını boş bırakır.
    And   Kullanıcı Submit butonuna tıklar.
    Then Password kısmının altında Required yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC13
  Scenario: Vice_Dean_olusturmada_Password_kismini_yedi_karakterden_az_karakter_girme
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullanıcı Password kısmına yedi karakterden az karakter girer.
    And   Kullanıcı Submit butonuna tıklar.
    Then Password kısmının altında Minimum 8 character yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC14
  Scenario: Vice_Dean_olusturmada_Password_kismina_yedi_karakter_girme
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullanıcı Password kısmına yedi karakter girer.
    And   Kullanıcı Submit butonuna tıklar.
    Then Password kısmının altında Minimum 8 character yazısı çıkar.
    And  Sayfa kapatilir

  @US_TC15
  Scenario: Vice_Dean_olusturmada_Gender_kismini_bos_birakma
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyeti boş bırakır.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Submit butonuna tıklar.
    Then  Vice Dean hesabı oluşturulmaz.
    And  Sayfa kapatilir