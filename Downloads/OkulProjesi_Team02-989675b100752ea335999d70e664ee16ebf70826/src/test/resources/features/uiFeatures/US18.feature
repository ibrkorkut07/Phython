Feature: @US18
  Background:
    Given Anasayfa daki "https:// managmentonschools.com/" sayfasina git.
    Then Sayfanın sağ üstteki login butonuna tıkla
    And Username gir
    And password gir
    And Alttaki login butonuna tıkla

  Scenario: TC01 Pozitif Senaryo

    And Açılan pencerede ders bölümünü seç
    And Açılan pencerede öğrenci bölümüne ogrenciyi seç
    And Açılan pencerede dönem bölümünü seç
    And Açılan pencerede devamsızlık bölümüne sayı gir
    And Açılan pencerede arasınav bölümüne "sifirileyuz" arasında bir sayı gir
    And Acilan pencerede final sınavı bolumune "sifirileyuz" arasında bir sayı gir
    And Açılan pencerede bilgi notu bölümüne "enzonkarakter" gir
    And submit butonuna tıkla
    And student info list bölümüne öğrencinin eklendiğini doğrula
    And Acilan pencerede student info list bolumundeki Name Stununda "name" isiminin varligini dogrula
    And Acilan pencerede student info list bolumundeki Lesson Name Stununda "ders" isimlerinin varligini dogrula
    And Acilan pencerede student info list bolumundeki Absentee Sutununda devamsizlik sayisinin varligini dogrula
    And Acilan pencerede student info list bolumundeki Final Exam Sutununda final "not"unun varligini dogrula
    And Acilan pencerede student info list bolumundeki Midterm Exam Sutununda arasinav "not"unun varligini dogrula
    And Acilan pencerede student info list bolumundeki Note Sutununda donem sonu notunun varligini dogrula
    And Acilan pencerede student info list bolumundeki Info Note Sutununda bilgi notunun varligini dogrula
    And Acilan pencerede student info list bolumundeki Average donem sonu ortalama notunun varligini dogrula
    And Sayfayi kapatt
