package de.leuphana.swa.crs.view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CrsApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {

            Button button = new Button("Click me");
            TextField field = new TextField();
            field.setPrefWidth(200);
            field.setAlignment(Pos.BASELINE_CENTER);
            FlowPane root = new FlowPane();
            root.setAlignment(Pos.CENTER);
            root.setHgap(10);
            root.getChildren().addAll(button, field);

            Scene scene = new Scene(root, 300, 300);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Dummy App");


            primaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
