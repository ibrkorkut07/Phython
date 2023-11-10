@US11API
Feature: Vice Dean ders programını görebilmeli ve güncellemeler yapabilmelidir.
  (Lesson Program - Lesson Program List)

  Background: Login - Vice Dean
    Given Vice Dean is on "https://managementonschools.com/"IO
    Then Vice Dean enters a valid username and password then clicks the login buttonIO
    And Vice Dean clicks on the Lesson Program section on the opened pageIO

    Scenario:TC001 - Lesson Program Viewing Scenario (Get)
    Given Editing the URL to view a lesson programIO
      When Sending a GET request to view the lesson program detailsIO
      Then Verifying that the Status Code is 200IO
      And Verifying the response body for the lesson programIO

  Scenario: TC002 Positive Scenario to Verify Deleted Lesson Program (Delete)
    Given Editing the URL to delete a created lesson programIO
    When Sending a DELETE request to delete the created Lesson ProgramIO
    Then Verifying that the Status Code is 200IO
    And Verifying the response body for the deletion of the Lesson ProgramIO








