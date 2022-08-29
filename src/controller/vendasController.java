package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class vendasController implements Initializable{

    @FXML private Label menu;
    @FXML private Label menuBack;
    @FXML private AnchorPane slider;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
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
