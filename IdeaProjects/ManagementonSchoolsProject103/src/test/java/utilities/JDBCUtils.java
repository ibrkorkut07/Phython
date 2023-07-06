package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtils {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void closeConnectionAndStatement() {
        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            if (connection.isClosed() && statement.isClosed()) {
                System.out.println("Connection and statement closed!");

            } else {
                System.out.println("Connection and statement NOT closed!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection connectToDataBase(String hostName, String dbName, String username, String password) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://" + hostName + ":5432/" + dbName, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (connection != null) {
            System.out.println("Connection Success");
        } else {
            System.out.println("Connection Fail");
        }
        return connection;
    }

    public static Statement createStatement() {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }

    public static void createTable(String tableName, String... columnName_dataType) {
        StringBuilder columnName_dataValue = new StringBuilder("");
        for (String w : columnName_dataType) {
            columnName_dataValue.append(w).append(",");
        }
        columnName_dataValue.deleteCharAt(columnName_dataValue.length() - 1);
        try {
            statement.execute("CREATE TABLE " + tableName + "(" + columnName_dataValue + ")");
            System.out.println("Table " + tableName + " successfully created!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean execute(String sql) {
        boolean isExecute;
        try {
            isExecute = statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return isExecute;
    }

    public static ResultSet executeQuery(String query) {
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultSet;
    }

    public static int executeUpdate(String query) {
        int guncellenenSatirSayisi;
        try {
            guncellenenSatirSayisi = statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return guncellenenSatirSayisi;
    }

    public static List<Object> getColumnList(String columnName, String tableName) {
        List<Object> columnData = new ArrayList<>();
        String query = "SELECT " + columnName + " FROM " + tableName;
        executeQuery(query);
        try {
            while (resultSet.next()) {
                columnData.add(resultSet.getObject(columnName));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return columnData;
    }

    public static void insertDataIntoTable(String tableName, String... columnName_Value) {
        StringBuilder columnNames = new StringBuilder("");
        StringBuilder values = new StringBuilder("");
        for (String w : columnName_Value) {
            columnNames.append(w.split(" ")[0]).append(",");
            values.append(w.split(" ")[1]).append(",");
        }
        columnNames.deleteCharAt(columnNames.lastIndexOf(","));
        values.deleteCharAt(values.lastIndexOf(","));
        String query = "INSERT INTO " + tableName + "(" + columnNames + ") VALUES(" + values + ")";
        execute(query);
        System.out.println("Data " + tableName + " tablosuna girildi.");
    }

}
