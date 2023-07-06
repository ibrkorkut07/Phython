package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MeetListGorebilmeStepDefinition {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("Database baglantisi kurulur US_{int}")
    public void database_baglantisi_kurulur_us(Integer int1) {
        connection = JDBCUtils.connectToDataBase("164.92.252.42", "school_management", "select_user", "43w5ijfso");
    }

    @When("Teacher rolu ile olusturulmus meet tablosundan Id ile sorgu yapar US_{int}")
    public void teacher_rolu_ile_olusturulmus_meet_tablosundan_ıd_ile_sorgu_yapar_us(Integer int1) throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM meet WHERE id = 2;";
        resultSet = statement.executeQuery(query);
        resultSet.next();
    }
    //
    @Then("Meet bilgileri dogrulanir US_20")
    public void meet_bilgileri_dogrulanir_us() throws SQLException {
        statement = JDBCUtils.createStatement();
        String query = "SELECT * FROM meet WHERE id = 602;";
        resultSet = statement.executeQuery(query);
        resultSet.next();
    }


    @Then("Gelen datanin bos oldugu dogrulanir US_20")
    public void gelenDataninBosOlduguDogrulanirUS_() throws SQLException {
        Assert.assertFalse(false);
    }
}


