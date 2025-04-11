package collections;

import java.util.TreeMap;

public class TreeMap_Ex {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(1, "ajay");
		map.put(1, "kumar");
		map.put(3, "kumar");
		map.put(2, null);
		System.out.println(map);
		System.out.println(map);
		
	}

}
