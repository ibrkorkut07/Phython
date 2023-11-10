package stepDefinitions.db_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

public class US16_DB_StepDefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    ResultSet resultSet2;

    @Given("connect to school database")
    public void connectToSchoolDatabase() throws SQLException {

        //Create connection
        connection =  DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user","43w5ijfso");
        //Create Statement
        statement = connection.createStatement();
    }

    @Then("Send get contact_message request")
    public void send_get_contact_message_request() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Contact_message body should exist")
    public void contact_message_body_should_exist() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Send get message request")
    public void send_get_message_request() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Contact_message body should contain messages")
    public void contact_message_body_should_contain_messages() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("connect to school databasem")
    public void connectToSchoolDatabasem() throws SQLException {

        //Create connection
        connection =  DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user","43w5ijfso");
        //Create Statement
        statement = connection.createStatement();
    }
}
