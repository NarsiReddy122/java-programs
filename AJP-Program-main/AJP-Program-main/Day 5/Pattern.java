package loops;

import java.util.Scanner;

public class Pattern {
	
	static void logic(int end)
	{
		int start=1;
		while(start<=end)
		{
			System.out.print(start+" ");
			start++;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the end:");
		int end=sc.nextInt();
		System.out.println("Pattern :");
		int start=1;
		while(start<=end)
		{
			logic(start);
			System.out.println();
			start++;
		}
	}

}