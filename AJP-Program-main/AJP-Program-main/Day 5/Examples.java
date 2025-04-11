package loops;

// Program to demonstrate the printing the table of a number

import java.util.Scanner;

public class Examples {

	void table(int n)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(n+"*"+i+"="+(n*i));
			i++;
		}
	}
	public static void main(String[] args) {
	
		System.out.println("Enter the Number to print table:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Examples e1=new Examples();
		e1.table(num);
	}

}
