package java_AJP_2;

public class Department {

	public static void main(String[] args) {	// Accessing different values
		
		Emp e=new Emp();
		e.id=1;
		e.name="Ajay";
		e.setAadhaar(53443233364l);// 'l' to represent long int
		e.setSalary(83.7f);			// 'f' to represent float
		System.out.println("Public:"+e.id+"\n"+"Default:"+e.name);
		System.out.println("Private:"+e.getAadhaar());
		System.out.println("Private:"+e.getSalary());

	}

}
