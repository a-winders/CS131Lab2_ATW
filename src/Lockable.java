
public interface Lockable {
	
	public void setKey(int key);
	// end setKey
	
	public void lock (int key);
	// end lock
	
	public void unlock(int key);
	// end unlock
	
	public boolean isLocked ();
	// end isLocked
	
} // end class	


