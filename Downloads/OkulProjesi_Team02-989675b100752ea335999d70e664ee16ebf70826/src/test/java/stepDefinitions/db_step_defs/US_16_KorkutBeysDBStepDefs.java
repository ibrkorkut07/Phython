package stepDefinitions.db_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static junit.framework.TestCase.assertEquals;

public class US_16_KorkutBeysDBStepDefs {
    String actDate;
    String actEmail;
    String actMessage;
    String actName;
    String actSubject;
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    ResultSet resultSet2;

    @Given("Connect to school database")
    public void connectToSchoolDatabase() throws SQLException {
        DBUtils.createConnection();
    }

    @And("Contact_message body contains dates {string}, emails {string}, messages {string}, names {string}, subjects {string}")
    public void contact_messageBodyContainsDatesEmailsMessagesNamesSubjects(String date, String email, String message, String name, String subject) throws SQLException {
        String query = "select * from public.contact_message;";
        resultSet = DBUtils.getStatement().executeQuery(query);
        resultSet.next();

        actDate = resultSet.getString("date");
        actEmail = resultSet.getString("email");
        actMessage = resultSet.getString("message");
        actName = resultSet.getString("name");
        actSubject = resultSet.getString("subject");

        assertEquals(date, actDate);
        assertEquals(email, actEmail);
        assertEquals(message, actMessage);
        assertEquals(name, actName);
        assertEquals(subject, actSubject);

        System.out.println("actDate = " + actDate);
        System.out.println("actName = " + actName);
        System.out.println("actEmail = " + actEmail);
        System.out.println("actMessage = " + actMessage);
        System.out.println("actSubject = " + actSubject);
    }

}


