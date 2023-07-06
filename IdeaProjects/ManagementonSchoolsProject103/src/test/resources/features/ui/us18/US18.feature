@us18
Feature: Teacher, öğrenciye verdiği notları, görebilmeli ve güncelleyebilmelidir.

  Background:
    Given Site adresine gidilir
    When Teacher rolu ile login islemi gerceklestirilir
    And teacher menu butonuna tiklar.
    And teacher Student Info Management butonuna tiklar.
    And teacher Student Info List Bolumunu gorur

  @us18_tc01
  Scenario: TC_01 Student Info List'te; Name bilgilerini gorebilmeli
    And teacher Name Surname Bolumunu gorur
    Then Sayfa kapatilir

  @us18_tc02
  Scenario: TC_02 Student Info List'te; Lesson bilgilerini gorebilmeli
    And teacher Lesson Name Bolumunu gorur
    Then Sayfa kapatilir

  @us18_tc03
  Scenario: TC_03 Student Info List'te; Ansentee bilgilerini gorebilmeli
    And teacher Anssente Bolumunu gorur
    Then Sayfa kapatilir

  @us18_tc04
  Scenario: TC_04 Student Info List'te; Midterm bilgilerini gorebilmeli
    And teacher Midterm Bolumunu gorur
    Then Sayfa kapatilir

  @us18_tc05
  Scenario: TC_05 Student Info List'te; Final Exam bilgilerini gorebilmeli
    And teacher Final Exam Bolumunu gorur
    Then Sayfa kapatilir

  @us18_tc06
  Scenario: TC_06 Student Info List'te; Info Note bilgilerini gorebilmeli
    And teacher Info Note Bolumunu gorur.
    Then Sayfa kapatilir

  @us18_tc07 @smokeTest
  Scenario: TC_07 Student Info List'te; Average bilgilerini gorebilmeli
    And teacher Average bilgilerinin yer aldigi Bolumu gorur
    Then Sayfa kapatilir

  @us18_tc08
  Scenario: TC_08 Öğrenci Not bilgisini güncelleyebilmeli
    And teacher Add Student Info Bolumu goruntuler.
    And teacher Choose Lesson bolumunden ders  secer.
    And teacher Choose Student bolumunden ogrenci secer.
    And teacher Choose Education Term bolumunden egitim donemi secer.
    And teacher Devamsizlik bilgisi girer.
    And teacher Midterm not girer.
    And teacher Final notunu girer.
    And teacher info notunu girer.
    And teacher Submit butonuna tiklar.
    And teacher Edit Butonuna tiklar.
    And teacher Choose Lesson secer.
    And teacher Choose Education Term secer.
    And teacher ogrenci not bilgisine yeni bir deger girer.
    And teacher Submit butonuna tiklar.
    Then Teacher updated Successful" popUp mesajini goruntuler.
    Then Sayfa kapatilir

  @us18_tc09 @smokeTest
  Scenario: TC_09 Öğrenci Not bilgisini silebilmeli
    And teacher Delete Butonuna tiklar.
    Then teacher ogrenci bilgilerinin silindigini dogrular.
    Then Sayfa kapatilir