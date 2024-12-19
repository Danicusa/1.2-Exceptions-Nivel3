package Level2Ex1;

public class EmptyStringException extends Exception {
	public EmptyStringException() {
	    super("The string cannot be empty or shorter than 2, please write something");
	  }
}
