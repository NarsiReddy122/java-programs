package oops;

public class Array_Ex {

	public static void main(String[] args) {
		int[] array=new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		int sum=0;
		System.out.println(array);
		for(int i=0;i<array.length;i++)
			sum+=array[i];
		System.out.println("Total Sum:"+sum);
	}

}
