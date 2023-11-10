@RamazanDB
Feature: Admin Bilgisi Dogrulama
  Scenario: Kayitli Admin Bilgisini Dogrulama Testi
    Given Database baglantisi kurulurRA
    And Kayitli Admin hesap bilgisini almak icin Qery gonderilirRA
    Then Kayitli Admin bilgisi dogrulanir
    And DAtabase baglantisi kesilirRA
