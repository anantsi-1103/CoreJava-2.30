package CollectionFramework;

import java.util.Stack;

public class cf3 {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();

		st.add(10);
		st.add(50);
		st.add(30);
		st.add(90);
		st.add(100);

		System.out.println(st);
		System.out.println(st.peek());

		System.out.println(st.pop());
		System.out.println(st);
	}
}
