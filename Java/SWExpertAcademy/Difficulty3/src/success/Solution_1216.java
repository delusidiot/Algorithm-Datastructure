package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1216 {
	final static int arrLength = 100;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int[][] arr = new int[arrLength][arrLength];
			for(int i = 0; i < 100; i++) {
				arr[i] = br.readLine().trim().chars().toArray();
			}
			int maxLength = arrLength;
			length:while (maxLength > 0) {
				for (int i = 0; i < arrLength; i++) {
					for (int j = 0; j <= arrLength - maxLength; j++) {
						if(widthCheck(arr, maxLength, i, j))
							break length;
					}
				}
				for (int i = 0; i < arrLength; i++) {
					for (int j = 0; j <= arrLength - maxLength; j++) {
						if(heightCheck(arr, maxLength, j, i))
							break length;
					}
				}
				maxLength--;
			}
			System.out.printf("#%d %d\n", test_case, maxLength);
		}
	}
	
	public static boolean widthCheck(int[][] arr, int N, int x, int y) {
		for(int i = 0; i < N / 2; i++) {
			if (arr[x][y + i] != arr[x][y + N - i - 1])
				return false;
		}
		return true;
	}
	public static boolean heightCheck(int[][] arr, int N, int x, int y) {
		for(int i = 0; i < N / 2; i++) {
			if (arr[x + i][y] != arr[x + N - i - 1][y])
				return false;
		}
		return true;
	}

}
