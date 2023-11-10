Feature: Vice Dean ders listesini gorebilmeli ve guncellemeler yapabilmelidir.
  (Lessons - Lesson List)


  Background: Login
    Given Vice Dean is on "https://managementonschools.com/"
    And Vice Dean clicks on the login
    And Vice Dean enters a valid username "<username>"
    And Vice Dean enters a valid password "<password>"
    And Vice Dean clicks on the login button
    And Vice Dean clicks on the Lessons section on the opened page
  @US09 @POSITIVE

  Scenario: Scenario: Oluşturulan; Lesson Name, Compulsory ve Credit Score görebilmelidir.

    And Vice Dean adds a lesson named "<lessonName>"
    And Vice Dean specifies if the lesson is compulsory: "<isCompulsory>"
    And Vice Dean enters the credit score as "<creditScore>"
    And Vice Dean submits the lesson
    Then Vice Dean navigates to the last page
    Then The information of the created lesson "<lessonName>" is displayed
    And Verify if the displayed information matches the "<lessonName>" created lesson details
  @US09
  Scenario: Delete a specific lesson and verify deletion
    When Vice Dean navigates to the last page
    And Vice Dean clicks the trash bin icon for the lesson to be deleted
    Then Vice Dean verifies that the lesson "<lessonName>" has been deleted successfully