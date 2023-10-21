module com.example.arvorebinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arvorebinaria to javafx.fxml;
    exports com.example.arvorebinaria;
}