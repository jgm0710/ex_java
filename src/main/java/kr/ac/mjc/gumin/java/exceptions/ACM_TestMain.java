package kr.ac.mjc.gumin.java.exceptions;

public class ACM_TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ACM_HotelManager acm = new ACM_HotelManager();
		acm.setHeight(2);
		acm.setWidth(3);
		acm.setGuests(6);
		try {
			acm.room();
		} catch (GuestsOverRoomsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ACM_HotelManager acm2 = new ACM_HotelManager(2,3,6);
		try {
			acm2.room();
		} catch (GuestsOverRoomsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
