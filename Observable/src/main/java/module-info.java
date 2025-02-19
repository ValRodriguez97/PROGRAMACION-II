module co.edu.uniquindio.observable {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.observable to javafx.fxml;
    exports co.edu.uniquindio.observable;
    exports co.edu.uniquindio.observable.model;
    opens co.edu.uniquindio.observable.model to javafx.fxml;
}