package H4;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4_7dobbelsteen extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.black);
    g.fillRect(100, 100, 300, 300);
    g.setColor(Color.white);
    g.fillOval(120, 130, 100, 100);
    g.setColor(Color.white);
    g.fillOval(120, 280, 100, 100);
    g.setColor(Color.white);
    g.fillOval(280, 130, 100, 100);
    g.setColor(Color.white);
    g.fillOval(280, 280, 100, 100);
  }
}
