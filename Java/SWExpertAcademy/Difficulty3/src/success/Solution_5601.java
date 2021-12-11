package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5601 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			System.out.printf("#%d ", test_case);
			for (int i = 0; i < N - 1; i++) {
				System.out.printf("1/%d ", N);
			}
			System.out.printf("1/%d\n", N);
		}
	}

}
