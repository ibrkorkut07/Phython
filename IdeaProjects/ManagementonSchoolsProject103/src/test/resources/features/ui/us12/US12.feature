Feature: "Vice Dean öğretmene ders atayabilmelidir.(Lesson Program - Lesson Program Assignment)"

  @US12_AC01 @smokeTest
  Scenario: Ders seçebilmelidir
    Given Site adresine gidilir
    Then Vice Dean rolu ile login islemi gerceklestirilir
    Then  kullanıcı homepagede menü ye tıklar
    Then ana menüden Lesson Management ders seçimine tıklar
    Then açılan sayfadan" lesson program " tıklar
    Then kullanıcı choose lessons tıklar ,ders seçimini yapar
    And  dersin seçili olduğunu doğrular
    Then close browser

  @US12_AC02
  Scenario: Seçilen dersi silebilmelidir Ders seçebilmelidir.
    Given Site adresine gidilir
    Then Vice Dean rolu ile login islemi gerceklestirilir
    Then  kullanıcı homepagede menü ye tıklar
    Then ana menüden Lesson Management ders seçimine tıklar
    Then açılan sayfadan" lesson program " tıklar
    Then kullanıcı choose lessons tıklar ,ders seçimini yapar
    And  dersin seçili olduğunu doğrular
    Then kullanıcı seçilen dersi silebilmelidir
    And  dersin silindiğini doğrular
    Then close browser

  @US12_AC03
  Scenario: Ders seçim kısmı boş bırakılmmalıdır..
    Given Site adresine gidilir
    Then Vice Dean rolu ile login islemi gerceklestirilir
    Then  kullanıcı homepagede menü ye tıklar
    Then ana menüden Lesson Management ders seçimine tıklar
    Then açılan sayfadan" lesson program " tıklar
    And Kullanici egitim donemi secimi yapar.
    And Kullanici ders gunu secer.
    And Kullanici dersin baslangic saatini girer.
    And Kullanci dersin bitis saatini baslangic saatinden buyuk girer.
    Then Kullanici Submit butonuna tiklar.
    Then close browser

  @US12_AC05
  Scenario: Ders seçim kısmı boş bırakılmmalıdır
    Given Site adresine gidilir
    Then Vice Dean rolu ile login islemi gerceklestirilir
    Then  kullanıcı homepagede menü ye tıklar
    Then ana menüden Lesson Management ders seçimine tıklar
    Then açılan sayfadan" lesson program " tıklar
    And Kullanici egitim donemi secimi yapar.
    Then egitim donemi secimini dogrular.
    Then close browser