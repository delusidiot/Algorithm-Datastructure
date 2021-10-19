package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1961 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			for (int i = 0; i < N; i++)
				arr[i] = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.out.printf("#%d\n", test_case);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) { //90
					System.out.print(arr[N - j - 1][i]);
				}
				System.out.print(" ");
				for (int j = 0; j < N; j++) { //180
					System.out.print(arr[N - i - 1][N - j - 1]);
				}
				System.out.print(" ");
				for (int j = 0; j < N; j++) { //270
					System.out.print(arr[j][N - i - 1]);
				}
				System.out.println();
			}
		}
	}

}
