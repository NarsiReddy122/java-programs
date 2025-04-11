package collections;
import java.util.*;

public class Array_list_Ex {

	public static void main(String[] args) {
			ArrayList<Integer> nums=new ArrayList<>();
			nums.add(5);
			nums.add(8);
			nums.add(5);
			nums.add(1,2);
			nums.add(null);
			System.out.println(nums);
			
			ArrayList<String> names=new ArrayList<String>();
			names.add("Ajay");
			names.add("Kumar");
			names.add("Kumar");
			System.out.println(names.get(0));
			System.out.println(names.contains("Ajay"));
			
			System.out.println(names);
			
			for (Integer string : nums) {	// Print the results
				System.out.println(string);
				
			}
	}
}
