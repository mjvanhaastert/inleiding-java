//        Opdracht 8.2
//
//        Op de open avonden van school wordt bijgehouden hoeveel mannen en vrouwen en hoeveel potentiële vrouwelijke
//        en mannelijke leerlingen de school op zo'n avond bezoeken. Schrijf een applet waarin alleen op één van de vier
//        knoppen geklikt hoeft te worden en de vier aantallen en het totaal wordt in het venster van de applet worden bijgehouden.


package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr82 extends Applet {

    Button knopm;
    Button knopv;
    Button knopmll;
    Button knopvll;

    int man = 1;
    int vrouw = 1;
    int manl = 1;
    int vrouwl = 1;
    int totaal = 1;


    public void init() {

        knopm = new Button("Man");
        knopm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                man++;
                getGraphics().drawString("Man" + man, 50, 70
                repaint();


            }
        });
        add(knopm);
    }
}