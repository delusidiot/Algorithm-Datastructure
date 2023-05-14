package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution_1979 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());

		for (int test_case = 1; test_case <= T; test_case++) {
			String[] line = br.readLine().trim().split(" ");
			int N = Integer.parseInt(line[0]);
			int K = Integer.parseInt(line[1]);
			int[][] puzzle = new int[N][N];
			for (int i = 0; i < N; i++) {
				puzzle[i] = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			int counter = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (puzzle[i][j] == 1) {
						int x = i;
						int y = j;
						int c = 0;
						if (x == 0 || puzzle[x - 1][j] == 0) {
							while (x < N && puzzle[x][j] == 1) {
								c++;
								x++;
							}
						}
						if (c == K)
							counter++;
						c = 0;
						if ((y == 0 || puzzle[i][y - 1] == 0)) {
							while (y < N && puzzle[i][y] == 1) {
								c++;
								y++;
							}
						}
						if (c == K)
							counter++;
					}
				}
			}
			
			
			System.out.printf("#%d %d\n", test_case, counter);
		}
		br.close();
	}
}

