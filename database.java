import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class database {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306"; // MySQL server URL
        String user = "root"; // Your MySQL username
        String password = ""; // Your MySQL password

        // Database and table names
        String databaseName = "mydb";
        String tableName = "mytable";

        try {
            // Establish a connection to the MySQL server
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a database
            String createDatabaseQuery = "CREATE DATABASE IF NOT EXISTS " + databaseName;
            Statement createDbStatement = connection.createStatement();
            createDbStatement.executeUpdate(createDatabaseQuery);
            createDbStatement.close();

            // Switch to the created database
            connection.setCatalog(databaseName);

            // Create a table
            Statement createTableStatement = connection.createStatement();
            String createTableQuery = "CREATE TABLE IF NOT EXISTS " + tableName + " (id INT AUTO_INCREMENT, name VARCHAR(50), PRIMARY KEY (id))";
            createTableStatement.executeUpdate(createTableQuery);
            createTableStatement.close();

            // Prompt user for the number of names to insert
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of names you want to insert: ");
            int numberOfNames = scanner.nextInt();

            // Insert data into the table
            Statement insertStatement = connection.createStatement();

            for (int i = 0; i < numberOfNames; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                String name = scanner.next();
                String insertQuery = "INSERT INTO " + tableName + " (name) VALUES ('" + name + "')";
                insertStatement.executeUpdate(insertQuery);
            }

            insertStatement.close();
            scanner.close();

            // Fetch and display data from the table
            Statement selectStatement = connection.createStatement();
           String selectQuery = "SELECT * FROM " + tableName + " LIMIT 3";
            ResultSet resultSet = selectStatement.executeQuery(selectQuery);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close resources
            resultSet.close();
            selectStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}