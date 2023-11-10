@RamazanE2E
Feature: Admin Admin Ekleyebilmeli

  Background: Management School sayfasinda Admin olarak login olunur
    Given Kullanici Management sayfasina giderRA
    Then Kullanici Admin olarak login olurRA
   # And Kullanici Menu sekmesine tiklarRA
   # And Admin Management' e tiklaRA

  @UI  #PASSED
  Scenario:TC01 Tum alanlar doldurularak admin ekleme olusturulabilmelidir
    Given Name, Surname, Birth Place, Cinsiyet, E-mail, Phone Number, Date of Birth, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And Admin olustugu dogrulaRA
    And Sayfayi kapatirRA


  Scenario: Olusturulan Admin hesap bilgisini alma testi
    Given Kayitli Admin hesap bilgisinin ID nosu alinirRA
    Then Status kodun 200 oldugu dogrulanirRA

  Scenario: Kayitli Admin Bilgisini Dogrulama Testi
    Given Database baglantisi kurulurRA
    And Kayitli Admin hesap bilgisini almak icin Qery gonderilirRA
    Then Kayitli Admin bilgisi dogrulanir
    And DAtabase baglantisi kesilirRA

  Scenario: Kayitli Admin hesabi silme testi
    Given Admin Delete icin URL duzenlenirRA
    When Admin Delete icin Delete Request gonderilir ve Response alinirRA
    Then Status kodun 200 oldugu dogrulanirRA
