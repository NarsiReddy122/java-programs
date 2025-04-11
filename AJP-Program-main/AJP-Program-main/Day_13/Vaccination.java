package oops;

import java.util.Scanner;

// Main class read the age and nationality 

public class Vaccination {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter the nationality :");
		String nationality=sc.next();

		VaccinationSuccessful obj1=new VaccinationSuccessful(age,nationality);
		boolean first_dose=false;
		// check the condition for age 18 and nationality indian
		if (obj1.age>=18 && obj1.nationality.equalsIgnoreCase("indian"))
		{
			System.out.println("Successful first dose");
			obj1.firstdose();
			first_dose=true;	// first dose is true
		}
		else
		{
			System.out.println("You are not eligible for first dose");
		}
		if(first_dose) {
			obj1.seconddose();// second dose 
			obj1.boosterDose();
		}
		else
		{
			System.out.println("You are not eligible for second dose");
		}

	}

}
