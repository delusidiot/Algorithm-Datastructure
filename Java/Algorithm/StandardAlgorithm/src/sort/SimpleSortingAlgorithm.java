package sort;

import java.util.Arrays;

public class SimpleSortingAlgorithm {

	public static void main(String[] args) {
		int[] arr = {3, 5, 4, 1, 2};
		
		simplest_sorting(arr);
	}
	public static void simplest_sorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
