module com.example.listacircular {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listacircular to javafx.fxml;
    exports com.example.listacircular;
}