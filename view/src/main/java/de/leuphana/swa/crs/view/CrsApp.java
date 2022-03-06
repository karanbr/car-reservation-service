package de.leuphana.swa.crs.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Getter;

import java.io.IOException;
import java.util.ResourceBundle;

@Getter
public class CrsApp extends Application {
    private static Scene scene;

    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("/fxml/welcome"), 640, 800);
        stage.setScene(scene);
        stage.setTitle("Car Reservation Service");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CrsApp.class.getResource(fxml + ".fxml"));
        ResourceBundle bundle = ResourceBundle.getBundle("/properties/ViewResources");
        fxmlLoader.setResources(bundle);
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}

