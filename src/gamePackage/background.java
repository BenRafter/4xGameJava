package gamePackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class background {
	public static JFrame f = new JFrame("Background");
	gameController gc;
	
	public static void print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public void closeFrame() {
		f.dispose();
	}
	
	public background(gameController _gc) {
		this.gc = _gc;
	}
	
	public static void startBackground() {
		
		planet tempPlanet = new planet("Earth", f, 50, 50, 8000000000.0);
		tempPlanet.addToBackground();
		
		planet tempPlanet2 = new planet("Mars", f, 500,365, 1000000.0);
		tempPlanet2.addToBackground();
		
		JButton nextTurn = new JButton("Next turn");
		nextTurn.setBounds(1400, 700, 100,100);
		nextTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print("Next turn button pressed");
			}
		});
		f.add(nextTurn);
		
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setUndecorated(false);
		f.setLayout(null);
		f.setVisible(true);
	}
}
