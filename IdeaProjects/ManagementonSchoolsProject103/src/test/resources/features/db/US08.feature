@US08DB
  Feature: Vicedean roluyle olusturulmus Lessonin dogrulanmasi

    Scenario: Vicedean roluyle olusturulmus Lessonin dogrulanmasi
      Given Database baglantisi kurulur
      Then ViceDean rolu ile belirlenmis lesson, lesson tablosunda lesson_id ile bulunur
      Then lesson bilgileri dogrulanir
      And Database baglantisi kesilir





