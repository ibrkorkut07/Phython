Feature: Vice Dean ders programı oluşturabilmelidir.
  (Lesson Program - Add Lesson Program)

  Background:
    Given Vice Dean is on "https://managementonschools.com/"
    And Vice Dean clicks on the login
    And Vice Dean enters a valid username "<username>"
    And Vice Dean enters a valid password "<password>"
    And Vice Dean clicks on the login button
    And Vice Dean clicks on the Lesson Program section on the opened page

  @US10POSITIVE
  Scenario: Create and verify a lesson program
    When Vice Dean selects the lesson "<selectedLesson>" from the dropdown menu
    And Vice Dean selects the day "<selectedDay>" from the dropdown menu
    And Vice Dean selects the Education Term "<selectedTerm>" from the dropdown menu
    And Vice Dean enters the start and stop time of the lesson and clicks the submit button
    And Vice Dean scrolls down to reach the lesson program list's page numbers
    And Vice Dean clicks the last page button
    Then the information of the created lesson program is displayed on the opened page
    And Vice Dean verifies if the displayed information matches the created lesson program details

  @US10NEGATIVE
  Scenario: Vice Dean Cannot Create a Lesson Program Without Filling Mandatory Fields (Negative test)
    When Vice Dean clicks the submit button
    Then the Vice Dean waits for 1 seconds
    Then the Vice Dean verifies the visibility of the required fields.

  @US10NEGATIVE
  Scenario: Vice Dean Cannot Create a Class Schedule Without Filling Mandatory Fields (Negative test)
    When Vice Dean enters the start and stop time of the lesson and clicks the submit button
    Then the Vice Dean waits for 1 seconds
    Then the Vice Dean verifies the visibility of the message "JSON parse error"
    Then the Vice Dean captures a screenshot of the error message

  @US10NEGATIVE
  Scenario: Vice Dean Cannot Create a Class Schedule Without Filling Mandatory Fields (Negative test)

    When Vice Dean selects the lesson "<selectedLesson>" from the dropdown menu
    Then the Vice Dean selects "THURSDAY" from the Choose Day menu in the Add Lesson Program area
    Then Vice Dean enters the start and stop time of the lesson and clicks the submit button
    Then the Vice Dean waits for 1 seconds
    Then the Vice Dean verifies the visibility of the message Please select education term
    Then the Vice Dean captures a screenshot of the error message

  @US10NEGATIVE
  Scenario: Vice Dean Cannot Create a Class Schedule Without Filling Mandatory Fields (Negative test)
    When Vice Dean selects the lesson "<selectedLesson>" from the dropdown menu
    Then the Vice Dean selects "FALL_SEMESTER" from the Choose Education Term menu in the Add Lesson Program area
    Then the Vice Dean verifies the accessibility of the Choose Day menu in the Add Lesson Program area
    Then the Vice Dean selects "WEDNESDAY" from the Choose Day menu in the Add Lesson Program area
    Then the Vice Dean enters stop time and greater star time and clicks the submit button
    Then the Vice Dean waits for 1 seconds
    Then the Vice Dean verifies the visibility of the message Error: start time must not be greater than or equal to stop time
    Then the Vice Dean captures a screenshot of the error message

