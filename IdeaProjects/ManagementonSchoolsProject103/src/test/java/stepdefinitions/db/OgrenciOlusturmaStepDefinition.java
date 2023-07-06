package stepdefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class OgrenciOlusturmaStepDefinition {

    Statement statement;
    ResultSet resultSet;

    @When("Vice Dean rolu ile olusturulmus ogrenci student tablosunda username ile bulunur US15")
    public void deanRoluIleOlusturulmusOgrenciStudentTablosundaIleBulunurUS() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM student WHERE username = ellis.marvin;";
        resultSet = JDBCUtils.executeQuery(query);
        resultSet.next();
    }

    @Then("Ogrencinin bilgileri dogrulanir US15")
    public void ogrencininBilgileriDogrulanirUS() throws SQLException {
        assertEquals("2004-11-06", resultSet.getString("birth_day"));
        assertEquals("Feilbury", resultSet.getString("birth_place"));
        assertEquals("stnt@stnt.com", resultSet.getString("email"));
        assertEquals("Marty", resultSet.getString("father_name"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Lauren", resultSet.getString("mother_name"));
        assertEquals("Edwin", resultSet.getString("name"));
        assertEquals("782-608-5533", resultSet.getString("phone_number"));
        assertEquals("234-12-5679", resultSet.getString("ssn"));
        assertEquals("Kemmer", resultSet.getString("surname"));
    }

}
