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

public class MeetOlusturabilmeStepDefinition {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("Database baglantisi kurulurUS_{int}")
    public void database_baglantisi_kurulur_us(Integer int1) {
        connection = JDBCUtils.connectToDataBase("164.92.252.42", "school_management", "select_user", "43w5ijfso");
    }
    @When("Teacher rolu ile olusturulmus meet tablosunda Id ile bulunur US19")
    public void teacher_rolu_ile_olusturulmus_meet_tablosunda_ıd_ile_bulunur_us19() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM meet WHERE id = 2;";
        resultSet = statement.executeQuery(query);
        resultSet.next();
    }
    @Then("Meet bilgileri dogrulanir US19")
    public void meet_bilgileri_dogrulanir_us19() throws SQLException {
        assertEquals("2024-01-11", resultSet.getString("date"));
        assertEquals(2, resultSet.getInt("id"));
        assertEquals("Veli Toplantisi", resultSet.getString("description"));
        assertEquals("12:00:00", resultSet.getString("start_Time"));
        assertEquals("13:00:00", resultSet.getString("stop_Time"));


    }

}


