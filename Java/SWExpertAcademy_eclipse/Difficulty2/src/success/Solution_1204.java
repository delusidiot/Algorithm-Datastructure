package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution_1204 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine().trim());
		for (int test_case = 1; test_case <= T; test_case++) {
			String N = br.readLine();
			String key = Collections.max(Arrays.stream(br.readLine().trim().split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet(), new Comparator<Entry<String, Long>>() {
				@Override
				public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
					return o1.getValue() >= o2.getValue() ? 1 : -1;
				}
			}).getKey();
			System.out.printf("#%d %s\n", test_case, key);
		}
	}
}
