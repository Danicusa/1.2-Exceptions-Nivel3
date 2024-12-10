package tascas102level1;

public class EmptySaleException extends Exception {
	public EmptySaleException() {
	    super("To do a sale, you must add at least one product to the sale.");
	  }
}
