package oops;

import java.util.Scanner;

// Program demonstrate  the greatest of 2 numbers

public class Two_num {
	
	public static void check(int num1,int num2) {
	
		// Method to check the greatest of 2 numbers
		
		if(num1>num2)		
			System.out.println(num1+" is greater");
		else if(num2>num1)
			System.out.println(num2+" is greater");
		else
			System.out.println("Both are equal");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	// Class helps to read the values from console
		
		System.out.println("Enter the first number"); // Reading the respective values from the console
		int first=sc.nextInt();
		System.out.println("Enter the second number");
		int second=sc.nextInt();
		
		check(first, second);	// Function call
		
	}

}

/*
output:
Enter the first number
 	
	5
Enter the second number

	7
7 is greater

 */







