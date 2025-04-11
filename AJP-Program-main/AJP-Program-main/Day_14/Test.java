package oops;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		}
		finally {
			System.out.println("Hello");
		}
	}

}
