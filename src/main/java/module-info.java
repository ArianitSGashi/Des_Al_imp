module com.example.des_al_imp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.des_al_imp to javafx.fxml;
    opens application to javafx.fxml;
    exports com.example.des_al_imp;
    exports application to javafx.graphics;
}