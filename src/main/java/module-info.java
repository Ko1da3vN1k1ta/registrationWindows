module com.example.loginpanel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginpanel to javafx.fxml;
    exports com.example.loginpanel;
}