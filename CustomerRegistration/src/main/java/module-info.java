module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    exports customermanager;

    // FXMLLoader needs reflective access to the controllers (@FXML fields and methods)
    opens customermanager to javafx.fxml;
}
