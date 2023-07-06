@us17
Feature: Teacher, öğrencilere not verebilmelidir.

  Background:
    Given Site adresine gidilir
    When Teacher rolu ile login islemi gerceklestirilir
    And teacher menu butonuna tiklar.
    And teacher Student Info Management butonuna tiklar.
    And teacher Add Student Info Bolumunu goruntuler.

  @us17_tc01
  Scenario: TC_01 Ders_seçme_testi
    And teacher Choose Lesson sekmesinden ders secer.
    Then teacher ders secebildigini dogrular.
    Then Sayfa kapatilir

  @us17_tc02
  Scenario: TC_02 Ogrenci_secme_Testi
    And teacher Choose Student sekmesinden ogrenci secer.
    Then teacher ogrenci secebildigini dogrular.
    Then Sayfa kapatilir

  @us17_tc03
  Scenario: TC_03 Donem_Secme_Testi
    And teacher Choose Education Term sekmesinden egitim donemi secer.
    Then teacher donem secebildigini dogrular.
    Then Sayfa kapatilir

  @us17_tc04
  Scenario: TC_04 Devamsızlık_girebilme_testi
    And teacher Devamsizlik  girer.
    Then teacher devamsizlik  girebildigini dogrular.
    Then Sayfa kapatilir

  @us17_tc05
  Scenario: TC_05 Midterm_notu_girebilme_testi
    And teacher Midterm notu girer.
    Then teacher Midterm notu girebildigini dogrular.
    Then Sayfa kapatilir

  @us17_tc06
  Scenario: TC_06 Final_notu_girebilme_testi
    And teacher Final notu girer.
    Then teacher Final notu girebildigini dogrular.
    Then Sayfa kapatilir

  @us17_tc07
  Scenario: TC_07 Öğrenci_hakkında_Info_notu_girebilme_testi
    And teacher info notuna metin girer.
    Then teacher info notu girebildigini dogrular.
    Then Sayfa kapatilir

  @us17_tc08
  Scenario: TC_08 Öğrenci_hakkında_Info_notunu_bos_birakma_testi
    And kullanici info notuna space girer.
    Then kullanici info notu girebildigini dogrular.
    Then Sayfa kapatilir

  @us17_tc09 @smokeTest
  Scenario: TC_09 Gerekli_alanlarin_doldurulma_Testi
    And teacher Choose Lesson sekmesinden ders secmez
    And teacher Choose Student sekmesinden ogrenci secer.
    And teacher Choose Education Term sekmesinden egitim donemi secer.
    And teacher Devamsizlik bilgilerini girer.
    And teacher Midterm notunu girer.
    And teacher Final Exam notunu girer.
 #   And teacher info note alanini bos birakir.
    Then teacher requared yazisinin ciktigini dogrular.
    Then Sayfa kapatilir