package java_AJP;

// Program to demonstrate the access modifiers in java

public class Acess_specifiers {

	public static void main(String[] args) {
		
		Car_ex c=new Car_ex();		// Object Creation and assign values
		c.millege=8;
		c.seats=2;
		c.speed=160;
	
		c.setName("BMW_M3");		// Function call
		
		System.out.println("Public:"+c.speed+"\n"+"Protected:"+c.millege+"\n"+"Default:"+c.seats); // Printing Results
		
		System.out.println("Private:"+c.getName());
	}

}