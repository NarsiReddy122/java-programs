package oops;

// Program to calculate the leap year or not

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
	
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the year");		// Read the year from user
			int num=sc.nextInt();
			
			
			if(num%4==0 && num%100!=0)				// Logic for the year
				System.out.println("Leap year");
			else if(num%400==0)
				System.out.println("Leaap Year");
			else
				System.out.println("Not a leap year");
	}

}

/*
 			Enter the year
			2020
			Leap year
			
			
			
			Enter the year
			1900
			Not a leap year


 */



