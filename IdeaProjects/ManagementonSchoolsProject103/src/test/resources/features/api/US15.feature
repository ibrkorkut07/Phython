@US15
Feature: Vice Dean rolu ile ogrenci olusturma

  @US15_TC01 @api_smoke_test
  Scenario: Vice dean rolu ile ogrenci olusturma
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 200 oldugu dogrulanir
    Then Ogrencinin data'daki bilgilerle olusturuldugu dogrulanir US15

  @US15_TC02
  Scenario: Data'da "danisman ogretmen" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data advisorTeacherId bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC03
  Scenario: Data'da "name" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data name bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC04
  Scenario: Data'da "surname" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data surname bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC05
  Scenario: Data'da "birth place" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data birthPlace bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC06
  Scenario: Data'da "e-mail" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data email bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC07
  Scenario: Data'da "telefon numarasi" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data phoneNumber bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC08
  Scenario: Data'da "cinsiyet" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data gender bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC09
  Scenario: Data'da "dogum tarihi" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data birthDay bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC10
  Scenario: Data'da "ssn" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data ssn bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC11
  Scenario: Data'da "ssn" bilgisinin yanlis formatta gonderilmesi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak ssn bilgisinde ucuncu rakamdan sonra tire icermeyecek sekilde data gonderilir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC12
  Scenario: Data'da "ssn" bilgisinin yanlis formatta gonderilmesi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak ssn bilgisinde besinci rakamdan sonra tire icermeyecek sekilde data gonderilir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC13
  Scenario: Data'da "ssn" bilgisinin yanlis formatta gonderilmesi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak ssn bilgisinde sekiz rakam icerecek sekilde data gonderilir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC14
  Scenario: Data'da "ssn" bilgisinin yanlis formatta gonderilmesi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak ssn bilgisinde on rakam icerecek sekilde data gonderilir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC15
  Scenario: Data'da "user name" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data username bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC16
  Scenario: Data'da "father name" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data fatherName bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC17
  Scenario: Data'da "mother name" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data motherName bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC18
  Scenario: Student number'in otomatik olarak verilmesi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 200 oldugu dogrulanir
    Then Ogrenciye otomatik olarak student number verildigi dogrulanir US15

  @US15_TC19
  Scenario: Data'da "password" bilgisine yer verilmesinin zorunlu olmasi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak gonderilecek data password bilgisine yer verilmeden hazirlanir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir

  @US15_TC20
  Scenario: Data'da "password" bilgisinin yanlis formatta gonderilmesi
    Given Ogrenci olusturmak icin endpoint hazirlanir US15
    When Vice Dean rolu ile token olusturulur
    And Body olarak password bilgisinde yedi karakter icerecek sekilde data gonderilir US15
    When Post request gonderilir US15
    Then Status Code'unun 400 oldugu dogrulanir
    # Then Ogrencinin olusturulamadigi dogrulanir