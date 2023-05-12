module com.example.des_al_imp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.des_al_imp to javafx.fxml;
    exports com.example.des_al_imp;
}