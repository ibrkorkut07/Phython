package stepdefinitions.db;

import io.cucumber.java.en.*;
import utilities.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class RegisterStepDefinition {

    Statement statement;
    ResultSet resultSet;

    @When("aday ogrenci student tablosunda username ile bulunur US21")
    public void aday_ogrenci_student_tablosunda_username_ile_bulunur_us21() throws SQLException {
        statement = JDBCUtils.createStatement();
        resultSet= JDBCUtils.executeQuery("select * from guest_user where id=583");
        resultSet.next();
        System.out.println("resultSet.getString(\"name\") = " + resultSet.getString("name"));
    }
    @Then("Ogrencinin bilgileri dogrulanir US01_TC01")
    public void ogrencinin_bilgileri_dogrulanir_us01_tc01() throws SQLException {
        assertEquals("1995-06-01", resultSet.getString("birth_day"));
        assertEquals("East Darylmouth", resultSet.getString("birth_place"));
        assertEquals("freddy.medhurst",resultSet.getString("username"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Francis", resultSet.getString("name"));
        assertEquals("245-116-3497", resultSet.getString("phone_number"));
        assertEquals("739-14-5835", resultSet.getString("ssn"));
        assertEquals("Ziemann", resultSet.getString("surname"));
    }
}
