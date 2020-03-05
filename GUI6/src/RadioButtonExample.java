import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonExample extends Application{


    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Episode 10 - Toggle and Radio Buttons");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox();

        Label label = new Label("Pick a color: ");

        ToggleButton button1 = new ToggleButton("Blue");
        ToggleButton button2 = new ToggleButton("Pink");
        ToggleButton button3 = new ToggleButton("Purple");
        ToggleGroup buttonGroup = new ToggleGroup();
        button1.setToggleGroup(buttonGroup);
        button2.setToggleGroup(buttonGroup);
        button3.setToggleGroup(buttonGroup);
        button2.setSelected(true); //default selection

//        button1.setOnAction(e -> {
//            System.out.println("YEEET");
//        });

        //Radio Buttons
        RadioButton r1 = new RadioButton("I am a Radio");
        r1.setToggleGroup(buttonGroup);
        RadioButton r2 = new RadioButton("I a32141");
        r2.setToggleGroup(buttonGroup);

        root.getChildren().addAll(label, button1, button2, button3, r1, r2);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
