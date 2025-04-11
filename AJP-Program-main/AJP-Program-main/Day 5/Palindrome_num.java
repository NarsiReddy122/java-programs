package loops;

//Program to check the Number is palindrome or not

import java.util.Scanner;

public class Palindrome_num {
	
	public  static void palin(int num)
	{
		int temp,rem,sum=0;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if (temp==sum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a palindrome Number");
	}

	public static void main(String[] args) {

		System.out.println("Enter the Number to check palindrome or not:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		palin(num);
	}

}
