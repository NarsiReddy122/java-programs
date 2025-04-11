
// program  that Demonstarte the implementation of  static block and methods

class Static_example
 {		
	int num;
	 static String name;	// Declare a static variable
	 
	 static 			// Declaring the static block

	 {								 
		 System.out.println("Static Block"); // Content of static block
		 
	 }
	 public static void message() 	// Static method
	 {
		 System.out.println("Static Method");// content of static method
	 }
	 
	 public void acess()
	 {
		 System.out.println("Name:"+name);	// printing the result
	 }
	
}
 
public class Static_Demo {
	
	public static void main(String[] args) {
		Static_example.message();	// Calling the Static method using class name
		
		Static_example obi=new Static_example();
		obi.message();		// Calling the Static method using object
		
		obi.name="Ajay"; // Assigning the value and printing the  values of static variables
		obi.acess();
		
		obi.num=10;		// Assigning the value and printing the  values of instance variables
		System.out.println("Instance Variable:"+obi.num);
		
	}

}
