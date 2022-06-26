import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;

public class FindGrade extends Application {
    // statement for executing queries
    private Statement stmt;
    private TextField tfSSN = new TextField();
    private TextField tfCourseId = new TextField();
    private Label lblStatus = new Label();

    @Override // overide the start method in the Application class
    public void start(Stage primaryStage) {
        // initialize database connection and create a Statement object
        initializeDB();

        Button btShowGrade = new Button("Show Grade");
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("SSN"), tfSSN, new Label("Course ID"), tfCourseId, (btShowGrade));

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(hBox, lblStatus);

        tfSSN.setPrefColumnCount(6);
        tfCourseId.setPrefColumnCount(6);
        btShowGrade.setOnAction(e -> showGrade());

        //create a scene and place it in the stage
        Scene scene = new Scene(vBox, 420, 80);
        primaryStage.setTitle("FindGrade"); // set the stage title
        primaryStage.setScene(scene); // place the scene in the stage
        primaryStage.show(); // display the stage

    }

    private void initializeDB() {

        try {
            // load the JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");

            // establish a connection
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@liang.armstrong.edu:1521:orcl", "scott", "tiger");
            System.out.println("Database Connected");

            // create a statement
            stmt = connection.createStatement();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void showGrade() {
        String ssn = tfSSN.getText();
        String courseId = tfCourseId.getText();
        try {
            String queryString = "select firstName, mi, " +
            "lastName, title, grade from Student, Enrollment, Course " +
            "where Student.ssn = '" + ssn + "' and Enrollment.courseId " +
            "= '" + courseId + "' and Enrollment.courseId = Course.courseId " +
            " and Enrollment.ssn = Student.ssn";

            ResultSet rSet = stmt.executeQuery(queryString);

            if(rSet.next()) {
                String lastName = rSet.getString(1);
                String mi = rSet.getString(2);
                String firstName = rSet.getString(3);
                String title = rSet.getString(4);
                String grade = rSet.getString(5);

                // display result in a label
                lblStatus.setText(firstName + " " + mi + " " + lastName + "'s grade on course " + title + " is " + grade );
            }
            else {
                lblStatus.setText("Not Found");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
