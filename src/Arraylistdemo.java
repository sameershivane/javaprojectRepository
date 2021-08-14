import java.util.ArrayList;

public class Arraylistdemo {

	public static <integer> void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(0, 40);
		al.add(40);

		System.out.println(al);

		for (Integer integer : al) {
			System.out.println(integer);

		}
		System.out.println(al.contains(40));
		System.out.println(al.get(4));
	}

}
