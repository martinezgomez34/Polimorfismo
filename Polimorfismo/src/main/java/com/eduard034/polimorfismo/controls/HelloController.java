package com.eduard034.polimorfismo.controls;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import java.net.URL;
import java.util.ResourceBundle;

import com.eduard034.polimorfismo.HelloApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class HelloController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void onClickSalir(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void onClickSave(MouseEvent event) {
        HelloApplication.newStage("save.fxml","SAVE");
    }

    @FXML
    void onClickUpdate(MouseEvent event) {
        HelloApplication.newStage("date.fxml","UPDATE");
    }
    @FXML
    void onClickVerListas(MouseEvent event) {
        HelloApplication.newStage("update.fxml","REGISTROS");
    }

    @FXML
    void initialize() {

    }

}