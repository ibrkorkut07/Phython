Feature: US_16 Vice Dean, kullanicilarin gonderdigi mesajlari gorebilmelidir
@US16_TC01
  Scenario: TC01 Vice Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir
    Given kullanici okul web sayfasina gider
    And kullanici ana sayfadaki logine tiklar
    And Vice Dean username girer
    And Vice Dean Password girer
    And kullanici login buttona tiklar
    And Vice Dean Menu buttona tiklar
    And kullanici Contact Get All secer
    And Vice Dean mesajlari goruntuler
    And Vice Dean yazarlari goruntuler
    And Vice Dean email hesaplari goruntuler
    And Vice Dean gonderilme tarihini goruntuler
    And Vice Dean subject bilgilerini goruntuler

