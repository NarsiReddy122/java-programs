package loops;

import java.util.Scanner;

// Program to print the sum of natural and even numbers

public class For_ex {

	public static void main(String[] args)
	{
		int sum=0,sum_of_even=0;
		System.out.println("Enter the end of the range:");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		for(int i=0;i<=range;i++)
		{
			sum+=i;
			
			if(i%2==0)
				sum_of_even+=i;
		}
		System.out.println("Total: "+sum+" Sum of even: "+sum_of_even);
	}

}
