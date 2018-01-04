package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Op83 extends Applet{

    Button bOk;
    TextField tekstveld;
    double uitkomst;

    public void init ();{

        bOk = new Button("Uitkomst");
        bOk.addActionListener(new Listener());
        add(bOk);
        add(tekstveld);
    }

    public void paint(Graphics g){
        g.drawString("Uitkomst met BTW " + uitkomst, 50,75);
    }

    public class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        String getal = tekstveld.getText();
        double invoer = Double.parseDouble(getal);
        uitkomst = invoer * 1.21;
        repaint();
        }
    }
}
