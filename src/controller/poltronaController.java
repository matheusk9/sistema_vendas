package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import main.Main;

public class poltronaController implements Initializable{

    @FXML private Button btFinalizarCompra;
    @FXML private Label lbOrigemDestino;
    @FXML private Label lbSubtotal;
    @FXML private GridPane poltronaLadoMotorista;
    @FXML private GridPane poltronaLadoPassageiro;
    Scene screenForm;
    Stage stageTemp;

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        // screenForm = new Scene(Main.fxmlForm);
        
        btFinalizarCompra.setOnMouseClicked((MouseEvent e)->{
            Main.getStage().close();
        });
        
        poltronaLadoMotorista.setOnMouseClicked((MouseEvent e)->{

            // Node poltrona = (Node) e.getSource();    //pego o objeto de onde ocorreu um evento
            Main.getInnerStage().show();
            


            System.out.println( "FECHOU A TELA");

        });

        poltronaLadoPassageiro.setOnMouseClicked((MouseEvent e)->{
            System.out.println("PASSAGEIRO:"+Main.getStage().getTitle());
        });
    }
//RESOLVER PROBLEMAS COM OS STAGES 


    @FXML
    void corStatusPoltrona(MouseEvent event) {
        System.out.println("clicou");
    }
}
