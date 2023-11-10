@US16_DB
Feature: US16 Vice Dean, Contact Get All, Contact Message (DB)

  Scenario Outline: US16 TC01 Vice Dean Sees All Contact Info
    Given Connect to school database
    And Contact_message body contains dates "<date>", emails "<email>", messages "<message>", names "<name>", subjects "<subject>"
    Examples:
      | date       | email           | message                                              | name  | subject     |
      | 2023-10-22 | merve@gmail.com | Can you give me information about 15th May schedule? | merve | schedule    |

    # No need to print data but just to see