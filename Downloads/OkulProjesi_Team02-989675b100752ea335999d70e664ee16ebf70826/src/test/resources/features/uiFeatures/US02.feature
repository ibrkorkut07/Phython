Feature:US02 Admin Guest User List

  Background:
    Given kullanici ana sayfaya gider
    And kullanici register butonuna tiklar


    Then User Name girer
    Then Password girer
    Then Menuye tiklar
    Then  Guest User 'a tiklar
    Then Guest User List yazisini gorur
    Then Name,Phone Number,Ssn,User Name listesinin bos olmadigini dogrular
    And Guest User List ilk kayitli indeksi bilgileri goruntuler
    And Liastedeki ilk siranin kaydini sil butona basar
    Then yazdirdigi listenin sayfada olmadigini dogrular
    And sayfayi kapatir.
























