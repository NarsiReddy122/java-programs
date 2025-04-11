package oops;
public class Handling {
	public static void main(String[] args) {
		try
		{
			String str_ex=null;
			System.out.println(str_ex.length());
			System.out.println(2/0);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		catch ( ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Final Block");
		}
		System.out.println("End of the program");

	}
}