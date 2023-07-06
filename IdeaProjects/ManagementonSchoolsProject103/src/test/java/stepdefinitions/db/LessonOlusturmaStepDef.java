package stepdefinitions.db;

import io.cucumber.java.en.Then;
import utilities.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class LessonOlusturmaStepDef {
    Statement statement;

    ResultSet resultSet;

    @Then("ViceDean rolu ile belirlenmis lesson, lesson tablosunda lesson_id ile bulunur")
    public void vice_dean_rolu_ile_belirlenmis_lesson_lesson_tablosunda_lesson_id_ile_bulunur() throws SQLException {
        statement= JDBCUtils.createStatement();
        resultSet=JDBCUtils.executeQuery("select * from lesson where lesson_id=3");
        resultSet.next();

    }
    @Then("lesson bilgileri dogrulanir")
    public void lesson_bilgileri_dogrulanir() throws SQLException {
    assertEquals("JAVA",resultSet.getString("lesson_name"));

    }
    @Then("ViceDean rolu ile belirlenmis Compulsary ve credit score, lesson tablosunda bulunur")
    public void vice_dean_rolu_ile_belirlenmis_compulsary_ve_credit_score_lesson_tablosunda_bulunur() throws SQLException {
        statement= JDBCUtils.createStatement();
        resultSet=JDBCUtils.executeQuery("select * from lesson where lesson_id=3");
        resultSet.next();
    }
    @Then("Compulsary ve credit score bilgileri dogrulanir")
    public void compulsary_ve_credit_score_bilgileri_dogrulanir() throws SQLException {
    assertEquals(false,resultSet.getBoolean("is_compulsory"));
    assertEquals(8,resultSet.getInt("credit_score"));

    }

}
