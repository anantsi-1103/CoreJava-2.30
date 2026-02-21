package CollectionFramework;

import java.util.List;
import java.util.LinkedList;

public class cf2 {
	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<Integer>();
		
		
		li.add(10);
		li.add(20);
		li.addFirst(30);
		li.addLast(50);
		
		System.out.println(li);
	}
}
