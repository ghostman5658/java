
import java.net.URL;
import java.sql.*;

public class CreateTable2{

  Connection con;

  Statement stmt;

  public CreateTable2(){

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/databasedb?";

      con = DriverManager.getConnection(url + "user=student1&password=pass");

      stmt = con.createStatement();
    }
    catch(Exception e){

      System.out.println("Error connection to database.");
      System.exit(0);
    }

    try{

      stmt.executeUpdate("DROP TABLE fans");
      System.out.println("Table address Dropped");
    }
    catch(SQLException e){

      System.out.println("Table address does not exist");
    }

    try{

      stmt.executeUpdate("CREATE TABLE fans(ID int PRIMARY KEY,FIRSTNAME varchar(25)," +
                         "LASTNAME varchar(25), FAVORITETEAM varchar(25))");
      System.out.println("Table address Created");
    }
    catch(SQLException e){

      System.out.println("Table address Creation failed");
    }

    try{

      stmt.close();

      con.close();
      System.out.println("Database connections closed");
    }
    catch(SQLException e){

      System.out.println("Connection close failed");
    }
  }

  public static void main(String args[]) {

    CreateTable2 createTable = new CreateTable2();
  }
}