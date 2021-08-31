package gamePackage;

import java.util.ArrayList;
import java.util.List;

public class player {
	String type;
	int materials = 0;
	int money = 0;
	int food = 0;
	List<planet> controlledPlanets = new ArrayList<planet>();
	
	public player(int _type, int startingMaterials, int startingMoney, int startingFood) {
		if(_type == 1) {
			type = "Human";
		}else {
			type = "Computer";
		}
		materials = startingMaterials; 
		money = startingMoney;
		food = startingFood;
	}
	
	public String getType() {
		return type;
	}
	
	public int getMaterials() {
		return materials;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getFood() {
		return food;
	}
	
	public void updateMaterials(int _materials) {
		materials += _materials; 
	}
	
	public void updateMoney(int _money) {
		money += _money;
	}
	
	public void updateFood(int _food) {
		food += _food;
	}
	
	public void capturedPlanet(planet capedPlanet) {
		controlledPlanets.add(capedPlanet);
	}
	
	public void lostPlanet(planet lostPlanet) {
		for(int i = 0; i < controlledPlanets.size(); i++) {
			if(controlledPlanets.get(i) == lostPlanet) {
				controlledPlanets.remove(i);
			}
		}
	}
	
	public List<planet> getControlledPlanets() {
		return controlledPlanets;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Player type: " + type);
		sb.append(" current materials amount: " + this.getMaterials());
		sb.append(" current money amount: " + this.getMoney());
		sb.append(" current food amount: " + this.getFood());
		return sb.toString();
	}
}
