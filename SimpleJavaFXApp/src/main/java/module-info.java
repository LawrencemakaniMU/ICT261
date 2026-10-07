module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.hellofx;
    opens studentregistration to javafx.fxml;
    opens customermanager to javafx.fxml;
}
