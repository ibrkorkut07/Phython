@US11
Feature: Verify Lesson Program Creation and Display
  Scenario: Create and Verify a Lesson Program
    Given Vice Dean is on "https://managementonschools.com/"
    And Vice Dean logs in with a valid username and a valid password
    When Vice Dean clicks on the Lesson Program section on the opened page
    And Vice Dean selects a lesson from the dropdown menu
    And Vice Dean selects a day from the dropdown menu
    And Vice Dean selects the Education Term from the dropdown menu
    And Vice Dean enters the start and stop time of the lesson and clicks the submit button
    And Vice Dean scrolls down to reach the lesson program list's page numbers
    And Vice Dean clicks the last page button
    Then the information of the created lesson program is displayed on the opened page
    And Verify if the displayed information matches the created lesson program

  Scenario: TC-02 Vice Dean can to change in program list

    Then Vice Dean can not "change"

  Scenario: TC-03 Vice Dean can to delete in program list

    Then Vice Dean can not "delete"