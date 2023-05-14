package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1974 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());

		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] sudoku = new int[9][9];
			for (int i = 0; i < 9; i++)
				sudoku[i] = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			boolean[] check = new boolean[10];
			boolean result = true;
			vertical:for (int i = 0; i < 9; i++) {
				Arrays.fill(check, false);
				for (int j = 0; j < 9; j++) {
					if (!check[sudoku[i][j]]) {
						check[sudoku[i][j]] = true;
					}
					else {
						result = false;
						break vertical;
					}
				}
			}
			if (!result) {
				System.out.printf("#%d 0\n",test_case);
				continue;
			}
			horizental:for (int i = 0; i < 9; i++) {
				Arrays.fill(check, false);
				for (int j = 0; j < 9; j++) {
					if (!check[sudoku[j][i]]) {
						check[sudoku[j][i]] = true;
					}
					else {
						result = false;
						break horizental;
					}
				}
			}
			if (!result) {
				System.out.printf("#%d 0\n",test_case);
				continue;
			}
			int[] arr = {0, 3, 6};
			block:for (int x = 0; x < arr.length; x++) {
				for (int y = 0; y < arr.length; y++) {
					Arrays.fill(check, false);
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							if (!check[sudoku[j + arr[x]][i + arr[y]]]) {
								check[sudoku[j + arr[x]][i + arr[y]]] = true;
							}
							else {
								result = false;
								break block;
							}
						}
					}
				}
			}
			System.out.printf("#%d %d\n",test_case, (result? 1 : 0));
		}
	}
}
