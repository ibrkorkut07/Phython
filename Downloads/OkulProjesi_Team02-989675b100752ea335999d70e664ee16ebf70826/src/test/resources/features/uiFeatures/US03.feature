@US03
Feature: Contact_Message

  Background:
    Given User goes to "https://managementonschools.com/"
    When  User enters Contact button

  @TC01
  Scenario: TC01 Contact Message
    And User enters a valid value of "John" in the Your Name text box.
    And User enters a valid value of "John@gmail.com" in the Your Mail text box.
    And User enters a valid value of "Techpro" in the Subject text box.
    And User enters a valid Message "Hello Java$$$" in the Message text box.
    And User clicks the Send Message button
    Then User confirms that Contact Message Created Successfully
    Then User close the page

  @TC02
  Scenario: TC02_Contact_Message_Negative_Name

    And User leaves the Your Name box blank
    And User enters a valid value of "John@gmail.com" in the Your Mail text box.
    And User enters a valid value of "Techpro" in the Subject text box.
    And User enters a valid Message "Hello Java$$$" in the Message text box.
    And User clicks the Send Message button
    Then User confirms that the required message has been received
    Then User close the page


  @TC03
  Scenario: TC03_Contact_Message_Negative_Email

    And  User enters a valid value of "John" in the Your Name text box.
    And  User enters a valid value of "John@gmailcom" in the Your Mail text box.
    And User enters a valid value of "Techpro" in the Subject text box.
    And User enters a valid Message "Hello Java$$$" in the Message text box.
    And User clicks the Send Message button
    Then User confirms that Contact Message Created Successfully
    Then User close the page

  @TC04
  Scenario: TC04_Contact_Message_Negative_Email

    And  User enters a valid value of "John" in the Your Name text box.
    And  User enters a valid value of "Johngmail.com" in the Your Mail text box.
    And User enters a valid value of "Techpro" in the Subject text box.
    And User enters a valid Message "Hello Java$$$" in the Message text box.
    And User clicks the Send Message button
    Then User confirms that the error message has been received
    Then User close the page

  @TC05
  Scenario: TC05_Contact_Message_Negative_Subject

    And  User enters a valid value of "John" in the Your Name text box.
    And  User enters a valid value of "John@gmail.com" in the Your Mail text box.
    And User leaves the Subject box blank
    And User enters a valid Message "Hello Java$$$" in the Message text box.
    And User clicks the Send Message button
    Then User confirms that the required message has been received
    Then User close the page

  @TC06
  Scenario: TC06_Contact_Message_Negative_Message

    And User enters a valid value of "John" in the Your Name text box.
    And User enters a valid value of "John@gmail.com" in the Your Mail text box.
    And User enters a valid value of "Techpro" in the Subject text box.
    And User leaves the Message box blank
    And User clicks the Send Message button
    Then User confirms that the required message has been received
    Then User close the page