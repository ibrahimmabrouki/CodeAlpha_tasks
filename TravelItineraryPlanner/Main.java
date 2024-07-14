package TravelItineraryPlanner;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Main {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to our travel planning application!");
		
		System.out.print("Enter your total budget: ");
		
        double budgeta = scan.nextDouble();
        scan.nextLine();  
        Budget budget = new Budget(budgeta);
		
        TravelPlan travelPlan = new TravelPlan();
		boolean flag = true;// flag to enter more destination.
		int count = 1;
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        //both the above two lines are used to format the entered string as required for the data and time instead of dividing the string manually


		while(flag)
		{
			System.out.print("Enter the " + count + " destination: ");
			String name = scan.nextLine();
			
			System.out.print("Enter travel date (YYYY-MM-DD): ");
	        String dateString = scan.nextLine();
	        LocalDate date = LocalDate.parse(dateString, dateFormatter);
	        
	        System.out.print("Enter travel time (HH:mm): ");
	        String timeString = scan.nextLine();
	        LocalTime time = LocalTime.parse(timeString, timeFormatter);
	        
	        System.out.print("Enter specifications: ");
            String preferences = scan.nextLine();
            
            Destination destination = new Destination(name, date, time, preferences);
            travelPlan.addDestination(destination);
            
            System.out.print("Enter estimated cost for this destination: ");
            budget.addExpense(scan.nextDouble());
            scan.nextLine();
            
            System.out.print("Do you want to add another destination? (yes/no): ");
            String response = scan.nextLine().trim().toLowerCase();

            if(response.equals("no"))
            {
            	flag = false;
            }
            
			//the blow while section is to allow the user enter the response more than one in case not entering yes or no
			while(!response.equals("yes") && !response.equals("no")) 
			{
	            System.out.println("Invalid response. Please enter 'yes' or 'no'.");
	            response = scan.nextLine().trim().toLowerCase();
	            if(response.equals("no"))
	            {
	            	flag = false;
	            }
	        }
            
            System.out.println();
            count++;
		}
		
		System.out.println(travelPlan);
		System.out.println();
		
        System.out.println(budget);
        
        for (Destination destination : travelPlan.getDestinaitons()) 
        {
            System.out.println(WeatherService.getWeather(destination.getName()));
            System.out.println(MapService.getMap(destination.getName()));
            System.out.println();
        }

		
	}
		
		
		
		
}
