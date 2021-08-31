package gamePackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class planet {
	String name = "";
	int xCord = 0;
	int yCord = 0;
	JFrame frame;
	
	public void print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public planet(String _name, JFrame backGround, int _xCord, int _yCord) {
		this.name = _name;
		this.xCord = _xCord; 
		this.yCord = _yCord;
		this.frame = backGround;
	}
	
	public String getName() {
		return name;
	}
	
	public void addToBackground() {
		JButton thisPlanet = new JButton(name);
		thisPlanet.setBounds(xCord, yCord, 100, 100);
		thisPlanet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print(name + " clicked");
				planetMenu temp = new planetMenu(name);
				temp.openMenu();
			}
		});
		frame.add(thisPlanet);
	}
}
