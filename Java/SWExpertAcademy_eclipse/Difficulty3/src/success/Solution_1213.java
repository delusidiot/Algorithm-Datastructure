package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1213 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			String word = br.readLine().trim();
			String string = br.readLine().trim();
			int count = 0;
			int idx = 0;
			while (string.indexOf(word, idx) > 0) {
				count++;
				idx = string.indexOf(word, idx) + 1;
			}
			System.out.printf("#%d %d\n", test_case, count);
		}
	}
}
