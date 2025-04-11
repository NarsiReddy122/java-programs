package oops;

//abstract class with instance variables and concrete methods and abstract method 

abstract public class Vaccine {
	int age;
	String nationality;
	public Vaccine(int age,String nationality)
	{
	this.age=age;
	this.nationality=nationality;
	}
	public void  firstdose()	//concrete methods
	{
		System.out.println("Have to pay 250rs");
	}
	public void  seconddose()	//concrete methods
	{
		System.out.println("Second dose successful");
	}
	abstract void  boosterDose();	//abstract method
	
}
