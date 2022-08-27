package exemplos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControler {

    @FXML
    private Button buttonLogin;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField userField;

    @FXML
    void eventLogin(ActionEvent event) {
        String user = userField.getText();
        String password = passwordField.getText();

        if(user.equals("Matheusk9") && password.equals("1234")){
            System.out.println("Fez login com sucesso!");
        }else{
            System.out.println("Usuário ou senha incorreto.");
        }
    }
}
