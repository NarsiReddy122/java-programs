package constructers;

// Program demonstrate the this keyword and constructor

public class Test {
	
	int id;
	String name;
	float marks;
	
	public Test() {
	System.out.println("Default Construcuter");
	System.out.println();
	}
	
	public Test(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("Constructer with 2 parameters");
		System.out.println("Values:"+this.id+" name:"+this.name);
		System.out.println();
	}
	
	public Test(int id,String name,float marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		System.out.println("Constructer with 3 parameters");
		System.out.println("Values:"+this.id+" name:"+this.name+" marks"+this.marks);
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		Test t1=new Test(); // Default Constructor 
		Test t2=new Test(1, "Abc");	// Constructor with 2 parameters
		Test t3=new Test(2,"Kumar", 5.6f);// Constructor with 3 parameters

	}

}

