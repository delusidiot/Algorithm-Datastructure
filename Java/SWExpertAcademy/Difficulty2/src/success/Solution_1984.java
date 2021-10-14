package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1984 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			int[] line = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
			int total = 0;
			for (int i = 1; i < line.length - 1; i++) {
				total += line[i];
			}
			System.out.println("#" + test_case + " " + ((total * 10 / 8 % 10 >= 5) ? (total / 8) + 1 : (total / 8)));
		}

	}

}
