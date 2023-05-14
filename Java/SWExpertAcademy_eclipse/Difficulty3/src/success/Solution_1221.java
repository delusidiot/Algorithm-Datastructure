package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution_1221 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] digits = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < digits.length; i++) 
			map.put(digits[i], i);
		for (int test_case = 1; test_case <= T; test_case++) {
			br.readLine();
			System.out.println("#" + test_case);
			System.out.println(Arrays.stream(br.readLine().trim().split(" ")).mapToInt(n -> map.get(n)).sorted().mapToObj(n -> digits[n]).collect(Collectors.joining(" ")));
		}

	}

}
