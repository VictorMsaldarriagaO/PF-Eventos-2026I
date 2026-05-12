package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String idCompra;
    private Usuario usuario;
    private Evento evento;
    private LocalDateTime fechaCreacion;
    private double total;
    private String estadoCompra; // Creada, Pagada, Confirmada...
    private List<Entrada> entradas;

    public Compra(String id, Usuario usuario, Evento evento) {
        this.idCompra = id;
        this.usuario = usuario;
        this.evento = evento;
        this.fechaCreacion = LocalDateTime.now();
        this.entradas = new ArrayList<>();
    }

    public String getIdCompra() {return idCompra;}
    public void setIdCompra(String idCompra) {this.idCompra = idCompra;}

    public Usuario getUsuario() {return usuario;}
    public void setUsuario(Usuario usuario) {this.usuario = usuario;}

    public Evento getEvento() {return evento;}
    public void setEvento(Evento evento) {this.evento = evento;}

    public LocalDateTime getFechaCreacion() {return fechaCreacion;}
    public void setFechaCreacion(LocalDateTime fechaCreacion) {this.fechaCreacion = fechaCreacion;}

    public double getTotal() {return total;}
    public void setTotal(double total) {this.total = total;}

    public String getEstadoCompra() {return estadoCompra;}
    public void setEstadoCompra(String estadoCompra) {this.estadoCompra = estadoCompra;}

    public List<Entrada> getEntradas() {return entradas;}
    public void setEntradas(List<Entrada> entradas) {this.entradas = entradas;}
}