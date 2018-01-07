package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht extends Applet {

    TextField input1;
    TextField input2;
    Button Maal;
    Button Delen;
    Button Plus;
    Button Min;
    Double Getal1;
    Double Getal2;

    public void init(){
        input1 = new  TextField("", 10);
        add(input1);
        input2 = new TextField("",10);
        add(input2);

        Maal = new Button("X");
        MaalListener maalListener = new MaalListener();
        Maal.addActionListener(maalListener);
        add(Maal);

        Delen = new Button("/");
        DelenListener deelListener = new DelenListener();
        Delen.addActionListener(deelListener);
        add(Delen);

        Plus = new Button("+");
        PlusListeren plusListeren = new PlusListeren();
        Plus.addActionListener(plusListeren);
        add(Plus);

        Min = new Button("-");
        MinListener minListener = new MinListener();
        Min.addActionListener(minListener);
        add(Min);
    }

    class MaalListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String veld1 = input1.getText();
            Getal1 = Double.parseDouble(veld1);
            String veld2 = input2.getText();
            Getal2 = Double.parseDouble(veld2);
            Double uitkomstMaal = Getal1 * Getal2;
            input1.setText("" + uitkomstMaal);
            input2.setText(" ");
            }
    }

    class DelenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String veld1 = input1.getText();
            Getal1 = Double.parseDouble(veld1);
            String veld2 = input2.getText();
            Getal2 = Double.parseDouble(veld2);
            Double uitkomstDelen = Getal1 / Getal2;
            input1.setText("" + uitkomstDelen);
            input2.setText(" ");
        }
    }

    class PlusListeren implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String veld1 = input1.getText();
            Getal1 = Double.parseDouble(veld1);
            String veld2 = input2.getText();
            Getal2 = Double.parseDouble(veld2);
            Double uitkomstPlus = Getal1 + Getal2;
            input1.setText("" + uitkomstPlus);
            input2.setText(" ");
        }
    }

    class MinListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String veld1 = input1.getText();
            Getal1 = Double.parseDouble(veld1);
            String veld2 = input2.getText();
            Getal2 = Double.parseDouble(veld2);
            Double uitkomstMin = Getal1 - Getal2;
            input1.setText("" + uitkomstMin);
            input2.setText(" ");
        }
    }
}
