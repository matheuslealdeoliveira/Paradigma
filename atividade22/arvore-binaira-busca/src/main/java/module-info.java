module com.example.arvorebinairabusca {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arvorebinairabusca to javafx.fxml;
    exports com.example.arvorebinairabusca;
}