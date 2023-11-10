@RamazanAPI_US21
  Feature: US21
    Background: Management School sayfasinda student olarak login olunur
      Given Kullanici Management sayfasina giderRA
      And Kullanici student olarak login olurRA
#PASSED
    Scenario: TC01 Oğrenci Choose Lesson listesinde; Teacher, Day, Start Time ve Stop Time bilgilerini görebilmeli
      Given Choose Lesson da Teacher bir name oldugunu dogrula
      Then Choose Lesson da bir  Day oldugunu dogrula
      And Choose Lesson da bir Start time oldugunu dogrula
      And Choose Lesson da bir Stop time oldugunu dogrula
      And Sayfayi kapatirRA
