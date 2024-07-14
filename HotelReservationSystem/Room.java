package HotelReservationSystem;

public class Room 
{
	private int roomNumber;
	private String type;
	private boolean available;
	private double price;
	
	public Room(int roomNumber, String type, double price)
	{
		this.roomNumber = roomNumber;
		this.type = type;
		this.available = true;
		this.price  = price;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", type=" + type + ", available=" + available + ", price=" + price
				+ "]";
	}
	
	
	
}
