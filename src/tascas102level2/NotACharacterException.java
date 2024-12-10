package tascas102level2;

public class NotACharacterException extends Exception {
	public NotACharacterException() {
	    super("Invalid input. Please enter a valid character value.");
	  }
}
