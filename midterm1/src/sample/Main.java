//Question 2
//Abdullah Riaz Raja
//100693348
//I couldn't output result to Result field so instead I outputted to the terminal

package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Question_3");

        //Window layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Number Fields
        Label num1 = new Label("Number 1");
        grid.add(num1, 0, 1);
        TextField num1Field = new TextField();
        grid.add(num1Field, 1, 1);

        Label num2 = new Label("Number 2");
        grid.add(num2, 2, 1);
        TextField num2Field = new TextField();
        grid.add(num2Field, 3, 1);

        Label result = new Label("Result");
        grid.add(result, 4, 1);
        TextField resultField = new TextField();
        grid.add(resultField, 5, 1);

        //Buttons
        Button addButton = new Button("Add");
        grid.add(addButton, 0, 2);
        addButton.setOnAction( e -> {
            int number1 = Integer.parseInt(num1Field.getText());
            int number2 = Integer.parseInt(num2Field.getText());
            int r = number1 + number2;
            System.out.println(String.valueOf(r));
        });

        Button subtractButton = new Button("Subtract");
        grid.add(subtractButton, 1, 2);
        subtractButton.setOnAction( e -> {
            int number1 = Integer.parseInt(num1Field.getText());
            int number2 = Integer.parseInt(num2Field.getText());
            int r = number1 - number2;
            System.out.println(String.valueOf(r));
        });

        Button multButton = new Button("Multiply");
        grid.add(multButton, 2, 2);
        multButton.setOnAction( e -> {
            int number1 = Integer.parseInt(num1Field.getText());
            int number2 = Integer.parseInt(num2Field.getText());
            int r = number1 * number2;
            System.out.println(String.valueOf(r));
        });

        Button divButton = new Button("Divide");
        grid.add(divButton, 3, 2);
        divButton.setOnAction( e -> {
            int number1 = Integer.parseInt(num1Field.getText());
            int number2 = Integer.parseInt(num2Field.getText());
            int r = number1 / number2;
            System.out.println(String.valueOf(r));
        });

        //Window size
        Scene scene = new Scene(grid, 700, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

