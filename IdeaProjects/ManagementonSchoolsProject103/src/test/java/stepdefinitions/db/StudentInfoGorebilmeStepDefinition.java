package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertFalse;

public class StudentInfoGorebilmeStepDefinition {

    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("Database baglantisi kurulur US18")
    public void database_baglantisi_kurulur_us18() {
        connection = JDBCUtils.connectToDataBase("164.92.252.42", "school_management", "select_user", "43w5ijfso");
    }

    @When("Teacher rolu ile olusturulmus student info note tablosundan Id ile sorgu yapar US18")
    public void teacher_rolu_ile_olusturulmus_student_info_note_tablosundan_ıd_ile_sorgu_yapar_us18() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM student_info WHERE id = 863;";
        resultSet = JDBCUtils.executeQuery(query);
        resultSet.next();
    }
    @Given("Id {string} ile sorgu yap")
    public void idIleSorguYap(String arg0) throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM student_info WHERE id = 663;";
        resultSet = statement.executeQuery(query);
        resultSet.next();

    }

    @Then("gelen data bos olmali")
    public void gelen_data_bos_olmali() throws SQLException {
        assertFalse(resultSet.next());

    }


}

