package tascas102level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	public static Scanner sc = new Scanner(System.in);

	  public static byte readByte(String message) {
	    byte value = 0;
	    boolean validInput = false;

	    while (!validInput) {
	      try {
	        System.out.println(message);
	        value = sc.nextByte();
	        sc.nextLine();
	        validInput = true;
	      } catch (InputMismatchException e) {
	        System.out.println("Invalid input. Please enter a valid byte value.");
	        sc.nextLine();
	      }
	    }
	    return value;
	  }

	  public static int readInt(String message) {
	    int value = 0;
	    boolean validInput = false;

	    while (!validInput) {
	      try {
	        System.out.println(message);
	        value = sc.nextInt();
	        sc.nextLine();
	        validInput = true;
	      } catch (InputMismatchException e) {
	        System.out.println("Invalid input. Please enter a valid integer value.");
	        sc.nextLine();
	      }
	    }
	    return value;
	  }

	  public static float readFloat(String message) {
	    float value = 0f;
	    boolean validInput = false;

	    while (!validInput) {
	      try {
	        System.out.println(message);
	        value = sc.nextFloat();
	        sc.nextLine();
	        validInput = true;
	      } catch (InputMismatchException e) {
	        System.out.println("Invalid input. Please enter a valid float value.");
	        sc.nextLine();
	      }
	    }
	    return value;
	  }

	  public static double readDouble(String message) {
	    double value = 0d;
	    boolean validInput = false;

	    while (!validInput) {
	      try {
	        System.out.println(message);
	        value = sc.nextDouble();
	        sc.nextLine();
	        validInput = true;
	      } catch (InputMismatchException e) {
	        System.out.println("Invalid input. Please enter a valid double value.");
	        sc.nextLine();
	      }
	    }
	    return value;
	  }

	  public static char readChar(String message) {
	    char finalValue = ' ';
	    String value = "";
	    boolean validInput = false;

	    while (!validInput) {
	      try {
	        System.out.println(message);
	        value = sc.nextLine();

	        if (value.length() != 1) {
	          throw new NotACharacterException();
	        }
	        validInput = true;
	        finalValue = value.charAt(0);
	      } catch (NotACharacterException e) {
	        System.out.println(e.getMessage());
	      }
	    }
	    return finalValue;
	  }

	  public static String readString(String message) {
	    String value = "";
	    boolean validInput = false;

	    while (!validInput) {
	      try {
	        System.out.println(message);
	        value = sc.nextLine();

	        if (value.length() == 0) {
	          throw new EmptyStringException();
	        }
	        validInput = true;
	      } catch (EmptyStringException e) {
	        System.out.println(e.getMessage());
	      }
	    }
	    return value;
	  }

	  public static boolean readYesNo(String message) {
	    boolean validInput = false;
	    boolean finalValue = false;
	    String value = "";

	    while (!validInput) {
	      try {
	        System.out.println(message);
	        value = sc.next();

	        if (!value.equalsIgnoreCase("y") && !value.equalsIgnoreCase("n")) {
	          throw new NotACorrectBoolean();
	        }
	        if (value.equalsIgnoreCase("y")) {
	          finalValue = true;
	          validInput = true;
	        } else {
	          finalValue = false;
	          validInput = true;
	        }
	      } catch (NotACorrectBoolean e) {
	        System.out.println(e.getMessage());
	      }
	    }
	    return finalValue;
	  }
}
