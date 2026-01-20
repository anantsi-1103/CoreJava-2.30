package Array;

import java.util.Scanner;

public class code1 {

	public static void PrintArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your Size for Array");
		int n = s.nextInt();

		int arr[] = new int[n]; // 90

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Your Value will be at Index : " + i);
			arr[i] = s.nextInt();
		}
		
		PrintArray(arr);

//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[100]);

	}
}
