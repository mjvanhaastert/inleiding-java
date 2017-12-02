package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Op81 extends Applet {

    TextField tekstvak;
    String schermtekst;
    String resettekst;
    Button ok;
    Button reset;
    Label label;

    public void init() {
        ok = new Button("Ok");
        ok.addActionListener( new OkListener() );
        reset = new Button("Reset");
        reset.addActionListener( new ResetLisener());
        label = new Label("Typ iets in het tekstvlak");
        tekstvak = new TextField("", 30);
        resettekst = "";
        add(label);
        add(tekstvak);
        add(ok);
        add(reset);

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50,70);
    }

    class OkListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            schermtekst = tekstvak.getText();
            repaint();
        }
    }


    class ResetLisener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            schermtekst = ("");
            tekstvak.setText("");
            repaint();
        }
    }
}

