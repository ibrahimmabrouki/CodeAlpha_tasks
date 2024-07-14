package HotelReservationSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation 
{
	private Customer customer;
	private Room room;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	
	
	public Reservation(Customer customer, Room room, LocalDate checkInDate, LocalDate checkOutDate) 
	{
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Room getRoom() {
		return room;
	}


	public void setRoom(Room room) {
		this.room = room;
	}


	public LocalDate getCheckInDate() {
		return checkInDate;
	}


	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}


	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}


	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	


	
}
