package TravelItineraryPlanner;

public class Budget 
{
	private double totalBudget;
	private double totalexpenses;
	
	public Budget(double totalBudget)
	{
		this.totalBudget = totalBudget;
		this.totalexpenses = 0;
	}
	
	public void addExpense(double expense)
	{
		this.totalexpenses += expense;
	}
	
	public double remainingBudget()
	{
		return this.totalBudget - this.totalexpenses;
	}
	
	 public String toString() 
	 {
	        return "Total Budget: $" + totalBudget + ", Expenses: $" + totalexpenses + ", remaining: $" + remainingBudget();
	 }

}
