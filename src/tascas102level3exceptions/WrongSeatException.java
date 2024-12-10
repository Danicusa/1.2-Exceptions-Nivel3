package tascas102level3exceptions;

public class WrongSeatException extends Exception {
	public WrongSeatException() {
		System.out.println("Invalid seat. It must be between 1 and the maximum number of cinema seats");
	}
}
