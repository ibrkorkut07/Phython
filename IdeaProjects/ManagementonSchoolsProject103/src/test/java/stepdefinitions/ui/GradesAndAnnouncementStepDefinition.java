package stepdefinitions.ui;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ChooseLessonPage;
import pages.GradesAndAnnouncementsPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class GradesAndAnnouncementStepDefinition {

    public static int counter = 0;
    ChooseLessonPage chooseLessonPage = new ChooseLessonPage();
    GradesAndAnnouncementsPage gradesAndAnnouncementsPage = new GradesAndAnnouncementsPage();
    public static List<String> teachersNames = new ArrayList<String>();
    public static List<String> days = new ArrayList<String>();
    List<String> startTimes = new ArrayList<String>();
    List<String> stopTimes = new ArrayList<String>();

    public void dersSecimi() {
        do {
            ReusableMethods.waitFor(1);
            ReusableMethods.scrollTopJS();
            ReusableMethods.waitFor(5);
            chooseLessonPage.lessonSelectButton.get(counter).click();
            ReusableMethods.waitFor(2);
            counter++;
            ReusableMethods.waitFor(2);
            chooseLessonPage.lessonSelectButton.get(counter).click();
            ReusableMethods.waitFor(4);
            ReusableMethods.scrollIntoViewJS(chooseLessonPage.lessonSelectButton.get(chooseLessonPage.lessonSelectButton.size() - 4));
            ReusableMethods.waitFor(3);
            ReusableMethods.clickByJS(chooseLessonPage.sumbitButton);
            ReusableMethods.waitFor(1);
            if (chooseLessonPage.submitAlert.getText().contains("Lesson added to Student")) {
                break;
            }
        } while (true);
    }

    @Then("Kullanici Chose Lesson listesinde Teacher bilgilerini gorur")
    public void kullanici_chose_lesson_listesinde_teacher_bilgilerini_gorur() {
        for (WebElement w : chooseLessonPage.teachersSutun) {
            teachersNames.add(w.getText());
        }
        Assert.assertTrue(chooseLessonPage.teacher.isDisplayed());
    }

    @Then("Kullanici Chose Lesson listesinde Day bilgilerini gorur")
    public void kullanici_chose_lesson_listesinde_day_bilgilerini_gorur() {
        for (WebElement w : chooseLessonPage.daysSutun) {
            days.add(w.getText());
        }
        Assert.assertTrue(chooseLessonPage.day.isDisplayed());
    }

    @Then("Kullanici Chose Lesson listesinde Start Time bilgilerini gorur")
    public void kullanici_chose_lesson_listesinde_start_time_bilgilerini_gorur() {
        for (WebElement w : chooseLessonPage.startTimeSutun) {
            startTimes.add(w.getText());
        }
        Assert.assertTrue(chooseLessonPage.startTime.isDisplayed());
    }

    @Then("Kullanici Chose Lesson listesinde Stop time bilgilerini gorur")
    public void kullanici_chose_lesson_listesinde_stop_time_bilgilerini_gorur() {
        for (WebElement w : chooseLessonPage.stopTimeSutun) {
            stopTimes.add(w.getText());
        }
        Assert.assertTrue(chooseLessonPage.stopTime.isDisplayed());
    }

    @Then("Kullanici secmek istedigi dersin Choose Lesson butonuna tiklar")
    public void kullanici_secmek_istedigi_dersin_choose_lesson_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollTopJS();
        ReusableMethods.waitFor(2);
        if (!chooseLessonPage.lessonSelectButton.get(counter).isSelected()) {
            chooseLessonPage.lessonSelectButton.get(counter).click();
        } else {
            ReusableMethods.waitFor(1);
            counter++;
            chooseLessonPage.lessonSelectButton.get(counter).click();
            ReusableMethods.waitFor(1);
        }
    }

    @Then("Kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        ReusableMethods.scrollIntoViewJS(chooseLessonPage.lessonSelectButton.get(chooseLessonPage.lessonSelectButton.size() - 4));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(chooseLessonPage.sumbitButton);
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici Lesson added to Student uyarisini gorur")
    public void kullanici_lesson_added_to_student_uyarisini_gorur() {
        if (!chooseLessonPage.submitAlert.getText().contains("Lesson added to Student")) {
            dersSecimi();
        } else Assert.assertTrue(chooseLessonPage.submitAlert.getText().contains("Lesson added to Student"));
    }

    @Then("Kullanici Pazartesi gunu saat oniki de olan dersi secer")
    public void kullanici_pazartesi_gunu_saat_oniki_de_olan_dersi_secer() {
        ReusableMethods.scrollIntoViewJS(chooseLessonPage.lessonSelectButton.get(14));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(chooseLessonPage.saat12Ders1);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Pazartesi gunu saat oniki de olan baska bir ders secer")
    public void kullanici_pazartesi_gunu_saat_oniki_de_olan_baska_bir_ders_secer() {
        ReusableMethods.scrollIntoViewJS(chooseLessonPage.lessonSelectButton.get(14));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(chooseLessonPage.saat12Ders2);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Error: Course schedule cannot be selected for the same hour and day uyarisini gorur")
    public void kullanici_error_course_schedule_cannot_be_selected_for_the_same_hour_and_day_uyarisini_gorur() {
        Assert.assertTrue(chooseLessonPage.submitAlert.getText().contains("Error: Course schedule cannot be selected for the same hour and day"));
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici sayfayi asagi kaydirir")
    public void kullanici_sayfayi_asagi_kaydirir() {
        ReusableMethods.scrollIntoViewJS(chooseLessonPage.sumbitButton);
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Lesson Program List te ekledigi dersleri gorur")
    public void kullanici_lesson_program_list_te_ekledigi_dersleri_gorur() {
        Assert.assertTrue(chooseLessonPage.lessonProgramList.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici sayfada acilan main menu kisminda Grades ve Announcements alanina tiklar")
    public void kullanici_sayfada_acilan_main_menu_kisminda_grades_ve_announcements_alanina_tiklar() {
        chooseLessonPage.gradesAndAnnouncements.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici acilan sayfada Student Info List kisminda Note bolumunu gorur")
    public void kullanici_acilan_sayfada_student_info_list_kisminda_note_bolumunu_gorur() {
        Assert.assertTrue(gradesAndAnnouncementsPage.studentInfoListTablo.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici acilan sayfada Meet List alaninda toplantilari gorur")
    public void kullanici_acilan_sayfada_meet_list_alaninda_toplantilari_gorur() {
        ReusableMethods.scrollIntoViewJS(gradesAndAnnouncementsPage.studentInfoListTablo);
        Assert.assertTrue(gradesAndAnnouncementsPage.studentInfoListTablo.isDisplayed());
        ReusableMethods.waitFor(1);
    }

}
