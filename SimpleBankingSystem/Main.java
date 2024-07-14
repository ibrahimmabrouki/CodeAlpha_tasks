package SimpleBankingSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		//here we assume that these account are already exists in the system
		
		Account account1 = new Account(1001, "Alice", 1500.0);
		Account account2 = new Account(1002, "Bob", 2000.0);
		Account account3 = new Account(1003, "Charlie", 3000.0);
		Account account4 = new Account(1004, "David", 4000.0);
		Account account5 = new Account(1005, "Eve", 500.0);
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Enter your AccountNumber: ");
		int accountNumber = scan.nextInt();
		
		scan.nextLine();
		
		if(!Account.checkacountexistance(accountNumber)) 
		{
			System.out.println("\nAccount Does not exists");
			return;
		}
		
		System.out.println("\nEnter your name: ");
		
		String name1 = scan.nextLine();// name passed as input
		
		Account temp = Account.accounts.get(accountNumber);//storing the retrieved account in temporary variable
		
		if(! name1.equals(temp.getName()))
		{
			System.out.println("Account number and name do not match");
			return;
		}
		
		boolean flag = true; // is a variable that determines whether the account closed or open for operations
		
		while(flag)
		{
			System.out.println("\nWelcome " + temp.getName());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            
            int choice = scan.nextInt();
            
            if(choice == 1)
            {
            	System.out.println("Enter the amount you want to add: ");
            	double amount = scan.nextDouble();
            	temp.deposit(amount);
            }
            
            else if(choice == 2)
            {
            	System.out.println("Enter the amount you want to withdraw: ");
            	double amount = scan.nextDouble();
            	temp.withdraw(amount);
            }
            
            else if(choice == 3)
            {
            	temp.checkBalance();
            }
            
            else if (choice == 4)
            {
            	System.out.println("Thank you");
				flag = false;
			}
            
            else {
				System.out.println("Invalid choice");
			}
            
		}
	

	}

}
