package HotelReservationSystem;

import java.time.LocalDate;
import java.util.ArrayList;


public class Hotel 
{
	private ArrayList<Room> rooms;
	private ArrayList<Reservation> reservations;
	private ArrayList<Payment> payments;
	
	public Hotel()
	{
		 this.rooms = new ArrayList<>();
	     this.reservations = new ArrayList<>();
	     this.payments = new ArrayList<>();
	}
	
	public void addRoom(Room room)
	{
		this.rooms.add(room);
	}
	
	public ArrayList<Room> getAvailableRooms()
	{
		ArrayList<Room> temp = new ArrayList<>();
		
		for(Room room : this.rooms)
		{
			if(room.isAvailable()) 
			{
				temp.add(room);
			}
		}
		
		return temp;
	}
	
	public Reservation makeReservation(Customer customer, Room room, LocalDate checkInDate, LocalDate CheckOutDate)
	{
		Reservation reservation = new Reservation(customer, room, checkInDate, CheckOutDate);
		room.setAvailable(false);
		reservations.add(reservation);
		
		return reservation;
	}
	
	public void cancleReservation(Reservation reservation)
	{
		reservation.getRoom().setAvailable(true);
		reservations.remove(reservation);
	}
	
	public double getTotalRevenue() 
	{
        double totalRevenue = 0.0;
        for (Payment payment : payments) 
        {
            totalRevenue += payment.getCost();
        }
        return totalRevenue;
    }
	
	public ArrayList<Reservation> getReservationsForCustomer(Customer customer) 
	{
		ArrayList<Reservation> customerReservations = new ArrayList<>();
		
        for (Reservation reservation : reservations) 
        {
            if (reservation.getCustomer().equals(customer)) 
            {
                customerReservations.add(reservation);
            }
        }
        return customerReservations;
    }
	
	
	//the function below retrieve the reservation of a certain room
	public Reservation getReservationByRoom(Room room)
	{
		for(Reservation reservation : reservations)
		{
			if(reservation.getRoom().equals(room))
			{
				return reservation;
			}
		}
		
		return null;
	}
	
	
	//the function below retrieve the payment at certain data;
	public ArrayList<Payment> getPaymentsByDate(LocalDate date)
	{
		ArrayList<Payment> temp = new ArrayList<>();
		
		for(Payment payment : payments)
		{
			if(payment.getReservation().getCheckInDate().equals(date))
			{
				temp.add(payment);
			}
		}
		
		if(!temp.isEmpty())
		{
			return temp;
		}
		return null;
	}
	
	
	//the function below return the TotalRevenue at certain data interval;
	public double calculateTotalRevenue(LocalDate startDate, LocalDate endDate)
	{
		double totalRevenue = 0.0;
		
		for(Payment payment : payments)
		{
			if(payment.getReservation().getCheckInDate().isAfter(startDate) && 
					payment.getReservation().getCheckOutDate().isBefore(endDate))
			{
				totalRevenue += payment.getCost();
			}
		}
		
		return totalRevenue;
	}
}
