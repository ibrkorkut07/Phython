package stepdefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class TeacherLessonProgramAssigment {

    Statement statement;
    ResultSet resultSet;
    @When("Vice Dean rolu ile olusturulmus ders programı tablosunda id ile bulunur US12")
    public void vice_dean_rolu_ile_olusturulmus_ders_programı_tablosunda_id_ile_bulunur_us12() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM lesson_program WHERE id = 200;";
        resultSet = JDBCUtils.executeQuery(query);
        resultSet.next();

    }
    @Then("Ders program bilgileri dogrulanir US12")
    public void ders_program_bilgileri_dogrulanir_us12() throws SQLException {
        assertEquals("MONDAY",resultSet.getString("day"));
        assertEquals("05:05:00",resultSet.getString("start_time"));
        assertEquals("06:05:00",resultSet.getString("stop_time"));
        assertEquals("1",resultSet.getString("education_term_id"));

    }

}