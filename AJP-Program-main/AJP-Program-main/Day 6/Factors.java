package loops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		System.out.println("Enter the number print its factors: ");
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		System.out.println("The factors are");
		System.out.print("0 ");
		for(int i=1;i<=target;i++)
		{
			if(target%i==0)
				System.out.print(i+" ");
		}

	}

}
