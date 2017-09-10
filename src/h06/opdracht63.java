package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht63 extends Applet {

    int cijfer1, cijfer2, oplossing;

    public void init(){

        cijfer1 = 2147483646;
        cijfer2 = 2147483646;
        oplossing = cijfer1 + cijfer2;
    }

    public void paint (Graphics g){

        g.drawString("2147483646 + 2147483646 = " + oplossing, 20 ,40);

    }

}
