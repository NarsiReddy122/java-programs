package ajp_program;

import java.util.Scanner;

//Program to demonstrate the usage of switch case 

public class Analysis {	 
	
		int sub1,sub2,sub3,sub4;
		public void findResult()
		{
			if (sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35)
			{
				int total,avg;
				char g;
				total=sub1+sub2+sub3+sub4;
				avg=total/4;
				System.out.println("Average:"+avg+"%");
				
				if (avg>80)
					g='A';
				else if (avg>60)
					g='B';
				else g='C';
				
				switch (g) {
				case 'A':
					System.out.println("A Grade");
					break;
				case 'B':
					System.out.println("B Grade");
					break;
				default:
					System.out.println("C grade");
					break;
				}
			}
			else
				System.out.println("Failed in the examinations");
		}
		
	public static void main(String[] args) {
		System.out.println("Enter 4 numbers:");
		Scanner sc=new  Scanner(System.in);
		Analysis a=new Analysis();
		a.sub1=sc.nextInt();
		a.sub2=sc.nextInt();
		a.sub3=sc.nextInt();
		a.sub4=sc.nextInt();
		a.findResult();
	}

}
