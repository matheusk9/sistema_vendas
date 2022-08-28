package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import main.Main;


public class poltronaController implements Initializable{

    @FXML private Button btFinalizarCompra;
    @FXML private Label lbOrigemDestino;
    @FXML private Label lbSubtotal;
    @FXML private GridPane poltronaLadoMotorista;
    @FXML private GridPane poltronaLadoPassageiro;
    private static Node poltrona;
    private final String selecionado = "-fx-background-color: Gold;";
    private final String disponivel = "-fx-background-color: MediumSeaGreen;"; 

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        btFinalizarCompra.setOnMouseClicked((MouseEvent e)->{
            Main.getStage().close();
        });
    }

    @FXML
    void corStatusPoltrona(MouseEvent event) {        
        //pego o objeto de onde ocorreu um evento(click)
        poltrona = (Node) event.getSource();   

        if (poltrona.getStyle().equalsIgnoreCase(disponivel)) {
            Main.getInnerStage().show();
        } 
        else if (poltrona.getStyle().equalsIgnoreCase(selecionado)) {
            System.out.println("amarelo");
        } 
        else {
            System.out.println("ELSE");
        }
    }

    public Node getPoltrona() {
        return poltrona;
    }

    public String getSelecionado() {
        return selecionado;
    }

    public String getDisponivel() {
        return disponivel;
    }
}
