package collections;

import java.util.LinkedHashMap;

public class Linked_Hash_Map_Ex {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		map.put("Q6708", null);
		map.put("Q6711",75);
		map.put("Q6711",85);
		map.put(null, null);
		map.putIfAbsent("Q6708",746);
		System.out.println(map);

	}

}
