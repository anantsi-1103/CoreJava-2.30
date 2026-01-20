package Array;

import java.util.Scanner;

public class twoD {

	public static void PrintArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) { // 0
			for (int j = 0; j < arr.length; j++) { // 0
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int sumofAll(int arr[][]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { // 0
			for (int j = 0; j < arr.length; j++) { // 0

				sum = sum + arr[i][j];

			}
		}
		return sum;
	}

	public static int SumofLeft_right(int arr[][]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { // 0
			for (int j = 0; j < arr.length; j++) { // 0
				// left

				if (i == j) {
					sum += arr[i][j];
				} else if ((i + j) == arr.length - 1) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}

	public static int[][] transpose(int arr[][]) {
		int row = arr.length;
		int col = arr.length;

		int t[][] = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				t[j][i] = arr[i][j];
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your Number of Rows");
		int n = s.nextInt();

		System.out.println("Enter your Number of Columns");
		int m = s.nextInt();

		int arr[][] = new int[n][m];

		for (int i = 0; i < n; i++) { // 0
			for (int j = 0; j < m; j++) { // 0
				System.out.println("Your Value will store at index " + i + "," + j);
				arr[i][j] = s.nextInt();
			}
		}

		PrintArray(arr);

//		System.out.println(SumofLeft_right(arr));
//
//		System.out.println(sumofAll(arr));
		System.out.println("-------");
		int res[][] = transpose(arr);
		
		PrintArray(res);

	}
}
