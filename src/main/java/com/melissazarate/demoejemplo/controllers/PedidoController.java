package com.melissazarate.demoejemplo.controllers;

import com.melissazarate.demoejemplo.models.Administracion;
import com.melissazarate.demoejemplo.models.Bebida;
import com.melissazarate.demoejemplo.models.Comida;
import com.melissazarate.demoejemplo.models.Producto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class PedidoController {

    @FXML
    private Button buttonActualizar;

    @FXML
    private Button buttonGuardar;

    @FXML
    private Button buttonLimpiar;

    @FXML
    private ListView<String> listPedidos;

    @FXML
    private ListView<String> listaProductos;

    @FXML
    private TextField txrProductoOrden;

    @FXML
    private TextField txtCantidadpago;

    @FXML
    private TextField txtNameClient;

    @FXML
    private TextField txtTotalApagar;

    @FXML
    private TextField txtaddPedido;

    @FXML
    private TextField txtnomCliente;

    @FXML
    private TextField txtTipo;

    @FXML
    private TextField txtTipoPedido;

    @FXML
    void OnMouseClickButtonGuardar(MouseEvent event) {
        Administracion administracion = new Administracion();

        String tipo = txtTipo.getText();
        String nombreCliente = txtnomCliente.getText();

        if (tipo.equalsIgnoreCase("Bebida")) {
            Bebida nuevaBebida = new Bebida(txtaddPedido.getText(), Double.parseDouble(txtCantidadpago.getText()), txtTipo.getText(), txtnomCliente.getText());
            administracion.addProducto(nuevaBebida);
        } else {
            Comida nuevaComida = new Comida(txtaddPedido.getText(), Double.parseDouble(txtCantidadpago.getText()), txtTipo.getText(), txtnomCliente.getText());
            administracion.addProducto(nuevaComida);
        }

        for (Producto producto : administracion.getListaProductos()) {
            String detalleProducto = producto.getNombre() + " - Cliente: " + producto.getNombreCliente();
            listPedidos.getItems().add(detalleProducto);
        }

        mostrarAlerta("Información", "Producto agregado exitosamente");
    }

    @FXML
    void OnMouseClickButtonLimpiar(MouseEvent event) {
        txtnomCliente.clear();
        txrProductoOrden.clear();
        txtCantidadpago.clear();
        txtNameClient.clear();
        txtaddPedido.clear();
        txtTotalApagar.clear();
        txtTipo.clear();
        txtTipoPedido.clear();
    }

    @FXML
    void modificarPedido(ActionEvent event) {

    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
