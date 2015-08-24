package H4;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4_4tabel extends Applet {

  public void init() {
  }

  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.black);
    g.fillRect(60, 50, 10, 300);
    setBackground(Color.white); 
    g.setColor(Color.black);
    g.fillRect(60, 350, 300, 10);
    setBackground(Color.white); 
    g.setColor(Color.pink);
    g.fillRect(180, 110, 60, 240);
    setBackground(Color.white); 
    g.setColor(Color.magenta);
    g.fillRect(90, 50, 60, 300);
    g.setColor(Color.CYAN);
    g.fillRect(270, 230, 60, 120);
	 g.setColor(Color.black);   
    g.drawString("100 KG  ", 10, 60 );
    g.setColor(Color.black);
    g.drawString("80 KG  ", 10, 120 );
    g.setColor(Color.black);
    g.drawString("60 KG  ", 10, 180 );
    g.setColor(Color.black);
    g.drawString("40 KG  ", 10, 240 );
    g.setColor(Color.black);
    g.drawString("20 KG  ", 10, 300 );
    g.setColor(Color.black);
    g.drawString("0 KG  ", 15, 360 );
    g.setColor(Color.black);
    g.drawString("Jeroen", 100, 390 );
    g.setColor(Color.black);
    g.drawString("Hans", 190, 390 );
    g.setColor(Color.black);
    g.drawString("Valerie", 285, 390 );
  }
}