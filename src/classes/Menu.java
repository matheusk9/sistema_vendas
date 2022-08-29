package classes;

import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Menu {
    public void getMenu(AnchorPane slider, Label menu, Label menuBack){
        slider.setTranslateX(-176);
        menu.setOnMouseClicked(e -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();
            slider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent event)->{
                menu.setVisible(false);
                menuBack.setVisible(true);
            });
        });
        
        menuBack.setOnMouseClicked(e -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent event)->{
                menu.setVisible(true);
                menuBack.setVisible(false);
            });
        });
    }
}
