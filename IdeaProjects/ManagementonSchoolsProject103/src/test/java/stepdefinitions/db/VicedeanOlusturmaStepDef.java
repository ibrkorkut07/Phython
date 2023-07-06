package stepdefinitions.db;

import io.cucumber.java.en.Then;
import utilities.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;


public class VicedeanOlusturmaStepDef {
    Statement statement;
    ResultSet resultSet;


    @Then("Dean rolu ile belirlenmis Vicedean Vicedean tablosunda id ile bulunur")
    public void deanRoluIleBelirlenmisVicedeanVicedeanTablosundaIdIleBulunur() throws SQLException {
        statement= JDBCUtils.createStatement();
        resultSet=JDBCUtils.executeQuery("select * from vice_dean where id=844");
        resultSet.next();
        System.out.println("resultSet.getString(\"name\") = " + resultSet.getString("name"));
    }
    @Then("Vicedean bilgileri dogrulanir")
    public void vicedean_bilgileri_dogrulanir() throws SQLException {
        assertEquals("1986-08-16", resultSet.getString("birth_day"));
        assertEquals("Bayerstad", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Clyde", resultSet.getString("name"));
        assertEquals("241-163-5539", resultSet.getString("phone_number"));
        assertEquals("891-80-4384", resultSet.getString("ssn"));
        assertEquals("Gorczany", resultSet.getString("surname"));
        assertEquals("trinh.marks", resultSet.getString("username"));
        assertEquals("3", resultSet.getString("user_role_id"));

    }

    @Then("Admin rolu ile belirlenmis Vicedean Vicedean tablosunda id ile bulunur")
    public void admin_rolu_ile_belirlenmis_vicedean_vicedean_tablosunda_id_ile_bulunur() throws SQLException {
        statement= JDBCUtils.createStatement();
        resultSet=JDBCUtils.executeQuery("select * from vice_dean where id=844;");
        resultSet.next();
    }
}
