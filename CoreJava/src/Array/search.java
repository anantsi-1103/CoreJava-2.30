package Array;

public class search {

	public static void PrintArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int LinearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int BinarySearch(int arr[], int key) {
		int si = 0;
		int ei = arr.length - 1;

		while (si != ei) {
			int mid = (si + ei) / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}
		return -1;
	}
	
	

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 10, 12, 13, 14, 15, 16 };
		PrintArray(arr);
		
		System.out.println("Your Key at index : "+BinarySearch(arr, 100));
		
		
		
		
		
		
		
		
		

	}
//		int arr[] = { 2, 4, 6, 8, 10, 5, 66, 33, 44, 54, 3, 87, 99 };

//		System.out.println("Your key found at index " + LinearSearch(arr, 100));

}
