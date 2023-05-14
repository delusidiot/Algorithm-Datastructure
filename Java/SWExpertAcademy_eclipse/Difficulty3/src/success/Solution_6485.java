package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_6485 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int[][] busRoute = new int[N][2];
			for (int n = 0 ; n < N; n++ ) {
				busRoute[n] = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			Integer P = Integer.parseInt(br.readLine().trim());
			System.out.print("#" + test_case + " ");
			for (int p = 0 ; p < P; p++ ) {
				int num = Integer.parseInt(br.readLine().trim());
				int counter = 0;
				for (int n = 0 ; n < N; n++ ) {
					if (busRoute[n][0] <= num && busRoute[n][1] >= num)
						counter++;
				}
				System.out.print(counter + " ");
			}
			System.out.println();
		}

	}

}
