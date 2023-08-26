module com.example.listaligada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listaligada to javafx.fxml;
    exports com.example.listaligada;
}