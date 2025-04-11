package oops;

public class Throw_Ex {
	
	void div(int a,int b) throws ArithmeticException
	{
		if (b==0){
			throw new ArithmeticException();
		}
		else
		{
			System.out.println(a/b);
		}
	}

	public static void main(String[] args) {
		Throw_Ex obj=new Throw_Ex();
		try {
		obj.div(4, 0);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
