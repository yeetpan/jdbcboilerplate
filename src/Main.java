import java.sql.*;
//This class uses Statement Interface for executing queries.
// do not import everything always.
// use .env files always.
public class Main {
    // boiler-plate for JDBC.
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";          //example:usage
    private static String password = "password";            //example:usage

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Retrieving the records
            String query = "SELECT * FROM students";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double marks = rs.getDouble("marks");
                System.out.println(id);
                System.out.println(name);
                System.out.println(age);
                System.out.println(marks);
            }

            // Inserting data
            query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %f)", "Rahul", 23, 74.22);
            int rowsAffected = statement.executeUpdate(query);
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Data not inserted!!");
            }

            // Updating data
            query = String.format("UPDATE students SET marks = %f WHERE id = %d", 89.5, 2);
            rowsAffected = statement.executeUpdate(query);
            if (rowsAffected > 0) {
                System.out.println("Data updated successfully!");
            } else {
                System.out.println("Data not updated!!");
            }

            // Deleting data
            query = String.format("DELETE FROM students WHERE id = %d", 2);
            rowsAffected = statement.executeUpdate(query);
            if (rowsAffected > 0) {
                System.out.println("Deleted successfully!!");
            } else {
                System.out.println("Data not deleted!!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
