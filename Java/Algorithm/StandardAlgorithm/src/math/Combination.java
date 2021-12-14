package math;

import java.util.Arrays;

public class Combination {
	public void combination(int[] arr, int[] result, boolean[] visited, int depth, int n, int r) {
		if(depth == r) {
			System.out.println(Arrays.toString(result));
			return;
		}
		for(int i = 0; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				result[depth] = arr[i];
				combination(arr, result, visited, depth + 1, n , r);
				visited[i] = false;
			}
		}
		
	}
	public static void main(String[] args) {
		Combination c = new Combination();
		int[] arr = {1,2,3};
		int r = 2;
		c.combination(arr, new int[r], new boolean[arr.length], 0, arr.length, r);
	}
}
