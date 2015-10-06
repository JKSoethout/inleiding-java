package toets;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class toetsopdr2 extends Applet {
	TextField tekstvak;
    Label label;
    Label label2;
    Button minButton;
    Button plusButton;
    double rekening;
    double fooi;
    int min;
    int plus;
    
	
    public void init() {
    	fooi = 15;
        tekstvak = new TextField("", 20);
        label = new Label("Rekening bedrag");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
		
		minButton = new Button("-");
		MinKnopLuisteraar mkl = new MinKnopLuisteraar();
		minButton.addActionListener(mkl);
		add(minButton);
		
		 plusButton = new Button("+");
			PlusKnopLuisteraar pkl = new PlusKnopLuisteraar();
			plusButton.addActionListener(pkl);
			add(plusButton);
		
	
    }
	
    public void paint(Graphics g) {
    	setSize(750,300);
        g.drawString("Fooi = € " + (rekening * (fooi / 100+1) - rekening), 50, 120 );
        g.drawString("Totaal incl. fooi = € " + rekening * (fooi / 100+1), 50, 140 );
        g.drawString("Percentage fooi " + fooi, 90, 60);
        minButton.setLocation(210, 44);
        plusButton.setLocation(300, 44);
    }
    
    class MinKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			min--;
			fooi--;
			repaint();
		}
	}
    

    class PlusKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			plus++;
			fooi++;
			repaint();
		}
	}
    
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            rekening = Double.parseDouble( s );
            repaint();
        						
        		}
        }
}