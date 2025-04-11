package oops;

// Superclass with abstract methods

abstract public class Employee {
	int salary,pf;

	public Employee(int salary, int pf) {
		super();
		this.salary = salary;
		this.pf = pf;
	}
	public void display() {
		System.out.println("Total Salary:"+(salary+pf));
		
	}
	abstract void get_salary();
	abstract void get_pf();

}
