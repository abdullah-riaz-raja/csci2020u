package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    TableView<StudentRecord> table;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("Lab05 Solutions");

        //Columns
        //Student ID Column
        TableColumn<StudentRecord, String> idColumn = new TableColumn<>("SID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        //Assignments Column
        TableColumn<StudentRecord, Float> assignmentColumn = new TableColumn<>("Assignments");
        assignmentColumn.setCellValueFactory(new PropertyValueFactory<>("assignments"));

        //Midterm Column
        TableColumn<StudentRecord, Float> midColumn = new TableColumn<>("Midterm");
        midColumn.setCellValueFactory(new PropertyValueFactory<>("midterm"));

        //Final Exam Column
        TableColumn<StudentRecord, Float> fExamColumn = new TableColumn<>("Final Exam");
        fExamColumn.setCellValueFactory(new PropertyValueFactory<>("exam"));

        //Final Mark Column
        TableColumn<StudentRecord, Float> fMarkColumn = new TableColumn<>("Final Mark");
        fMarkColumn.setCellValueFactory(new PropertyValueFactory<>("mark"));

        //Letter Grade Column
        TableColumn<StudentRecord, Float> lGradeColumn = new TableColumn<>("Letter Grade");
        lGradeColumn.setCellValueFactory(new PropertyValueFactory<>("grade"));

        table = new TableView<>();
        table.setItems(getAllMarks());
        table.getColumns().addAll(idColumn, assignmentColumn, midColumn, fExamColumn, lGradeColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    public static ObservableList<StudentRecord> getAllMarks() {
        ObservableList<StudentRecord> marks = FXCollections.observableArrayList();
        //Student ID, Assignments, Midterm, Final exam
        marks.add(new StudentRecord("100100100", 75.0f, 68.0f, 54.25f));
        marks.add(new StudentRecord("100100101", 70.0f, 69.25f, 51.5f));
        marks.add(new StudentRecord("100100102", 100.0f, 97.0f, 92.5f));
        marks.add(new StudentRecord("100100103", 90.0f, 88.5f, 68.75f));
        marks.add(new StudentRecord("100100104", 72.25f, 74.75f, 58.25f));
        marks.add(new StudentRecord("100100105", 85.0f, 56.0f, 62.5f));
        marks.add(new StudentRecord("100100106", 70.0f, 66.5f, 61.75f));
        marks.add(new StudentRecord("100100107", 55.0f, 47.0f, 50.5f));
        marks.add(new StudentRecord("100100108", 40.0f, 32.5f, 27.75f));
        marks.add(new StudentRecord("100100109", 82.5f, 77.0f, 74.25f));

        return marks;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
