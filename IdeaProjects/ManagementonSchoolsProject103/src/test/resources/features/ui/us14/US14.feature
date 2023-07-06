@US14
Feature:Vice Dean öğretmenleri görebilmeli ve güncelleme yapabilmelidir

  Background:
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Menu butonuna tiklar
    When Teacher Management'a tiklar

  @US14_TC01
  Scenario: TC01_Olusturulan ogretmenin Name Surname bilgilerinin gorunmesi
    Then Teacher List sayfasinda olusturulan ogretmene ait Name Surname bilgisinin gorundugunu dogrular

  @US14_TC02
  Scenario: TC02_Olusturulan ogretmenin Name Surname bilgilerinin gorunmesi
    Then Teacher List sayfasinda olusturulan ogretmene ait Phone Number bilgisinin gorundugunu dogrular

  @US14_TC03
  Scenario: TC03_Olusturulan ogretmenin Ssn bilgilerinin gorunmesi
    Then Teacher List sayfasinda olusturulan ogretmene ait Ssn bilgisinin gorundugunu dogrular

  @US14_TC04
  Scenario: TC04_Olusturulan ogretmenin User Name bilgilerinin gorunmesi
    Then Teacher List sayfasinda olusturulan ogretmene ait User Name bilgisinin gorundugunu dogrular

  @US14_TC05
  Scenario: TC05_Choose Lessons bilgisinin guncellenmesi
    When Guncellemek istedigi ogretmenin bulundugu satirdaki Edit butonuna tiklar
    And Ogretmene ait secili ders bilgisini gorur
    And Secili ders bilgisini baska bir data ile degistirir
    And Gender female secilir
    And Password "password" olarak girer
    And Submit tiklanir
    Then Teacher updated Successful popUp mesajini goruntuler

  @US14_TC06
  Scenario: TC06_Name bilgisinin guncellenmesi
    When Guncellemek istedigi ogretmenin bulundugu satirdaki Edit butonuna tiklar
    And Ogretmenin girecegi ders edit sayfasinda secilir
   # And Ogretmene ait secili Name bilgisini gorur
    And Secili Name bilgisini baska bir data ile degistirir
    And Gender female secilir
    And Password "password" olarak girer
    And Submit tiklanir
    Then Teacher updated Successful popUp mesajini goruntuler

  @US14_TC07
  Scenario: TC07_Surname bilgisinin guncellenmesi
    When Guncellemek istedigi ogretmenin bulundugu satirdaki Edit butonuna tiklar
    And Ogretmenin girecegi ders edit sayfasinda secilir
    And Secili ders bilgisini baska bir data ile degistirir
    And Ogretmene ait secili Name bilgisini gorur
    And Secili Name bilgisini baska bir data ile degistirir
    And Gender female secilir
    And Password "password" olarak girer
    And Submit tiklanir
    Then Teacher updated Successful popUp mesajini goruntuler