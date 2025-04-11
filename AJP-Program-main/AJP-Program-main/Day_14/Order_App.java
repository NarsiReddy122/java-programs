package oops;
import java.util.Scanner;

public class Order_App {
	int billAmt;

	public Order_App(int billAmt) {
		super();
		this.billAmt = billAmt;
	}
	void confirmOrder(int amt) throws Amount_Miss_match
	{
		if (amt==billAmt) {
			System.out.println("Payment Succesfull");
		}
		else {
			throw new Amount_Miss_match("Insufficient Amount");
		}
	}

	public static void main(String[] args) {
		Order_App obj=new Order_App(3000);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount to be paid:");
		int amt=sc.nextInt();
		try {
			obj.confirmOrder(amt);
		} catch (Amount_Miss_match e) {
			
			System.out.println(e);
		}
	}
}