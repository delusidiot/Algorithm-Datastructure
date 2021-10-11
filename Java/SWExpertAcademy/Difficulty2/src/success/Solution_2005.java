package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_2005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int[] arr = new int[N];
			Arrays.fill(arr, 1);
			System.out.println("#" + test_case);
			for (int i = 1; i <= N; i++) {
				int prev1 = arr[0];
				int prev2 = arr[1];
				for (int j = 1; j < i - 1; j++) {
					arr[j] = prev1 + prev2;
					prev1 = prev2;
					prev2 = arr[j + 1];
				}
				for (int j = 0; j < i; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
		}
	}
}
