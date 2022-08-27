package classes;

// Classe criada para interagir com várias telas
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HaveStage {

    private static HaveStage haveStage = null;
    private Stage stage;

    private HaveStage(Stage stage) {
        this.stage = stage;
    }

    public static HaveStage instance(Stage stage) {
        if (haveStage == null) {
            haveStage = new HaveStage(stage);
        }
        return haveStage;
    }

    public Stage getStage() {
        return this.stage;
    }

    public void loadNewStage(Parent fxmlLoad) {
        if (stage != null) {
            Parent root = fxmlLoad;
            Scene scene = new Scene(root);
            stage.setScene(scene);
            //stage.show();
        }
    }
}