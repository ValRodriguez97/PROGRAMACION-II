module co.edu.uniquindio.preparciali.preparcialii {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens co.edu.uniquindio.preparciali.preparcialii to javafx.fxml;
    exports co.edu.uniquindio.preparciali.preparcialii;
    exports co.edu.uniquindio.preparciali.preparcialii.viewcontroller;
    opens co.edu.uniquindio.preparciali.preparcialii.viewcontroller to javafx.fxml;
}