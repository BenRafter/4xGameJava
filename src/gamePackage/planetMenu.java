package gamePackage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class planetMenu {
	JFrame menu;
	String planetName = "";
	public void print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public void closeFrame() {
		menu.dispose();
	}
	
	public planetMenu(String _name) {
		this.planetName = _name;
	}
	
	public void openMenu() {
		menu = new JFrame(planetName + " menu");
		
		JLabel planetNameLabel = new JLabel("Planet name: ");
		planetNameLabel.setBounds(0, 10, 100, 50);
		menu.add(planetNameLabel);
		
		JLabel planetNameLabelActual = new JLabel(planetName);
		planetNameLabelActual.setBounds(100, 10, 100, 50);
		menu.add(planetNameLabelActual);
		
		menu.setSize(500,500);
		menu.setUndecorated(false);
		menu.setLayout(null);
		menu.setVisible(true);
	}
}
