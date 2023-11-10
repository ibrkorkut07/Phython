Feature: US12 Choose Lessons bolumune olusturulan dersin geldigi gorulmelidir(Lesson Program - Lesson Program Assignment)

  @Burak1
  Scenario:TC01 Choose Lessons bolumune olusturulan dersin geldigi gorulmelidir

    Given Vice Dean Siteye giderBS
    And  Login linkine tıklarBS
    And  User name kutusuna kayitli kayitli ismini girerBS
    And Passwordu girerBS
    And Giris butonuna tiklarBS
    And Dersler butonuna tiklarBS
    Then Dersin olusturuldugunu dogrularBS

  Scenario:TC02 Ders icin ogretmen secilebilmelidir
    Given Vice Dean Siteye giderBS
    And Login linkine tıklarBS
    And User name kutusuna kayitli kayitli ismini girerBS
    And Passwordu girerBS
    And Giris butonuna tiklarBS
    And Dersler butonuna tiklarBS
    And Ders programina tiklarBS
    And Dersi secerBS
    And Ogretmen sec butonuna tiklarBS
    And Ogretmeni secerBS
    And Ogretmen secebildigini dogrularBS
    And Gonder butonuna tiklarBS