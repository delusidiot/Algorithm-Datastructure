package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_12221 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] num = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int mul = 0;
			if (num[0] > 9 || num[1] >9)
				mul = -1;
			else
				mul = num[0] * num[1];
			System.out.printf("#%d %d\n", test_case, mul);
		}
	}

}
