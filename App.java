/*
Kye Gotzman 5/7/2022 Module 10.2 Program
Write a program that views and updates fan information stored in database titled "databasedb", user ID titled “student1” with a password “pass”.
The table name is to be “fans” with the fields of ID (integer, PRIMARY KEY), firstname (varchar(25)), lastname (varchar(25)), and favoriteteam (varchar(25)).
Your interface is to have 2 buttons to display and update records.
The display button will display the record with the provided ID in the display (ID user provides).
The update button will update the record in the database with the changes made in the display.
Your application is not to create or delete the table.
To work on this using your home database, you can make the table and populate it.
When the application is tested, the table will already be created and populated.
Write test code that ensures all methods and the interface functions correctly.
 
Liang, D. 2020. Introduction to Java 
Programming and Data Structures Comprehensive Version. 
Pearson Education, Inc. Hoboken, NJ.
*/

import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;

public class App extends Application {
    // statement for executing queries
    private Statement stmt;
    private Connection con;
    private TextField fName = new TextField(); 
    private TextField lName = new TextField();
    private TextField fTeam = new TextField();
    private TextField userIdIn = new TextField();
    private TextField userIdOut = new TextField();
    private Label userResult = new Label(); 

    @Override // overide the start method in the Application class
    public void start(Stage primaryStage) {
        // initialize database connection and create a Statement object
        initializeDB();

        // create a button and hbox for adding data to the database
        Button addData = new Button("Add Data");
        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Label("User ID"), userIdIn, new Label("First Name"), fName, new Label("Last Name"), lName, new Label("Favorite Team"), fTeam,(addData));

        // create a button and hbox for displaying user records from the database
        Button displayData = new Button("Display Data");
        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(new Label("Enter User ID"), userIdOut, (displayData));


        // create two buttons to connect and disconnect from the database
        Button connect = new Button("Connect to DB");
        Button disconnect = new Button("Disconnect from DB");
        HBox hBox3 = new HBox();
        hBox3.getChildren().addAll(connect, disconnect);


        // add the hboxes to the vbox
        VBox vBox = new VBox();
        vBox.getChildren().addAll(hBox,hBox2, hBox3, userResult);
        vBox.setSpacing(20);
        vBox.setStyle("-fx-padding: 16;");

        // add and event listener for when the buttons are clicked
        addData.setOnAction(e -> addData());
        displayData.setOnAction(e -> displayData());
        connect.setOnAction(e -> initializeDB());
        disconnect.setOnAction(e -> disconnectDB());

        //create a scene and place it in the stage
        Scene scene = new Scene(vBox, 1600, 1600);
        primaryStage.setTitle("Favorite Team Database"); // set the stage title
        primaryStage.setScene(scene); // place the scene in the stage
        primaryStage.show(); // display the stage
    }

    private void initializeDB() {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
      
            String url = "jdbc:mysql://localhost:3306/databasedb?";
      
            con = DriverManager.getConnection(url + "user=student1&password=pass");

            stmt = con.createStatement();

            System.out.println("Connection Successful");

          }
          catch(Exception e){
      
            System.out.println("Error connection to database.");
            System.exit(0);
          }
    }

    private void disconnectDB() {
        try{

            stmt.close();
      
            con.close();
            System.out.println("Database connections closed");
          }
          catch(SQLException e){
      
            System.out.println("Connection close failed");
          }
    }
    
    private void addData() {
        String fn = fName.getText();
        String ln = lName.getText();
        String ft = fTeam.getText();
        String id = userIdIn.getText();
        try {
             stmt.executeUpdate("INSERT INTO fans (ID, FIRSTNAME, LASTNAME, FAVORITETEAM) VALUES('"+id+"', '"+fn+"','"+ln+"', '"+ft+"')");
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void displayData() {
        String id = userIdOut.getText();
        
        try {
            String queryString = "select FIRSTNAME, LASTNAME, " +
            "FAVORITETEAM from fans where fans.ID = '" + id + "'";

            ResultSet rSet = stmt.executeQuery(queryString);

            if(rSet.next()) {
                String firstName = rSet.getString(1);
                String lastName = rSet.getString(2);
                String favoriteTeam = rSet.getString(3);

                // display result in a label
                userResult.setText(firstName + " " + lastName + "'s favorite team is " + favoriteTeam);
            }
            else {
                userResult.setText("Not Found");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}