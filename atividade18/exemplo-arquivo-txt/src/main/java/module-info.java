module com.example.exemploarquivotxt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exemploarquivotxt to javafx.fxml;
    exports com.example.exemploarquivotxt;
}