package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.JDBCUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class DeanOlusturmaStepDefinition {
    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("Dean username bilgisi ile cagrilir")
    public void dean_bilgisi_ile_cagrilir( ) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = JDBCUtils.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM dean WHERE id = 537");
        resultSet.next();
        System.out.println(resultSet);
    }

    @Then("Dean'in bilgileri dogrulanir")
    public void deaninBilgileriDogrulanir( ) throws SQLException {
        assertEquals("2000-10-10", resultSet.getString("birth_day"));
        assertEquals("ADANA", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Lera", resultSet.getString("name"));
        assertEquals("234-756-2536", resultSet.getString("phone_number"));
        assertEquals("234-76-2536", resultSet.getString("ssn"));
        assertEquals("Batz", resultSet.getString("surname"));
        assertEquals("Presley75", resultSet.getString("username"));


    }
}
