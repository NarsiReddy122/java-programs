package oops;

// Program 1

// Program to check strong number or not

import java.util.Scanner;

public class Strong_num {

	public static void check(int num) {
		
		// method to check the strong number or not
		
		int fact=1,rem,sum=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10; 		// Grab the individual digits of number
			for(int i=1;i<=rem;i++)
			{
				fact*=i;			// Factors of individual digits
			}
			sum+=fact;				// Sum of factors
			fact=1;				// re-intializing fact=1 for further  digits factor calculating
			num=num/10;
		}
		if (sum==temp)				// Check final sum with original number
			System.out.println("Strong Number");
		else
			System.out.println("Not a strong number");
		
	}
	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);	// Class helps to read the values from console
		
		System.out.println("Enter the  number"); // Reading the respective values from the console
		int num=sc.nextInt();
		check(num);		// method call

	}

}
/*
 			output:
 			
 			 1.Enter the  number
				145
				Strong Number
				
			 2.Enter the  number
				123
				Not a strong number


 */




