package stepdefinitions.db;

import io.cucumber.java.en.*;
import utilities.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChooseLesson_Grades_Meet_StepDefinition {
    Statement statement ;
    ResultSet resultSet;
    List<Integer> meetList = new ArrayList<>();
    List<Integer> lesson_program_id = new ArrayList<>();

    @When("dersler student_lesson tablosunda student_id ile bulunur US21")
    public void dersler_student_lesson_tablosunda_student_id_ile_bulunur_us21() throws SQLException {
        statement = JDBCUtils.createStatement();
        resultSet = JDBCUtils.executeQuery("select * from student_lessonprogram where student_id=127");

        while (resultSet.next()){
            lesson_program_id.add(resultSet.getInt(2));
        }
        System.out.println("lesson_program_id = " + lesson_program_id);


    }
    @Then("lesson program id leri dogrulanir US21_TC01")
    public void lesson_program_id_leri_dogrulanir_us21_tc01() {
        assertTrue(lesson_program_id.contains(3));
        assertTrue(lesson_program_id.contains(4));
        assertTrue(lesson_program_id.contains(5));
        assertTrue(lesson_program_id.contains(6));
        assertTrue(lesson_program_id.contains(103));
        assertTrue(lesson_program_id.contains(106));
    }

    @When("ogrenci sinav notlari student_info tablosunda student_id ile bulunur US21")
    public void ogrenci_sinav_notlari_student_info_tablosunda_student_id_ile_bulunur_us21() throws SQLException {
        statement=JDBCUtils.createStatement();
        resultSet = JDBCUtils.executeQuery("select * from student_info where student_id=127");
        resultSet.next();

    }
    @Then("ogrenci sinav notlari dogrulanir US21_TC02")
    public void ogrenci_sinav_notlari_dogrulanir_us21_tc02() throws SQLException {
        assertEquals(319,resultSet.getInt("id"));
        assertEquals(5,resultSet.getInt("absentee"));
        assertEquals(85,resultSet.getInt("exam_average"));
        assertEquals(75,resultSet.getInt("final_exam"));
        assertEquals("AA",resultSet.getString("letter_grade"));
        assertEquals("hfghsfdddg",resultSet.getString("info_note"));
        assertEquals(100,resultSet.getInt("midterm_exam"));
    }


    @When("toplanti meet student tablosunda id ile bulunur US21")
    public void toplanti_meet_student_tablosunda_id_ile_bulunur_us21() throws SQLException {
        statement = JDBCUtils.createStatement();
        resultSet = JDBCUtils.executeQuery("select * from meet_student_table where student_id=127");

        while (resultSet.next()){
            meetList.add(resultSet.getInt(2));
        }
        System.out.println("meetList = " + meetList);

    }
    @Then("Toplanti id bilgileri dogrulanir US21_TC01")
    public void toplanti_id_bilgileri_dogrulanir_us21_tc01() {
        assertTrue(meetList.contains(88));
        assertTrue(meetList.contains(89));
        assertTrue(meetList.contains(90));


    }

}
