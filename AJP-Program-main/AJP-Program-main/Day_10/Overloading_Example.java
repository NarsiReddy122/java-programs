package oops;

// Program demonstrate the method overloading

public class Overloading_Example {
	
	public void add(int a,int b)	// Method with int,int
	{
		System.out.println(a+b);
	}
	public void add(double a,double b)	// Method with double,double
	{
		System.out.println(a+b);
	}
	public void add(int a,double b)	// method with int,double
	{
		System.out.println(a+b);
	}
	public void add(double a,int b)	// method with double, int
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)	// method with int,int,int
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Overloading_Example o=new Overloading_Example();
		// Method call with different parameters
		o.add(2, 3);
		o.add(3.2, 4.5);
		o.add(5.4, 6);
		o.add(4, 5.4);
		o.add(1, 2, 3);
		

	}

}
