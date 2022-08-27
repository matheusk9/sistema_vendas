package classes;
import javafx.scene.Scene;
import main.Main;

public class Telas{

    //minhas telas
    private final Scene mainScreen;
    private final Scene formScreen;
    

    
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
