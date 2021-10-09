package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1859 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			Integer N = Integer.parseInt(br.readLine());
			long benefit = 0;
			int[] salePrice = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int max = 0;
			for (int i = N - 1; i >= 0; i--) {
				if (max < salePrice[i])
					max = salePrice[i];
				else
					benefit += max - salePrice[i];
			}
			System.out.println("#" + test_case + " " + benefit);
		}
		br.close();
	}
}