package exemplos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Demo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new Label("Demo")));
        stage.show();
        
        Stage inner = new Stage(){{setScene(new Scene(new Label("Inner"))); }};
        inner.showAndWait(); // Try replacing with showAndWait
        System.out.println("Done");
    }
}
