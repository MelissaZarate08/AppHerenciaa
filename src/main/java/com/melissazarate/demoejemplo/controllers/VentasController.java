package com.melissazarate.demoejemplo.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.melissazarate.demoejemplo.models.Administracion;
import com.melissazarate.demoejemplo.models.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    private TableView<Administracion> TablaVentasView;

    @FXML
    private TableColumn<Producto, String> TipoColumn;

    @FXML
    private TableColumn<Producto, String> TotalColumn;

    @FXML
    private Label labelQuestion;

    @FXML
    void initialize() {
        IdColumn.setCellValueFactory(cellData -> cellData.getValue().idVentaProperty());
        NombreClienteColumn.setCellValueFactory(cellData -> cellData.getValue().nombreClienteProperty());
        ProductoColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        TipoColumn.setCellValueFactory(cellData -> cellData.getValue().tipoProperty());
        TotalColumn.setCellValueFactory(cellData -> cellData.getValue().);
        List<Administracion> observableVentas = Administracion.getListaProductos();
        ObservableList<Administracion> observableListVentas = FXCollections.observableArrayList(observableVentas);
        TablaVentasView.setItems(observableListVentas);
    }
}
