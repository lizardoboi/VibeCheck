package com.example.vibecheck;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class VibeCheck extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("VibeCheck_view.fxml"));
        Image icon = new Image(getClass().getResourceAsStream("kek.png"));
        stage.getIcons().add(icon);
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("vibe_check!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

