package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_12368 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int time = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).sum();
			System.out.printf("#%d %d\n", test_case, time % 24);
		}
	}

}
