package oops;

public class Staff extends Institute{
		
	int id_s;
	String name_s;
	public Staff(String name, int code, int id_s, String name_s) {
		super(name, code);
		this.id_s = id_s;
		this.name_s = name_s;
	}
	public void st() {
		System.out.println("Staff name:"+name_s);
		
	}
}
