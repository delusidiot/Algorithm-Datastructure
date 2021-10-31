package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1284 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] line = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			// p q r s w
			int Acomp = line[0] * line[4];
			int Bcomp = line[1];
			if (line[4] > line[2]) {
				Bcomp += (line[4] - line[2]) * line[3];
			}
			System.out.printf("#%d %d\n", test_case, (Acomp > Bcomp)? Bcomp: Acomp);
		}

	}

}
