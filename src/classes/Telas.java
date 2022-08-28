package classes;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import main.Main;

public class Telas{

    //minhas telas
    private final Scene mainScreen;
    private final Scene formScreen;
    private Parent fxmlForm;
    private Parent root;
    
    public Telas(){
        this.mainScreen = new Scene(Main.root);
        this.formScreen = new Scene(Main.fxmlForm);
    }
    
    
    public Scene getFormScreen() {
        return formScreen;
    }

    public Scene getMainScreen() {
        return mainScreen;
    }


    public void loadingFxml() throws IOException{
        try {
            root = FXMLLoader.load(getClass().getResource("/view/selectPoltrona.fxml"));
            fxmlForm = FXMLLoader.load(getClass().getResource("/view/dadosPassageiro.fxml"));

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // public static Scene cacheScreen(String nomeTela,Parent fxml){
    //     switch (nomeTela) {
    //         case "mainScreen":
    //             return mainScreen = new Scene(fxml);
    //         case "formScreen":
    //             return formScreen = new Scene(fxml);
    //         default:
    //             System.out.println("ERRO");
    //             return null;
    //     }
    // }
}
