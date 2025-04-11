package java_AJP_2;


import java_AJP.Car_ex;

public class Test extends Car_ex {

	public static void main(String[] args) {
		
	Car_ex c=new Car_ex();
	c.speed=100;
	
	Test t=new Test(); // Protected variables of different packages can accessible with child class object which extends parent
	t.millege=60;
	
	
	System.out.println("Public:"+c.speed);
	System.out.println("Protected:"+t.millege);

	
	

	}

}
