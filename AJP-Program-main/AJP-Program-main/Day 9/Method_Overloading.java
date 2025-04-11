package oops;

public class Method_Overloading  {

	
	public void product(int a,int b) {
		System.out.println(a*b);
		
	}
	
	public void product(double a,double b) {
		System.out.println(a*b);
		
	}
	public void product(int a,int b,int c){
		System.out.println(a*b*c);
		
	}
	
	public static void main(String[] args) {

		Method_Overloading p=new Method_Overloading();
		p.product(2, 3);
		p.product(2.3, 4.5);
		p.product(1, 2, 5);
		
	}

}
