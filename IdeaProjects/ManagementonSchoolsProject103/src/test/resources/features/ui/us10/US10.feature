@US10_Steps
Feature: uS_10 test Case Vice Dean ders programi olusturabilmelidir.

  @smokeTest
  Scenario: US10_TC01 Vice Dean ders programi olusturmasi.
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Kullanici Lesson Program tiklar.
    When Kullanici ders secimi yapar.
    And Kullanici egitim donemi secimi yapar.
    And Kullanici ders gunu secer.
    And Kullanici dersin baslangic saatini girer.
    And Kullanci dersin bitis saatini baslangic saatinden buyuk girer.
    Then Kullanici Submit butonuna tiklar.
    And "Created Lesson Program" mesaji cikartigini dogrular.
    And Sayfa kapatilir

  Scenario: US10_TC02 Vice Dean ders programı olusturmasi esnasinda ders secimini boş birakilmasi
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Kullanici Lesson Program tiklar.
    When Kullanici ders secimi bos birakir.
    And Kullanici egitim donemi secimi yapar.
    And Kullanici ders gunu secer.
    And Kullanici dersin baslangic saatini girer.
    And Kullanci dersin bitis saatini baslangic saatinden buyuk girer.
    Then Kullanici Submit butonuna tiklar.
    And Hata mesaji cikar.
    And Sayfa kapatilir

  Scenario: US10_TC03 Vice Dean ders programi olusturmasi esnasinda egitim donemini bos birakmasi
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Kullanici Lesson Program tiklar.
    When Kullanici ders secimi yapar.
    And Kullanici egitim donemi secimi yapmaz.
    And Kullanici ders gunu secer.
    And Kullanici dersin baslangic saatini girer.
    And Kullanci dersin bitis saatini baslangic saatinden buyuk girer.
    Then Kullanici Submit butonuna tiklar.
    And Please select education term mesaji cikartigini dogrular.
    And Sayfa kapatilir

  Scenario: US10_TC04 Vice Dean ders programi olusturmasi esnasinda ders günü secilmemesi
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Kullanici Lesson Program tiklar.
    When Kullanici ders secimi yapar.
    And Kullanici egitim donemi secimi yapar.
    And Kullanici ders gunu secimini yapmaz.
    And Kullanici dersin baslangic saatini girer.
    And Kullanci dersin bitis saatini baslangic saatinden buyuk girer.
    Then Kullanici Submit butonuna tiklar.
    And Hata mesaji cikar.
    And Sayfa kapatilir

  Scenario: US10_TC05 Vice Dean ders program olusturmasi esnasinda ders bitis saatinin baslangıc saatinden kucuk olmasi
    Given Site adresine gidilir
    When Vice Dean rolu ile login islemi gerceklestirilir
    When Kullanici Lesson Program tiklar.
    When Kullanici ders secimi yapar.
    And Kullanici egitim donemi secimi yapar.
    And Kullanici ders gunu secer.
    And Kullanici dersin baslangic saatini girer.
    And Kullanci dersin bitis saatini baslangic saatinden esit ve kucuk olacak sekilde girer.
    Then Kullanici Submit butonuna tiklar.
    And Error: start time must not be greater than or equal to stop time mesaji cikartigini dogrular.
    And Sayfa kapatilir