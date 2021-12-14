package search;

import java.util.Arrays;

public class ExponentialSearch {

	static int[] arr = {1, 3, 4, 5, 9, 11, 13, 15};
	static int number = 11;
	
	private BinarySearch binarySearch;
	
	public ExponentialSearch(BinarySearch binarySearch) {
		this.binarySearch = binarySearch;
	}
	
	public static void main(String[] args) {
		ExponentialSearch exponentialSearch = new ExponentialSearch(new BinarySearch());
		// a sorted array arr[]
		Arrays.sort(arr);
		
		int index = exponentialSearch.search(arr, number);
		System.out.println("index[" + index + "]: " + arr[index]);

	}
	public int search(int[] arr, int num) {
		return this.search(arr, arr.length, num);
	}
	
	public int search(int[] arr, int length, int num) {
		if (arr[0] == num)
			return 0;
		int i = 1;
		while (i < length && arr[i] <= num)
			i = i * 2;
		System.out.println(i);
		return Arrays.binarySearch(arr,  i/2, Math.min(i,  length - 1), num);
	}

}
