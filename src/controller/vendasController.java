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

        btTela1.setOnMouseClicked((MouseEvent e)->{
            teste(tela1);
        });

        btTela2.setOnMouseClicked((MouseEvent e)->{
            teste(tela2);
        });
        
        btTela3.setOnMouseClicked((MouseEvent e)->{
            teste(tela3);
        });

    }

    public void showScreen(){

    }


    @FXML
    void teste(AnchorPane mostrar){
        if (mostrar.equals(tela1)){
            tela2.setVisible(false);
            tela3.setVisible(false);
            tela1.setVisible(true);
        }
        else if(mostrar.equals(tela2)){
            tela1.setVisible(false);
            tela3.setVisible(false);
            tela2.setVisible(true);
        }
        else{
            tela1.setVisible(false);
            tela2.setVisible(false);
            tela3.setVisible(true);
        }
    }


}
