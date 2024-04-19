package com.melissazarate.demoejemplo.controllers;

import com.melissazarate.demoejemplo.models.Cafeteria;
import com.melissazarate.demoejemplo.models.Bebida;
import com.melissazarate.demoejemplo.models.Comida;
import com.melissazarate.demoejemplo.models.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.List;

public class PedidoController {

    @FXML
    private Button buttonActualizar;

    @FXML
    private Button buttonGuardar;

    @FXML
    private Button buttonLimpiar;

    @FXML
    private ListView<Producto> listPedidos;

    @FXML
    private TextField txrProductoOrden;

    @FXML
    private TextField txtCantidadpago;

    @FXML
    private TextField txtNameClient;

    @FXML
    private TextField txtTipo;

    @FXML
    private TextField txtTipoPedido;

    @FXML
    private TextField txtTotalApagar;

    @FXML
    private TextField txtaddPedido;

    @FXML
    private TextField txtNomCliente;
    @FXML
    private TextField txtCalorias;

    @FXML
    private TextField txtCaloriasMod;

    private Cafeteria administracion = new Cafeteria();

    private ObservableList<Producto> observableListaProductos = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        listPedidos.setItems(observableListaProductos);

        listPedidos.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                txrProductoOrden.setText(newValue.getNombre());
                txtCantidadpago.setText(Double.toString(newValue.getPrecio()));
                txtNameClient.setText(newValue.getNombreCliente());
            }
        });
    }

    @FXML
    void OnMouseClickButtonGuardar(MouseEvent event) {
        String tipo = txtTipo.getText();
        String nombreCliente = txtNameClient.getText();
        String calorias = txtCalorias.getText();

        try {
            double cantidadPago = Double.parseDouble(txtCantidadpago.getText());

            if (tipo.equalsIgnoreCase("Bebida")) {
                Bebida nuevaBebida = new Bebida(txtaddPedido.getText(), txtTipo.getText(), txtNameClient.getText(), Double.parseDouble(txtCantidadpago.getText()));
                administracion.addProducto(nuevaBebida);
            } else if (tipo.equalsIgnoreCase("Comida")) {
                Comida nuevaComida = new Comida(txtaddPedido.getText(), txtTipo.getText(), txtNameClient.getText(), txtCalorias.getText(), Double.parseDouble(txtCantidadpago.getText()));
                administracion.addProducto(nuevaComida);
            }
            VentasController.actualizarListaProductos(administracion.getListaProductos());
            actualizarListaProductos(administracion.getListaProductos());

            mostrarAlerta("Información", "Producto agregado exitosamente");
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Cantidad de pago inválida. Por favor ingrese un número válido.");
        }
    }

    @FXML
    void OnMouseClickButtonLimpiar(MouseEvent event) {
        txtNameClient.clear();
        txrProductoOrden.clear();
        txtCantidadpago.clear();
        txtNameClient.clear();
        txtaddPedido.clear();
        txtTotalApagar.clear();
        txtTipo.clear();
        txtTipoPedido.clear();
        txtCalorias.clear();
        txtCaloriasMod.clear();
    }

    @FXML
    void modificarPedido(ActionEvent event) {
        Producto productoSeleccionado = listPedidos.getSelectionModel().getSelectedItem();
        if (productoSeleccionado != null) {
            String nombre = txrProductoOrden.getText();
            double precio = Double.parseDouble(txtTotalApagar.getText());
            String nombreCliente = txtNomCliente.getText();
            String caloriasMod = txtCaloriasMod.getText();
            String tipoMod = txtTipoPedido.getText();

            productoSeleccionado.setNombre(nombre);
            productoSeleccionado.setPrecio(precio);
            productoSeleccionado.setNombreCliente(nombreCliente);

            actualizarListaProductos(administracion.getListaProductos());
            mostrarAlerta("Información", "Producto modificado exitosamente");
        } else {
            mostrarAlerta("Error", "Selecciona un producto para modificar");
        }
    }

    private void actualizarListaProductos(List<Producto> listaProductos) {
        observableListaProductos.clear();
        observableListaProductos.addAll(listaProductos);
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
