@US09API
Feature: Vice Dean ders listesini gorebilmeli ve guncellemeler yapabilmelidir.
  (Lessons - Lesson List)
  Background: Login - Vice Dean
    Given Vice Dean is on "https://managementonschools.com/"IO
    Then Vice Dean enters a valid username and password then clicks the login buttonIO
    And Vice Dean clicks on the Lessons section on the opened pageIO

    Scenario: Oluşturulan; Lesson Name, Compulsory ve Credit Score görebilmelidir.
    TC001 - Positive Scenario (Post)
      Given Editing the URL for Creating a LessonIO
      And Preparing the payload for Creating a LessonIO
      When  Sending a POST Request for Creating a Lesson and Receiving a ResponseIO
      Then Verifying that the Status Code is 200IO
      And Verifying the Response Body for Created LessonIO

  Scenario: TC002 - Positive Scenario to Created Lesson (Get)
    Given Editing the URL for Viewing the Created LessonIO
    When Sending a GET Request to View the Created Lesson and Receiving a ResponseIO
    Then Verifying that the Status Code is 200IO
    And Verifying the Response Body for the Created LessonIO

  Scenario: TC003 -Delete a specific lesson and verify deletion(Delete)
  Given Editing the URL for delete the created lessonIO
  When Sending a DELETE Request to delete the created lesson and receiving a responseID
  Then Verifying that the Status Code is 200IO
  And Verifying the response body for the deletion of the lessonIO





