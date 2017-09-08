package h05;

import java.applet.Applet;
import java.awt.*;

public class PraktijdOpdrachtver3 extends Applet {

    //Uitleg variabelen

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    public void init () {

        //Initialisatie
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 180;
        hoogte = 100;
    }

    public void paint(Graphics g) {

        //Lijn
        g.drawString("Lijn",100,35);
        g.drawLine(20,20,200,20);
        //Rechthoek
        g.drawString("Rechthoek",80,155);
        g.drawRect(20,40,breedte,hoogte);
        //Gevulde rechthoek met ovaal
        g.drawString("Gevulde rechthoek met ovaal",230,155);
        g.setColor(opvulkleur);
        g.fillRect(220,40,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(220,40,breedte,hoogte);
        //Taartpunt met ovaal eromheen
        g.drawString("Taartpunt met ovaal eromheen",430,155);
        g.drawOval(420,40,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(420,40,breedte,hoogte,360,45);
        //Afgeronde rechthoek
        g.setColor(lijnkleur);
        g.drawString("Afgeronde rechthoek",60,275);
        g.drawRoundRect(20,160,breedte,hoogte,30,30);
        //Gevulde ovaal
        g.drawString("Gevulde ovaal",270,275);
        g.setColor(opvulkleur);
        g.fillOval(220,160,breedte,hoogte);
        //Cirkel
        g.setColor(lijnkleur);
        g.drawString("Cirkel",495,275);
        g.drawOval(460,160,hoogte,hoogte);
    }
}