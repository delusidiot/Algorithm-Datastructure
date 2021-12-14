package search;

import java.util.Arrays;

public class InterpolationSearch {
	static int[] arr = {1, 3, 4, 5, 9, 11, 13, 15};
	static int number = 11;
	public static void main(String[] args) {
		InterpolationSearch interpolationSearch = new InterpolationSearch();
		
		// a sorted array arr[]
		Arrays.sort(arr);
		
		int index = interpolationSearch.search(arr, number);
		System.out.println("index[" + index + "]: " + arr[index]);
	}
	
	public int search(int[] arr, int num) {
		return search(arr, 0, arr.length - 1, num);
	}
	
	public int search(int[] arr, int lo, int hi, int num) {
		if (lo <= hi && num >= arr[lo] && num <= arr[hi]) {
			int pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (num - arr[lo]));
			if (arr[pos] == num)
				return pos;
			if (arr[pos] < num)
				return search(arr, pos + 1, hi, num);
			if (arr[pos] > num)
				return search(arr, lo, pos - 1, num);
		}
		return -1;
	}

}
