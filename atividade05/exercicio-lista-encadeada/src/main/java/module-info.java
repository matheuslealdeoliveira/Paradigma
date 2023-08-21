module com.example.exerciciolistaencadeada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciolistaencadeada to javafx.fxml;
    exports com.example.exerciciolistaencadeada;
}