


// Program Demonstrate the different function types and static methods

class Rectangle{
	
	public static int area(int l, int b) {  // Function with return type and parameters
		return l*b;

	}
	
	public static void perimeter(int l,int b)	// Function with no return type and parameters
	{
		System.out.println("Perimeter:"+2*(l+b));
	}
}

public class Static_one {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		
		int result=r1.area(2, 5);	// Storing the result and printing 
		System.out.println("Area:"+result);
		
		r1.perimeter(2, 5); // Function call
		
		System.out.println("Using Class accessing static methods");
		
		System.out.println("Area(static):"+Rectangle.area(2, 10)); // Access the methods using class name
		Rectangle.perimeter(2, 10);
		
	}

}