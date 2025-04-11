package java_AJP_2;

//  Demonstrate the employee class with  access specifiers and get & set methods

public class Emp {

	public int id;
	String name;
	private float salary;
	private long aadhaar;
	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}
	
}
