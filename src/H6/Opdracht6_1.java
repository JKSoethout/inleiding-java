package H6;
import java.awt.*;
import java.applet.*;


@SuppressWarnings("serial")
public class Opdracht6_1 extends Applet {
    int a;
    int b;
    double uitkomst;
	
	
    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a / b) ;
    }

    public void paint(Graphics g) {
    	g.drawString("Jan: " + uitkomst, 20, 20);
    	g.drawString("Ali:" + uitkomst, 20, 40);
    	g.drawString("Jeannette" + uitkomst, 20, 60);
    	g.drawString("Julia" + uitkomst, 20, 80);
    }
}