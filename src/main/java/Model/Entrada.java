package Model;

public class Entrada {
    private String idEntrada;
    private Zona zona;
    private Asiento asiento;
    private double precioFinal;
    private String estado; // Activa, Usada, Anulada

    public Entrada(String id, Zona zona, Asiento asiento, double precio) {
        this.idEntrada = id;
        this.zona = zona;
        this.asiento = asiento;
        this.precioFinal = precio;
        this.estado = "Activa";
    }

    public String getIdEntrada() {return idEntrada;}
    public void setIdEntrada(String idEntrada) {this.idEntrada = idEntrada;}

    public Zona getZona() {return zona;}
    public void setZona(Zona zona) {this.zona = zona;}

    public Asiento getAsiento() {return asiento;}
    public void setAsiento(Asiento asiento) {this.asiento = asiento;}

    public double getPrecioFinal() {return precioFinal;}
    public void setPrecioFinal(double precioFinal) {this.precioFinal = precioFinal;}

    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
}

