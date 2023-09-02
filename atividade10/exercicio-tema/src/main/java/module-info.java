module com.example.exerciciotema {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciotema to javafx.fxml;
    exports com.example.exerciciotema;
}