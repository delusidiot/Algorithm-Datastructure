package fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_13038 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer n = Integer.parseInt(br.readLine().trim());
			int[] a = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int start = -1;
			int weekly = 0;
			int lesson = 0;
			int i = 0;
			for (i = 0; i < 7; i++) {
				weekly += a[i];
				if (start == -1 && a[i] == 1) {
					start = i;
				}
			}
			lesson -= start;
			if (n % weekly == 0) {
				lesson += (n / weekly - 1) * 7;
				n = weekly;
			}
			else {
				lesson += (n / weekly) * 7;
				n %= weekly;
			}
			i = 0;
			while (n > 0) {
				if (a[i % 7] == 1) {
					n--;
				}
				i++;
				lesson++;
			}
			System.out.printf("#%d %d\n", test_case, lesson);
		}
	}
}
