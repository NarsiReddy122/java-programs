package ajp_program;

import java.util.Scanner;

// program  to demonstrate the lo

public class Loops {
	
	int sum,num=0;
	int result(int limit)	//  Function to write the sum of Natural numbers
	{
		while(num<=limit)
		{	
			sum+=num;
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the end:");
		int limit=sc.nextInt();
		Loops l=new Loops();
		System.out.println("Total:"+l.result(limit));
	}

}
