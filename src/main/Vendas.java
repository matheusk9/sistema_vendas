package main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Vendas extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);   
    }

    public static Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            root = FXMLLoader.load(getClass().getResource("/view/menu.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene scene = new Scene(root);
        Stage stage = primaryStage;
        stage.setScene(scene);
        stage.show();
        
    }
}
