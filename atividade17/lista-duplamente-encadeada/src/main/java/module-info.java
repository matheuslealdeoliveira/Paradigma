module com.example.listaduplamenteencadeada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listaduplamenteencadeada to javafx.fxml;
    exports com.example.listaduplamenteencadeada;
}