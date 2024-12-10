package tascas102level3exceptions;

public class TakenSeatException extends Exception {
	public TakenSeatException() {
		super("This seat is already taken, please select a new one");
	}
}
