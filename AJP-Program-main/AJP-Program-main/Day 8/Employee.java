package oops;

// Subclass with properties and methods

public class Employee extends User{
	
	double salary;

	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	public double annual_salary()
	{
		double annual=this.salary*12;
		return annual;
	}

}
