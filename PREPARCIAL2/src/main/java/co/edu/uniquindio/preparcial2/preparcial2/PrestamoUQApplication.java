package co.edu.uniquindio.preparcial2.preparcial2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrestamoUQApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PrestamoUQ.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 586, 323);
        stage.setScene(scene);
        stage.setTitle("Prestamo UQ");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
