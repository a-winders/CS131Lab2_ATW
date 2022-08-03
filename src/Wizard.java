
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable {
	
	private String name; 
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		this.setName("");
		this.setHealth(100);
		this.setKey(0);
		this.locked = false;
		
	}//end empty-argument constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
		this.name = name;
		this.setHealth(100);
		this.setKey(0);
		this.locked = false;
	}//end preferred constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		int takeDamage = (health - power);
		
		if(this.isLocked() == true)
			System.out.println(health - 0);
		else
			System.out.println(takeDamage);
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey

	@Override
	public void setKey(int key) {
		if (key > 0 && key != 0)
		{	
			this.key = key;
			System.out.println("Key is: " +key);
		}
	}	// end setKey

	@Override
	public void lock(int key) {
		if(key == this.key)
		{
			locked = true;
			System.out.println("LOCKED");
			
		}	
	}	// end lock

	@Override
	public void unlock(int key) {
		if (key == this.key)
		{	
			locked = false;
			System.out.println("UNLOCKED");
		}	
	}	// end unlock

	@Override
	public boolean isLocked() {
		return locked;
	}	// end isLocked

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class
