package co.edu.uniquindio.preparcial2.preparcial2.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrestamoUQViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClientes;

    @FXML
    private Button btnEmpleados;

    @FXML
    private Button btnObjetos;

    @FXML
    private Button btnPrestamos;

    @FXML
    void onBtnClientes(ActionEvent event) {

    }

    @FXML
    void onBtnEmpleados(ActionEvent event) {

    }

    @FXML
    void onBtnObjetos(ActionEvent event) {

    }

    @FXML
    void onBtnPrestamos(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnClientes != null : "fx:id=\"btnClientes\" was not injected: check your FXML file 'PrestamoUQView.fxml'.";
        assert btnEmpleados != null : "fx:id=\"btnEmpleados\" was not injected: check your FXML file 'PrestamoUQView.fxml'.";
        assert btnObjetos != null : "fx:id=\"btnObjetos\" was not injected: check your FXML file 'PrestamoUQView.fxml'.";
        assert btnPrestamos != null : "fx:id=\"btnPrestamos\" was not injected: check your FXML file 'PrestamoUQView.fxml'.";

    }

}
