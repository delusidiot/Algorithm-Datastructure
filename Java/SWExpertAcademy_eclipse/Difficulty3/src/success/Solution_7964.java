package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_7964 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] line = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] cities = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int count = 0;
			int dist = 1;
			for (int i = 0; i < line[0]; i++) {
				if (cities[i] == 1)
					dist = 1;
				else if (dist == line[1]) {
					dist = 1;
					count++;
				}
				else
					dist++;
			}
			System.out.printf("#%d %d\n", test_case, count);
		}
	}

}
