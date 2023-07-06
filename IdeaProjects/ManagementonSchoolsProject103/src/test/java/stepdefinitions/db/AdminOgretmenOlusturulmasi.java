package stepdefinitions.db;

import io.cucumber.java.en.*;
import utilities.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class AdminOgretmenOlusturulmasi {

    Statement statement;
    ResultSet resultSet;

    @When("Admin rolu ile olusturulmus ogretmen teacher tablosunda id ile bulunur US24")
    public void admin_rolu_ile_olusturulmus_ogretmen_teacher_tablosunda_id_ile_bulunur_us24() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM teacher WHERE id=1657;";
        resultSet = JDBCUtils.executeQuery(query);
        resultSet.next();

    }
    @Then("Ogretmenin bilgileri dogrulanir US24")
    public void ogretmenin_bilgileri_dogrulanir_us24() throws SQLException {

        assertEquals("1989-01-13", resultSet.getString("birth_day"));
        assertEquals("Wolfbury", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Merry", resultSet.getString("name"));
        assertEquals("900-699-4364", resultSet.getString("phone_number"));
        assertEquals("077-76-7083", resultSet.getString("ssn"));
        assertEquals("Schultz", resultSet.getString("surname"));
        assertEquals("kali.wiegand", resultSet.getString("username"));
        assertEquals("Mable@gmail.com", resultSet.getString("email"));



    }
}