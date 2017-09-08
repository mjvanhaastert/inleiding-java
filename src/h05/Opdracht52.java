package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht52 extends Applet{

    //Uitleg
    Color table1;
    Color table2;
    Color table3;
    int valerie;
    int jeroen;
    int hans;

    public void paint(Graphics g) {

        table1 = Color.red;
        table2 = Color.YELLOW;
        table3 = Color.blue;
        valerie = 80;
        jeroen = 200;
        hans = 160;

        //Opdracht 5.2 Drie kinderen hebben het volgende gewicht:
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

        //Valerie
        g.setColor(table1);
        g.fillRect(100,220,50,valerie);
        //Jeroen
        g.setColor(table2);
        g.fillRect(150,100, 50,jeroen);
        //Hans
        g.setColor(table3);
        g.fillRect(200,140,50,hans);

        //Legenda

        g.setColor(table1);
        g.drawString("Valerie",100,350);
        g.setColor(table2);
        g.drawString("Jeroen",100,370);
        g.setColor(table3);
        g.drawString("Hans",100,390);
    }
}


