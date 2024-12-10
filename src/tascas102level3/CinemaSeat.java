package tascas102level3;

public class CinemaSeat {
	private int rowNumber;
	private int seatNumber;
	private String guestName;
	
	public CinemaSeat(int rowNumber, int seatNumber, String guestName) {
		this.rowNumber = rowNumber;
		this.seatNumber = seatNumber;
		this.guestName = guestName;
	}
	
	public int getRowNumber() {
		return this.rowNumber;
	}
	public int getSeatNumber() {
		return this.seatNumber;
	}
	public String getGuestName() {
		return this.guestName;
	}
	
	public String equals() {
		return ""; // ver como hacerlo
	}
	
	public String toString() {
		return "Row: " + this.getRowNumber() + ", Seat: " + this.getSeatNumber() + ", Person: " + this.getGuestName();
	}
}
