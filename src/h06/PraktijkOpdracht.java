package h06;

import java.applet.Applet;
import java.awt.*;

import static javafx.scene.input.KeyCode.R;

public class PraktijkOpdracht extends Applet{

    //Typecasting
    //int geheel;
    //double gebroken;
    //geheel = (int) gebroken;

    public void paint (Graphics g){

        double Uitkomst=(5.9 + 6.3 + 6.9) / 3;
        Uitkomst=Math.round(Uitkomst*10.0)/10.0;
        g.drawString("Uitkomst = " + Uitkomst, 20 ,40);
    }

}
