package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Op83 extends Applet{

    TextField tekst;
    Button knop;
    Label label;
    double getal;
    double btw;


    public void init(){
        tekst = new TextField("",20);
        label = new Label("getal");
        add (label);
        tekst.addActionListener(new tekstListener());
        add (tekst);
        knop = new Button("+ Btw");
        knop.addActionListener(new knopListener());
        btw = 1.21;
        add (knop);

    }

    public void paint(Graphics g){
        g.drawString("het getal is "+ getal * btw,50,60);
    }


    //enter functie
    class tekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            //pak getal uit tekst
            String s=tekst.getText();
            getal = Double.parseDouble(s);
            repaint();
        }
    }
    //knop functie
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s=tekst.getText();
            getal = Double.parseDouble(s);
            repaint();
        }
    }
}
