package SimpleBankingSystem;

import java.util.ArrayList;
import java.util.HashMap;


public class Account 
{
	private int accountNumber;
	
	private String name; //account owner
	
	private double amount; //Balance
	
    private static ArrayList<Integer> accountNums = new ArrayList<>();
	
    public static HashMap<Integer, Account> accounts = new HashMap<>();

	
	public Account(int accountNumber, String name, double amount) // can be substituted by a constructor
	{
		this.accountNumber = accountNumber;
		this.name = name;
		if(amount >= 1000) 
		{
			this.amount = amount;
			System.out.println("Dear "+ name + " your account created successfully with ");
			checkBalance();
			System.out.println();
			Account.accountNums.add(this.accountNumber);
			accounts.put(accountNumber, this);
		}
		
		else 
		{
			System.out.println("Account can not be initaited with negative or less than 1000$ balance!");
			System.out.println();
		}
	}
	
	public void deposit(double amount)
	{
		if(amount >= 5)
		{
			this.amount += amount;
			
			System.out.println("Dear " + this.name + ", " + amount + " is deposited successfully and your balance now is ");
			checkBalance();
			System.out.println();
		}
		
		else 
		{
			System.out.println("Can not deposit less than 5$");
			System.out.println();
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount > this.amount)
		{
			System.out.println("Insufficient Balance");
		}
		
		else 
		{
			this.amount =  this.amount - amount;
			System.out.println("Dear " + this.name + ", " + amount + " is withdrawn successfully and your balance now is ");
			checkBalance();
			System.out.println();
		}
	}
	
	public void checkBalance()
	{
		System.out.println("Balance = "  + this.amount);
		System.out.println();
	}
	
	public static boolean checkacountexistance(int accountNumber)
	{
		return accountNums.contains(accountNumber);
	}
	
	public String getName()
	{
		return this.name;
	}


	public String toString() 
	{
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", amount=" + amount + "]";
	}
	
}
