package stepDefinitions.db_step_defs;

import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

public class US_20_DBStepDefs {
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

    @Then("Get Student Meeting date {string}, description {string}, start_time {string}, stop_time {string} via advisor_teacher_id {string}")
    public void getStudentMeetingDateDescriptionStart_timeStop_timeViaAdvisor_teacher_id(String date, String description, String start_time, String stop_time, String advisor_teacher_id) throws SQLException {
        String query = "select * from public.meet\n" +
                "where advisor_teacher_id = " + advisor_teacher_id + ";";
        resultSet = DBUtils.getStatement().executeQuery(query);
        resultSet.next();

        actDate = resultSet.getString("date");
        actDescription = resultSet.getString("description");
        actStartTime = resultSet.getString("start_time");
        actStopTime = resultSet.getString("stop_time");

        assertEquals(date, actDate);
        assertEquals(description, actDescription);
        assertEquals(start_time, actStartTime);
        assertEquals(stop_time, actStopTime);

        System.out.println("advisor_teacher_id = " + advisor_teacher_id);
        System.out.println("actDate = " + actDate);
        System.out.println("actName = " + actDescription);
        System.out.println("actEmail = " + actStartTime);
        System.out.println("actMessage = " + actStopTime);

    }

    @Then("Get Student Meeting date, description, start_time, stop_time according to advisor_teacher_id {string}")
    public void getStudentMeetingDateDescriptionStart_timeStop_timeAccordingToAdvisor_teacher_id(String advisor_teacher_id) throws SQLException {
        String query = "select * from public.meet\n" +
                "where advisor_teacher_id = " + advisor_teacher_id + ";";
        resultSet = DBUtils.getStatement().executeQuery(query);
        resultSet.next();

        actDate = resultSet.getString("date");
        actDescription = resultSet.getString("description");
        actStartTime = resultSet.getString("start_time");
        actStopTime = resultSet.getString("stop_time");

        assertFalse(actDate.isEmpty());
        assertFalse(actDescription.isEmpty());
        assertFalse(actStartTime.isEmpty());
        assertFalse(actStopTime.isEmpty());

        System.out.println("advisor_teacher_id = " + advisor_teacher_id);
        System.out.println("actDate = " + actDate);
        System.out.println("actName = " + actDescription);
        System.out.println("actEmail = " + actStartTime);
        System.out.println("actMessage = " + actStopTime);
        System.out.println(" ***** ");
    }

    @Then("Update Student Meeting date {string}, description {string}, start_time {string}, stop_time {string} via advisor_teacher_id {string}")
    public void updateStudentMeetingDateDescriptionStart_timeStop_timeViaAdvisor_teacher_id(String date, String description, String start_time, String stop_time, String advisor_teacher_id) throws SQLException {
        String actDataQuery = "select * from public.meet;";
        actResultSet = DBUtils.getStatement().executeQuery(actDataQuery);
        actResultSet.next();

        actDate = actResultSet.getString("date");
        actDescription = actResultSet.getString("description");
        actStartTime = actResultSet.getString("start_time");
        actStopTime = actResultSet.getString("stop_time");
        // System.out.println("actDate = " + actDate);

        // Update the values in the meet table according to the advisor_teacher_id
        String updateQuery = "update public.meet set date = '" + date + "', \n" +
                "description = '" + description + "', \n" +
                "start_time = '" + start_time + "', \n" +
                "stop_time = '" + stop_time + "' \n" +
                "where advisor_teacher_id = " + advisor_teacher_id + ";";
        updatedResultSet = DBUtils.getStatement().executeQuery(updateQuery);
        updatedResultSet.next();

        updatedDate = updatedResultSet.getString("date");
        updatedDescription = updatedResultSet.getString("description");
        updatedStartTime = updatedResultSet.getString("start_time");
        updatedStopTime = updatedResultSet.getString("stop_time");

        assertEquals(actDate, updatedDate);
        assertEquals(actDescription, updatedDescription);
        assertEquals(actStartTime, updatedStartTime);
        assertEquals(actStopTime, updatedStopTime);
    // update public.meet set date = '2024-02-22', description = 'grades', start_time = '09:00:00', stop_time = '10:00:00' where advisor_teacher_id = 1261;
    }

    @Then("Delete Student Meeting date via advisor_teacher_id {string}")
    public void deleteStudentMeetingDateViaAdvisor_teacher_id(String advisor_teacher_id) throws SQLException {
        String query = "select * from public.meet\n" +
                "where advisor_teacher_id = " + advisor_teacher_id + ";";
        resultSet = DBUtils.getStatement().executeQuery(query);
        resultSet.next();

        String deleteQuery = "delete * from public.meet\n" +
                "where advisor_teacher_id = " + advisor_teacher_id + ";";
        resultSet = DBUtils.getStatement().executeQuery(query);
        resultSet.next();
        System.out.println("actDate = " + actDate);
        System.out.println("actDescription = " + actDescription);
        System.out.println("actStartTime = " + actStartTime);
        System.out.println("actStopTime = " + actStopTime);

        assertEquals("Date cannot be deleted ", actDate, null);
        assertEquals("Description cannot be deleted ", actDescription, null);
        assertEquals("StartTime cannot be deleted ", actStartTime, null);
        assertEquals("StopTime cannot be deleted ", actStopTime, null);

    }
}


