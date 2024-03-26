package com.example.vibecheck;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class VibeCheckController {

    private final String[] texts = {"Вайб кайфовы", "Вайб атстойны"};
    private final Random random = new Random();

    @FXML
    private Label vibeLabel;

    @FXML
    private Button vibeCheckButton;

    @FXML
    private void initialize() {
        vibeCheckButton.setOnAction(event -> generateVibe());
    }

    @FXML
    private void generateVibe() {
        int index = random.nextInt(texts.length);
        vibeLabel.setText(texts[index]);
    }
}