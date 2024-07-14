package HotelReservationSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer 
{
	
	private String name;
	
	private String email;
	
	public Customer(String name, String email)
	{
		if(!isValidEmail(email))
		{
			System.out.println("Invalid Email");
			return;
		}
		
		else 
		{
			this.email = email;
			this.name = name;
		}
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(!isValidEmail(email))
		{
			System.out.println("Invalid Email");
			return;
		}
		
		else 
		{
			this.email = email;
		}
	}

	//The function below is to check the validity of the emial
	private boolean isValidEmail(String email) 
	{
        // Regular expression pattern for validating email addresses
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
	

}


