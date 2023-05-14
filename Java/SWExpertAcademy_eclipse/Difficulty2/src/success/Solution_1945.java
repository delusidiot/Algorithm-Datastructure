package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1945 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine());
			int[] nums = {2,3,5,7,11};
			int[] rest = new int[5];
			for (int i = 0; i < nums.length; i++) {
				while (N % nums[i] == 0) {
					N /= nums[i];
					rest[i]++;
				}
			}
			System.out.printf("#%d ", test_case);
			for (int i = 0; i < nums.length; i++) {
				System.out.printf("%d ", rest[i]);
			}
			System.out.println();
		}

	}

}
