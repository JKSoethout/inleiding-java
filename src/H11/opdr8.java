package H11;

import java.applet.Applet;
import java.awt.Graphics;



@SuppressWarnings("serial")
public class opdr8 extends Applet {
int cijfer;



	  public void init() {
		  setSize(250,250);


}
	 
	  @SuppressWarnings("unused")
	public void paint(Graphics g) {
	setSize(750,750);
		  int x = 10;
		  int y = 10;
		  int hoogte = 10;
		  int laagte = 10;

		  
		 for(int i = 0; i < 110; i++) {
			 
	g.drawRoundRect(hoogte, hoogte, x, y, x, y);

		x+=10;
		y+=10;
		  
		  	
	  }
	  } 

	  }
