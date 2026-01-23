package Collectionframwork;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();
		
		s.add(10);
		s.add(56);
		s.add(76);
		s.add(1230);
		s.add(2);
		s.add(2);
		
		System.out.println(s);
		
//		System.out.println(s.contains(3));
//		s.clear();
//		System.out.println(s.isEmpty());
	}
}
