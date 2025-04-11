package ajp_program;

//Program to demonstrate the switch case

import java.util.Scanner;

public class Test_class {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number:");
		Scanner sc=new  Scanner(System.in);
		num=sc.nextInt();
		switch (num) {
		case 0:
			System.out.println("Choosen 0");
			break;
		case 1:
			System.out.println("Choosen 1");
			break;
		case 2:
			System.out.println("Choosen 2");
			break;
		case 3:
			System.out.println("Choosen 3");
			break;
		case 4:
			System.out.println("Choosen 4");
			break;

		default:
			System.out.println("Some other value");
			break;
		}
		
	}
}
