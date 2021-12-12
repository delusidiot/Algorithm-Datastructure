package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_5607 {
	final static int MOD = 1234567891;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int N = line[0];
			int R = line[1];
			long answer = 1;
			for (int i = R + 1; i <= N; i++) {
				answer = (answer * i) % MOD;
			}
			long a = 1;
			for (int i = 1; i <= N - R; i++)
				a = (a * i) % MOD;
			long k = MOD - 2;
			while (k > 0) {
				if (k % 2 == 1) {
					answer = (answer * a) % MOD;
				}
				k /= 2;
				a = (a * a) % MOD;
			}
			System.out.printf("#%d %d\n", test_case, answer);
		}
	}
}
