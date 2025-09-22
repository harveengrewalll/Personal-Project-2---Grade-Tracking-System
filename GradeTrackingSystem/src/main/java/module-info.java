module projects.gradetrackingsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires mysql.connector.java;


    opens projects.gradetrackingsystem to javafx.fxml;
    exports projects.gradetrackingsystem;
}