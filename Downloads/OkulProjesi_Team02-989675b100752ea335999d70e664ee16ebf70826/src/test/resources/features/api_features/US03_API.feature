@US03_Api
Feature: Contact_Message_Sending
@Tapi
  Scenario: TC01_Contact_Message
    Given User sends the post request
    Then  User verify the response

  Scenario: TC02_Contact_Message_Negative_Name
    Given User sends the post request without name
    Then  User verify the status code should be 400

  Scenario: TC03_Contact_Message_Negative_Email
    Given User sends the post request email without @ and .
    Then  User verify the response without @ and .

  Scenario: TC04_Contact_Message_Negative_Subject
    Given User sends the post request without subject
    Then  User verify the response without subject

  Scenario: TC05_Contact_Message_Negative_Message
    Given User sends the post request without message
    Then  User verify the response without message