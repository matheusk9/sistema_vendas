package main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import classes.Telas;

public class Main extends Application{
    // public static Stage stage, stageForm;
    // private static Stage stage, innerStage; //toda vez que eu invocar a tela "main" ela vai ter um 'stage' (uma janela

    // public static Stage getInnerStage() {
    //     return innerStage;
    // }

    // public static void setInnerStage(Stage innerStage) {
    //     Main.innerStage = innerStage;
    // }

    // public static Parent fxmlForm=null, root=null;
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //talvez seja necessário passar no arquivo fxml no fx:controller= "pasta.arquivo"
        // try {
        //     root = FXMLLoader.load(getClass().getResource("/view/selectPoltrona.fxml"));
        //     fxmlForm = FXMLLoader.load(getClass().getResource("/view/dadosPassageiro.fxml"));

        // } catch (IOException ex) {
        //     Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        // }

        // //coloca o FXML em uma cena
        // Scene scene = new Scene(root); 
        // Scene screenForm = new Scene(fxmlForm);

        Telas.setStage(primaryStage); 
        //coloca a cena em uma janela
        // stage.setScene(scene);  
        // stage.setTitle("tela principal");
        // stage.setResizable(false);
        // //abre a janela
        // stage.show();  
        
        // innerStage = new Stage(){{setScene(screenForm); }};
        // innerStage.setResizable(false);
        // // sempre que a tela for aberta estará setando a validação como false 
        // innerStage.setOnShown((WindowEvent e)->{   
        // });
        // innerStage.close();
    }

    //obrigatorio para execução do codigo
    public static void main(String[] args) throws Exception {
        launch(args);   
    }
    
    
    // public static Stage getStage() {
    //     return stage;
    // }
    
    // public static void setStage(Stage stage) {
    //     Main.stage = stage;
    // }
}
