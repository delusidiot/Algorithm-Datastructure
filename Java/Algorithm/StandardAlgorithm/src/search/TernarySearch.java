package search;

import java.util.Arrays;

public class TernarySearch {
	
	/*
	 * Recursive formula for counting comparisons in worst case of Binary Search
	 * T(n) = T(n/2) + 2, T(1) = 1
	 * Recursive formula for counting comparisons in worst case of Ternary Search.
	 * T(n) = T(n/3) + 4, T(1) = 1
	 * 
	 * Time Complexity for Binary search = 2clog2n + O(1)
	 * Time Complexity for Ternary search = 4clog3n + O(1)
	 * Ternary Search does more comparisons than Binary Search in worst case.
	 */

	static int[] arr = {1, 3, 4, 5, 9, 11, 13, 15};
	static int number = 11;
	
	public static void main(String[] args) {
		TernarySearch ternarySearch = new TernarySearch();
		// a sorted array arr[]
		Arrays.sort(arr);
		
		int index = ternarySearch.search(arr, number);
		System.out.println("index[" + index + "]: " + arr[index]);

	}
	public int search(int[] arr, int num) {
		return this.search(arr, 0, arr.length, num);
	}
	
	public int search(int[] arr, int l , int r, int num) {
		if (r >= l) {
			int mid1 = l + (r - l) / 3;
			int mid2 = mid1 + (r - l) / 3;
			
			if (arr[mid1] == num) return mid1;
			if (arr[mid2] == num) return mid2;
			
			if (arr[mid1] > num)
				return search(arr, l, mid1 - 1, num);
			if (arr[mid2] < num)
				return search(arr, mid2 + 1, r, num);
			return search(arr, mid1 + 1, mid2 - 1, num);
		}
		return -1;
	}
}
