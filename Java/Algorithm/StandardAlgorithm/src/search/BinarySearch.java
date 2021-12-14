package search;

import java.util.Arrays;

public class BinarySearch {
	static int[] arr = {1, 3, 4, 5, 9, 11, 13, 15};
	static int number = 11;

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		// a sorted array arr[]
		Arrays.sort(arr);
		
		int index = binarySearch.search(arr, number);
		System.out.println("index[" + index + "]: " + arr[index]);
	}
	
	public int search(int[] arr, int num) {
		return this.search(arr, 0, arr.length, num);
	}
	
	public int search(int[] arr, int l , int r, int num) {
		if (r >= l) {
			int mid = l + (r - 1) / 2;
			
			if (arr[mid] == num)
				return mid;
			if (arr[mid] > num)
				return search(arr, l, mid -1, num);
			return search(arr, mid, r, num);
		}
		return -1;
	}
}
