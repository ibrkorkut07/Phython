@US04
Feature:Admin Dean ekleyebilmeli

  Background: Management_School_Page
    And Admin accesses the "https://www.managementonschools.com/" page.
    And Admin clicks on the Login
    And Admin enters Username "AdminTeam2"
    And Admin enters password "AdminTeam2"
    And Admin clicks on the Login to Enter.
    And Admin clicks on the Menu button.
    And Admin selects Dean Management.
  @TC01
  Scenario: TC01_Admin add a new Dean_Pozitif
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin enters the dean's Ssn in the required format.
    And Admin enters the dean's User Name in the box
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin clicks on the Submit button.
    And Admin verifies the Dean Saved message.
    Then close the application
  @TC02
  Scenario: TC02_"Name" girilmelidir. Boş bırakılamaz._Negative
    And Admin leaves the dean's Name box blank
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin enters the dean's Ssn in the required format.
    And Admin enters the dean's User Name in the box
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin verifies the invalid name text
    Then close the application
  @TC03
  Scenario: TC03_"Surname" girilmelidir. Boş bırakılamaz.Negative
    And Admin enters the dean's Name in the box
    And Admin leaves the dean's Surname box blank
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin enters the dean's Ssn in the required format.
    And Admin enters the dean's User Name in the box
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin verifies the invalid surname text
    Then close the application
  @TC04
  Scenario: TC04_"Birth Place" girilmelidir. Boş bırakılamaz.Negative
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin Leaves the dean's Birth Place in the box blank
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin enters the dean's Ssn in the required format.
    And Admin enters the dean's User Name in the box
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin verifies the invalid birthPlace text
    Then close the application
  @TC05
  Scenario: TC05_Doğum tarihi girilmelidir. Boş bırakılamaz.Negative
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin Leaves the dean's date of birth in the Date Of Birth box blank.
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin enters the dean's Ssn in the required format.
    And Admin enters the dean's User Name in the box
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin verifies the invalid dob text
    Then close the application
  @TC06
  Scenario: TC06_Telefon numarası girilmelidir. Boş bırakılamaz.Negative
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin Leaves the dean's Phone number  box blank
    And Admin enters the dean's Ssn in the required format.
    And Admin enters the dean's User Name in the box
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin verifies the invalid phone number text
    Then close the application
  @TC07
  Scenario: TC07_SSN girilmelidir.  SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.Negative
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin leaves the dean's Ssn number box blank..
    And Admin enters the dean's User Name in the box
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin verifies the Valid SSN message.
    Then close the application
  @TC08
  Scenario: TC08_SSN girilmelidir.  SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.Negative
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin does not put the - sign in the Ssn box after the third and fifth digits of Ssn.
    And Admin enters the dean's User Name in the box
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin clicks on the Submit button.
    And Admin verifies SSN Minimum eleven character (XXX-XX-XXXX)
    Then close the application
  @TC09
  Scenario: TC09_SSN girilmelidir.  SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.Negative
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin enters an SSN number of more than nine digits into the SSN box..
    And Admin enters the dean's User Name in the box
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin clicks on the Submit button.
    And Admin verifies the Valid SSN message.
    Then close the application
  @TC10
  Scenario: TC10_User Name girilmelidir. Boş bırakılamaz.Negative
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin enters the dean's Ssn in the required format.
    And Admin leaves the dean's User Name box blank
    And Admin enters a password with a minimum of Eight characters in the Password box
    And Admin verifies the invalid username text
    Then close the application
  @TC11
  Scenario: TC11_Password girilebilmelidir. Password en az 8 karakterden oluşmalıdır. Negative
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin enters the dean's Ssn in the required format.
    And Admin enters the dean's User Name in the box
    And Admin leaves a password  in the Password box blank
    And Admin verifies the invalid password text
    Then close the application
  @TC12
  Scenario: TC12_Password girilebilmelidir. Password en az 8 karakterden oluşmalıdır. Negative
    And Admin enters the dean's Name in the box
    And Admin enters the dean's Surname in the box
    And Admin enters the dean's Birth Place in the box
    And Admin enters the dean's date of birth in the Date Of Birth box in the valid format .
    And In the Gender section, Admin selects Male.
    And Admin enters the dean's Phone number in the box
    And Admin enters the dean's Ssn in the required format.
    And Admin enters the dean's User Name in the box
    And Admin enters less then Eight characters for password
    And Admin confirmed that the At least Eight characters warning message was displayed
    Then close the application