import java.util.TreeMap;

public class Tailmapheadmapsubmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java code to illustrate submap() Method

		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();

		// Mapping String to Integer
		tree.put(47, "Sashi");
		tree.put(82, "Ridhi");
		tree.put(66, "Himanshu");
		tree.put(98, "Sarthak");
		tree.put(87, "Sonika");
		tree.put(85, "Ritesh");
		tree.put(89, "Yogesh");

		// printing the complete TreeMap
		System.out.println("The original map is: \n" + tree);

		// printing the submap from key
		// 67(included) to 89(excluded)
		System.out.println("The subMap is: \n" + tree.subMap(67, 89));

		// if start key and end key are same then
		// this method returns a null map
		System.out.println("Empty subMap: \n" + tree.subMap(67, 67));

		// Headmap printing
		System.out.println("The HeadMap is: \n" + tree.headMap(86));

		// tailmap printing
		System.out.println("The HeadMap is: \n" + tree.tailMap(87));

	}

}
