package com.melissazarate.demoejemplo.models;

public class Comida extends Producto {

    private String calorias;

    public Comida(String nombre, String tipo, String nombreCliente, String calorias, double precio) {
        super( nombre, tipo, nombreCliente, precio);
        this.calorias = calorias;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
                ",Tipo: " + getTipo() +
                ", Nombre del Cliente: " + getNombreCliente() +
                ", Total Venta: " + getPrecio() +
                "Calorias: " + calorias;
    }
}
