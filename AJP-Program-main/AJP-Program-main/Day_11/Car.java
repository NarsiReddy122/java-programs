package oops;

public abstract class Car {
	
	int speed;
	String company;
	
	abstract void display_details();
	
	void getInfo_car() {
		System.out.println("Car company & speed:"+company+" "+speed);
	}

}
