package stepdefinitions.db;

import java.sql.*;

public class DB {

    public void databaseTest() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");

        Statement statement = connection.createStatement();

        String query = "";

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {

            System.out.println(resultSet.getString(0));

            System.out.println(resultSet.getString(""));

        }

        resultSet.next();

    }

}
