package gamePackage;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class planetMenu {
	JFrame menu;
	String planetName = "";
	double population = 0;
	public void print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public void closeFrame() {
		menu.dispose();
	}
	
	public planetMenu(String _name, double _population) {
		this.planetName = _name;
		this.population = _population;
	}
	
	public void openMenu() {
		menu = new JFrame(planetName + " menu");
		
		JLabel planetNameLabel = new JLabel("Planet name: ");
		planetNameLabel.setBounds(0, 10, 100, 50);
		menu.add(planetNameLabel);
		
		JLabel planetNameLabelActual = new JLabel(planetName);
		planetNameLabelActual.setBounds(100, 10, 100, 50);
		menu.add(planetNameLabelActual);
		
		JLabel planetPopulationLabel = new JLabel("Population: ");
		planetPopulationLabel.setBounds(0, 60, 100, 50);
		menu.add(planetPopulationLabel);
		
		String popTemp = Double.toString(population);
		JLabel planetPopulationLabelActual = new JLabel(popTemp);
		planetPopulationLabelActual.setBounds(100, 60 ,100, 50);
		menu.add(planetPopulationLabelActual);
		
		menu.setSize(500,500);
		menu.setUndecorated(false);
		menu.setLayout(null);
		menu.setVisible(true);
	}
}
