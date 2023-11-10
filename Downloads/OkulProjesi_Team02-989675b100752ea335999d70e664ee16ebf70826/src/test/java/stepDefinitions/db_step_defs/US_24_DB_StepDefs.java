package stepDefinitions.db_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static junit.framework.TestCase.assertEquals;

public class US_24_DB_StepDefs {

    String actDate;
    String actEmail;
    String actMessage;
    String actName;
    String actSubject;
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    ResultSet resultSet2;
    String actDescription;
    String actStartTime;
    String actStopTime;
    ResultSet actResultSet;
    ResultSet updatedResultSet;
    String updatedDate;
    String updatedDescription;
    String updatedStartTime;
    String updatedStopTime;
    String actBirth_day;
    String actBirth_place;
    String actGender;
    String actPhone_number;
    String actSsn;
    String actSurname;
    String actUsername;
    String expName;
    String expBirth_day;
    String expBirth_place;
    String expGender;
    String expPhone_number;
    String expSsn;
    String expSurname;
    String expUsername;
    String actId;
    String actPassword;

    @And("Admin crea teacher with birth_day {string}, birth_place {string}, gender {string}, name {string}, password {string}, phone_number {string}, ssn {string}, surname {string}, username {string}, email {string}")
    public void adminCreaTeacherWithBirth_dayBirth_placeGenderNamePasswordPhone_numberSsnSurnameUsernameEmail(String birth_day, String birth_place, String gender, String name, String password, String phone_number, String ssn, String surname, String username, String email) throws SQLException {

        String actQuery = "INSERT INTO teacher VALUES(" + birth_day + "," + birth_place + "," + gender + "," + name + "," + password + "," + phone_number + "," + ssn + "," + surname + "," + username + "," + email + ");";
        resultSet = DBUtils.getStatement().executeQuery(actQuery);
        resultSet.next();

        actBirth_day = resultSet.getString("birth_day");
        actBirth_place = resultSet.getString("birth_place");
        actGender = resultSet.getString("gender");
        actName = resultSet.getString("name");
        actPassword = resultSet.getString("password");
        actPhone_number = resultSet.getString("phone_number");
        actSsn = resultSet.getString("ssn");
        actSurname = resultSet.getString("surname");
        actUsername = resultSet.getString("username");
        actEmail = resultSet.getString("email");
    }

    @Then("The Body contains birth_day {string}, birth_place {string}, gender {string}, name {string}, password {string}, phone_number {string}, ssn {string}, surname {string}, username {string}, email {string}")
    public void theBodyContainsBirth_dayBirth_placeGenderNamePasswordPhone_numberSsnSurnameUsernameEmail(String birth_day, String birth_place, String gender, String name, String password, String phone_number, String ssn, String surname, String username, String email) throws SQLException {

        // resultSet.next();
//        String expid = resultSet.getString("id");
//        String actBirthDay = resultSet.getString("birth_day");
//        String actBirthPlace = resultSet.getString("birth_place");
//        String actGender = resultSet.getString("gender");
//        String actName = resultSet.getString("name");
//        String actPassword = resultSet.getString("password");
//        String actPhoneNumber = resultSet.getString("phone_number");
//        String actSsn = resultSet.getString("ssn");
//        String actSurname = resultSet.getString("surname");
//        String actUsername = resultSet.getString("username");
//        String actEmail = resultSet.getString("email");

        // Assert.assertEquals(id, actId);
        Assert.assertEquals(birth_day, actBirth_day);
        Assert.assertEquals(birth_place, actBirth_place);
        Assert.assertEquals(gender, actGender);
        Assert.assertEquals(name,actName);
        assertEquals(password, actPassword);
        Assert.assertEquals(phone_number,actPhone_number);
        Assert.assertEquals(ssn,actSsn);
        Assert.assertEquals(surname,actSurname);
        Assert.assertEquals(username,actUsername);
        Assert.assertEquals(email,actEmail);
    }
}