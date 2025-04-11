package oops;

public class TyresDemo {

	public static void main(String[] args) {
		Mrf mrf=new Mrf();
		mrf.setBrand("MRF");
		mrf.setPrice(2000);
		mrf.avgLifeTime();
		mrf.manufacture_date("2025-01-02");
		System.out.println("Brand:"+mrf.getBrand()+" Price:"+mrf.getPrice()+"MFD:"+mrf.manufacture_date("2025-01-02"));
		
		Tyres tyre=new Mrf();
		tyre.avgLifeTime();
	}
}
