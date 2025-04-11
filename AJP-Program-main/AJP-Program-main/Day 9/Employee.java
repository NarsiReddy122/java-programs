package oops;

public class Employee {
	
	int base_salary;
	int pf;
	public void salary(int salary,int pf)
	{
		base_salary=salary;
		this.pf=pf;
		System.out.println(base_salary+pf);
		System.out.println("Super class method");
	}

}
