package loops;

import java.util.Scanner;

public class Prime_print {
	
	static void result(int range)
	{
		int count=0;
		
		for(int i=2;i<=range;i++)
		{
			
			for(int j=2;j<=i;j++)
				if(i%j==0)
					count++;
			
			if (count==1)
				System.out.print(i+" ");
			count=0;
		}
	}

	public static void main(String[] args) {
			
		System.out.println("Enter the number print prime in a range: ");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		result(range);
	}

}