
class Rectangle{
	
	int length,breadth;
	
	public int area(int l, int b) {  // Function with return type and parameters
		
		length=l;
		breadth=b;
		System.out.println("Area:"+(length*breadth));
		return length*breadth;

	}
	
	public void perimeter(int l,int b)	// Function with no return type and parameters
	{
		System.out.println("Perimeter:"+2*(l+b));
	}
}

public class Fun_type {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		
		int result=r1.area(2, 5);	// Storing the result and printing 
		System.out.println("Area:"+result);
		
		r1.perimeter(2, 5); // Function call 
	}

}
