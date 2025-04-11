package loops;

//Program to demonstrate the printing the factorial of a number

import java.util.Scanner;

public class Fact {
	
	 static int fact_n(int num)
	{
		int fact=1;
		while(num>=1)
		{
			fact=fact*num;
			num--;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Number to print factorial:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Factorial:"+fact_n(num));

	}

}
