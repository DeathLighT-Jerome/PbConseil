module com.example.pbconseil {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.pbconseil to javafx.fxml;
    exports com.example.pbconseil;
}