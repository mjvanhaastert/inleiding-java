package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Op82 extends Applet {

    int man, vrouw, manleerling, vrouwleerling, totaal;
    Button B1;
    Button B2;
    Button B3;
    Button B4;

    public void init() {

        man = 0;
        vrouw = 0;
        manleerling = 0;
        vrouwleerling = 0;
        totaal = 0;
        //knop met een label
        B1 = new Button("Man");
        //koppel er een listener aan
        B1Listener B1l = new B1Listener();
        B1.addActionListener(B1l);
        add(B1);

        B2 = new Button("Vrouw");
        B2Listener B2l = new B2Listener();
        B2.addActionListener(B2l);
        add(B2);

        B3 = new Button("Leerling Man");
        B3Listener B3l = new B3Listener();
        B3.addActionListener(B3l);
        add(B3);

        B4 = new Button("Leerling Vrouw");
        B4Listener B4l = new B4Listener();
        B4.addActionListener(B4l);
        add(B4);

    }

    public void paint(Graphics g) {
        g.drawString("Mannen" + man, 20, 130);
        g.drawString("Vrouwen" + vrouw, 20, 150);
        g.drawString("Leerling Man" + manleerling, 20, 170);
        g.drawString("Leerling Vrouw" + vrouwleerling, 20, 190);
        g.drawString("Totaal" + totaal, 20, 210);
    }


    class B1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man++;
            totaal++;
            repaint();
        }
    }

    class B2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw++;
            totaal++;
            repaint();
        }
    }

    class B3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            manleerling++;
            totaal++;
            repaint();
        }
    }

    class B4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwleerling++;
            totaal++;
            repaint();
        }
    }
}
