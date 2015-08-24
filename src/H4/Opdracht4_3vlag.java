package H4;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4_3vlag extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.red);
    g.fillRect(80, 80, 130, 40);
    setBackground(Color.white); 
    g.setColor(Color.white);
    g.drawRect(80, 120, 130, 40);
    setBackground(Color.white); 
    g.setColor(Color.blue);
    g.fillRect(80, 160, 130, 40);
    setBackground(Color.white); 
    g.setColor(Color.black);
    g.fillRect(70, 80, 15, 250);
    
  }
}