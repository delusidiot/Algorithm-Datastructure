package search;

import java.util.Arrays;

public class JumpSearch {
	static int[] arr = {1, 3, 4, 5, 9, 11, 13, 15};
	static int number = 11;

	public static void main(String[] args) {
		JumpSearch jumpSearch = new JumpSearch();
		
		// a sorted array arr[]
		Arrays.sort(arr);
		
		int index = jumpSearch.search(arr, number);
		System.out.println("index[" + index + "]: " + arr[index]);
	}
	
	public int search(int[] arr, int num) {
		int step = (int)Math.floor(Math.sqrt(num));
		
		int prev = 0;
		
		while (arr[Math.min(step, arr.length)] < num) {
			prev = step;
			step += (int)Math.floor(Math.sqrt(num));
			if (prev >= arr.length)
				return -1;
		}
		
		while (arr[prev] < num) {
			prev++;
			if (prev == Math.min(step, arr.length)) {
				return -1;
			}
		}
		if (arr[prev] == num)
			return prev;
		return -1;
	}
}
