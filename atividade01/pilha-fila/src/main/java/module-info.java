module com.example.pilhafila {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pilhafila to javafx.fxml;
    exports com.example.pilhafila;
}