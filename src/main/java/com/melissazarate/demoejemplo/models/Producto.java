package com.melissazarate.demoejemplo.models;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Producto {
    private SimpleStringProperty idVenta;
    private SimpleStringProperty nombre;
    private SimpleDoubleProperty precio;
    private SimpleStringProperty tipo;
    private SimpleStringProperty nombreCliente;
    private SimpleDoubleProperty totalVenta;

    public Producto(String idVenta, String nombre, double precio, String tipo, String nombreCliente, double totalVenta) {
        this.idVenta = new SimpleStringProperty(idVenta);
        this.nombre = new SimpleStringProperty(nombre);
        this.precio = new SimpleDoubleProperty(precio);
        this.tipo = new SimpleStringProperty(tipo);
        this.nombreCliente = new SimpleStringProperty(nombreCliente);
        this.totalVenta = new SimpleDoubleProperty(totalVenta);
    }

    public Producto(String nombre, double precio, String tipo, String nombreCliente) {
    }

    public String getIdVenta() {
        return idVenta.get();
    }

    public SimpleStringProperty idVentaProperty() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta.set(idVenta);
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

    public double getPrecio() {
        return precio.get();
    }

    public SimpleDoubleProperty precioProperty() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio.set(precio);
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

    public double getTotalVenta() {
        return totalVenta.get();
    }

    public SimpleDoubleProperty totalVentaProperty() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta.set(totalVenta);
    }
}
