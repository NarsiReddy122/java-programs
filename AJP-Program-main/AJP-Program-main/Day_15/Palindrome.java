package Collections;

import java.util.Scanner; // Used to read input

public class Palindrome {
	// Boolean Function for check palindrome 
	
	public boolean check_palindrome(String name) {
			int left=0,right=name.length()-1;// Identify first and last index
			while(left<right)
			{
				if(name.charAt(left)!=name.charAt(right))// Check Whether  the characters are same or not
				{
					return false; // Not the characters are same it return false
				}
				left++;
				right--;
			}
			return true;// Return true for palindrome
	}
	public static void main(String[] args) {
		Palindrome obj=new Palindrome();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");// Reading the input 
		String name=sc.next();
		
		if(obj.check_palindrome(name.toLowerCase()))// Convert to lower case to handle case of characters 
													// function call
		{
			System.out.println(name+"is Palindrome");
		}
		else
		{
			System.out.println(name+" is not Palindrome");
		}
	}
}
