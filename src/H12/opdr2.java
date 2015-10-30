package H12;

import java.applet.Applet;
import java.awt.Button;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class opdr2 extends Applet {

	
	
    Button knop;
    double[] aantal;

public void init() {
	setSize(500,200);
	knop = new Button("");
	aantal = new double[24];
	aantal[0] = 1;
	int x = 20;
	int y = 20;
	for (int i = 0; i < 25; i++) {
            JButton b = new JButton("button");
            b.setBounds(x, y, 100, 20);               
            this.add(b);
 }
	}
}