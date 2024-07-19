package com.example.practical_11_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private static final double WIDTH = 400;
    private static final double HEIGHT = 400;
    private static final double LIMIT_HEIGHT = (HEIGHT / 2);
    private static double[] percent = new double[] { 0.20, 0.10, 0.30, 0.40 };
    private static String[] titles = new String[] {
            "project -- 20%",
            "quizzes -- 10%",
            "midterm -- 30%",
            "final -- 40%"
    };
    private static Color[] colors = new Color[] { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE };

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 10, 0, 100));
        Rectangle[] bars = new Rectangle[4];
        for (int i = 0; i < 4; i++) {
            bars[i] = new Rectangle(
                    5 + (100 * i), // x
                    LIMIT_HEIGHT - (HEIGHT * percent[i]), // y WIDTH / bars.length - 5, // width
                    HEIGHT * percent[i]); // height bars[i].setFill(colors[i]);
            Text text = new Text(5 + (100 * i), LIMIT_HEIGHT - (HEIGHT * percent[i]) - 5, titles[i]);
            pane.getChildren().addAll(text, bars[i]);

        }

        primaryStage.setScene(new Scene(pane, WIDTH + 25, LIMIT_HEIGHT));
        primaryStage.setTitle("practical_11_2");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
