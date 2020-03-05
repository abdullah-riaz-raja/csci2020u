package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question2  extends Application {

    int height = 500;
    int length = 800;

    int[] getFrequency(Scanner text) {
        int[] freq = new int[26];
        while (text.hasNext()){
            String line = text.nextLine();
            //System.out.println(line);

            int num = 0;
            for (int i = 0; i < line.length(); i++) {
                num = (int) (line.charAt(i));
                if ((num > 64) && (num < 91)) {
                    freq[line.charAt(i) - 'A']++;
                } else if ((num > 96) && (num < 123)) {
                    freq[line.charAt(i) - 'a']++;
                }
            }
        }
        return freq;
    }

    Canvas createHistogram(int[] freq) {
        Canvas canvas = new Canvas(length, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(1.5);
        for (int i = 0; i < 26; i++) {
            int barH = freq[i]*10;
            gc.strokeRect(10+i*30, height-barH-50, 25, barH);
        }

        for (int i = 0; i < 26; i++) {
            char letter = (char) ('A' + i);
            gc.fillText(String.valueOf(letter), 20+i*30, height-30);
        }
        return canvas;
    }

//    void display() {
//
//    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        VBox vbox = new VBox();
        HBox hbox = new HBox();

        //Displaying Histogram
        Canvas empty = new Canvas(length, height);

        //Controls
        Label fileName = new Label("   Filename");
        fileName.setPrefWidth(70);
        TextField pathField = new TextField();
        pathField.setPrefWidth(700);
        Button view = new Button("View");
        view.setOnAction( e -> {
            String path = (pathField.getText());

            //Selecting a file
            File srcFile = new File(path);

            //Checks if the selected file exists
            if(!srcFile.exists()){
                System.out.println("Selected file does not exist");
                System.exit(2);
            }

            //read file
            Scanner input = null;
            try {
                input = new Scanner(srcFile);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }

            int freq[] = getFrequency(input);
            //input.close();

            System.out.println(path);
            Canvas histogram = createHistogram(freq);
            hbox.getChildren().clear();
            vbox.getChildren().clear();
            hbox.getChildren().addAll(fileName, pathField, view);
            vbox.getChildren().addAll(histogram, hbox);
//            Scene s = new Scene(vbox);
//            primaryStage.setScene(s);
//            primaryStage.setTitle("Question 4");
//            primaryStage.show();
        });

        //Displaying everything to the user
        hbox.getChildren().addAll(fileName, pathField, view);
        vbox.getChildren().addAll(empty, hbox);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Question 4");
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
