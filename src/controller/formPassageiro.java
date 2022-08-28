package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import main.Main;

public class formPassageiro extends poltronaController{
   
    @FXML private Button btBuscarCPF;
    @FXML private Button btCancelarReserva;
    @FXML private DatePicker dataNascimento;
    @FXML private Button salvarReserva;
    @FXML private TextField tfBuscarCPF;
    @FXML private TextField tfCPFpassageiro;
    @FXML private TextField tfNomePassageiro;

    @Override
    public void initialize(URL location, ResourceBundle resources){  
        btCancelarReserva.setOnAction(e->Main.getInnerStage().close());

        salvarReserva.setOnMouseClicked((MouseEvent e)->{
            getPoltrona().setStyle(getSelecionado());
            System.out.println("Salvo!");
            Main.getInnerStage().close();
        });
    }
    
}
