package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			Integer T = Integer.parseInt(br.readLine().trim());
			int[] NM = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();		
			System.out.printf("#%d %d\n", test_case, (int)Math.pow(NM[0], NM[1]));
		}
	}

}
