module com.example.pilhaefilaencadeada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pilhaefilaencadeada to javafx.fxml;
    exports com.example.pilhaefilaencadeada;
}