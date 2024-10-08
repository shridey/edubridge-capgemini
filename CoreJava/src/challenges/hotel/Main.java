package challenges.hotel;

import java.util.ArrayList;
import java.util.List;

class Customer {
	String name;
	int numberOfRooms;
	
	public Customer (String name, int numberOfRooms) {
		this.name = name;
		this.numberOfRooms = numberOfRooms;
	}
}

class Hotel {
	List<String> customerName = new ArrayList<String>();
	int roomsBooked = 0;
	
	public String checkIn(Customer customer) {
		if (checkRooms(customer).equals("Yes")) {
			customerName.add(customer.name);
			roomsBooked += customer.numberOfRooms;
			return "Checked in";
		} else {
			return "No rooms available";
		}
	}
	
	public String checkRooms(Customer customer) {
		return customer.numberOfRooms <= (10 - roomsBooked) ? "Yes" : "No";
	}
}

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("Shridhar", 4);
		Hotel hotel = new Hotel();
		System.out.println(hotel.checkIn(customer));
	}

}
