package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_11856 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] alpha = new int[26];
			br.readLine().trim().chars().forEach(c -> alpha[c - 'A'] = 1);
			if (Arrays.stream(alpha).sum() == 2)
				System.out.printf("#%d Yes\n", test_case);
			else
				System.out.printf("#%d No\n", test_case);
		}
	}
}
