@US16_DB
Feature: Vice Dean mesajlari gorebilmeli

  Scenario Outline: Vice Dean name, email, subject ve message bilgilerini görebilmeli
    Given Database baglantisi kurulur US
    When email bilgisi ile mesaj alinir
    Then Mesaj bilgileri dogrulanir: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

    Examples:
      | name       | email             | subject | message                     | date       |
      | My Message | johndoe@gmail.com | Urgent  | We have meeting tomorrow!!! | 2023-05-01 |