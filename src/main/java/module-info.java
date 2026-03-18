module com.example.proyectoeventos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectoeventos to javafx.fxml;
    exports com.example.proyectoeventos;
    exports com.example.proyectoeventos.Controller;
    opens com.example.proyectoeventos.Controller to javafx.fxml;
    exports com.example.proyectoeventos.App;
    opens com.example.proyectoeventos.App to javafx.fxml;
}