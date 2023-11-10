package stepDefinitions.db_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.net.ConnectException;
import java.sql.*;

public class US22_db_stepdefs {
    Connection connection;
    ResultSet resultSet;
    Statement statement;
    @Given("Database baglantisi kurulurRA")
    public void databaseBaglantisiKurulurRA() throws SQLException {
         connection= DriverManager.getConnection("jdbc:postgresql://managementonscgools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("Kayitli Admin hesap bilgisini almak icin Qery gonderilirRA")
    public void kayitliAdminHesapBilgisiniAlmakIcinQeryGonderilirRA() throws SQLException {
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select* from admins where username='RamazanB2'");

    }

    @Then("Kayitli Admin bilgisi dogrulanir")
    public void kayitliAdminBilgisiDogrulanir() throws SQLException {
        resultSet.next();
        /*
        Assert.assertEquals(object.getBrithday(),resultSet.getString("birth_day"));
        Assert.assertEquals(object.getBirthPlace(),resultSet.getString("birth_place"));
        Assert.assertEquals(0,resultSet.getInt("gender"));
        Assert.assertEquals(object.getName(),resultSet.getString("name"));
        Assert.assertEquals(object.getPhoneNumber(),resultSet.getString("phone_pumber"));
        Assert.assertEquals(object.getSsn(),resultSet.getString("ssn"));
        Assert.assertEquals(object.getSurname(),resultSet.getString("surname"));
        Assert.assertEquals(object.getUsername(),resultSet.getString("username"));
        */

    }

    @And("DAtabase baglantisi kesilirRA")
    public void databaseBaglantisiKesilirRA() throws SQLException {
        statement.close();
        connection.close();
    }
}