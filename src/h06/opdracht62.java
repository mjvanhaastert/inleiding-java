package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht62 extends Applet{

    int secondenUur, secondenDag, secondenJaar;

    public void init(){

        secondenUur = 60 * 60;
        secondenDag = 60 * 60 * 24;
        secondenJaar = 60 * 60 * 24 * 7 * 12;

    }

    public void paint (Graphics g){

            g.drawString("Hoeveel seconden zitten er in een uur? = " + secondenUur, 20 ,20);
            g.drawString("Hoeveel seconden zitten er in een dag? = " + secondenDag, 20 ,40);
            g.drawString("Hoeveel seconden zitten er in een jaar? = " + secondenJaar, 20 ,60);

    }
}
