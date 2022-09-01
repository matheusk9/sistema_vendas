package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import classes.Menu;
import classes.Telas;

public class vendasController implements Initializable{

    @FXML private Label menu;
    @FXML private Label menuBack;
    @FXML private AnchorPane slider;
    @FXML private AnchorPane tela1;
    @FXML private AnchorPane tela2;
    @FXML private AnchorPane tela3;
    @FXML private Button btTela1;
    @FXML private Button btTela2;
    @FXML private Button btTela3;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Menu.getMenu(slider, menu, menuBack);
        showAndHideScreen();
        
    }

    public void showAndHideScreen(){
        Telas screen = new Telas(tela1,tela2,tela3);
        btTela1.setOnMouseClicked((MouseEvent e)->{
            screen.show(screen.getTela1());
        });

        btTela2.setOnMouseClicked((MouseEvent e)->{
            screen.show(screen.getTela2());
        });
        
        btTela3.setOnMouseClicked((MouseEvent e)->{
            screen.show(screen.getTela3());
        });
    }
}
