package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_1234 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			List<Integer> arr = br.readLine().trim().split(" ")[1].chars().map(n -> n - '0').boxed().collect(Collectors.toList());
			int i = 0;
			while (i < arr.size() - 1) {
				if (arr.get(i) == arr.get(i + 1)) {
					arr.remove(i);
					arr.remove(i);
					i--;
				}
				else
					i++;
				if (i < 0)
					i = 0;
			}
			System.out.printf("#%d ", test_case);
			arr.stream().forEach(System.out::print);
			System.out.println();
		}
	}
}
