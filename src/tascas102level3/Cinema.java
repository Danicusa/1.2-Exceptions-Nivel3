package tascas102level3;

import java.util.Scanner;

public class Cinema {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	private static int totalCinemaRows;
	private static int totalCinemaSeats;	
	private CinemaManagement cineMang;
	private SeatManagement seatMang;
	
	public Cinema() {
		this.cineMang = new CinemaManagement(this);
		this.seatMang = new SeatManagement();
		askForInitialData();
	}
	
	public int getTotalCinemaRows() {
		return Cinema.totalCinemaRows;
	}
	
	public int getTotalCinemaSeats() {
		return Cinema.totalCinemaSeats;
	}
	
	public void askForInitialData() {
		System.out.println("Enter the number of the cinema rows");
		Cinema.totalCinemaRows = sc.nextInt();
		System.out.println("Enter the number of the cinema seats");
		Cinema.totalCinemaSeats = sc.nextInt();
	}
	
	public static void start() {
		int answer = -1;
		do {
		answer = CinemaManagement.menu();
		
	
		switch(answer) {
		case 1:
			CinemaManagement.showSeats();
			break;
		case 2:
			CinemaManagement.showPersonSeats();
			break;
		case 3:
			CinemaManagement.reserveASeat();
			break;
		case 4:
			CinemaManagement.cancelAReservation();
			break;
		case 5:
			CinemaManagement.cancelPersonReservations();
			break;
		case 0:
			CinemaManagement.Exit();
			break;
		}
		} while (answer != 0);
	}
}
