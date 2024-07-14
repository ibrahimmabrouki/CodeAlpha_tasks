package TravelItineraryPlanner;

import java.time.LocalDate;
import java.time.LocalTime;


public class Destination 
{
	private String name;//name of the destination
	private LocalDate date;
	private LocalTime time;
	private String specs; //Specifications such as know places of know activities
	
	
	public Destination(String name, LocalDate data)
	{
		this.name = name;
		this.date = date;
	}
	
	public Destination(String name, LocalDate data, LocalTime time, String specs)
	{
		this.name = name;
		this.date = date;
		this.time = time;
		this.specs = specs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	@Override
	public String toString() {
		return "Destination [name=" + name + ", date=" + date + ", time=" + time + ", specs=" + specs + "]";
	}
	
	
}
