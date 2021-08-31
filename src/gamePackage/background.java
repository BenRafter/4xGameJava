package gamePackage;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class background {
	public static JFrame f = new JFrame("Background");
	
	public void print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public void closeFrame() {
		f.dispose();
	}
	
	public static void startBackground() {
		
		planet tempPlanet = new planet("Earth", f, 50, 50);
		tempPlanet.addToBackground();
		
		planet tempPlanet2 = new planet("Mars", f, 500,365);
		tempPlanet2.addToBackground();
		
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setUndecorated(false);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		startBackground(); 
	}
}
