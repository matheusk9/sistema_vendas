package controller;

import java.net.URL;
import java.util.ResourceBundle;
import classes.Telas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import main.Main;

public class PoltronaControler implements Initializable{

    @FXML private Button btFinalizarCompra;
    @FXML private Label lbOrigemDestino;
    @FXML private Label lbSubtotal;
    @FXML private GridPane poltronaLadoMotorista;
    @FXML private Label teste;
    @FXML private Label teste1;

    // final private String selecionado = "-fx-background-color: Gold;";
    // final private String disponivel = "-fx-background-color: MediumSeaGreen;";    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Telas tela = new Telas();

        btFinalizarCompra.setOnMouseClicked((MouseEvent e)->{
            Main.getStage().close();
        });
        
        poltronaLadoMotorista.setOnMouseClicked((MouseEvent e)->{
            Node poltrona = (Node) e.getSource();    //pego o objeto de onde ocorreu um evento
            System.out.println(poltrona.toString());
            // Main.getStage().setScene(tela.formScreen);

            // String statusPoltrona = ((Node)poltrona).getStyle();
            
            // if (statusPoltrona.equalsIgnoreCase(disponivel)) {
            //     System.out.println("ta verde");
            //     // Main.stage.showAndWait();
            //     // Main.stage.setOnHiding(e -> ((Node) a).setStyle(selecionado));
            // } 
            // else if (statusPoltrona.equalsIgnoreCase(selecionado)) {
            //     ((Node) poltrona).setStyle(disponivel);
            // } 
            // else {
                
            // }
        });
    }
    
    @FXML
    void corStatusPoltrona(MouseEvent event) {
        System.out.println("funfou");
        
    }
}
