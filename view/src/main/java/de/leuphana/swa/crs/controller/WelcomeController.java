package de.leuphana.swa.crs.controller;

import de.leuphana.swa.crs.view.CrsApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import lombok.Data;

import java.io.IOException;
import java.util.Locale;

@Data
public class WelcomeController {

    @FXML
    private Button createButton, loginButton, showCarsButton;

    @FXML
    private ComboBox<String> chooseLanguage;

    // TODO --
    public void handleLanguage() {
        chooseLanguage.setOnAction(event -> {
            if (chooseLanguage.getSelectionModel().getSelectedItem().equals("English")) {
                CrsApp.setLocale(Locale.ENGLISH);
            } else {
                CrsApp.setLocale(Locale.GERMAN);
            }
            try {
                CrsApp.setRoot("/fxml/welcome");
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }

    @FXML
    public void login() {

    }

    @FXML
    public void createAccount() {

    }

    @FXML
    public void showCars() {

    }
}
