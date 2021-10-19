package com.company;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
        // write your code here
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button okButton1 = new Button("ok1");
        Button okButton2 = new Button("ok2");
        Button okButton3 = new Button("ok3");
        Button okButton4 = new Button("ok4");
        Rectangle rectangle = new Rectangle(100, 80);
        okButton1.setOnMouseClicked(event -> {
            rectangle.setHeight(rectangle.getHeight()-10);
            rectangle.setWidth(rectangle.getWidth()-10);
        });
        okButton2.setOnMouseClicked(event -> {
            rectangle.setHeight(rectangle.getHeight()+10);
            rectangle.setWidth(rectangle.getWidth()+10);
        });
        okButton3.setOnMouseClicked(event -> {
            rectangle.setFill(Color.PURPLE);
        });
        okButton4.setOnMouseClicked(event -> {
            rectangle.setFill(Color.PINK);
        });

        VBox hBox = new VBox(10, rectangle, okButton1, okButton2,okButton3,okButton4);
        hBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(hBox, 450, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
