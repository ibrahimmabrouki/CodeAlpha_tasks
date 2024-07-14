package TravelItineraryPlanner;

import java.util.ArrayList;

public class TravelPlan 
{
	private ArrayList<Destination> destinations;// ArrayList because the size of the array is undetermined 
	
	public TravelPlan()
	{
		destinations = new ArrayList<>();
	}
	
	public void addDestination(Destination destination)
	{
		this.destinations.add(destination);
	}
	
	public ArrayList<Destination> getDestinaitons()
	{
		return destinations;
	}

	@Override
	public String toString() {
		return "TravelPlan [destinations=" + destinations + "]";
	}
	
	

}
