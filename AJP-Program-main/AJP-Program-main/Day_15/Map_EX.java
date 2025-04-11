package collections;

import java.util.HashMap;
import java.util.Map;

public class Map_EX {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Ajay");
		map.put(1, "Kumar");
		map.put(2, "Sai");
		map.put(3, "Arun");
		map.put(5, "Arun");
		map.put(null,null);
		map.putIfAbsent(4, "Kumar");
		System.out.println(map);
				
	}

}
