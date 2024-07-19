package com.example.practical_10a;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import java.util.*;

public class P10_1 extends Application 
{
    protected TextField textField = new TextField();
    protected TextArea textArea = new TextArea();
    protected LinkedList<Integer> list = new LinkedList<>();

    @Override
    public void start(Stage primaryStage) 
    { 
        Button btSort = new Button("Sort"); Button btShuffle = new Button("Shuffle");
        Button btReverse = new Button("Reverse");

        HBox paneForTextField = new HBox(10); 
        paneForTextField.getChildren().addAll(new Label("Enter a number:"), textField); 
        paneForTextField.setAlignment(Pos.CENTER);

        HBox paneForButtons = new HBox(5); 
        paneForButtons.getChildren().addAll( btSort, btShuffle, btReverse);
        paneForButtons.setAlignment(Pos.CENTER); textArea.setEditable(false); 
        textArea.setWrapText(true);
        BorderPane pane = new BorderPane(); 
        pane.setTop(paneForTextField); 
        pane.setCenter(textArea); 
        pane.setBottom(paneForButtons);
        
        textField.setOnAction(e -> add() 
        {
            // add and integer btSort.setOnAction(e -> 
            Collections.sort(list); displayText();
        });

        btShuffle.setOnAction(e->
        {
            Collections.shuffle(list);
            displayText();
        });
        
        btReverse.setOnAction(e->
        {
            Collections.sort(list, Collections.reverseOrder());
            displayText();
        });

        Scene scene = new Scene(pane, 400,150);
        primaryStage.setTitle("practical_10a");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void add() 
    {
        list.addLast(Integer.parseInt(textField.getText())); displayText();
    }

    private void displayText() 
    {
        String output = "";
        for (Integer e: list) output += e + " ";
        textArea.setText(output); 
        textField.setText("");
    }
}
