package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cf1 {
	public static void main(String[] args) {
		List<String> std = new ArrayList<String>();

		std.add("raj");
		std.add("Gaurav");
		std.add("ritik");
		std.add("ashok");
		std.add("avinaw");

//		System.out.println(std);
//		
//		System.out.println(std.size());
//		
//		System.out.println(std.remove(3));
		System.out.println(std);

//		System.out.println(std.get(0));
//		System.out.println(std.get(1));
//		System.out.println(std.get(2));
//		System.out.println(std.get(3));
//		System.out.println(std.get(4));

//		for (int i = 0; i < std.size(); i++) {
//			System.out.println(std.get(i));
//		}

//		for(String i : std) {
//			System.out.println(i);
//		}

//		std.forEach(x -> System.out.println(x));

//		Iterator
//		Iterator it = std.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		System.out.println(std.contains("ajay"));
		
		
	}

}
