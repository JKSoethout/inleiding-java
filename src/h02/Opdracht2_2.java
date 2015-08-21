package h02;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Opdracht2_2 extends Applet {
	 public void init() {
		    setBackground(Color.white);
		  }

		  public void paint(Graphics g) {
		    g.setColor(Color.blue);
		    g.drawString("Yuliya", 50, 60 );
		    g.setColor(Color.red);
		    g.drawString("Soethout", 40, 70 );
		  }
}
