package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1285 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int[] distance = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(n -> Math.abs(Integer.parseInt(n))).sorted().toArray();
			long count = Arrays.stream(distance).filter(n -> n == distance[0]).count();
			System.out.printf("#%d %d %d", test_case, distance[0], count);
		}
	}
}
