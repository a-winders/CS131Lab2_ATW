
public class Application {

	public static void main(String[] args) {
		
		Wizard ec = new Wizard ();	// tests empty-argument constructor
		System.out.println(ec);
		
		Wizard pc = new Wizard ("Gandalf");	// tests preferred constructor
		System.out.println(pc);
		
		Wizard td = new Wizard ();	// tests takeDamage
		td.takeDamage(40);
		
		Wizard gn = new Wizard ();	// tests getName
		System.out.println(gn.getName());
		
		Wizard sn = new Wizard ();	// tests setName
		sn.setName("Gandalf");
		
		Wizard gh = new Wizard () ;	// tests getHealth
		System.out.println(gh.getHealth());
		
		Wizard sh = new Wizard ();	// tests setHealth
		sh.setHealth(0);
		
		Wizard gk = new Wizard ();	// tests getKey
		System.out.println(gk.getKey());
		
		Wizard sk = new Wizard ();	// tests setKey
		sk.setKey(2);
		
		Wizard testLock = new Wizard ();	// tests lock
		testLock.lock(3);
		
		Wizard unlock = new Wizard ();	// tests unlock
		unlock.unlock(0);
		
		Wizard il = new Wizard ();	// tests isLocked
		System.out.println(il.isLocked());
		
		Wizard wizardString = new Wizard ();	// tests toString
		System.out.println(wizardString.toString());
		
	}	// end main

}	// end class
