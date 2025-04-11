package oops;

import java.util.Scanner;

public class Array_min_max {

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
		// logic to find min and max 
		
		int min=array[0],max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min)
				min=array[i];
			if(array[i]>max)
				max=array[i];
		}
		System.out.println("Min: "+min+" Max: "+max);
	}

}
