package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_12004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] nums = new boolean[100];
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				nums[i*j] = true;
			}
		}
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			if (N <= 81 && N > 0 && nums[N])
				System.out.printf("#%d Yes\n", test_case);
			else
				System.out.printf("#%d No\n", test_case);
		}
	}

}
