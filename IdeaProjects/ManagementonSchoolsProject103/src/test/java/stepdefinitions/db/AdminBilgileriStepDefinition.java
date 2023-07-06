package stepdefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.JDBCUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class AdminBilgileriStepDefinition {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @When("Admin, id bilgisi ile cagrilir US22")
    public void admin_id_bilgisi_ile_cagrilir_us22() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = JDBCUtils.createStatement();
        resultSet = statement.executeQuery("select * from admins where id=293");
        resultSet.next();
    }
    @Then("Adminin bilgileri dogrulanir US22")
    public void adminin_bilgileri_dogrulanir_us22() throws SQLException {
        assertEquals("2001-01-01", resultSet.getString("birth_day"));
        assertEquals("Ankara", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Stephon", resultSet.getString("name"));
        assertEquals("917-174-2806", resultSet.getString("phone_number"));
        assertEquals("636-38-4179", resultSet.getString("ssn"));
        assertEquals("Veum", resultSet.getString("surname"));
        assertEquals("JaneKozey", resultSet.getString("username"));
    }

}
