module com.example.proyectoeventos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectoeventos to javafx.fxml;
    exports com.example.proyectoeventos;
}