package H4;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4_6stoplicht extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.black);
    g.fillRoundRect(60, 120, 150, 300, 80, 80);
    g.fillRect(130, 400, 15, 150);
    g.setColor(Color.red);
    g.fillOval(105, 150, 60, 60);
    g.setColor(Color.yellow);
    g.fillOval(105, 235, 60, 60);
    g.setColor(Color.green);
    g.fillOval(105, 320, 60, 60);
    
    
  }
}