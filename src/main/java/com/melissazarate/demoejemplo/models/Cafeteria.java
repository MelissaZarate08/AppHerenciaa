package com.melissazarate.demoejemplo.models;

import java.util.ArrayList;

public class Cafeteria {
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public boolean addProducto(Producto producto) {
        return listaProductos.add(producto);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
