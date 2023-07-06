package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StudentInfoOlusturmaStepDefinition {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Database baglantisi kurulurUS17")
    public void databaseBaglantisiKurulurUS() {

        connection = JDBCUtils.connectToDataBase("164.92.252.42", "school_management", "select_user", "43w5ijfso");
    }

    @When("Teacher rolu ile olusturulmus student info note tablosunda Id ile bulunur US17")
    public void vice_dean_rolu_ile_olusturulmus_student_info_note_tablosunda_ıd_ile_bulunur_us17() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM student_info WHERE id = 863;";
        resultSet = statement.executeQuery(query);
        resultSet.next();
    }

    @Then("Student info note bilgileri dogrulanirUS17")
    public void studentInfoNoteBilgileriDogrulanirUS() throws SQLException {

        assertEquals(1, resultSet.getInt("Absentee"));
        assertEquals(863, resultSet.getInt("id"));
        assertEquals(2, resultSet.getInt("Education_Term_Id"));
        assertEquals(45, resultSet.getInt("Final_Exam"));
        assertEquals(67, resultSet.getInt("Midterm_Exam"));
        assertEquals(3, resultSet.getInt("Student_Id"));
        assertEquals("Her gun tekrarr yapmali", resultSet.getString("Info_Note"));
    }

}



