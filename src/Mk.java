import java.sql.*;
//using prepared statement for doing CRUD op on DB
// better to use than Statement interface
public class Mk {
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static  final String username="root";
    private static final String password="password";

    public static void main(String[] args) {
        try{
            Connection connection=DriverManager.getConnection(url,username,password);           // always necessary.
            String query="UPDATE  students SET marks = ?  WHERE id = ?";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setDouble(1,99.99);
            preparedStatement.setInt(2,1);
            int rowsAffected=preparedStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("updated successfully!!");
            }
            //Insertion//Updation and Deleting data
//          String query="INSERT INTO students
//            preparedStatement.setInt(1,1);
//            ResultSet rs=preparedStatement.executeQuery();          // do not insert query here in prepared statement.
//            while (rs.next()){
//                System.out.println("Marks" +rs.getDouble("marks"));
//            }
//
//            preparedStatement.setString(1,"Ankit");
//            preparedStatement.setInt(2,25);
//            preparedStatement.setDouble(3,75.66);
//
//            int rowsAffected=preparedStatement.executeUpdate();
//            if(rowsAffected>0){
//                System.out.println("Data inserted Successfully!");
//            }
//            else {
//                System.out.println("Please check !");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
