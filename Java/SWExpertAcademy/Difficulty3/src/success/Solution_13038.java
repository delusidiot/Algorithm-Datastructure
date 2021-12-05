package success;

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
			int weekly = 0;
			for (int i = 0; i < 7; i++)
				weekly += a[i];
			for (int i = 0; i < a.length; i++) {
				int lesson = n;
				int day = 0;
				if (a[i] > 0) {
					for (int j = i; j < a.length; j++) {
						day++;
						if (a[j] > 0)
							lesson--;
						if (lesson <= 0)
							break;
					}
					if (lesson != 0) {
						if (lesson % weekly == 0) {
							day += lesson / weekly * 7 - 7;
							lesson = weekly;
						}
						else {
							day += lesson / weekly * 7;
							lesson %= weekly;
						}
						int idx = 0;
						while (lesson > 0) {
							if (a[idx % 7] > 0)
								lesson--;
							idx++;
							day++;
						}
					}
					a[i] = day;
				}
			}
			System.out.printf("#%d %d\n", test_case, Arrays.stream(a).filter((num)-> num != 0).min().getAsInt());
		}
	}
}
