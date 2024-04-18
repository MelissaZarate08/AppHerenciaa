package com.melissazarate.demoejemplo.models;

public class Comida extends Producto {

    private String tipoComida;

    public Comida(String nombre, String precio, String tipo, String nombreCliente, String idVenta) {
        super(nombre, precio, tipo, nombreCliente, idVenta);
        this.tipoComida = tipoComida;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
}