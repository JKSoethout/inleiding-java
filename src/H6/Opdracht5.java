package H6;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht5 extends Applet {
	Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
  public void init() {
	  opvulkleur = Color.MAGENTA;
      lijnkleur = Color.BLACK;
      breedte = 225;
      hoogte = 100;  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(lijnkleur);
    g.drawRect(10, 10, breedte, 0);
    g.drawString("Lijn", 110, 25 );
    setBackground(Color.white); 
    g.setColor(lijnkleur);
    g.drawRect(10, 30, breedte, hoogte);
    g.drawString("Rechthoek", 90, 145 );
    g.drawRoundRect(10, 150, breedte, hoogte, 30, 30);
    g.drawString("Afgeronde rechthoek", 70, 265 );
    g.setColor(opvulkleur);
    g.fillRect(250, 30, breedte, hoogte);
    g.setColor(lijnkleur);
    g.drawOval(250, 30, breedte, hoogte);
    g.drawString("Gevulde rechthoek met ovaal", 280, 145 );
    g.setColor(opvulkleur);
    g.fillOval(250, 150, breedte, hoogte);
    g.setColor(lijnkleur);
    g.drawString("Gevulde ovaal", 320, 265 );
    g.drawOval(500, 30, breedte, hoogte);
    g.setColor(opvulkleur);
    g.fillArc(500,30, breedte, hoogte, 0, 45);
    g.setColor(lijnkleur);
    g.drawString("Taartpunt met ovaal eromheen", 530, 145 );
    g.drawOval(560, 150, 100, 100);
    g.drawString("cirkel", 595, 265 );
    
  }
}