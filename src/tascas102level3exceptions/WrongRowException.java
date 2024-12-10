package tascas102level3exceptions;

public class WrongRowException extends Exception {
	public WrongRowException() {
		super("Invalid row. It must be between 1 and the maximum number of cinema rows");
	}

}
