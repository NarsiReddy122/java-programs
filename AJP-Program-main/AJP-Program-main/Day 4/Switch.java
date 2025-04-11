package ajp_program;
	
// Program to demonstrate the switch case

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char c=sc.next().charAt(0);
		switch (c) {
		case 65,97:
			System.out.println("Choosen:"+c);
			break;
		case 66,98:
			System.out.println("Choosen:"+c);
			break;
		case 67,99:
			System.out.println("Choosen:"+c);
			break;
		case 68,100:
			System.out.println("Choosen:"+c);
			break;
		case 69,101:
			System.out.println("Choosen:"+c);
			break;

		default:
			System.out.println("Some other value");
			break;
		}

	}

}
