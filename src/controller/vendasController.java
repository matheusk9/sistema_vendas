package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import classes.Menu;

public class vendasController implements Initializable{

    @FXML private Label menu;
    @FXML private Label menuBack;
    @FXML private AnchorPane slider;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Menu.getMenu(slider, menu, menuBack);
    }
}
