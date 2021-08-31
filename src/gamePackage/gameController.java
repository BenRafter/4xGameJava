package gamePackage;

import java.util.ArrayList;
import java.util.List;

public class gameController {
	player currentTurn;
	List<player> playerList = new ArrayList<player>();
	
	public static void print(Object toPrint) {
		System.out.println(toPrint);
	}
	
	public gameController() {
		
	}
	
	public void addPlayer(player toAdd) {
		playerList.add(toAdd);
	}
	
	public void listPlayers() {
		print("Printing player list.....");
		for(int i = 0; i < playerList.size(); i++) {
			print(playerList.get(i).toString());
		}
	}
}
