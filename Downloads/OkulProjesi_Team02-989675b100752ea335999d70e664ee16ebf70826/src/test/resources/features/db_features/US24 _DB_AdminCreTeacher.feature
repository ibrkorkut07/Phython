@US24_DB
Feature: Admin should be able to crea a teacher

  Scenario Outline: US24_DB Crea a teacher
    Given Connect to school database
    And Admin crea teacher with birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", password "<password>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>", email "<email>"
    Then The Body contains birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", password "<password>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>", email "<email>"
    Examples:
      | birth_day  | birth_place | gender | name | password | phone_number | ssn         | surname | username | email             |
      | 1988-11-11 | Canada      | 1      | Ali  | paspas   | 598-924-1518 | 671-44-4914 | can     | AliCan   | ali.can@gmail.com |

  # It gives the following error which is strange as there is no column named "canada" and not used in any data insertion;
  # ERROR: column "canada" does not exist