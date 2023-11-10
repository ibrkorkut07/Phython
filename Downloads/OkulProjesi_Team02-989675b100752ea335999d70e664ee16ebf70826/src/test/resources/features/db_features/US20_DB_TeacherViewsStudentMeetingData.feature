@US20_DB
Feature: Teacher Views Student Meeting Data

  Background:
    Given Connect to school database

  Scenario Outline: US20_DB_TeacherViewsStudentMeetingData
        Then Get Student Meeting date "<date>", description "<description>", start_time "<start_time>", stop_time "<stop_time>" via advisor_teacher_id "<advisor_teacher_id>"
    Examples:
      | advisor_teacher_id | date       | description | start_time    | stop_time    |
      | 1308               | 2023-11-12 | Toplanti    | 10:00:00      | 11:00:00     |

  Scenario Outline: US20_DB_TeacherUpdatesStudentMeetingData
    Then Update Student Meeting date "<date>", description "<description>", start_time "<start_time>", stop_time "<stop_time>" via advisor_teacher_id "<advisor_teacher_id>"
    Examples:
      | advisor_teacher_id | date       | description | start_time    | stop_time    |
      | 1261               | 2024-01-11 | exams       | 11:00:00      | 12:00:00     |
    # UPDATE permission is denied for table meet - Meet table is set not to be updated by default

  Scenario Outline: US20_DB_TeacherDeletesStudentMeetingData
    Then Delete Student Meeting date via advisor_teacher_id "<advisor_teacher_id>"
    Examples:
      | assertEquals  |
      | 1257                |
    # If the table can be deleted, you should change the given assertEquals in Examples for this Scenario Outline
    # as the given advisor_teacher_id will be deleted when the test runs and not found the next time

  # Alternative Scenario: Finds Student Meeting Data According to advisor_teacher_id
  Scenario Outline: US20_DB_StudentMeetingDataAccordingToAdvisorTeacherId
    Then Get Student Meeting date, description, start_time, stop_time according to advisor_teacher_id "<advisor_teacher_id>"

    Examples:
      | advisor_teacher_id |
      | 1257               |
      | 1308               |
      | 1260               |
      | 1313               |
      | 1514               |

