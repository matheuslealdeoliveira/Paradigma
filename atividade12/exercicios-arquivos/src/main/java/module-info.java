module com.example.exerciciosarquivos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciosarquivos to javafx.fxml;
    exports com.example.exerciciosarquivos;
}