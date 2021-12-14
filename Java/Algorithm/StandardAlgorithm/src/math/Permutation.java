package math;

import java.util.Arrays;

public class Permutation {
	public void permutation1(int[] arr, int depth, int n, int r) {
		if (depth == r) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for (int i = depth; i < n; i++) {
			swap(arr, depth, i);
			permutation1(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}
	}
	public void permutation2(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth == r) {
			System.out.println(Arrays.toString(output));
			return;
		}
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				output[depth] = arr[i];
				permutation2(arr, output, visited, depth+1, n, r);
				visited[i] = false;
			}
		}
	}
	public void swap(int[] arr, int depth, int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Permutation p = new Permutation();
		//p.permutation1(arr, 0, 4, 3);
		p.permutation2(arr, new int[arr.length], new boolean[arr.length], 0, arr.length, arr.length);
	}
}
