package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht44 extends Applet{

    public void paint(Graphics g) {

        //Opdracht 4.4 Drie kinderen hebben het volgende gewicht:
        //Valerie: 40 kg
        //Jeroen: 100 kg
        //Hans: 80 kg

        //Staafdiagram

        g.drawRect(100,100,200,200);
        g.drawLine(90,260,110,260);
        g.drawString("20",70,260);
        g.drawLine(90,220,110,220);
        g.drawString("40",70,220);
        g.drawLine(90,180,110,180);
        g.drawString("60",70,180);
        g.drawLine(90,140,110,140);
        g.drawString("80",70,140);

        //Kolommen

        g.setColor(Color.red);
        g.fillRect(100,220,50,80 );
        g.setColor(Color.yellow);
        g.fillRect(150,100, 50,200 );
        g.setColor(Color.blue);
        g.fillRect(200,140,50,160 );

        //Legenda

        g.setColor(Color.red);
        g.drawString("Valerie",100,350);
        g.setColor(Color.yellow);
        g.drawString("Jeroen",100,370);
        g.setColor(Color.blue);
        g.drawString("Hans",100,390);
    }
}


