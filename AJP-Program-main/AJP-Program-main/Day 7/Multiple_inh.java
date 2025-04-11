package oops;

class Products{
	
	int prod;
	String brand;
	int price;
	
	public Products(int prod, String brand, int price) {
		super();
		this.prod = prod;
		this.brand = brand;
		this.price = price;
	}
	
	
	
}
class Electronic extends Products{
	String catagory;
	String type;
	
	public Electronic(int prod, String brand, int price,String catagory,String type) {
		super(prod, brand, price);
		this.catagory=catagory;
		this.type=type;
		
	}

}

public class Multiple_inh  extends Electronic{
	int exp_days;
	String name;

	public Multiple_inh(int prod, String brand, int price, String catagory, String type,int days,String n) {
		super(prod, brand, price, catagory, type);
		exp_days=days;
		name=n;	
	}
	
	public void details() {
		System.out.println("Id: "+this.prod);
		System.out.println("Brand:"+this.brand);
		System.out.println("Price: "+this.price);
		System.out.println("Catagory: "+this.catagory);
		System.out.println("Type: "+this.type);
		System.out.println("Prod name: "+this.name);
		System.out.println("Expiry Days: "+this.exp_days);
		
	}

	public static void main(String[] args) {
	Multiple_inh ac=new Multiple_inh(1, "Samsung", 1800, "Electronics", "AC", 800, "Air Conditon");
	ac.details();

	}

}
