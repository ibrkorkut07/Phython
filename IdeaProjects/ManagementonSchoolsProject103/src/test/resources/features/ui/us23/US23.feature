@US23_TC
Feature: Admin Vice Dean oluşturabilmeli.

  Background:
    Given Site adresine gidilir
    When Admin rolu ile login islemi gerceklestirilir
    Then Kullanacı Menu butonuna tıklar.
    And  Kullancı açılan menüden Vice Dean Management e tıklar.

  @smokeTest
  Scenario: US23_TC01 Admin Vice dean oluşturma.
    When  Kullancı Name alanına isim girer.
    And   Kullanıcı Surname alanına soyisim girer.
    And   Kullanıcı Birth Place alanına doğum yeri girer.
    And   Kullanıcı Gender alanından cinsiyet seçer.
    And   Kulancı Date Of Birth alanına doğum tarihi girer.
    And   Kullanıcı Phone alanına uygun formatta telefon numarası girer.
    And   Kullanıcı Ssn alanına uygun formatta Ssn numarası girer.
    And   Kullancı User Name alanına user name girer.
    And   Kullancı Password alanına uygun formatta şifre girer.
    And   Kullanıcı Submit butonuna tıklar.
    Then  Vice Dean saved mesajı çıkar ve vice dean oluşturulur.
    And  Sayfa kapatilir

  Scenario: US23_TC02 Admin Vice Dean oluşturmada Name kısmını boş bırakma.
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

  Scenario: US23_TC03 Admin Vice Dean oluşturmada Surname kısmını boş bırakma.
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

  Scenario: US23_TC04 Admin Vice Dean oluşturmada Birth place kısmını boş bırakma.
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

  Scenario:US23_TC05 Admin Vice Dean oluşturmada Birth of Date kısmını boş bırakma.
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

  Scenario: US23_TC06 Admin Vice Dean oluşturmada Phone kısmını boş bırakma.
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

  Scenario: US23_TC07 Admin Vice Dean oluşturmada Ssn kısmını boş bırakma.
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

  Scenario: US23_TC08 Admin Vice Dean oluşturmada Ssn kısmında üçüncü rakamdan sonra - koymama.
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

  Scenario: US23_TC09 Admin Vice Dean oluşturmada Ssn kısmında beşinci rakamdan sonra - koymama.
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

  Scenario: US23_TC10 Admin Vice Dean oluşturmada Ssn kısmında üçüncü ve beşinci rakamdan sonra - koymama.
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

  Scenario: US23_TC11 Admin Vice Dean oluşturmada User Name kısmını boş bırakma.
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

  Scenario: US23_TC12 Admin Vice Dean oluşturmada Password kısmını boş bırakma.
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

  Scenario: US23_TC13 Admin Vice Dean oluşturmada Password kısmını yedi karakterden az karakter girme.
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

  Scenario: US23_TC14 Admin Vice Dean oluşturmada Password kısmını yedi karakter girme.
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

  Scenario: US23_TC15 Admin Vice Dean oluşturmada Gender kısmını boş bırakma.
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