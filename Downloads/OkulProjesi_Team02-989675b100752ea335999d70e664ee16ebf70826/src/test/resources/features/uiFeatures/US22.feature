Feature: US22

  Background: Management School sayfasinda Admin olarak login olunur
    Given Kullanici Management sayfasina giderRA
    Then Kullanici Admin olarak login olurRA
   # And Kullanici Menu sekmesine tiklarRA
   # And Admin Management' e tiklaRA
 @ramazan @22  #PASSED
  Scenario:TC01 Tum alanlar doldurularak admin ekleme olusturulabilmelidir
    Given Name, Surname, Birth Place, Cinsiyet, E-mail, Phone Number, Date of Birth, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And Admin olustugu dogrulaRA
    And Sayfayi kapatirRA
  @ramazan @22 #PASSED
  Scenario:TC02 "Name" girilmelidir. Boş bırakılamaz.
    Given Name bos birakilir, Surname, Birth Place, Cinsiyet, Phone Number, Date of Birth, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And Name girilmedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA
  @ramazan @22 #PASSED
  Scenario:TC03 "Surname" girilmelidir. Boş bırakılamaz.
    Given Surname bos birakilir, Name, Birth Place, Cinsiyet, Phone Number, Date of Birth, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And Surname girilmedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED
  Scenario:TC04 "Birth Place" girilmelidir. Boş bırakılamaz.
    Given Birth Place bos birakilir, Name, Surname, Cinsiyet, Phone Number, Date of Birth, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And Birth Place girilmedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED #Cinsiyet bos birakildigi halde submit' e tiklandiginda herhangi bir uyari gelmiyor ekrana.
  Scenario:TC05 "Cinsiyet" seçilmelidir. Boş bırakılamaz.
    Given Cinsiyet bos birakilir, Name, Surname, Birth Place, E-mail, Phone Number, Date of Birth, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And Cinsiyet girilmedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED
  Scenario:TC06 "Dogum Tarihi" girilmelidir bos birakilamaz
    Given Date of Birth bos birakilir, Name, Surname, Birth Place, Cinsiyet, Phone Number, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And Dogum Tarihi girilmedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED
  Scenario:TC07 "Phone Number" girilmelidir. Boş bırakılamaz.
    Given Phone Number bos birakilir, Name, Surname, Birth Place, Cinsiyet, Date of Birth, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And Phone Number girilmedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED
  Scenario:TC08 "SSN" girilmelidir. Boş bırakılamaz.
    Given SSN bos birakilir, Name, Surname, Birth Place, Cinsiyet, Phone Number, Date of Birth, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And SSN girilmedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED
  Scenario:TC09 SSN 3. ve 5. rakamdan sonra "-" içermediginde submit olmamalidir
    Given SSN 3. ve 5. rakamdan sonra '-' içermeden Name, Surname, Birth Place, Cinsiyet, Date of Birth, Phone Number, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And SSN 3. ve 5. rakamdan sonra '-' içermedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED
  Scenario:TC10 SSN 9 rakamdan cok oldugunda submit olmamalidir
    Given SSN 10 haneli girilerek Name, Surname, Birth Place, Cinsiyet, Date of Birth, Phone Number, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And SSN 9 rakamdan cok oldugu icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED
  Scenario:TC11 "User Name" girilmelidir. Boş bırakılamaz.
    Given User Name bos birakilir, Name, Birth Place, Cinsiyet, Phone Number, Date of Birth, SSN, Password girilirRA
    Then Submit butonuna tiklaRA
    And Username girilmedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED
  Scenario:TC12 "Password" girilmelidir. Boş bırakılamaz.
    Given Password bos birakilir, Name, Surname, Birth Place, Cinsiyet, Date of Birth, Phone Number, Date of Birth, SSN, User Name girilirRA
    Then Submit butonuna tiklaRA
    And Password girilmedigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA

  @ramazan @22 #PASSED
  Scenario:TC13 Password girilmelidir. Password icin 7 karakter girilememelidir
    Given Password 7 haneli girilir Name, Surname, Birth Place, Cinsiyet, Date of Birth, Phone Number, Date of Birth, SSN, User Name girilirRA
    Then Submit butonuna tiklaRA
    And Password 7 haneli girildigi icin Admin olusmadigini dogrulaRA
    And Sayfayi kapatirRA











