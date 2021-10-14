package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1986 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine());
			int total = 0;
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 1)
					total += i;
				else
					total -= i;
			}
			System.out.println("#" + test_case + " " + total);
		}

	}

}
