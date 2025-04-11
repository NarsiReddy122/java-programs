package oops;

public class Ex {
	public static void main(String[] args) {
//		Exception Handling 1
		int array[]= {1,2,4};
		try {
			System.out.println(array[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		}
		
//		Exception Handling 2
		try {
			System.out.println(2/0);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
//				Exception Handling 2
		try {
			String str=null;
			System.out.println(str.length());
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
	