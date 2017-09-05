package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijdOpdracht extends Applet {

    public void paint(Graphics g) {

        g.drawLine(20,20,200,20);
        g.drawRect(20,40,180,100);
        g.setColor(Color.magenta);
        g.fillRect(220,40,180,100);
        g.setColor(Color.black);
        g.drawOval(220,40,180,100);
        g.drawOval(420,40,180,100);
        g.fillArc(420,40,180,100,360,45);
        g.drawRoundRect(20,160,180,100,10,10);


    }
}