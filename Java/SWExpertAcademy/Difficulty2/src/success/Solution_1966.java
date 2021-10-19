package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution_1966 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine());
			String result = Arrays.stream(br.readLine().trim().split(" "))
					.mapToInt(Integer::parseInt).sorted().mapToObj(i -> ((Integer)i).toString())
					.collect(Collectors.joining(" "));
			System.out.printf("#%d %s\n", test_case, result);
		}
	}
}
