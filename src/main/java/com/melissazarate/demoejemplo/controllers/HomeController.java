package com.melissazarate.demoejemplo.controllers;

import com.melissazarate.demoejemplo.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    private Button buttonPedidos;

    @FXML
    private Button buttonVentas;

    @FXML
    private Label labelBienvenido;

    @FXML
    private Label labelQuestion;
    Stage admin = new Stage();
    Stage pedidos = new Stage();

    @FXML
    void OnMouseClickButtonPedidos(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("admin-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        admin.setTitle("Cafetería - Ventas");
        admin.setScene(scene);
        admin.show();
    }

    @FXML
    void OnMouseClickButtonVentas(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("pedido-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        pedidos.setTitle("Cafetería - Pedidos");
        pedidos.setScene(scene);
        pedidos.show();
    }

}
