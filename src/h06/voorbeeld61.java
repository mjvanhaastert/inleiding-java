package h06;

import java.applet.Applet;
import java.awt.*;

public class voorbeeld61 extends Applet{

    double uitkomst;

    public void init() {

        uitkomst = 113 / 4;

    }

    public void paint (Graphics g){
        g.drawString("de uitkomst is: " + uitkomst, 20 ,20);
    }
}
