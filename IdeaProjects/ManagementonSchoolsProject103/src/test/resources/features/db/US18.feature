@US18_DB
Feature: Teacher rolu ile student info note olusturulabildigini gorebilmesi

  @US18_TC01_DB
  Scenario Outline: Teacher rolu ile olusturulmus olan student info note bilgilerinin gorulebilmesi
    Given Database baglantisi kurulur US18
    When Teacher rolu ile olusturulmus student info note tablosundan Id ile sorgu yapar US18
    Then Database baglantisi kesilir

    Examples:
      | id  | Absentee  |Exam_Average  | Final_Exam   |  Midterm_Exam |         Info_Note        |  Student_Id   | Educatin_Term_Id  |
      | 863 |      1    |     53.8     |       45     |      67       |Her gun tekrarr yapmali   |       3       |         2         |

  @US18_TC02_DB
 #Sildiğim user'ın username değeri ile çağrılan body boş olmalı
  Scenario:  Teacher Student Info List bilgilerini silebilir
    Given Id "663" ile sorgu yap
    Then gelen data bos olmali