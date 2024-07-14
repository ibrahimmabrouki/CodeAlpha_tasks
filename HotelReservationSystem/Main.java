package HotelReservationSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		
		//here we are creating the hotel
		Hotel hotel = new Hotel();
		
		
		//here we are creating some rooms in the hotel
		hotel.addRoom(new Room(101, "Single", 100.0));
	    hotel.addRoom(new Room(102, "Double", 150.0));
	    hotel.addRoom(new Room(103, "Suite", 200.0));
	    hotel.addRoom(new Room(104, "Single", 100.0));
	    hotel.addRoom(new Room(105, "Double", 150.0));
	    hotel.addRoom(new Room(106, "Suite", 200.0));
	    
	    //here we are printing the available rooms before any of them booked
	    System.out.println("Available Rooms: \n");
	    for(Room room : hotel.getAvailableRooms())
	    {
	    	System.out.println(room);
	    }
	    
	    //Demostrating a certain reservation
	    
	    Customer customer1 = new Customer("Alex", "alex@gmail.com");
	    Customer customer2 = new Customer("Brown", "brown@gmail.com");
	    
	    
	    //Reservation for customer1
        LocalDate startDate1 = LocalDate.parse("2024-05-06", dateFormatter);
        LocalDate endDate1 = LocalDate.parse("2024-05-08", dateFormatter);
	    Reservation alex =  hotel.makeReservation(customer1, hotel.getAvailableRooms().remove(0), startDate1, endDate1);
	    
	    
	    //here we are printing the available rooms after booking the first room;
	    System.out.println("\nAvailable Rooms: \n");
	    for(Room room : hotel.getAvailableRooms())
	    {
	    	System.out.println(room);
	    }
	    
	  //Reservation for customer1
        LocalDate startDate2 = LocalDate.parse("2024-05-06", dateFormatter);
        LocalDate endDate2 = LocalDate.parse("2024-05-08", dateFormatter);
	    Reservation brown = hotel.makeReservation(customer2, hotel.getAvailableRooms().remove(3), startDate2, endDate2);
	    
	    
	    //here we are printing the available rooms after booking the first room;
	    System.out.println("\nAvailable Rooms: \n");
	    for(Room room : hotel.getAvailableRooms())
	    {
	    	System.out.println(room);
	    }
	    
	    hotel.cancleReservation(brown);
	    
	    System.out.println("\nAvailable Rooms: \n");
	    for(Room room : hotel.getAvailableRooms())
	    {
	    	System.out.println(room);
	    }
	    
	}

}
