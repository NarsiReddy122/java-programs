package oops;


import java.util.Scanner;

// Program to demonstrate the Fibonacci Series

public class Fib {

	public static void main(String[] args) {
		
		int a=0,b=1; 	// Initial values
		int c=a+b;
		System.out.println("Fibonacci Series:");
		System.out.println("Enter the end value:");
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		while(a<=end) {				// Loop terminate until given range
			System.out.print(a+" ");	
			a=b;
			b=c;			// Logic of the series
			c=a+b;
		}

	}

}

/*
 					Fibonacci Series:
					Enter the end value:
					20
					0 1 1 2 3 5 8 13 
 */

