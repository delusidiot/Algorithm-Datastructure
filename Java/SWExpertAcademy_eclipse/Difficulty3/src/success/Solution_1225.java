package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1225 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int test_case = 1; test_case <= 10; test_case++) {
			br.readLine();
			int[] arr = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int num = 0;
			int idx = -1;
			do {
				idx++;
				arr[idx % arr.length] -= (num % 5 + 1);
				num++;
			}
			while (arr[idx % arr.length] > 0);
			arr[idx % arr.length] = 0;
			System.out.printf("#%d ", test_case);
			for (int i = 0; i < 8; i++)
				System.out.printf("%d ", arr[++idx % arr.length]);
			System.out.println();
		}
	}
}
