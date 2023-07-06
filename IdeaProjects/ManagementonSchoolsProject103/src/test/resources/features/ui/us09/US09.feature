Feature: Vice_Dean_ders_listesini_gorebilmeli_ve_guncellemeler_yapabilmelidir

  Background:
    Given  Site adresine gidilir

  @US09_TC01
  Scenario: Lesson_Name_bilgilerini_gorüntuleyebilme
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons menüsünü secer.
    Then Lesson Management sayfasini acildigini dogrular.
    Then Lesson List bolumunde "Lesson Name" bilgisini gorur.
    And Sayfa kapatilir

  @US09_TC02 @smokeTest
  Scenario: Compulsory_bilgilerini_gorüntuleyebilme
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons menüsünü secer.
    Then Lesson Management sayfasini acildigini dogrular.
    Then Lesson List bolumunde Compulsory bilgisini gorur.
    And Sayfa kapatilir

  @US09_TC03
  Scenario: Credit_Score_bilgilerini goruntuleyebilme
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons menüsünü secer.
    Then Lesson Management sayfasini acildigini dogrular.
    Then Lesson List bolumunde Credit Score bilgisini gorur.
    And Sayfa kapatilir

  @US09_TC04
  Scenario: Lesson_Name_Compulsory_ve_Credit_Score_bilgilerini_silebilme
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons menüsünü secer.
    Then Lesson Management sayfasini acildigini dogrular.
    Then Lesson Name alanina ders adi girer.
    Then  Compulsory Checkbox ini isaretler.
    Then Credit Score alanina "54" girer.
    Then Submit butonuna tiklar
    And create edilen lesson i silme butonuna tiklar
    And Sayfa kapatilir

  @US09_TC05
  Scenario: Edit_butonunun_goruntulenmemesi
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons menüsünü secer.
    Then Lesson Management sayfasini acildigini dogrular.
    Then Lesson Name alanina ders adi girer.
    Then  Compulsory Checkbox ini isaretler.
    Then Credit Score alanina "54" girer.
    Then Submit butonuna tiklar
    And create edilen lesson i edit butonuna tiklar
    And Sayfa kapatilir