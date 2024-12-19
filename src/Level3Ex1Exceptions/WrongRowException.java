package Level3Ex1Exceptions;

public class WrongRowException extends Exception {
	public WrongRowException() {
		super("Invalid row. It must be between 1 and the maximum number of cinema rows");
	}

}
