package conditional;

import java.util.Scanner;

public class funcCode {

	// function decalartion ->

	public static void demo() {
		System.out.println("hello world");
	}

	public static void demo_loop(int n) { // arguments
		for (int i = 1; i <= n; i++) {
			System.out.println("hello " + i);
		}
	}

	public static void sum_void(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static int sum_int(int a, int b) {
		return a + b;
	}

	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static String permission(int a) {
		if (a >= 18) {
			return "Allowed";
		} else {
			return "not Allowed";
		}
	}

	public static void Pallin_Void(int n) {
		int temp = n; // 212 21 2 0
		int sum = 0; // 0 2 21 212

		while (temp != 0) { //
			int d = temp % 10; // d = 2 % 10 = 2
			sum = sum * 10 + d; // sum = 21 * 10 + 2 = 212
			temp = temp / 10; // temp = 2/10 = 0
		}

		if (sum == n) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not a Pallindrome");
		}
	}

	public static int Pallin_Int(int n) {
		int temp = n; // 212 21 2 0
		int sum = 0; // 0 2 21 212

		while (temp != 0) { //
			int d = temp % 10; // d = 2 % 10 = 2
			sum = sum * 10 + d; // sum = 21 * 10 + 2 = 212
			temp = temp / 10; // temp = 2/10 = 0
		}

		if (sum == n) {
			return 1;
		}
		return 0;

	}

	public static boolean Pallin_Bool(int n) {
		int temp = n; // 212 21 2 0
		int sum = 0; // 0 2 21 212

		while (temp != 0) { //
			int d = temp % 10; // d = 2 % 10 = 2
			sum = sum * 10 + d; // sum = 21 * 10 + 2 = 212
			temp = temp / 10; // temp = 2/10 = 0
		}

		if (sum == n) {
			return true;
		}
		return false;

	}
	
	public static String Pallin_Str(int n) {
		int temp = n; // 212 21 2 0
		int sum = 0; // 0 2 21 212

		while (temp != 0) { //
			int d = temp % 10; // d = 2 % 10 = 2
			sum = sum * 10 + d; // sum = 21 * 10 + 2 = 212
			temp = temp / 10; // temp = 2/10 = 0
		}

		if (sum == n) {
			return "true";
		}
		return "false" ;

	}
	
	
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// code reusability ko bada deta hai ->
		if (Pallin_Str(121) == "true") {
			System.out.println("pallindrome");
		} else {
			System.out.println("not a pallindrome");
		}

	}
}
