package conditional;

import java.util.Scanner;

public class loop_que {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your N");
		int n = s.nextInt(); // 5

//		int sum = 0; //1 3 6 10 15
//		for(int i = 1; i<= n ; i++) { // 1 2 3 4 5
//			sum = sum + i; // sum = 10 + 5
//		}
//		
//		System.out.println(sum);

//		int fact = 1; //1 3 6 10 15
//		for(int i = 1; i<= n ; i++) { // 1 2 3 4 5
//			fact = fact * i; // sum = 10 + 5
//		}

//		System.out.println(fact);
//		
//		if(n <= 1) {
//			System.out.println("NOT A PRIME NUMBER");
//		}
//		int count = 0;
//		
//		for(int i = 2 ; i<= n; i++) { // 15
//			if(n % i== 0) {
//				// 15 % 15 
//				count++;
//			}
//		}
//		
//		if(count == 1) {
//			System.out.println("PRIME NUMBER");
//		}
//		else {
//			System.out.println("NOT A PRIME NUMBER");
//		}
//		
		// 337
//		int temp = n; // 337 33 3 0
//		int sum = 0; // 0 343 370 397
//
//		while (temp != 0) { // T T T F
//			int d = temp % 10; // 3 % 10 = 3
//			sum = sum + (d * d * d); // 370 + 27
//			temp = temp / 10; // 3 / 10 -> 0
//		}
//
//		if (sum == n) {
//			System.out.println("Armstrong");
//		} else {
//			System.out.println("Not a Armstrong");
//		}

		// pallindrome , fibo , 1,11,111,111 ->
		// 212
//		int temp = n; // 212  21  2 0
//		int sum = 0; // 0 2 21 212
//
//		while (temp != 0) { //
//			int d = temp % 10; // d = 2 % 10 = 2
//			sum = sum * 10 + d; // sum = 21 * 10 + 2 = 212
//			temp = temp / 10; // temp = 2/10 = 0
//		}
//
//		if (sum == n) {
//			System.out.println("Pallindrome");
//		} else {
//			System.out.println("Not a Pallindrome");
//		}
//		int d = 0; // 1
//		for (int i = 1; i <= n; i++) {
//			d = d * 10 + 1;
//			System.out.print(d+" ");
//		}
	}
}
