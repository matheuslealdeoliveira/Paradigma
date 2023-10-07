module com.example.legravaarquivotxt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.legravaarquivotxt to javafx.fxml;
    exports com.example.legravaarquivotxt;
}