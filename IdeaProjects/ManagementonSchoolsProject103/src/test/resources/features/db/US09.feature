@US09DB
  Feature: Vicedean roluyle olusturulmus Compulsary ve credit score dogrulanmasi

    Scenario: Vicedean roluyle olusturulmus Compulsary ve credit score dogrulanmasi
      Given Database baglantisi kurulur
      Then ViceDean rolu ile belirlenmis Compulsary ve credit score, lesson tablosunda bulunur
      Then Compulsary ve credit score bilgileri dogrulanir
      And Database baglantisi kesilir