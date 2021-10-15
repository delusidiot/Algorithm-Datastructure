package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1976 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());

		for (int test_case = 1; test_case <= T; test_case++) {
			int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int hour = line[0] + line[2];
			int min = line[1] + line[3];
			if (min > 60) {
				hour += min / 60;
				min %= 60;
			}
			if (hour > 24)
				hour %= 24;
			if (hour > 12) {
				hour -= 12;
			}
			System.out.printf("#%d %d %d\n",test_case, hour, min);
		}
	}
}
