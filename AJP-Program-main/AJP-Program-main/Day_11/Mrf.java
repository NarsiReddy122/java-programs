package oops;

public class Mrf implements Tyres {
	int price;
	String brand;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void avgLifeTime() {
		System.out.println("Avg Life time of MRF=5Year");
	}

	public String manufacture_date(String date) {
		return date;
	}

}
