package H11;

import java.applet.Applet;
import java.awt.Graphics;



@SuppressWarnings("serial")
public class opdr7 extends Applet {
int cijfer;




	  public void init() {
		  setSize(250,250);


}
	 
	  @SuppressWarnings("unused")
	public void paint(Graphics g) {
	setSize(750,750);
		  int x = 10;
		  int y = 10;
		  int hoogte = 300;
		  int laagte= 500;

		  
		 for(int i = 0; i < 50; i++) {
			 
	g.drawRoundRect(hoogte, hoogte, x, y, x, y);
		hoogte -=5;
		x+=10;
		y+=10;
		  
		  	
	  }
	  } 

	  }
