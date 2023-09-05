module com.example.matheuslealac1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.matheuslealac1 to javafx.fxml;
    exports com.example.matheuslealac1;
}