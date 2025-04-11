package oops;

// Child class implementing abstract method

public class Permanent  extends Employee{

	int td;
	public Permanent(int salaty, int pf,int td) {
		super(salaty, pf);
		this.td=td;
	}
	public void display()
	{
		System.out.println("Total Salary:"+(td+salary+pf));
	}
	@Override
	void get_salary() {
		System.out.println(this.salary);
		
	}
	@Override
	void get_pf() {
		System.out.println(this.pf);
		
	}
	

}
