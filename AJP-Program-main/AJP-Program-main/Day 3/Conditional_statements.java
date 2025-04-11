package java_AJP;

// Program to demonstrate the conditional statements 

import java.util.Scanner;

public class Conditional_statements {
	
	public void check(int first,int second,int third)
	{
		if (first>second && first>third) {
			System.out.println("First is greater");
			
		} 
		else if (second>first && second>third) {
			System.out.println("Second is greater");
		}
		else {
			System.out.println("Third is greater");
		}

	}
	public void check_add(int a) {
		
		if (a%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value:");
		int first=sc.nextInt();
		System.out.println("Enter Second value:");
		int second=sc.nextInt();
		System.out.println("Enter Third value:");
		int third=sc.nextInt();
		
		Conditional_statements obj=new Conditional_statements();
		obj.check(first, second, third);
		System.out.println();
		System.out.println("Now enter a Values to check even or odd");
		
		System.out.println("Enter a value:");
		int first_even=sc.nextInt();
		obj.check_add(first_even);
		
	}

}
