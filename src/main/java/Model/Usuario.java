package Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private List<String> metodosPago;

    public Usuario(String id, String nombre, String correo, String tel) {
        super(id, nombre, correo, tel);
        this.metodosPago = new ArrayList<>();
    }

    public java.util.List<String> getMetodosPago() { return metodosPago; }
    public void setMetodosPago(java.util.List<String> metodosPago) { this.metodosPago = metodosPago; }
}
