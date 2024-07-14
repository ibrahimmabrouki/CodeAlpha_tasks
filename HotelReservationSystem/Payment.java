package HotelReservationSystem;

public class Payment 
{
	private Reservation reservation;
	private double cost;
	
	public Payment(Reservation reservation, double cost)
	{
		this.reservation = reservation;
		this.cost = cost;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
