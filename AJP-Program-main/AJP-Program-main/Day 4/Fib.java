package ajp_program;

import java.util.Scanner;

// Program to demonstrate the Fibonacci Series

public class Fib {

	public static void main(String[] args) {
		
		int a=0,b=1;
		int c=a+b;
		System.out.println("Fibonacci Series:");
		System.out.println("Enter the end value:");
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		while(a<=end) {
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
		}

	}

}
 