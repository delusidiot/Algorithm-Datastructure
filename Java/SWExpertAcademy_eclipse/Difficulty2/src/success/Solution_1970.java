package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1970 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for (int test_case = 1; test_case <= T; test_case++) {
			int change = Integer.parseInt(br.readLine().trim());
			int[] result = new int[money.length];
			for(int i = 0; i < money.length; i++) {
				result[i] = change / money[i];
				change %= money[i];
			}
			System.out.printf("#%d\n", test_case);
			Arrays.stream(result).forEach(r -> System.out.print(r + " "));
			System.out.println();
		}
	}
}
