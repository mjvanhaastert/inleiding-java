package h04;

import java.awt.*;
import java.applet.*;

//Opdracht 4.5

public class Show01 extends Applet{

    public void paint(Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(50,50,50,100,90,315);

        //Opdracht 4.6

        g.setColor(Color.BLACK);
        g.drawRoundRect(200,50,40,100,5,5);
        g.setColor(Color.red);
        g.fillOval(205,55,32,32);
        g.setColor(Color.orange);
        g.fillOval(205,85,32,32);
        g.setColor(Color.green);
        g.fillOval(205,115,32,32);
        g.setColor(Color.black);
        g.drawRect(215  ,150,10,200);

        //Opdracht 4.7
        g.setColor(Color.WHITE);
        g.drawRoundRect(300,50,100,100,10,10);
        g.setColor(Color.BLACK);
        g.fillOval(310,60,30,30);
        g.setColor(Color.BLACK);
        g.fillOval(360,60,30,30);
        g.setColor(Color.BLACK);
        g.fillOval(310,110,30,30);
        g.setColor(Color.BLACK);
        g.fillOval(360,110,30,30);
    }
}

