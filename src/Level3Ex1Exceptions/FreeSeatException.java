package Level3Ex1Exceptions;

public class FreeSeatException extends Exception {
	public FreeSeatException() {
		super("This seat is free, please select a taken seat");
	}
}
