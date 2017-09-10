package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Voorbeeld81 extends Applet {

    //Voorbeeld 8.1
    Button knop;



    public void init() {
        knop = new Button("klik op mij");
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Doet deze knop wel iets?", 50, 60 );
    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "Ja, deze knop doet wel iets";
        }
    }

}





