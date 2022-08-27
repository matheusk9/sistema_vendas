package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import main.Main;

public class formPassageiro implements Initializable{

    @FXML private Button btBuscarCPF;
    @FXML protected Button btCancelarReserva;
    @FXML private Button btContinuarReserva;
    @FXML private Button btIrParaPagamento;
    @FXML private DatePicker dataNascimento;
    @FXML private TextField tfBuscarCPF;
    @FXML private TextField tfCPFpassageiro;
    @FXML private TextField tfNomePassageiro;

    @Override
    public void initialize(URL location, ResourceBundle resources){

        btCancelarReserva.setOnAction(e->Main.getInnerStage().close());
        
    }
}
