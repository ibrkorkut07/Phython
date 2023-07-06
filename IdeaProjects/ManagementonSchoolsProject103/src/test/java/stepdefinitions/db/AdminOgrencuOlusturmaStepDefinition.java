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

public class AdminOgrencuOlusturmaStepDefinition {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Database baglantisi kurulur US25")
    public void database_baglantisi_kurulur() {
        connection = JDBCUtils.connectToDataBase("164.92.252.42", "school_management", "select_user", "43w5ijfso");
    }


    @When("Admin rolu ile olusturulmus ogrenci student tablosunda username ile bulunur US{int}")
    public void adminRoluIleOlusturulmusOgrenciStudentTablosundaUsernameIleBulunurUS(int arg0) throws SQLException, SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM student WHERE id = 400;";
        resultSet = JDBCUtils.executeQuery(query);
        resultSet.next();
    }

    @Then("Ogrencinin bilgileri dogrulanir US25")
    public void ogrencininBilgileriDogrulanirUS() throws SQLException {
        assertEquals("2010-02-02", resultSet.getString("birth_day"));
        assertEquals("efsane", resultSet.getString("birth_place"));
        assertEquals("efsanee@gmail.com", resultSet.getString("email"));
        assertEquals("Jim", resultSet.getString("father_name"));
        assertEquals("Kemal", resultSet.getString("mother_name"));
        assertEquals("Esin", resultSet.getString("name"));
        assertEquals("$2a$10$Ro1.b.TmLFu.sbfU7lHncuEZ12.dHfSe4L6PghL1xeiPQJrfennYC", resultSet.getString("password"));
        assertEquals("312-696-9087", resultSet.getString("phone_number"));
        assertEquals("235-87-2130", resultSet.getString("ssn"));
        assertEquals("yalcin", resultSet.getString("surname"));
        assertEquals("Adam", resultSet.getString("username"));


    }
}