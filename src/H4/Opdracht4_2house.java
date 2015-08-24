package H4;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4_2house extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.magenta);
    g.drawRect(100, 250, 200, 200);
    setBackground(Color.white); 
    g.setColor(Color.magenta);
    int[] xPoints = {200, 100, 300};
    int[] yPoints = {100, 250, 250};
    g.drawPolygon(xPoints, yPoints, 3);
    setBackground(Color.white); 
    g.setColor(Color.magenta);
    g.drawRect(120, 350, 60, 100);
    setBackground(Color.white); 
    g.setColor(Color.magenta);
    g.drawRect(250, 300, 25, 25);
    g.drawRect(225, 300, 25, 25);
    g.drawRect(225, 275, 25, 25);
    g.drawRect(250, 275, 25, 25);
  }
}
  
   