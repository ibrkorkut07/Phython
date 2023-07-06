package stepdefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class AddTeacherStepDefinition {

    Statement statement;
    ResultSet resultSet;

    @When("Vice Dean rolu ile olusturulmus ogretmen teacher tablosunda id ile bulunur US13")
    public void vice_dean_rolu_ile_olusturulmus_ogretmen_teacher_tablosunda_id_ile_bulunur_us13() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM teacher WHERE id=35;";
        resultSet = JDBCUtils.executeQuery(query);
        resultSet.next();
    }

    @Then("Ogretmenin bilgileri dogrulanir US13")
    public void ogretmenin_bilgileri_dogrulanir_us13() throws SQLException {

        assertEquals("1889-11-01", resultSet.getString("birth_day"));
        assertEquals("Bursa", resultSet.getString("birth_place"));
        assertEquals("FEMALE", resultSet.getString("gender"));
        assertEquals("Senem", resultSet.getString("name"));
        assertEquals("448-646-0258", resultSet.getString("phone_number"));
        assertEquals("614-05-7813", resultSet.getString("ssn"));
        assertEquals("Ozcetnn", resultSet.getString("surname"));
        assertEquals("SenemOzcetinn", resultSet.getString("username"));
        assertEquals("sizmir@gmail.com", resultSet.getString("email"));

    }

}
