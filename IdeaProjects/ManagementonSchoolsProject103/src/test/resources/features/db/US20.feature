@US20_DB
Feature: Teacher rolu ile student info note olusturulabildigini gorebilmesi

  @US20_TC01_DB
  Scenario Outline: Teacher rolu ile olusturulmus olan meet bilgilerinin gorulebilmesi
    Given Database baglantisi kurulur US_20
    When Teacher rolu ile olusturulmus meet tablosundan Id ile sorgu yapar US_20
    Then Meet bilgileri dogrulanir US_20
    Then Database baglantisi kesilir


    Examples:
      | id  |    date    |      description  |     start_time  | stop_time   |
      | 2   | 2024-01-11 | Veli Toplantisi    |       12:00:00  | 13:00:00    |

  @US20_TC02_DB
 #Sildiğim user'ın username değeri ile çağrılan body boş olmalı
  Scenario:  Teacher Student Info List bilgilerini silebilir
    Given Database baglantisi kurulur US_20
    When Id "602" ile sorgu yap
    Then Gelen datanin bos oldugu dogrulanir US_20