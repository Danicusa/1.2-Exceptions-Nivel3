package tascas102level2;

public class EmptyStringException extends Exception {
	public EmptyStringException() {
	    super("The string cannot be empty, please write something");
	  }
}
