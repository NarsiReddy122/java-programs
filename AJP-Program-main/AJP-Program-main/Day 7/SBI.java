package oops;

// Program for inheritance and super class

public class SBI extends RBI {
	String address;
	int no_of;
	
	public SBI() {
	
		System.out.println("SBI Constructer");
	}	
	
	public SBI(int bankcode, String name, String type,String address, int no_of) {
		super(bankcode, name, type);
		this.address = address;
		this.no_of = no_of;
		
	}

	public static void main(String[] args) {

		SBI sbi=new SBI(1, "SBI", "Public", "BKl", 500);
		System.out.println("Address: "+sbi.address);
		System.out.println("Bank Code: "+sbi.bankcode);
	}

}
