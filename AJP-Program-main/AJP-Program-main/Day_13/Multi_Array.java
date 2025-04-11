package oops;

public class Multi_Array {

	public static void main(String[] args) {
		int[][] array= {{1,2},{3,4}};
		int[][] array1={{1,8},{6,1}};
		int [][] arr3=new int[2][2];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				arr3[i][j]=array[i][j]+array1[i][j];
			}		
		}
		
		System.out.println("Array1:");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
			 System.out.print(array[i][j]+" ");
			}		
			System.out.println();
		}
		System.out.println("Array2:");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
			 System.out.print(array1[i][j]+" ");
			}		
			System.out.println();
		
		}
		
		System.out.println("Sum of arrays");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
			 System.out.print(arr3[i][j]+" ");
			}		
			System.out.println();
		
		}		
		
	}

}
