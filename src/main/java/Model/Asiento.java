package Model;

public class Asiento {
    private String idAsiento;
    private String fila;
    private int numero;
    private String estado; // Disponible, Reservado, Vendido, Bloqueado

    public Asiento(String id, String fila, int numero) {
        this.idAsiento = id;
        this.fila = fila;
        this.numero = numero;
        this.estado = "Disponible";
    }

    public String getIdAsiento() {return idAsiento;}
    public void setIdAsiento(String idAsiento) {this.idAsiento = idAsiento;}

    public String getFila() {return fila;}
    public void setFila(String fila) {this.fila = fila;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

}