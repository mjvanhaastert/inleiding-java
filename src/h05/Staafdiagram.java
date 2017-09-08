package h05;


import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {

    int breedte;


    public void init() {


    }


    public void paint(Graphics g) {
        //Opdracht 4.4 Drie kinderen hebben het volgende gewicht:
        //Valerie: 40 kg
        //Jeroen: 100 kg
        //Hans: 80 kg

        g.drawRect(100, 50, 200, 200);



        g.setColor(Color.red);
        g.fillRect(300,130,10,10 );
        g.setColor(Color.red);
        g.drawString("Valerie 40kg",320,140);

        g.setColor(Color.yellow);
        g.fillRect(300,150,10,10 );
        g.setColor(Color.yellow);
        g.drawString("Jeroen 100kg",320,160);

        g.setColor(Color.blue);
        g.fillRect(300,170,10,10 );
        g.setColor(Color.blue);
        g.drawString("Hans 80kg",320,180);




        g.setColor(Color.red);
        g.fillRect(100, 50, breedte, 40);
        g.setColor(Color.yellow);
        g.fillRect(150, 50, breedte, 100);
        g.setColor(Color.blue);
        g.fillRect(200, 50, breedte, 80);




    }
}