package StudentGradeTraker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the size and the flag of the section: ");
		
		System.out.print("Size: "); int numStudents = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("Flag: "); String flag = scan.nextLine();

		
		ClassSection section = new ClassSection(numStudents, flag);
		
		ArrayList<Double> grades = new ArrayList<>();
		
		for(int i = 0; i < numStudents; i++)
		{
			System.out.print("Grade" + i + ": ");
			
			grades.add(scan.nextDouble());
		}
		
		section.setGrades(grades);
		
		double average = section.average();
		double highest = section.getHigest();
		double lowest = section.getLowest();
		
		System.out.println("\nAverage grade: " + average);
	    System.out.println("Highest grade: " + highest);
	    System.out.println("Lowest grade: " + lowest);
		
	}

}
