module com.eduard034.polimorfismo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.eduard034.polimorfismo to javafx.fxml;
    exports com.eduard034.polimorfismo;
    exports com.eduard034.polimorfismo.controls;
    opens com.eduard034.polimorfismo.controls to javafx.fxml;
}