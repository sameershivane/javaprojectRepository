import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> map = new TreeMap<>();

		map.put(1, "Sameer");
		map.put(2, "Sharav");
		map.put(3, "Ashwini");
		map.put(4, "Shubham");
		map.put(5, "Sushmita");

		/*
		 * System.out.println(map.keySet()); System.out.println(map.values());
		 */

		System.out.println(map.values());
		System.out.println(map.hashCode());

	}

}
