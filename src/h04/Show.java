package h04;

import java.awt.*;
import java.applet.*;

public class Show extends Applet{

    public void paint(Graphics g) {

        //Opdracht 4.1 Gelijkbenige driehoek
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawLine(0,100,50,0);
        g.setColor(Color.yellow);
        g.drawLine(50,0,100,100);
        g.setColor(Color.green);
        g.drawLine(0,100,100,100);

        //Opdracht 4.2 huis 1 raam en deur,
        g.setColor(Color.red);
        g.drawLine(10,200,10,300);
        g.drawLine(10,200,100,200);
        g.drawLine(100,200,100,300);
        g.drawLine(10,300,100,300);
        //dak
        g.drawLine(10,200,55,145);
        g.drawLine(55,145,100,200);
        //deur
        g.drawLine(20,300,20,250);
        g.drawLine(20,250,40,250);
        g.drawLine(40,300,40,250);
        //raam even iets anders geprobeerd
        g.drawRoundRect(50,250,30,30,5,5);

        //Opdracht 4.3 Nederlandse vlag
        g.setColor(Color.black);
        g.drawRect(200,200,2,100);
        g.setColor(Color.red);
        g.fillRect(202,200,50,5);
        g.setColor(Color.white);
        g.fillRect(202,205,50,5);
        g.setColor(Color.blue);
        g.fillRect(202,210,50,5);
    }







}


