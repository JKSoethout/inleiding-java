package H11;

import java.applet.Applet;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class Opdr1 extends Applet {


	  public void init() {

}
	 
	  @SuppressWarnings("unused")
	public void paint(Graphics g) {
		  int i = 0;

		  int x = 50;
		  int y = 50;
		  
		  
		  while (i < 30) {
			  g.drawRect(1, y, 1000, 1);
				i++;
		  	y+= 10;
		  
	  }
	  } 
}