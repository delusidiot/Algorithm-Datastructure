package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1215 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int[][] arr = new int[8][8];
			int count = 0;
			for (int i = 0; i < 8; i++)
				arr[i] = br.readLine().trim().chars().toArray();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8 - N; j++) {
					count += widthCheck(arr, N, i, j);
				}
			}
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8 - N; j++) {
					count += heightCheck(arr, N, j, i);
				}
			}
			System.out.printf("#%d %d\n", test_case, count);
		}
	}
	public static int widthCheck(int[][] arr, int N, int x, int y) {
		for(int i = 0; i < N / 2; i++) {
			if (arr[x][y + i] != arr[x][y + N - i - 1])
				return 0;
		}
		return 1;
	}
	public static int heightCheck(int[][] arr, int N, int x, int y) {
		for(int i = 0; i < N / 2; i++) {
			if (arr[x + i][y] != arr[x + N - i - 1][y])
				return 0;
		}
		return 1;
	}
}
