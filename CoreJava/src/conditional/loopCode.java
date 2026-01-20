package conditional;

import java.util.Scanner;

public class loopCode {
	public static void main(String[] args) {
		// while , do while , for loop

		// 1 - 10
//		int i = 1; // 1 2
//		while(i<=5) { // T T
//			System.out.println("hello "+i);  // 1 2
//			i++; // U U
//		}

		// do while
//		int i = 1; 
//		do {
//			System.out.println("hello "+i);
//			i++;
//		}while(i<=10);

		// for loop
//		int n = 101;
//		for (int i = n; i >= 1; i--) {
//			System.out.println("hello " + i);
//		}

//		multiplication => 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Number");

		int n = s.nextInt();

		for (int i = 1; i <= 10; i++) {
			
			// 8(n) x 1(i) = 8(n*i)
			System.out.println(n +" x "+i+" = "+ (n*i));
			
		}

	}
}
