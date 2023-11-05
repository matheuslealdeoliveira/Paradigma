module com.example.exerciciofilaprioridade {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciofilaprioridade to javafx.fxml;
    exports com.example.exerciciofilaprioridade;
}