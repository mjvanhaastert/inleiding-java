package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijdOpdracht extends Applet {

    public void paint(Graphics g) {

        //Lijn
        g.drawString("Lijn",100,35);
        g.drawLine(20,20,200,20);
        //Rechthoek
        g.drawString("Rechthoek",80,155);
        g.drawRect(20,40,180,100);
        //Gevulde rechthoek met ovaal
        g.drawString("Gevulde rechthoek met ovaal",230,155);
        g.setColor(Color.magenta);
        g.fillRect(220,40,180,100);
        g.setColor(Color.black);
        g.drawOval(220,40,180,100);
        //Taartpunt met ovaal eromheen
        g.drawString("Taartpunt met ovaal eromheen",430,155);
        g.drawOval(420,40,180,100);
        g.setColor(Color.magenta);
        g.fillArc(420,40,180,100,360,45);
        //Afgeronde rechthoek
        g.setColor(Color.black);
        g.drawString("Afgeronde rechthoek",60,275);
        g.drawRoundRect(20,160,180,100,30,30);
        //Gevulde ovaal
        g.drawString("Gevulde ovaal",270,275);
        g.setColor(Color.magenta);
        g.fillOval(220,160,180,100);
        //Cirkel
        g.setColor(Color.black);
        g.drawString("Cirkel",495,275);
        g.drawOval(460,160,100,100);

        

    }
}