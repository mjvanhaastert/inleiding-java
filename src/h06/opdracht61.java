package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht61 extends Applet{

    int uitkomst;

    public void init() {

        uitkomst = 113 / 4;
    }

    public void paint (Graphics g){
        g.drawString("Jan" + uitkomst, 20 ,20);
        g.drawString("Ali" + uitkomst, 20 ,40);
        g.drawString("Jeannette" + uitkomst, 20 ,60);
        g.drawString("Mark" + uitkomst, 20 ,80);
    }
}
