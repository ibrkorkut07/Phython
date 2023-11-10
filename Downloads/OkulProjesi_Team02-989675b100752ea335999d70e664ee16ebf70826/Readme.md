<img src="src/pngs/readme.png" width="100px" height="120px" align="right"/>


# https://www.managementonschools.com web Test Otomasyonu
## Web Test Senaryosu
### Test Senaryosu İçerisinde:
> - Aday öğrenciler sisteme kayıt olabilmelidir (Register).
> - Admin Guest User List bilgilerini görebilmeli ve silebilmelidir. 
> - Kullanıcılar sayfadan mesaj gönderebilmelidir (Contact).
> - Admin Dean ekleyebilmeli, Eklenen Dean leri görebilmeli ve silebilmelidir.
> - Dean, Vice Dean hesabı oluşturabilmelidir.
> - Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
> - Vice Dean ders oluşturabilmelidir (Lessons - Add Lesson).
> - Vice Dean ders listesini görebilmeli ve güncellemeler yapabilmelidir(Lessons - Lesson List).
> - Vice Dean ders programı oluşturabilmelidir(Lesson Program - Add Lesson Program).
> - Vice Dean ders programını görebilmeli ve güncellemeler yapabilmelidir (Lesson Program - Lesson Program List).
> - Choose Lessons bölümüne oluşturulan dersin geldiği görülmelidir (Lesson Program - Lesson Program Assignment).
> - Vice Dean öğretmen oluşturabilmeli, öğretmenleri görebilmeli ve güncelleme yapabilmelidir.
> - Vice Dean, öğrenci oluşturabilmelidir.
> - Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
> - Teacher, öğrencilere not verebilmeli, notları görebilmeli ve güncelleyebilmelidir (Add Student Info).
> - Teacher öğrenciler ile toplantı düzenleyebilmeli (Add Meet).
> - Teacher, toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir (Meet List).
> - Students, choose lesson, grades and announcement
> - Admin ekleme
> - Admin Vice Dean, Teacher ve Student oluşturabilmelidir..

Bu testler çalıştırılırken her aşamada doğrulamalar **Assertion** kullanılarak yapılmış,

Oluşturulan methodlarla daha dinamik çalışılması sağlanmıştır..

### Testler Hazirlanirken:
> - Proje yönetim aracı olarak **Jira-Xray** kullanılmıştır
> - Versiyon kontrol aracı olarak **Git-Github** kullanılmıştır
> - Otomasyon Scriptleri için **Java programlama dili** ile birlikte **Selenium Web Driver** kullanılmiştır.
> - Framework olarak **Cucumber**
> - Framework yapısı **Page Object Model(POM)** ile dizayn edilmiştir.
> - Framework yapısı içrisinde yapılan kodlamalar da **Object Oriented Programming(OOP)** kullanılmıştır.
> - Proje'de Locate almada _FindBy Anotation_'ı kullanılmıştır.
> - Her aşamada **Assertion**'larla testin akışı ile ilgili doğrulamlar yapılmıştır.
> - Testlerde kullanılan Data'lar **Properties** class'ı kullanılarak alınmıştır.
> - Raporlama methodu olarak **TestBaseRapor** kullanılmışır


<img src="src/pngs/java.png" width="100px" height="100px" padding="10px" align="left"/>
<img src="src/pngs/selenium.png" width="100px" height="100px" padding="10px" align="left"/>
<img src="src/pngs/cucumber.png" width="160px" height="100px" padding="10px" align="left"/>
<img src="src/pngs/jira.png" width="200px" height="100px" padding="10px" align="left"/>
<img src="src/pngs/git.png" width="200px" height="100px" padding="10px" align="left"/>
