// Opdracht 8.1
//
// Maak een applet in Java, waarin een tekstvak met een label en twee knoppen voorkomen.
// De eerste knop is de ok-knop die ervoor zorgt dat wat de gebruiker in het tekstvak heeft ingetikt in het venster van de applet zichtbaar wordt.
// De tweede knop is de reset-knop die het tekstvak leeg maakt als de gebruiker erop klikt.


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdr81 extends Applet {

    Button knop1;
    Button knop2;
    TextField tekstvlak;

    public void init() {

        tekstvlak = new TextField("", 20);
        knop1 = new Button("Oke");
        knop1.addActionListener(new Knop1Listener());
        knop2 = new Button("reset");
        knop2.addActionListener(new Knop2Listener());
        add(tekstvlak);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString("", 60, 70);

    }

    private class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvlak.getText();
            repaint();
        }
    }

    private class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvlak.setText("");
            repaint();
        }
    }
}
