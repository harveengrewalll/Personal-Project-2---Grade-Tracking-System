package projects.gradetrackingsystem;

import com.mysql.cj.xdevapi.Table;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.sound.midi.Track;

public class TrackerController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> courseColumn;
    @FXML
    private TableColumn<Student, Double> gradeColumn;
    @FXML
    private TableColumn<Student, Integer> creditColumn;


    @FXML
    private TextField nameField;
    @FXML
    private TextField courseField;
    @FXML
    private TextField gradeField;
    @FXML
    private TextField creditField;
}