package Collectionframwork;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collections {
	public static void main(String[] args) {
		// int arr[] = {1,2,3,4,5,6,7,8,9,10,12,13,11,22};

		// int index = Arrays.binarySearch(arr, 110);
		// System.out.println(index);
// wrapper c
		// Integer arr[] = {5,4,3,1,2};
		// Arrays.sort(arr,Collections.reverseOrder());

		List<Integer> li = new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(90);
		li.add(80);
		li.add(90);
		
		System.out.println(Collections.min(li));
		System.out.println(Collections.max(li));
		
		System.out.println(li);
		
		
		System.out.println(Collections.frequency(li, 90));

	}
}
