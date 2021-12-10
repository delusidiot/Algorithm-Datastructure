package success;

import java.io.*;
import java.util.Arrays;

public class Solution_5642 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine().trim());
			int[] numbers = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int total = numbers[0];
			for (int i = 2; i <= N; i++) {
				if (numbers[i - 1] >= 0 && (numbers[i - 1] + numbers[i] >= 0))
					numbers[i] += numbers[i - 1];
				if (total < numbers[i])
					total = numbers[i];
			}
			System.out.printf("#%d %d", test_case, total);
		}
	}
}
