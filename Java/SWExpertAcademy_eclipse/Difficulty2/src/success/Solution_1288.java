package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1288 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			Integer num = 0;
			boolean[] check = new boolean[10];
			while (!checker(check)) {
				num += N;
				Integer n = num;
				while (n > 0) {
					check[n % 10] = true;
					n /= 10;
				}
			}
			System.out.printf("#%d %d\n", test_case, num);
		}
	}
	public static boolean checker(boolean[] check) {
		boolean result = true;
		for (int i = 0; i < check.length; i++) {
			if (!check[i])
				result = false;
		}
		return result;
	}
}
