package Level3Ex1;

import java.util.Scanner;

import Level3Ex1Exceptions.FreeSeatException;
import Level3Ex1Exceptions.IncorrectPersonalNameException;
import Level3Ex1Exceptions.WrongRowException;
import Level3Ex1Exceptions.WrongSeatException;

public class CinemaManagement {
	
	static Cinema cinema1;
	
	public static Scanner sc = new Scanner(System.in);
	
	public CinemaManagement(Cinema cinema1) {
		CinemaManagement.cinema1 = cinema1;
	}	
	public static int menu() {
		int menu = -1;
		 
		System.out.println("What do you want to do?\n"
				+ "1. Show all reserved seats\n"
				+ "2. Show the seats reserved by one person\n"
				+ "3. Make a seat reservation\n"
				+ "4. Cancel a seat reservation\n"
				+ "5. Cancel all reservations for a person\n"
				+ "0. Exit");
				menu = sc.nextInt();
				
				return menu;

	}
	
	public static void showSeats() {
		String answer = " Reserved seats: \n";
		for (CinemaSeat seat : SeatManagement.cinemaSeats) {
			answer += seat.toString() + "\n";
		}
		System.out.println(answer);
	}
	
	public static void showPersonSeats() {
		String name = "";
		String answer = "";
		
		System.out.println("Write the name of the person");
		name = sc.next();
		
		for (CinemaSeat seat : SeatManagement.cinemaSeats) {
			if (seat.getGuestName().equals(name)) {
				answer += seat.toString();
			}
		}
		System.out.println(answer);
	}
	 static void reserveASeat() {
		int row = 0;
		int seat = 0;
		String name = "";
		int answer1 = -1;
		int answer2 = -1;
		 
		row = askForARow();
		answer1 = enterRow(row);
		
		if (answer1 > 0) {
		
		seat = askForASeat();
		answer2 = enterSeat(seat);
		}
		
		if (answer2 > 0) {
	
		name = askForAName();
		enterPerson(name);
		
		CinemaSeat cinemaS1 = new CinemaSeat(row,seat,name);
		SeatManagement.cinemaSeats.add(cinemaS1);	
		}
	 }
	 
	 static void cancelAReservation() {
		 int row = 0;
		 int seat = 0;
		 int cinemaSeat = 0;
		 
		 row = askForARow();
		 enterRow(row);
		 
		 seat = askForASeat();
		 enterSeat(seat);
		 
		 cinemaSeat = getRowIndex(row);
		 
		 try {
			 if (cinemaSeat == -1) {
				 throw new FreeSeatException();
			 } else {
				 SeatManagement.cinemaSeats.remove(cinemaSeat);
			 }
		 } catch (FreeSeatException e) {
			 System.out.println(e.getMessage());
		 }
		 
	 }
	 
	 public static void cancelPersonReservations() {
		 String name = "";
		 name = askForAName();
		 
		 for (int i = 0; i < SeatManagement.cinemaSeats.size(); i++) {
			 if (name.equals(SeatManagement.cinemaSeats.get(i).getGuestName())) {
				 SeatManagement.cinemaSeats.remove(i);
			 }
		 }
	 }
	 
	 static int enterRow(int row) {
		 int answer = -1;
		 
		 try {
			 if (row >= 1 && row <= CinemaManagement.cinema1.getTotalCinemaRows()) {
				 answer = row;
			 } else {
				 throw new WrongRowException();
			 }
		 
		 } catch (WrongRowException e) {
			 System.out.println(e.getMessage());			 
		 }	 
		 return answer;
	 }
	 
	 static int enterSeat(int seat) {
		 int answer = -1;
		 
		 try {
			 if (seat >= 1 && seat <= CinemaManagement.cinema1.getTotalCinemaSeats()) {
				 answer = seat;
			 } else {
				 throw new WrongSeatException();
			 }
		 } catch (WrongSeatException e) {
			System.out.println(e.getMessage());
		 }
		 
		 return answer;
	 }
	 
	 static String enterPerson(String name) {
		 String answer = "";
		 boolean nameTest = false;
		 
		 nameTest = containsNumbers(name);
		 
		 try {
			 if (nameTest == true) {
				 throw new IncorrectPersonalNameException();
			 } else {
				 answer = name;
			 }
		 } catch (IncorrectPersonalNameException e) {
			 System.out.println(e.getMessage());
		 }
		 
		 return answer;
	 }
	 
	 public static boolean containsNumbers(String name) {
		 boolean answer = false;
		    for (int i = 0; i < name.length(); i++) {
		        if (Character.isDigit(name.charAt(i))) {
		            answer = true;  
		        }
		    }
		    return answer;  
		}
	 
	 public static int askForARow() {
		 int row = 0;
		 
		 System.out.println("Enter the row number");
			row = sc.nextInt();
			
			return row;
	 }
	 
	 public static int askForASeat() {
		 int seat = 0;
		 
		 System.out.println("Enter the seat number");
			seat = sc.nextInt();
			
			return seat;
	 }
	 
	 public static String askForAName() {
		 String name = "";
		 
		 System.out.println("Enter the name of the person that makes the reservation");
			name = sc.next();
			
			return name;
	 }
	 
	 public static int getRowIndex(int row) {
		 boolean control = false;
		 int index  = -1;
		 
		 for (int i = 0; i < SeatManagement.cinemaSeats.size() && !control; i++) {
			 if (row == SeatManagement.cinemaSeats.get(i).getRowNumber()) {
				 index = i;
				 control = true;
			 }
		 }
		 
		 return index;
	 }
	 
	 public static String Exit() {
	 
	 return "You have exited the program";	
	}
}

