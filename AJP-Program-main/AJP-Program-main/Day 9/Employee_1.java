package oops;

public class Employee_1  extends Employee{

	int pf;
	public void salary(int salary,int pf)
	{
		this.base_salary=salary;
		this.pf=pf;
		System.out.println(base_salary*pf);
		System.out.println("Child class method");
		
	}
	public static void main(String[] args) {
		
		Employee_1 e1=new Employee_1();
		e1.salary(20, 30);

	}

}
