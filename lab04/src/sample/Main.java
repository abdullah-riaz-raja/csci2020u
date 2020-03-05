package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");

        //Window layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Form (Text Fields)
        //User Name Field
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        //Password Field
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        PasswordField pwField = new PasswordField();
        grid.add(pwField, 1, 2);

        //Full Name Field
        Label fullName = new Label("Full Name:");
        grid.add(fullName, 0, 3);
        TextField fullTextField = new TextField();
        grid.add(fullTextField, 1, 3);

        //Email Field
        Label email = new Label("E-mail:");
        grid.add(email, 0, 4);
        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 4);

        //Phone # Field
        Label phoneNum = new Label("Phone #:");
        grid.add(phoneNum, 0, 5);
        TextField phoneTextField = new TextField();
        grid.add(phoneTextField, 1, 5);

        //Date of Birth Field
        Label birthDate = new Label("Date of Birth:");
        grid.add(birthDate, 0, 6);
        DatePicker birthDateField = new DatePicker();
        grid.add(birthDateField, 1, 6);

        //Register Button
        Button registerButton = new Button("Register");
        grid.add(registerButton, 0, 7);
        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String username = userTextField.getText();
                String password = pwField.getText();
                String fullName = emailTextField.getText();
                String email = emailTextField.getText();
                System.out.printf("Username: %s \n", username);
                System.out.printf("Password: %s \n", password);
                System.out.printf("Full Name: %s \n", fullName);
                System.out.printf("E-mail: %s \n", email);
            }
        });

        //Window size
        Scene scene = new Scene(grid, 310, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
