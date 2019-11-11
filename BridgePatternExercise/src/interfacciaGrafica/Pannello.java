package interfacciaGrafica;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;

import pattern.Auto;

public class Pannello extends JPanel{
	
	Auto auto;
	
	public Pannello(Auto auto) {
		this.auto = auto;		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D grafica2d = (Graphics2D) g;
		grafica2d.drawImage(auto.getImg(),0,0,this);
	}

}
