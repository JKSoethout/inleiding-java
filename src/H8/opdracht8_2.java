package H8;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class opdracht8_2 extends Applet {
Button mButton;
Button vButton;
Button mlButton;
Button vlButton;
int man;
int vrouw; 
int manL;
int vrouwL;
int totaal;


public void init() {
	setSize(500, 400);
	mButton = new Button("man");
	add(mButton);
	ManKnopLuisteraar mkl = new ManKnopLuisteraar();
	mButton.addActionListener(mkl);
	vButton = new Button("vrouw");
	vButton.addActionListener(new VrouwKnopLuisteraar());
	add(vButton);
	mlButton = new Button("man LL");
	mlButton.addActionListener(new ManLLKnopLuisteraar());
	add(mlButton);
	vlButton = new Button ("vrouw LL");
	vlButton.addActionListener(new VrouwLLKnopLuisteraar());
	add(vlButton);
	man = 0;
	vrouw = 0;
	vrouwL = 0;
	manL = 0;
	totaal = 0;
}

  
public void paint(Graphics g){
	int x = 50;
	int y = 70;
	g.drawString("aantal mannen: " + man, x, y);
	y = y + 20;
	g.drawString("aantal vrouwen: " + vrouw, x, y);
	y = y + 20;
	g.drawString("aantal mannelijke leerlingen: " + manL, x, y);
	y = y + 20;
	g.drawString("aantal vrouwelijke leerlingen: " + vrouwL, x, y);
	y = y + 20;
	g.drawString("Totaal: " + totaal, x, y);
}
	
	
	class ManKnopLuisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			man++;
			manL++;
			totaal++;
			repaint();
			
			
		}
	}


	class VrouwKnopLuisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			vrouw++;
			totaal++;
			repaint();
			
		}
	}

	
	class ManLLKnopLuisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			manL++;
			totaal++;
			repaint();
		}
	}
	
	
	class VrouwLKnopLuisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			vrouw++;
			totaal++;
			repaint();
		}
	}
	
	
	class VrouwLLKnopLuisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			vrouwL++;
			totaal++;
			repaint();
		}
	}
	

}
