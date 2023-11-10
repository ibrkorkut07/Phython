@RamazanAPI_US22
  Feature: Admin Controller

    Scenario: Admin kullanicisi ile Admin hesabi olusturma testi
      Given Admin Save icin URL duzenlenirRA
      And Admin Save icin payload duzenlenirRA
      When Admin Save icn POST Request gonderilir ve Response alinirRA
      Then Status kodun 200 oldugu dogrulanirRA
      And Admin Save icin gelen Response body dogrulanirRA

    Scenario: Olusturulan Admin hesap bilgisini alma testi
      Given Kayitli Admin hesap bilgisinin ID nosu alinirRA
      Then Status kodun 200 oldugu dogrulanirRA
