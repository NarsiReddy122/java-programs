package oops;

// Main_class

import java.util.Scanner;

public class Main_One {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary:");	// Reading the salary from the user
		double salary=sc.nextDouble();
		
		Employee e1=new Employee(1, "Ajay", salary);	// Creating a employee object
		
		double res=e1.annual_salary();					// Getting annual salary
		double rounded_value=Math.floor(res*100)/100.0;
																			// Rounding the salary
		System.out.println("Annual Salary: "+rounded_value);
		
		
	}

}

/*
 			Enter the Salary:
			3753.753
			Annual Salary: 45045.03

 */




