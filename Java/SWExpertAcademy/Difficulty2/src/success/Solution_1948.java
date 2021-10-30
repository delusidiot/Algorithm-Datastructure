package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
<<<<<<< HEAD
=======
import java.time.LocalDate;
>>>>>>> 8a0dbbe94877eacc3e07181da284758ea1d0da0d
import java.util.Arrays;

public class Solution_1948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] date = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int count = 0;
			while (date[0] < date[2]) {
				count += monthDate(date[0]);
				date[0]++;
			}
			count -= date[1];
			count += date[3] + 1;
			System.out.printf("#%d %d\n", test_case, count);
		}

	}
	public static int monthDate(int month) {
		switch(month) {
		case 2:
			return 28;
		case 4: case 6: case 9: case 11:
			return 30;
		}
		return 31;
	}
}
