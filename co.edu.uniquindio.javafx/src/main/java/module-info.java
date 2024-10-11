module co.edu.uniquindio.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.javafx to javafx.fxml;
    exports co.edu.uniquindio.javafx;
}