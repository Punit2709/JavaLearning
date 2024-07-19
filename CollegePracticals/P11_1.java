package com.example.practical_11_1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(30, 0, 30, 0));
        for (int i = 0; i < 5; i++) {
            Text text = new Text("Java");
            text.setFont(Font.font("Times Roman", FontWeight.BOLD,
                    FontPosture.ITALIC, 22));
            text.setRotate(90);
            text.setFill(Color.color(Math.random(), Math.random(),
                    Math.random(), Math.random()));
            hbox.getChildren().add(text);
        }
        Scene scene = new Scene(hbox);
        stage.setScene(scene);
        stage.setTitle("practical_11_1");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
