package com.melissazarate.demoejemplo.controllers;

import com.melissazarate.demoejemplo.models.Producto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class VentasController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Producto, String> IdColumn;

    @FXML
    private TableColumn<Producto, String> NombreClienteColumn;

    @FXML
    private TableColumn<Producto, String> ProductoColumn;

    @FXML
    private TableView<Producto> TablaVentasView;

    @FXML
    private TableColumn<Producto, String> TipoColumn;

    @FXML
    private TableColumn<Producto, String> TotalColumn;

    @FXML
    private Label labelQuestion;

    private static ObservableList<Producto> observableListaProductos = FXCollections.observableArrayList();

    public static void actualizarListaProductos(List<Producto> listaProductos) {
        observableListaProductos.clear();
        observableListaProductos.addAll(listaProductos);
    }

    @FXML
    void initialize() {
        NombreClienteColumn.setCellValueFactory(cellData -> cellData.getValue().nombreClienteProperty());
        ProductoColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        TipoColumn.setCellValueFactory(cellData -> cellData.getValue().tipoProperty());
        TotalColumn.setCellValueFactory(cellData -> new SimpleStringProperty(Double.toString(cellData.getValue().getPrecio())));

        TablaVentasView.setItems(observableListaProductos);
    }
}
