@US17
Feature: Teacher

  Background: Teacher giris yapabilmeli.
    Given teacher url gider
    Then teacher anasayfaya geldigini dogrular
    When teacher login yazisina tiklar
    Then teacher login sayfasinin acildigini dogrular
    And teacher  username textboxuna "teacher_usernamemedine" ini girer
    And teacher password textboxa "teacher_passwordmedine" girer
    When teacher login butonuna tiklar
    Then teacher ders secer
    Then teacher ogrenci secer
    Then teacher devamsizlik girer
    Then teacher sinav notlarini girer
    Then teacher info notunu girer
    Then teacher Submit butonunu girer