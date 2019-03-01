package mainPack;

import java.util.HashMap;

public class Person {
	private String name;
	private String year;
   private int maxMinutes;
	private String[] chores;//linked list
	
	public Person(String name) {
		this.name = name;
	}
   
   public String getName() {
      return name;
   }
   
   public int getMaxMinutes() {
      return maxMinutes;
   }
   
   public String getChores() {
      return chores;
   }
   
   public String toString() {
      return
   }
   
   public void assignChore(Chore chore, String day) {
      if (chore.lenght() > 0) {
         chores += ", "; 
      }
      chores += chore.getName();
      minutes += chore.getMinutes();
   }  
}