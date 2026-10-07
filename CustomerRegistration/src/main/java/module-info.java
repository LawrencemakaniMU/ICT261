module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    exports customermanager;


    opens customermanager to javafx.fxml;
}
