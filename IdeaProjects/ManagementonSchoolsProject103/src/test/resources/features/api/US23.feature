Feature:Admin Vice Dean olusturma

  @US23_TC01 @api_smoke_test
  Scenario: Vicedean olusturma
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    Then Body olarak gönderilecek data hazırlanır US06_TC01
    And Post request gönderilir US06_TC01
    And Status Code'unun 200 oldugu dogrulanir
    And ViceDean ın data'daki bilgilerle oluşturulduğu doğrulanır US06_TC01

  Scenario:Data'da "name" bilgisine yer verilmesinin zorunlu olmasi
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    Then Body olarak gönderilecek data name bilgisine yer verilmeden hazırlanır US06_TC02
    And Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  Scenario:Data'da "surname" bilgisine yer verilmesinin zorunlu olmasi
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    Then Body olarak gönderilecek data surname bilgisine yer verilmeden hazırlanır US06_TC03
    And Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  Scenario:Data'da "birth Place" bilgisine yer verilmesinin zorunlu olmasi
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    Then Body olarak gönderilecek data birth Place bilgisine yer verilmeden hazırlanır US06_TC04
    And Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  Scenario:Data'da Gender bilgisine yer verilmesinin zorunlu olmasi
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    And Body olarak gönderilecek data Gender bilgisine yer verilmeden hazırlanır US06_TC04
    And Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  Scenario:Data'da Telefon no bilgisine yer verilmesinin zorunlu olmasi
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    And Body olarak gönderilecek data Telefon no bilgisine yer verilmeden hazırlanır
    And  Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  Scenario:Data'da Birth of Date bilgisine yer verilmesinin zorunlu olmasi
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    And Body olarak gönderilecek data Birth of date bilgisine yer verilmeden hazırlanır
    And  Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  Scenario:Data'da Ssn bilgisine yer verilmesinin zorunlu olmasi
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    And Body olarak gönderilecek data Ssn bilgisine yer verilmeden hazırlanır
    And  Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  Scenario:Data'da User name bilgisine yer verilmesinin zorunlu olmasi
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    And Body olarak gönderilecek data User Name bilgisine yer verilmeden hazırlanır
    And  Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir

  Scenario:Data'da Password bilgisine yer verilmesinin zorunlu olmasi
    Given Vice Dean oluşturmak için endpoint hazırlanır
    Then Admin rolu ile token olusturulur
    And Body olarak gönderilecek data Password bilgisine yer verilmeden hazırlanır
    And  Post request gönderilir US06_TC01
    And Status Code'unun 400 oldugu dogrulanir