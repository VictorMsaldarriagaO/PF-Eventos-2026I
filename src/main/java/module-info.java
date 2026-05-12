module com.example.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.proyectofinal to javafx.fxml;
    exports App;
    opens App to javafx.fxml;
}