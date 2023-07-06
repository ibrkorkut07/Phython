@us08
Feature:Vice_Dean_ders_olusturabilmelidir

  Background:
    Given  Site adresine gidilir

  @US08_TC01 @smokeTest
  Scenario: Vice_dean_ders_olusturma
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons menüsünü secer.
    Then Lesson Management sayfasini acildigini dogrular.
    Given Lesson Name alanina "Hamza"  girer.
    Then Compulsory Checkbox ini isaretler.
    Then Credit Score alanina "2020" girer.
    And Submit butonuna tiklar.
    And Sayfa kapatilir

  @US08_TC02
  Scenario: Vice_dean_ders_olusturmada_Lesson_Name_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons menüsünü secer.
    Then Lesson Management sayfasini acildigini dogrular.
    Given Lesson Name alanina ""  girer.
    And Sayfa kapatilir

  @US08_TC03
  Scenario: Vice_dean_ders_olusturmada_Compulsory_checkbox_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons menüsünü secer.
    Then Lesson Management sayfasini acildigini dogrular.
    Then Credit Score alanina "54" girer.
    And Submit butonuna tiklar.
    And Sayfa kapatilir

  @US08_TC04
  Scenario: Vice_dean_ders_olusturmada_Credit_Score_kismini_bos_birakma
    When Admin rolu ile login islemi gerceklestirilir
    Then Menu butonuna tiklar
    Then Kullanici acilan menuden Lesson Management e tiklar.
    And Acilan sayfada Lessons menüsünü secer.
    Then Lesson Management sayfasini acildigini dogrular.
    Then Credit Score alanina "" girer.
    And Sayfa kapatilir