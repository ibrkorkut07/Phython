Feature:US01 Register

  Background:
    Given kullanici ana sayfaya gider
    And kullanici register butonuna tiklar
  @123
  Scenario Outline: TC01 Basarili Kayit Islemi

    And kullanici  "<Surname>" "<Birth Place>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici register yazisina tiklar
    And kullanici herhangi bir karakter iceren name girer
    And kullanici GuestUser requested yazisini gorur
    Then kullanici register isleminin basarili oldugunu dogrular
    And  kullanici sayfayi kapatir
    Examples:
      | Surname | Birth Place | Phone | Gender | Date Of Birth | Ssn | User Name | Password |
    #And kullanici sayfayi kapatir
  @123
  Scenario Outline: TC01 NegatifSenaryo (Bosluk birakilan name ile giris yapilmamalidir)
    And kullanici bosluk iceren bir name girer
    And kullanici  "<Surname>" "<Birth Place>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Surname | Birth Place | Phone | Gender | Date Of Birth | Ssn | User Name | Password |

  @123
  Scenario Outline: TC02 Basarili Kayit Islemi

    And kullanici  "<Name>" "<Birth Place>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici herhangi bir karakter iceren surname girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | Birth Place | Phone | Gender | Date Of Birth | Ssn | User Name | Password |

  @123
  Scenario Outline: TC02 Negatif Senaryo (Bosluk birakilan surname ile giris yapilamamalidir)

    And kullanici  "<Name>" "<Birth Place>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici bosluk iceren surname girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | Birth Place | Phone | Gender | Date Of Birth | Ssn | User Name | Password |

  @123
  Scenario Outline: TC03 Basarili kayit islemi(Herhangi bir karakter iceren birthplace girilebilir)

    And kullanici  "<Name>" "<surname>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici karakter birthplace girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | surname | Phone | Gender | Date Of Birth | Ssn | User Name | Password |

  @123
  Scenario Outline: TC03 Negatıf Senaryo(Bosluk  iceren birthplace girilebilir)

    And kullanici  "<name>" "<surname>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici bosluk iceren birthplace girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | surname | Phone | Gender | Date Of Birth | Ssn | User Name | Password |

  Scenario Outline: TC04 Telefon numarasi girebilmelidir

    And kullanici  "<Name>" "<Surname>" "<Birthplace>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici PhoneNumber girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | Surname | Birthplace | Gender | Date Of Birth | Ssn | User Name | Password |

  Scenario Outline: TC05 Kullanici cinsiyetini  girebilmelidir

    And kullanici  "<Name>" "<Surname>" "<Birthplace>" "<Phone>" "<Date Of Birth>" "<Ssn>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici gender  girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | Surname | Birthplace | Phone | Date Of Birth | Ssn | User Name | Password |

  Scenario Outline: TC06 Kullanici dogum tarihini   girebilmelidir

    And kullanici  "<Name>" "<Surname>" "<Birthplace>" "<Phone>" "<Gender>" "<Ssn>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici Date of birth  girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | Surname | Birthplace | Phone | Gender | Ssn | User Name | Password |

  Scenario Outline: TC07 SSN number girebilmelidir   girebilmelidir

    And kullanici  "<Name>" "<Surname>" "<Birthplace>" "<Phone>" "<Gender>" "<Date of birth>" "<User Name>" "<Password>" bilgilerini girer
    And kullanici 9 rakamdan olusan , 3 ve 5.rakamdan sonra "-" iceren ssn  girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | Surname | Birthplace | Phone | Gender | Date of birth | User Name | Password |

  Scenario Outline: TC08 Kullanici username girebilmelidir girebilmelidir   girebilmelidir

    And kullanici  "<Name>" "<Surname>" "<Birthplace>" "<Phone>" "<Gender>" "<Date of birth>" "<Ssn>" "<Password>" bilgilerini girer
    And kullanici user name girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | Surname | Birthplace | Phone | Gender | Date of birth | Ssn | Password |

  Scenario Outline: TC09 Kullanici password girebilmelidir

    And kullanici  "<Name>" "<Surname>" "<Birthplace>" "<Phone>" "<Gender>" "<Date of birth>" "<Ssn>" "<User Name>" bilgilerini girer
    And kullanici 8 karakterden olusan password girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | Surname | Birthplace | Phone | Gender | Date of birth | Ssn | User Name |

  Scenario Outline: TC010 Kullanici buyuk harf,kucuk harf ve rakam iceren  password girebilmelidir

    And kullanici  "<Name>" "<Surname>" "<Birthplace>" "<Phone>" "<Gender>" "<Date of birth>" "<Ssn>" "<User Name>" bilgilerini girer
    And kullanici buyuk harf,kucuk harf ve rakam iceren  password girer
    And kullanici register yazisina tiklar
    And kullanici GuestUser requested yazisini gorur
    And kullanici sayfayi kapatir
    Examples:
      | Name | Surname | Birthplace | Phone | Gender | Date of birth | Ssn | User Name |





