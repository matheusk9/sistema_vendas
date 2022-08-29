package classes;

import javafx.scene.layout.AnchorPane;

public class Telas {
    private AnchorPane tela1;
    private AnchorPane tela2;
    private AnchorPane tela3;
    
    public Telas(AnchorPane tela1, AnchorPane tela2, AnchorPane tela3) {
        this.tela1 = tela1;
        this.tela2 = tela2;
        this.tela3 = tela3;
    }

    public AnchorPane getTela1() {
        return tela1;
    }

    public AnchorPane getTela2() {
        return tela2;
    }

    public AnchorPane getTela3() {
        return tela3;
    }

    public void show(AnchorPane mostrar){
        if (mostrar.equals(tela1)){
            tela2.setVisible(false);
            tela3.setVisible(false);
            tela1.setVisible(true);
        }
        else if(mostrar.equals(tela2)){
            tela1.setVisible(false);
            tela3.setVisible(false);
            tela2.setVisible(true);
        }
        else{
            tela1.setVisible(false);
            tela2.setVisible(false);
            tela3.setVisible(true);
        }
    }
}
