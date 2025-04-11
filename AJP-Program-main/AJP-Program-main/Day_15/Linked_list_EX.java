package collections;

import java.util.LinkedList;

public class Linked_list_EX {

	public static void main(String[] args) {
		
		LinkedList<String> names=new LinkedList<String>();
		names.add("Ajay");
		names.add("Kumar");
		names.add("Kumar");
		names.add("Kumar");
		names.add(null);
		System.out.println(names);
	}
}