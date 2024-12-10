package tascas102level3;

import java.util.ArrayList;
import java.util.InputMismatchException;

import tascas102level3exceptions.FreeSeatException;
import tascas102level3exceptions.TakenSeatException;

public class SeatManagement {
	static ArrayList<CinemaSeat> cinemaSeats;
	
	public SeatManagement() {
		SeatManagement.cinemaSeats = new ArrayList <CinemaSeat>();
	}
	
	public ArrayList<CinemaSeat> getCinemaSeats() {
		return SeatManagement.cinemaSeats;
	}
	
	public void addSeat(CinemaSeat cinemaSeat) {
		int rowNumber = 0;
		int seatNumber = 0;
		int answer = 0;
		
		rowNumber = cinemaSeat.getRowNumber();
		seatNumber = cinemaSeat.getSeatNumber();
	
		try {
			answer = searchSeat(rowNumber, seatNumber);
			
			if (answer == -1) {
				throw new TakenSeatException();
			}
			SeatManagement.cinemaSeats.add(cinemaSeat);
			
	    } catch (TakenSeatException e) {
	        System.out.println(e.getMessage());    
	    }
	}
	
	public static void removeSeat(int rowNumber, int seatNumber) {
		int answer = 0;
		
		try {
			answer = searchSeat(rowNumber, seatNumber);
			
			if (answer == -1) {
				throw new FreeSeatException();
			} else {
				cinemaSeats.remove(answer);
			}
			
		} catch (FreeSeatException e) {
			System.out.println(e.getMessage());
		}
	}
		
	public static int searchSeat(int rowNumber, int seatNumber) {
		boolean control = false;
		int answer = -1;
		for (int i = 0;  i < cinemaSeats.size() && !control; i++) {
			if (rowNumber == SeatManagement.cinemaSeats.get(i).getRowNumber() &&
				seatNumber == SeatManagement.cinemaSeats.get(i).getSeatNumber()) {
				answer = i;
				control =  true;
			}
		}
		return answer;
	}
}

