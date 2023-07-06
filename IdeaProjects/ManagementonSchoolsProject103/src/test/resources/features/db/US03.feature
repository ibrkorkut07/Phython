@US03_DB
  Feature: Kullanici mesaj gonderebilmeli

    Scenario Outline: Kullanicinin mesaj gonderebildiginin dogrulanmasi US03_DB
      Given Database baglantisi kurulur US
      When email bilgisi ile mesaj alinir
      Then Mesaj bilgileri dogrulanir: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"
      Then Database baglantisi kesilir

      Examples:
        | name       | email             | subject | message                     | date       |
        | My Message | johndoe@gmail.com | Urgent  | We have meeting tomorrow!!! | 2023-05-01 |