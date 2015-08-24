package h02;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht2_1 extends Applet {

  public void init() {
    setBackground(Color.blue);
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.drawString("Yuliya Soethout", 50, 60 );
  }
}