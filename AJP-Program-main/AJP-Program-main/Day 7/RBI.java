package oops;
public  class RBI {
	
	int bankcode;
	String name;
	String type;
	
	public RBI() {
		System.out.println("RBI Constructor");
	}

	public RBI(int bankcode, String name, String type) {
		this.bankcode = bankcode;
		this.name = name;
		this.type = type;
	}
	
}
