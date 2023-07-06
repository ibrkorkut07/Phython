package stepdefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.JDBCUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class GuestUserListStepDefinition {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @When("Guest User id bilgisi ile cagrilir")
    public void guest_user_id_bilgisi_ile_cagrilir() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = JDBCUtils.createStatement();
        resultSet = statement.executeQuery("select * from guest_user where id=594");
        resultSet.next();
        System.out.println(resultSet);
    }
    @Then("Guest User'in bilgileri dogrulanir")
    public void guest_user_in_bilgileri_dogrulanir() throws SQLException {
        assertEquals("1996-01-01", resultSet.getString("birth_day"));
        assertEquals("Kingston", resultSet.getString("birth_place"));
        assertEquals("MALE", resultSet.getString("gender"));
        assertEquals("Synthia", resultSet.getString("name"));
        assertEquals("119-877-6916", resultSet.getString("phone_number"));
        assertEquals("550-86-3816", resultSet.getString("ssn"));
        assertEquals("Parisian", resultSet.getString("surname"));
        assertEquals("jolyn.brekke", resultSet.getString("username"));
    }
}
