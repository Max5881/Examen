package sample.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerWindowExit {

    @FXML
    public Button Close;

    @FXML
    public void Close(){
        Close.getScene().getWindow().hide();
    }
    @FXML
    public void exit(){
        Platform.exit();
    }
}
