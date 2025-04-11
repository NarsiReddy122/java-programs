package loops;

import java.util.Scanner;

// print the numbers except multiple of 2

public class Break_continue {

	static void  print(int range)
	{
		for(int i=1;i<=range;i++)
		{
			if(i%2==0)
				continue;
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number print except multiple of 2 in range: ");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		System.out.println("The result: ");
			print(range);
	}

}
