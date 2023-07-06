@us19
Feature: Teacher öğrenciler ile toplantı düzenleyebilmeli

  Background:
    Given Site adresine gidilir
    When Teacher rolu ile login islemi gerceklestirilir
    And teacher menu butonuna tiklar
    And teacher Meet Management butonuna tiklar
    And teacher Meet List bolumunu gorur.

  @us19_tc01
  Scenario: TC_01 Choose Students öğrenci seçilebilmeli
    And teacher choose student alanindan ogrenci secer
    Then teacher choose student alanindan ogrenci secilebildigini dogrular
    Then Sayfa kapatilir

  @us19_tc02
  Scenario: TC_02 Date Of Meet toplantı zamanı seçilebilmeli. Geçmiş tarih girilmemmeli.
    And teacher Date Of Meet alanina gelecek bir tarih girer
    Then teacher Date Of Meet alanina gelecek bir tarih girildigini dogrular.
    Then Sayfa kapatilir

  @us19_tc03
  Scenario: TC_03 Date Of Meet toplantı zamanı seçilebilmeli. Geçmiş tarih girme testi.
    And teacher Date Of Meet alanina gecmis bir tarih girer
    Then teacher Date Of Meet alanina gecmis bir tarih girildigini dogrular.
    Then Sayfa kapatilir

  @us19_tc04
  Scenario: TC_04 Start Time alani testi
    And teacher Start Time alanina valid bir deger girer
    Then teacher Start Time alanina valid bir deger girildigini dogrular.
    Then Sayfa kapatilir

  @us19_tc05
  Scenario: TC_05  Stop Time alani testi
    And teacher Stop Time alanina valid bir deger girer
    Then teacher Stop Time alanina valid bir deger girildigini dogrular.
    Then Sayfa kapatilir

  @us19_tc06
  Scenario: TC_06 Start Time ve Stop Time girilmeli
    And teacher choose student bolumunden ogrenci secer
    And teacher Date Of Meet alanina gecmis tarih girer
    And teacher Start Time alanina gecerli deger girer
    And teacher Stop Time alanina gecerli deger girer
    And teacher Description alanina valid bir deger girer
    And teacher submit butonuna tiklar
    Then teacher hata mesaji gorur ve toplanti olusturamaz
    Then Sayfa kapatilir

  @us19_tc07
  Scenario: TC_07 Description alani testi
    And teacher description alanina gecer bir deger girer
    Then teacher description alanina gecer deger girilebildigini dogrular
    Then Sayfa kapatilir

  @us19_tc08
  Scenario: TC_08 Description girebilme
    And teacher description alanina space karakteri girer
    Then teacher description alanina deger girilebildigini dogrular
    Then Sayfa kapatilir