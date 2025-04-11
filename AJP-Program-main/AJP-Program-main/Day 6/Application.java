package loops;

// program to demonstrate the some services of ATM

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner  sc=new Scanner(System.in);
		int ch,amount,balance=0;
		while (true) {
			System.out.println("Enter the choice: ");
			System.out.println("1.Deposit");
			System.out.println("2.withdraw: ");
			System.out.println("3.Balance ");
			System.out.println("4. exit");
			ch=sc.nextInt();
			if (ch==1) {
				System.out.println("Amount: ");
				amount=sc.nextInt();
				if (amount<=0)
					System.out.println("Invalid amount");
				else {
					balance+=amount;
					System.out.println("Successfully Deposited");
					System.out.println("After deposit: "+balance);
					System.out.println();
				}
			}
			
			else if(ch==2) {
				System.out.println("Amount: ");
				amount=sc.nextInt();
				if (amount<=0) {
					System.out.println("Invalid amount");
					continue;
				}
				if(amount>balance) {
					System.out.println("Insufficient amount");
				}
				else {
					balance-=amount;
					System.out.println("Withdraw sucessful");
					System.out.println("After withdraw: "+balance);
					System.out.println();
				}
					
			}
			else if(ch==3) {
				System.out.println("The available balance is :"+balance);
				System.out.println();}
			
			else if (ch==4) {
				System.out.println("Thank you customer !");
				break;
			}
			else {
				System.out.println("Invalid input! re-enter");
			}
			
		}
	}
}