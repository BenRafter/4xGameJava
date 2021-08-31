package gamePackage;

public class start {
	public static void main(String[] args) {
		player jim = new player(1, 100, 200, 300);
		player comp = new player(0, 84,  65, 450);
		gameController temp = new gameController();
		temp.addPlayer(jim);
		temp.addPlayer(comp);
		temp.listPlayers();
	}
}
