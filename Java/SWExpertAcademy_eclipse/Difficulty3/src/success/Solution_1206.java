package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			Integer N = Integer.parseInt(br.readLine().trim());
			int[] building =  Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int count = 0;
			for (int i = 2; i < N - 2; i++) {
				int max = building[i - 2];
				if (max < building[i - 1])
					max = building[i - 1];
				if (max < building[i + 1])
					max = building[i + 1];
				if (max < building[i + 2])
					max = building[i + 2];
				if (max < building[i])
					count += building[i] - max;
			}
			System.out.printf("#%d %d\n", test_case, count);
		}
	}

}
