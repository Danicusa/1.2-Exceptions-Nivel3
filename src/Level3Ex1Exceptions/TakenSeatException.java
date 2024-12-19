package Level3Ex1Exceptions;

public class TakenSeatException extends Exception {
	public TakenSeatException() {
		super("This seat is already taken, please select a new one");
	}
}
