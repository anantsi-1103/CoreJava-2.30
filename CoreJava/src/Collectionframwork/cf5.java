package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class cf5 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();

//		unordered , duplciate data once

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		set.add(10);
		set.add(60);

		System.out.println(set);
	}
}
