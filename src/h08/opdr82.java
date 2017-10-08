//        Opdracht 8.2
//
//        Op de open avonden van school wordt bijgehouden hoeveel mannen en vrouwen en hoeveel potentiële vrouwelijke
//        en mannelijke leerlingen de school op zo'n avond bezoeken. Schrijf een applet waarin alleen op één van de vier
//        knoppen geklikt hoeft te worden en de vier aantallen en het totaal wordt in het venster van de applet worden bijgehouden.


package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;

public class opdr82 extends Applet{

    Button knopm;
    Button knopv;
    Button knopml;
    Button knopvl;

    String m;
    String v;
    String ml;
    String vl;

    public void init() {

        knopm = new Button("Man");
        knopm.addActionListener(new KnopmListener());
        knopv = new Button("Vrouw");
        knopv.addActionListener(new KnopvListener());
        knopml = new Button("Leerling Man");
        knopml.addActionListener(new KnopmlListener());
        knopvl = new Button("Leering Vrouw");
        knopvl.addActionListener(new KnopvlListener());
    }

    public void paint(Graphics g){
        g.drawString(m,60,40);
        g.drawString(v,60,60);
        g.drawString(ml,60,80);
        g.drawString(vl,60,100);
    }

    private class KnopmListener implements ActionListener {
    }

    private class KnopvListener implements ActionListener {
    }

    private class KnopmlListener implements ActionListener {
    }

    private class KnopvlListener implements ActionListener {
    }
}

