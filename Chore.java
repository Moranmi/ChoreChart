package mainPack;

import java.util.HashMap;

public class Chore {
	
	private int amount;
	private int minutes;
	private HashMap <String, ArrayList<Person>> mapPeople;
	private String choreName;
	
	public Chore(String choreNameP, String[] days, int minP, int amount) {
		this.amount = amount;
		this.choreName = choreNameP;
		this.minutes = minP;
		this.mapPeople = new HashMap<String, ArrayList<Person>>();
		for (String day : days) {
			mapPeople.put(day, new ArrayList<Person>);
		}
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public String getName() {
		return choreName;
	}
	
	public void assignChore(String day, String person) {
		mapPeople.get(day).add(person);
	}
	
	public boolean choreNotFilled(String day) {
		return mapPeople.get(day).size() < amount;
	}
}
