package Level3Ex1Exceptions;

public class IncorrectPersonalNameException extends Exception {
	public IncorrectPersonalNameException() {
		System.out.println("The name cannot contain numbers");
	}
}
