// Opdracht 8.1
//
// Maak een applet in Java, waarin een tekstvak met een label en twee knoppen voorkomen.
// De eerste knop is de ok-knop die ervoor zorgt dat wat de gebruiker in het tekstvak heeft ingetikt in het venster van de applet zichtbaar wordt.
// De tweede knop is de reset-knop die het tekstvak leeg maakt als de gebruiker erop klikt.



import java.awt.*;
import java.applet.*;


public class Knop extends Applet {
    Button knop;

    public void init() {
        knop = new Button();
        knop.setLabel( "Klik op mij" );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Doet deze knop wel iets?", 50, 60 );
    }
}