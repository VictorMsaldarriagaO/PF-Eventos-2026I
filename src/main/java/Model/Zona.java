package Model;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String idZona;
    private String nombre;
    private int capacidad;
    private double precioBase;
    private List<Asiento> asientos;

    public Zona(String id, String nombre, int capacidad, double precioBase) {
        this.idZona = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precioBase = precioBase;
        this.asientos = new ArrayList<>();
    }

    public String getIdZona() { return idZona;}

    public void setIdZona(String idZona) { this.idZona = idZona;}

    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precio) { this.precioBase = precio; }

    public List<Asiento> getAsientos() { return asientos; }
    public void setAsientos(List<Asiento> asientos) { this.asientos = asientos; }

    }