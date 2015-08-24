package H4;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.black);
    g.drawRect(10, 10, 225, 0);
    g.drawString("Lijn", 110, 25 );
    setBackground(Color.white); 
    g.setColor(Color.black);
    g.drawRect(10, 30, 225, 100);
    g.drawString("Rechthoek", 90, 145 );
    g.drawRoundRect(10, 150, 225, 100, 30, 30);
    g.drawString("Afgeronde rechthoek", 70, 265 );
    g.setColor(Color.magenta);
    g.fillRect(250, 30, 225, 100);
    g.setColor(Color.black);
    g.drawOval(250, 30, 225, 100);
    g.drawString("Gevulde rechthoek met ovaal", 280, 145 );
    g.setColor(Color.magenta);
    g.fillOval(250, 150, 225, 100);
    g.setColor(Color.black);
    g.drawString("Gevulde ovaal", 320, 265 );
    g.drawOval(500, 30, 225, 100);
    g.setColor(Color.magenta);
    g.fillArc(500,30, 225, 100, 0, 45);
    g.setColor(Color.black);
    g.drawString("Taartpunt met ovaal eromheen", 530, 145 );
    g.drawOval(560, 150, 100, 100);
    g.drawString("cirkel", 595, 265 );
    
  }
}