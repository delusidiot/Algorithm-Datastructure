package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1940 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int speed = 0;
			int distance = 0;
			for (int n = 0; n < N; n++) {
				int[] command = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				switch(command[0]) {
				case 0:
					break;
				case 1:
					speed += command[1];
					break;
				case 2:
					speed -= command[1];
					if (speed < 0)
						speed = 0;
					break;
				}
				distance += speed;
			}
			System.out.printf("#%d %d\n", test_case, distance);
		}
	}
}
