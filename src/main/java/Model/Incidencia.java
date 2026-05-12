package Model;

import java.time.LocalDateTime;

public class Incidencia {
    private String idIncidencia;
    private String tipo;
    private String descripcion;
    private LocalDateTime fecha;
    private String entidadAfectada;

    public Incidencia(String id, String tipo, String descripcion, String entidad) {
        this.idIncidencia = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = LocalDateTime.now();
        this.entidadAfectada = entidad;
    }

    public String getIdIncidencia() {return idIncidencia;}
    public void setIdIncidencia(String idIncidencia) {this.idIncidencia = idIncidencia;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public LocalDateTime getFecha() {return fecha;}
    public void setFecha(LocalDateTime fecha) {this.fecha = fecha;}

    public String getEntidadAfectada() {return entidadAfectada;}
    public void setEntidadAfectada(String entidadAfectada) {this.entidadAfectada = entidadAfectada;}
}