package classes;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class FormularioPessoa {

    @FXML
    private Button btBuscarCPF;
    // @FXML
    // private Button btCancelarReserva;
    // @FXML
    // private Button btContinuarReserva;
    // @FXML
    // private Button btIrParaPagamento;
    // @FXML
    // private DatePicker dataNascimento;
    // @FXML
    // private TextField tfBuscarCPF;
    // @FXML
    // private TextField tfCPFpassageiro;
    // @FXML
    // private TextField tfNomePassageiro;

    final private String cpf;

    protected FormularioPessoa(Button buscaCPF) {
        this.cpf = buscaCPF.getText();
    }
    
    public String getCpf() {
        return cpf;
    }
    
}

