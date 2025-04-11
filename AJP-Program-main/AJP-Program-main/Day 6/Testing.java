package loops;

// Program to check a number is prime number or not

import java.util.Scanner;

public class Testing {
	
	static void fun(int num)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if (num%i==0)
				count++;
		}
		if (count==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not a prime number");
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number  to check prime or not:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		fun(num);
	}

}
