import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4_1 extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.black);
    int[] xPoints = {200, 100, 300};
    int[] yPoints = {100, 250, 250};
    g.drawPolygon(xPoints, yPoints, 3);
    
    
  }
}