module com.example.herkansing {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.herkansing to javafx.fxml;
    exports com.example.herkansing;
    exports Model;
    opens Model to javafx.fxml;
}