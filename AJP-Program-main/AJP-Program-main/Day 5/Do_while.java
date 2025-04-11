package loops;

import java.util.Scanner;

// program to demonstrate the do-while loop

public class Do_while {

	// Logic of the code
	
	static void result(int end)
	{
		int i=1,sum=0,prod=1;
		do {
			if (i%2==0)
				sum+=i;
			else
				prod*=i;
			i++;
		}
		while(i<=end);
		System.out.println("Sum of even numbers:"+sum+" Product of odd numbers:"+prod);
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the end of the series:");
		int end=sc.nextInt();
		result(end);
		
	}

}
