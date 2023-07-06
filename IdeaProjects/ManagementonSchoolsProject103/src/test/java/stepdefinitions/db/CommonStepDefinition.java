package stepdefinitions.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.JDBCUtils;

import java.sql.Connection;

public class CommonStepDefinition {

    Connection connection;

    @Given("Database baglantisi kurulur")
    public void database_baglantisi_kurulur() {
        connection = JDBCUtils.connectToDataBase("164.92.252.42", "school_management", "select_user", "43w5ijfso");
    }

    @Then("Database baglantisi kesilir")
    public void databaseBaglantisiKesilir() {
        JDBCUtils.closeConnectionAndStatement();
    }

}
