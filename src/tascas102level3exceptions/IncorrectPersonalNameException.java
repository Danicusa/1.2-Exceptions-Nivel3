package tascas102level3exceptions;

public class IncorrectPersonalNameException extends Exception {
	public IncorrectPersonalNameException() {
		System.out.println("The name cannot contain numbers");
	}
}
