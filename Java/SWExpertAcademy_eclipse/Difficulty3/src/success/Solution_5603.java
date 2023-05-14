package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5603 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			Integer[] arr = new Integer[N];
			int total = 0;
			for (int n = 0; n < N; n++) {
				arr[n] = Integer.parseInt(br.readLine().trim());
				total += arr[n];
			}
			total /= N;
			int count = 0;
			for (int n = 0; n < N; n++) {
				if (total < arr[n])
					count += (arr[n] - total);
			}
			System.out.printf("#%d %d\n", test_case, count);
		}
	}

}
