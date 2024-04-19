package com.melissazarate.demoejemplo.models;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Producto {
    private SimpleStringProperty nombre;
    private SimpleStringProperty tipo;
    private SimpleStringProperty nombreCliente;
    private SimpleDoubleProperty totalVenta;

    public Producto( String nombre, String tipo, String nombreCliente, double precio) {
        this.nombre = new SimpleStringProperty(nombre);
        this.tipo = new SimpleStringProperty(tipo);
        this.nombreCliente = new SimpleStringProperty(nombreCliente);
        this.totalVenta = new SimpleDoubleProperty(precio);
    }


    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }


    public String getTipo() {
        return tipo.get();
    }

    public SimpleStringProperty tipoProperty() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo.set(tipo);
    }

    public String getNombreCliente() {
        return nombreCliente.get();
    }

    public SimpleStringProperty nombreClienteProperty() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente.set(nombreCliente);
    }

    public double getPrecio() {
        return precioProperty().get();
    }

    public SimpleDoubleProperty precioProperty() {
        return totalVenta;
    }

    public void setPrecio(double totalVenta) {
        this.totalVenta.set(totalVenta);
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() +
                ",Tipo: " + tipo +
                ", Nombre del Cliente: " + getNombreCliente() +
                ", Total Venta: " + getPrecio();
    }
}
