package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.JDBCUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class MesajOlusturmaStepDefinition {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String email = "johndoe@gmail.com";


    @Given("Database baglantisi kurulur US")
    public void databaseBaglantisiKurulurUS() throws SQLException {
        connection = JDBCUtils.connectToDataBase("164.92.252.42", "school_management", "select_user", "43w5ijfso");
       // connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
       // statement = connection.createStatement();
    }

    @When("email bilgisi ile mesaj alinir")
    public void emailBilgisiIleMesajAlinir() throws SQLException {

        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM contact_message WHERE email = '"+email+"';";
        resultSet = statement.executeQuery(query);
        resultSet.next();
    }

    @Then("Mesaj bilgileri dogrulanir: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void mesajBilgileriDogrulanirNameEmailSubjectMessageDate(String name, String email, String subject, String message, String date) throws SQLException {

        assertEquals(resultSet.getString("name"),name);
        assertEquals(resultSet.getString("email"),email);
        assertEquals(resultSet.getString("subject"),subject);
        assertEquals(resultSet.getString("message"),message);
        assertEquals(resultSet.getString("date"),date);
    }


}
