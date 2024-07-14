package StudentGradeTraker;

import java.util.ArrayList;

public class ClassSection 
{
	private int numStudents;//number of students in the section
	
	private String section;
	
	private ArrayList<Double> grades = new ArrayList<>();
	
	public ClassSection(int numStudents, String section)
	{
		if(numStudents < 0) 
		{
			System.out.println("Class size invlid");
			return;
		}
		
		else 
		{
			this.numStudents = numStudents;
			this.section = section;
		}
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public ArrayList<Double> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Double> grades) {
		this.grades = grades;
	}
	
	public double average()
	{
		 double sum = 0.0;
		
		 for(double value : grades)
		 {
			 sum += value; 
		 }
		 
		 return sum/this.numStudents;
	}
	
	public double getHigest()
	{
		double highest = Double.MIN_VALUE;
		
		 for(double value : grades)
		 {
			 if(value > highest)
			 {
				 highest = value;
			 }
		 }
		 
		 return highest;
	}
	
	public double getLowest()
	{
		double lowest = Double.MAX_VALUE;
		
		 for(double value : grades)
		 {
			 if(value < lowest)
			 {
				 lowest = value;
			 }
		 }
		 
		 return lowest;
	}
	
	

}
