package Model;

import java.time.LocalDateTime;

public class Evento {
    private String idEvento;
    private String nombre;
    private String descripcion;
    private String ciudad;
    private LocalDateTime fechaHora;
    private String estado; // Borrador, Publicado, Cancelado...
    private Recinto recinto;

    public Evento(String id, String nombre, String descripcion, Recinto recinto) {
        this.idEvento = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.recinto = recinto;
    }

    public String getIdEvento() {return idEvento;}
    public void setIdEvento(String idEvento) {this.idEvento = idEvento;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getCiudad() {return ciudad;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}

    public LocalDateTime getFechaHora() {return fechaHora;}
    public void setFechaHora(LocalDateTime fechaHora) {this.fechaHora = fechaHora;}

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public void setRecinto(Recinto recinto) {this.recinto = recinto;}
    public Recinto getRecinto() { return recinto; }

}