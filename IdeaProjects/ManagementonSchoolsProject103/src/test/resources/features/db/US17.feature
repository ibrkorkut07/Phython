@US17_DB
Feature: Teacher rolu ile student info note olusturulabildiginin dogrulanmasi

  @US17_TC01_DB
  Scenario Outline: Teacher rolu ile olusturulmus olan student info note bilgilerinin dogrulanmasi
    Given Database baglantisi kurulurUS17
    When Teacher rolu ile olusturulmus student info note tablosunda Id ile bulunur US17
    Then Student info note bilgileri dogrulanirUS17
    Then Database baglantisi kesilir


    Examples:
      | id  | Absentee | Final_Exam | Midterm_Exam | Info_Note               | Student_Id | Education_Term_Id |
      | 863 |     1    | 45         | 67           | Her gun tekrarr yapmali | 3          | 2                |
