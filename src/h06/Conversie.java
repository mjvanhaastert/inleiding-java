package h06;

import java.applet.*;
import java.awt.*;

public class Conversie extends Applet {
    double a, b, c, f, h, i, l;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        f = (a + b + c) / 3;
        h = f * 10;
        i = (int) h;
        l = i / 10;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Het gemiddelde is: " + l, 20, 20);

    }

}