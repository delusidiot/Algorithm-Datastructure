package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_12741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] time = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int start = (time[0] > time[2]) ? time[0]: time[2];
			int end = (time[1] < time[3]) ? time [1] : time[3];
			System.out.printf("#%d %d\n", test_case, (end-start < 0 ? 0 : end-start));
		}
	}

}
