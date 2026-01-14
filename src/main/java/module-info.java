module com.gabas.workshopjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.gabas.workshopjavafx to javafx.fxml;
    exports com.gabas.workshopjavafx;
}