package oops;

import java.util.Scanner;

public class Arrays_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the number "+(i+1)+" :");
			array[i]=sc.nextInt();
		}
		int even = 0,odd=0;
		System.out.println("Even numbers are");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
				even+=array[i];
			}
			else
				odd+=array[i];
		}
		System.out.println();
		System.out.println("Sum of even: "+even);
		System.out.println("Sum of odd: "+odd);
		
		}

}
