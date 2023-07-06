package stepdefinitions.db;

import io.cucumber.java.en.*;
import utilities.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class LessonProgramManagementDBStepDefinition {

    Statement statement;
    ResultSet resultSet;
    @When("Vice Dean rolu ile olusturulmus ders programı tablosunda id ile bulunur US10")
    public void vice_dean_rolu_ile_olusturulmus_ders_programı_tablosunda_id_ile_bulunur_us10() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM lesson_program WHERE id = 229;";
        resultSet = JDBCUtils.executeQuery(query);
        resultSet.next();
    }
    @Then("Ders program bilgileri dogrulanir US13")
    public void ders_program_bilgileri_dogrulanir_us13() throws SQLException {
        assertEquals("SUNDAY",resultSet.getString("day"));
        assertEquals("12:12:00",resultSet.getString("start_time"));
        assertEquals("15:15:00",resultSet.getString("stop_time"));
        assertEquals("2",resultSet.getString("education_term_id"));
    }



}
