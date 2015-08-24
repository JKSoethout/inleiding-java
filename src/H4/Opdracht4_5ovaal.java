package H4;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4_5ovaal extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.blue); 
    g.setColor(Color.black);
    g.drawOval(20, 20, 300, 150);
    g.setColor(Color.yellow);
    g.fillArc(20, 20, 300, 150, 90, 135);
   
  }
}