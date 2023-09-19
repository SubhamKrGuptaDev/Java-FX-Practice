package com.example.practice_demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.practice_demo.constains.ApplicationConstains.ICON_PATH;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root, Color.SKYBLUE);
        Image icon = new Image(ICON_PATH);
        Text text = new Text();
        root.getChildren().add(text);

        text.setText("Hello Guys Good Morning");
        text.setFont(Font.font(30.0D));
        text.setX(100);
        text.setY(100);

        stage.getIcons().add(icon);
        stage.setScene(scene);

        stage.setResizable(false);

        stage.setWidth(1000);
        stage.setHeight(500);

        stage.setTitle("Demo JavaFx Program");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}