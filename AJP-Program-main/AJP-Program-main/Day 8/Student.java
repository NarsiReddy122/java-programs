package oops;

public class Student extends Institute {
	
	int id;
	String name_stu;
	public Student(String name, int code, int id, String name2) {
		super(name, code);
		this.id = id;
		this.name_stu = name2;
	}
	public void stu() {
		System.out.println("Std name: "+name_stu);
		
	}

}
