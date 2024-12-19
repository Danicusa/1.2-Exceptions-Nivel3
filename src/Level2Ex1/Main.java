package Level2Ex1;

public class Main {

	public static void main(String[] args) {
		byte value0 = 0;
	    char value = ' ';
	    String value2 = "";
	    float value3 = 0f;
	    double value4 = 0d;
	    int value5 = 0;
	    boolean value6 = false;

	    value0 = Input.readByte("Enter a byte: ");
	    System.out.println("Your byte is : " + value0 + "\n");

	    value = Input.readChar("Enter a character");
	    System.out.println("Your character is: " + value + "\n");

	    value2 = Input.readString("Enter a string");
	    System.out.println("Your String is: " + value2 + "\n");

	    value3 = Input.readFloat("Enter a float");
	    System.out.println("Your float is : " + value3 + "\n");

	    value4 = Input.readDouble("Enter a double");
	    System.out.println("Your double is : " + value4 + "\n");

	    value5 = Input.readInt("Enter an int");
	    System.out.println("Your int is : " + value5 + "\n");

	    value6 = Input.readYesNo("Enter: y for true or n for false");
	    System.out.println("Your answer is: " + value6 + "\n");
	 }
}


