package fail;

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
			for (int i = 0; i < 9; i++) {
				sudoku[i] = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			boolean[] check = new boolean[9];
			Arrays.fill(check, false);
			boolean result = true;
			vertical:for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (!check[sudoku[i][j]]) {
						check[j] = true;
					}
					else {
						result = false;
						break vertical;
					}
				}
				Arrays.fill(check, false);
			}
			if (!result) {
				System.out.printf("#%d 0\n",test_case);
				continue;
			}
			Arrays.fill(check, false);
			horizental:for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (!check[sudoku[j][i]]) {
						check[j] = true;
					}
					else {
						result = false;
						break horizental;
					}
				}
				Arrays.fill(check, false);
			}
			if (!result) {
				System.out.printf("#%d 0\n",test_case);
				continue;
			}
			Arrays.fill(check, false);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					Arrays.fill(check, false);
				}
			}
			System.out.printf("#%d %d\n",test_case, (result? 1 : 0));
		}

	}

}
