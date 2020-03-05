package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        int height = 600;
        int length = 300;
        Canvas canvas = new Canvas(length, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(2.0);

        int freq[] = {7, 4, 50};
        for (int i = 0; i < 3; i++) {
            int barH = freq[i]*10;
            gc.strokeRect(10+i*30, height-barH, 25, barH);
        }

        Pane pane = new Pane();
        pane.getChildren().add(canvas);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Drawing Basic Shapes on a Canvas");
        primaryStage.show();
    }
}
