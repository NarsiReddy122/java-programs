package oops;

import java.util.Scanner;

public class Swapping {
	
	public  static void approach1(int num1,int num2) {
		
		// Method to swap 2 numbers
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping first= "+num1+" second= "+num2);
		
	}
	public static void approach2(int a,int b) {
		
		a=(b+a)-(b=a);	// Second approach to swap the numberrs
		
		System.out.println("After swapping first= "+a+" second= "+b);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	// Class helps to read the values from console
		
		System.out.println("Enter the first number"); // Reading the respective values from the console
		int first=sc.nextInt();
		System.out.println("Enter the second number");
		int second=sc.nextInt();
		System.out.println("Approach 1:");
		approach1(first, second);	// Method call 1
		System.out.println("Approach 2:");  // Method call 1
		approach2(first, second);
		
		
	}

}

/*
 			Enter the first number
			10
			Enter the second number
			20
			Approach 1:
			After swapping first= 20 second= 10
			
			Approach 2:
			After swapping first= 20 second= 10

 */


